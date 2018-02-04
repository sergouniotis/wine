import { Component, ViewChild, OnInit } from '@angular/core';

import { DataSource } from '@angular/cdk/collections';

import { MatPaginator } from '@angular/material';

import { Wine } from '../wine';
import { WineService } from '../wine.service';

import { BehaviorSubject } from 'rxjs/BehaviorSubject';
import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/startWith';
import 'rxjs/add/observable/merge';
import 'rxjs/add/operator/map';

@Component({
  selector: 'app-datatable',
  templateUrl: './datatable.component.html',
  styleUrls: ['./datatable.component.css'],
  providers: [WineService]
})
export class DatatableComponent implements OnInit {


  displayedColumns: string[];

  wineDatabase: WineDatabase;

  dataSource: WineDataSource | null;

  @ViewChild(MatPaginator) paginator: MatPaginator;

  constructor(private wineService: WineService) { }

  ngOnInit() {

    var self = this;

    self.displayedColumns = ['id', 'malicAcid', 'ash', 'alcalinityOfAsh',
      'magnesium', 'phenols', 'flavanoids', 'nonFlavanoidsPhenols',
      'proanthocyanins', 'colorIntensity', 'hue', 'region'];

    self.wineDatabase = new WineDatabase(self.wineService);

    self.dataSource = new WineDataSource(self.wineDatabase, self.paginator);

  }
}

/**Wine database that the data source uses to retrieve data for the table. */
export class WineDatabase {

  dataChange: BehaviorSubject<Wine[]> = new BehaviorSubject<Wine[]>([]);
  get data(): Wine[] { return this.dataChange.value; }

  constructor(private wineService: WineService) {
    // Fill up the database with 100 users.

    var self = this;
    this.wineService.getDataSet().then(response => {
      response.forEach(wine => self.add(wine));
    })

  }

  /** Adds a new user to the database. */
  add(wine: Wine) {
    const copiedData = this.data.slice();
    copiedData.push(wine);
    this.dataChange.next(copiedData);
  }

}


/**
 * Data source to provide what data should be rendered in the table. Note that the data source
 * can retrieve its data in any way. In this case, the data source is provided a reference
 * to a common data base, ExampleDatabase. It is not the data source's responsibility to manage
 * the underlying data. Instead, it only needs to take the data and send the table exactly what
 * should be rendered.
 */
export class WineDataSource extends DataSource<any> {
  constructor(private _exampleDatabase: WineDatabase, private _paginator: MatPaginator) {
    super();
  }

  /** Connect function called by the table to retrieve one stream containing the data to render. */
  connect(): Observable<Wine[]> {
    const displayDataChanges = [
      this._exampleDatabase.dataChange,
      this._paginator.page,
    ];

    return Observable.merge(...displayDataChanges).map(() => {
      const data = this._exampleDatabase.data.slice();

      // Grab the page's slice of data.
      const startIndex = this._paginator.pageIndex * this._paginator.pageSize;
      return data.splice(startIndex, this._paginator.pageSize);
    });
  }

  disconnect() { }
}
