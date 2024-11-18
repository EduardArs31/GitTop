package Builder_House_39_40;

import java.util.Objects;

public class House {
    protected int floors;
    protected int rooms;
    protected static boolean garage;

    private House(Builder builder) {
        this.floors = builder.floors;
        this.rooms = builder.rooms;
        this.garage = builder.garage;
    }

    @Override
    public String toString() {
        return "Дом:" + " " +
                "количество этажей =" + " " + floors + "," + " " +
                "количество комнат =" + " " + rooms + "," + " " +
                "наличия гаража =" + " " + garage;
    }

    public static class Builder {
        private int floors;
        private int rooms;
        private boolean garage;


        public Builder() {
        }

        public Builder floors(int floors) {
            this.floors = floors;
            return this;
        }

        public Builder rooms(int rooms) {
            this.rooms = rooms;
            return this;
        }

        public Builder garage(boolean garage) {
            this.garage = garage;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return floors == house.floors && rooms == house.rooms;
    }

    @Override
    public int hashCode() {
        return Objects.hash(floors, rooms, garage);
    }
}



