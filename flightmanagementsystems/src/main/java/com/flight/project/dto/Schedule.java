//package com.flight.project.dto;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.Id;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
//@Entity
//@Table(name="Schedule")
//public class Schedule {
//	    @Id
//	    
//	    @OneToOne(fetch=FetchType.EAGER)
//	    private Airport sourceAirport;
//	    @OneToOne(fetch=FetchType.EAGER)
//	    private Airport destinationAirport;
//	    @Column(name="arrivalTime")
//	    private String arrivalTime;
//	    @Column(name="departureTime")
//	    private String departureTime;
//		public Schedule(Airport sourceAirport, Airport destinationAirport, String arrivalTime, String departureTime) {
//			super();
//			this.sourceAirport = sourceAirport;
//			this.destinationAirport = destinationAirport;
//			this.arrivalTime = arrivalTime;
//			this.departureTime = departureTime;
//		}
//		public Schedule() {
//			super();
//		}
//		public Airport getSourceAirport() {
//			return sourceAirport;
//		}
//		public void setSourceAirport(Airport sourceAirport) {
//			this.sourceAirport = sourceAirport;
//		}
//		public Airport getDestinationAirport() {
//			return destinationAirport;
//		}
//		public void setDestinationAirport(Airport destinationAirport) {
//			this.destinationAirport = destinationAirport;
//		}
//		public String getArrivalTime() {
//			return arrivalTime;
//		}
//		public void setArrivalTime(String arrivalTime) {
//			this.arrivalTime = arrivalTime;
//		}
//		public String getDepartureTime() {
//			return departureTime;
//		}
//		public void setDepartureTime(String departureTime) {
//			this.departureTime = departureTime;
//		}
//	   
//	}


