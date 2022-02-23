package com.example.demo;

import java.util.Objects;

public class vehicle {
		
		String name;
		String type;
	
		int wheel;
		
		String result;
		public vehicle(String name , String type, int wheel,  String result) {
			
			
			super();
			this.name = name;
			this.type = type;
			this.wheel = wheel;
			this.result = result;
			
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		@Override
		public int hashCode() {
			return Objects.hash(name, result, type, wheel);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			vehicle other = (vehicle) obj;
			return Objects.equals(name, other.name) && Objects.equals(result, other.result)
					&& Objects.equals(type, other.type) && wheel == other.wheel;
		}
		@Override
		protected Object clone() throws CloneNotSupportedException {
			// TODO Auto-generated method stub
			return super.clone();
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString();
		}
		@Override
		protected void finalize() throws Throwable {
			// TODO Auto-generated method stub
			super.finalize();
		}
		public int getWheel() {
			return wheel;
		}
		public void setWheel(int wheel) {
			this.wheel = wheel;
		}
		public String getResult() {
			return result;
		}
		public void setResult(String result) {
			this.result = result;
		}
		}

 