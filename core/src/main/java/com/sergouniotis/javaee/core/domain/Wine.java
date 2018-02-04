package com.sergouniotis.javaee.core.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "wines")
public class Wine {

	@Id
	@Column(name = "database_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "WINESEQ")
	@SequenceGenerator(name = "WINESEQ", sequenceName = "wineseq", allocationSize = 50)
	private Long id;

	@Column(name = "region")
	private String region;

	@Column(name = "malic_acid")
	private Double malicAcid;

	@Column(name = "ash")
	private Double ash;

	@Column(name = "alcalinity_of_ash")
	private Double alcalinityOfAsh;

	@Column(name = "magnesium")
	private Double magnesium;

	@Column(name = "phenols")
	private Double phenols;

	@Column(name = "flavanoids")
	private Double flavanoids;

	@Column(name = "non_flavanoids_phenols")
	private Double nonFlavanoidsPhenols;

	@Column(name = "proanthocyanins")
	private Double proanthocyanins;

	@Column(name = "color_intensity")
	private Double colorIntensity;

	@Column(name = "hue")
	private Double hue;

	@Column(name = "od_of_diluted_wines")
	private Double odOfDilutedWines;

	@Column(name = "proline")
	private Double proline;

	@Version
	@Column(name = "optlock", nullable = false)
	private long version = 0L;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Double getMalicAcid() {
		return malicAcid;
	}

	public void setMalicAcid(Double malicAcid) {
		this.malicAcid = malicAcid;
	}

	public Double getAsh() {
		return ash;
	}

	public void setAsh(Double ash) {
		this.ash = ash;
	}

	public Double getAlcalinityOfAsh() {
		return alcalinityOfAsh;
	}

	public void setAlcalinityOfAsh(Double alcalinityOfAsh) {
		this.alcalinityOfAsh = alcalinityOfAsh;
	}

	public Double getMagnesium() {
		return magnesium;
	}

	public void setMagnesium(Double magnesium) {
		this.magnesium = magnesium;
	}

	public Double getPhenols() {
		return phenols;
	}

	public void setPhenols(Double phenols) {
		this.phenols = phenols;
	}

	public Double getFlavanoids() {
		return flavanoids;
	}

	public void setFlavanoids(Double flavanoids) {
		this.flavanoids = flavanoids;
	}

	public Double getNonFlavanoidsPhenols() {
		return nonFlavanoidsPhenols;
	}

	public void setNonFlavanoidsPhenols(Double nonFlavanoidsPhenols) {
		this.nonFlavanoidsPhenols = nonFlavanoidsPhenols;
	}

	public Double getProanthocyanins() {
		return proanthocyanins;
	}

	public void setProanthocyanins(Double proanthocyanins) {
		this.proanthocyanins = proanthocyanins;
	}

	public Double getColorIntensity() {
		return colorIntensity;
	}

	public void setColorIntensity(Double colorIntensity) {
		this.colorIntensity = colorIntensity;
	}

	public Double getHue() {
		return hue;
	}

	public void setHue(Double hue) {
		this.hue = hue;
	}

	public Double getOdOfDilutedWines() {
		return odOfDilutedWines;
	}

	public void setOdOfDilutedWines(Double odOfDilutedWines) {
		this.odOfDilutedWines = odOfDilutedWines;
	}

	public Double getProline() {
		return proline;
	}

	public void setProline(Double proline) {
		this.proline = proline;
	}

	public long getVersion() {
		return version;
	}

	public void setVersion(long version) {
		this.version = version;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		builder.append(region);
		builder.append(",");
		builder.append(malicAcid);
		builder.append(",");
		builder.append(ash);
		builder.append(",");
		builder.append(alcalinityOfAsh);
		builder.append(",");
		builder.append(magnesium);
		builder.append(",");
		builder.append(phenols);
		builder.append(",");
		builder.append(flavanoids);
		builder.append(",");
		builder.append(nonFlavanoidsPhenols);
		builder.append(",");
		builder.append(proanthocyanins);
		builder.append(",");
		builder.append(colorIntensity);
		builder.append(",");
		builder.append(hue);
		builder.append(",");
		builder.append(odOfDilutedWines);
		builder.append(",");
		builder.append(proline);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alcalinityOfAsh == null) ? 0 : alcalinityOfAsh.hashCode());
		result = prime * result + ((ash == null) ? 0 : ash.hashCode());
		result = prime * result + ((colorIntensity == null) ? 0 : colorIntensity.hashCode());
		result = prime * result + ((flavanoids == null) ? 0 : flavanoids.hashCode());
		result = prime * result + ((hue == null) ? 0 : hue.hashCode());
		result = prime * result + ((magnesium == null) ? 0 : magnesium.hashCode());
		result = prime * result + ((malicAcid == null) ? 0 : malicAcid.hashCode());
		result = prime * result + ((nonFlavanoidsPhenols == null) ? 0 : nonFlavanoidsPhenols.hashCode());
		result = prime * result + ((odOfDilutedWines == null) ? 0 : odOfDilutedWines.hashCode());
		result = prime * result + ((phenols == null) ? 0 : phenols.hashCode());
		result = prime * result + ((proanthocyanins == null) ? 0 : proanthocyanins.hashCode());
		result = prime * result + ((proline == null) ? 0 : proline.hashCode());
		result = prime * result + ((region == null) ? 0 : region.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Wine other = (Wine) obj;
		if (alcalinityOfAsh == null) {
			if (other.alcalinityOfAsh != null)
				return false;
		} else if (!alcalinityOfAsh.equals(other.alcalinityOfAsh))
			return false;
		if (ash == null) {
			if (other.ash != null)
				return false;
		} else if (!ash.equals(other.ash))
			return false;
		if (colorIntensity == null) {
			if (other.colorIntensity != null)
				return false;
		} else if (!colorIntensity.equals(other.colorIntensity))
			return false;
		if (flavanoids == null) {
			if (other.flavanoids != null)
				return false;
		} else if (!flavanoids.equals(other.flavanoids))
			return false;
		if (hue == null) {
			if (other.hue != null)
				return false;
		} else if (!hue.equals(other.hue))
			return false;
		if (magnesium == null) {
			if (other.magnesium != null)
				return false;
		} else if (!magnesium.equals(other.magnesium))
			return false;
		if (malicAcid == null) {
			if (other.malicAcid != null)
				return false;
		} else if (!malicAcid.equals(other.malicAcid))
			return false;
		if (nonFlavanoidsPhenols == null) {
			if (other.nonFlavanoidsPhenols != null)
				return false;
		} else if (!nonFlavanoidsPhenols.equals(other.nonFlavanoidsPhenols))
			return false;
		if (odOfDilutedWines == null) {
			if (other.odOfDilutedWines != null)
				return false;
		} else if (!odOfDilutedWines.equals(other.odOfDilutedWines))
			return false;
		if (phenols == null) {
			if (other.phenols != null)
				return false;
		} else if (!phenols.equals(other.phenols))
			return false;
		if (proanthocyanins == null) {
			if (other.proanthocyanins != null)
				return false;
		} else if (!proanthocyanins.equals(other.proanthocyanins))
			return false;
		if (proline == null) {
			if (other.proline != null)
				return false;
		} else if (!proline.equals(other.proline))
			return false;
		if (region == null) {
			if (other.region != null)
				return false;
		} else if (!region.equals(other.region))
			return false;
		return true;
	}

}
