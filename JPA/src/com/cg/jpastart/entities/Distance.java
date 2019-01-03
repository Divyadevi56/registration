package com.cg.jpastart.entities;


	

	import java.io.Serializable;

	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;

	import org.hibernate.annotations.NamedQueries;


	@Entity
	@Table(name="distance_record")

	public class Distance implements Serializable {
		
		
		private static final long serialVersionUID = 1L;
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		 private int distanceId;
		String Source;
		String destination;
		private int distance;
		private int distanceInMiles;
		public int getDistanceId() {
			return distanceId;
		}
		public void setDistanceId(int distanceId) {
			this.distanceId = distanceId;
		}
		public String getSource() {
			return Source;
		}
		public void setSource(String source) {
			Source = source;
		}
		public String getDestination() {
			return destination;
		}
		public void setDestination(String destination) {
			this.destination = destination;
		}
		
		
		public int getDistance() {
			return distance;
		}
		public void setDistance(int distance) {
			this.distance = distance;
			distanceInMiles=distance*100;
		}
		public int getDistanceInMiles()
		{
			return distanceInMiles;
		}
	


}
