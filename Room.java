package inheritence;

	public class Room {

		private String color;
		private Piller pillers;
		private TV tv;
		private Switchboard switchboard;
		private Wire wires;
		private Fan fans;
		private Table tables;
		private Chair chairs;
		
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		
		public Piller getPillers() {
			return pillers;
		}
		public void setPillers(Piller pillers) {
			this.pillers = pillers;
		}
		public TV getTv() {
			return tv;
		}
		public void setTv(TV tv) {
			this.tv = tv;
		}
		public Switchboard getSwitchboard() {
			return switchboard;
		}
		public void setSwitchboard(Switchboard switchboard) {
			this.switchboard = switchboard;
		}
		public Wire getWires() {
			return wires;
		}
		public void setWires(Wire wires) {
			this.wires = wires;
		}
		public Fan getFans() {
			return fans;
		}
		public void setFans(Fan fans) {
			this.fans = fans;
		}
		public Table getTables() {
			return tables;
		}
		public void setTables(Table tables) {
			this.tables = tables;
		}
		public Chair getChairs() {
			return chairs;
		}
		public void setChairs(Chair chairs) {
			this.chairs = chairs;
		}
}
