import { Http } from '@angular/http';
import { Injectable } from '@angular/core';
import { Wine } from './wine';
import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/map';

@Injectable()
export class WineService {

  constructor(private http: Http) { }

  _getDataSet(): Promise<Wine[]> {
    return new Promise(resolve => {
      return this.http.get('http://localhost:8080/javaee-core/v1/wine').map(response => {
        return response;
      });
    });
  }

  getDataSet(): Promise<Wine[]> {
    return this.http.get('http://localhost:8080/javaee-core/v1/wine')
      .toPromise()
      .then(response => {
        return response.json() as Wine[];
      })
      .catch(this.handleError);
  }

  private handleError(error: any): Promise<any> {
    console.error('An error occurred', error); // for demo purposes only
    return Promise.reject(error.message || error);
  }

}
