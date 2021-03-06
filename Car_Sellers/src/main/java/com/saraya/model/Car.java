package com.saraya.model;

	public class Car {
		private int id ;
		private int year ;
		private String mark ;
		private String model ;
		private String image ;
		
		public Car(int id, int year, String mark, String model, String image) {
			super() ;
			this.id = id ;
			this.year = year ;
			this.mark = mark ;
			this.model = model ;
			this.image = image ;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

		public String getMark() {
			return mark;
		}

		public void setMark(String mark) {
			this.mark = mark;
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public String getImage() {
			return image;
		}

		public void setImage(String image) {
			this.image = image;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + id;
			result = prime * result + ((image == null) ? 0 : image.hashCode());
			result = prime * result + ((mark == null) ? 0 : mark.hashCode());
			result = prime * result + ((model == null) ? 0 : model.hashCode());
			result = prime * result + year;
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
			Car other = (Car) obj;
			if (id != other.id)
				return false;
			if (image == null) {
				if (other.image != null)
					return false;
			} else if (!image.equals(other.image))
				return false;
			if (mark == null) {
				if (other.mark != null)
					return false;
			} else if (!mark.equals(other.mark))
				return false;
			if (model == null) {
				if (other.model != null)
					return false;
			} else if (!model.equals(other.model))
				return false;
			if (year != other.year)
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Car [id=" + id + ", year=" + year + ", mark=" + mark + ", model=" + model + ", image=" + image
					+ "]";
		}
	}
		