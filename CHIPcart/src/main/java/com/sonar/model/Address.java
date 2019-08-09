package com.sonar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="hr" , name="addresstable")
public class Address {

	 
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int addressId;
		private int customerId;
		private String houseNumber;
		private String city;
		private String state;
		private String contactNumber;
		private String pincode;

		public Address() {
		}

		public Address(int addressId,  int customerId,String houseNumber, String city, String state,
				String contactNumber, String pincode) {
			super();
			this.addressId = addressId;
			this.houseNumber = houseNumber;
			this.customerId = customerId;
			this.city = city;
			this.state = state;
			this.contactNumber = contactNumber;
			this.pincode = pincode;
		}

		public int getAddressId() {
			return addressId;
		}

		public void setAddressId(int addressId) {
			this.addressId = addressId;
		}

		public String getHouseNumber() {
			return houseNumber;
		}

		public void setHouseNumber(String houseNumber) {
			this.houseNumber = houseNumber;
		}

		public int getCustomerId() {
			return customerId;
		}

		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getContactNumber() {
			return contactNumber;
		}

		public void setContactNumber(String contactNumber) {
			this.contactNumber = contactNumber;
		}

		public String getPincode() {
			return pincode;
		}

		public void setPincode(String pincode) {
			this.pincode = pincode;
		}

	

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + addressId;
			result = prime * result + ((city == null) ? 0 : city.hashCode());
			result = prime * result + ((contactNumber == null) ? 0 : contactNumber.hashCode());
			result = prime * result + customerId;
			result = prime * result + ((houseNumber == null) ? 0 : houseNumber.hashCode());
			result = prime * result + ((pincode == null) ? 0 : pincode.hashCode());
			result = prime * result + ((state == null) ? 0 : state.hashCode());
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
			Address other = (Address) obj;
			if (addressId != other.addressId)
				return false;
			if (city == null) {
				if (other.city != null)
					return false;
			} else if (!city.equals(other.city))
				return false;
			if (contactNumber == null) {
				if (other.contactNumber != null)
					return false;
			} else if (!contactNumber.equals(other.contactNumber))
				return false;
			if (customerId != other.customerId)
				return false;
			if (houseNumber == null) {
				if (other.houseNumber != null)
					return false;
			} else if (!houseNumber.equals(other.houseNumber))
				return false;
			if (pincode == null) {
				if (other.pincode != null)
					return false;
			} else if (!pincode.equals(other.pincode))
				return false;
			if (state == null) {
				if (other.state != null)
					return false;
			} else if (!state.equals(other.state))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Address [addressId=" + addressId + ", houseNumber=" + houseNumber + ", customerId=" + customerId
					+ ", city=" + city + ", state=" + state + ", contactNumber=" + contactNumber + ", pincode="
					+ pincode + "]";
		}

	
		
}

