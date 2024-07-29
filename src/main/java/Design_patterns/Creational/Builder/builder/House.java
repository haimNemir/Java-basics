package Design_patterns.Creational.Builder.builder;

public class House {
    private String foundation;
    private String structure;
    private String roof;
    private boolean furnished;
    private boolean painted;

    public House(){}
    public House(String foundation, String structure, String roof, boolean furnished, boolean painted) {
        this.foundation = foundation;
        this.structure = structure;
        this.roof = roof;
        this.furnished = furnished;
        this.painted = painted;
    }

    // Getters
    public String getFoundation() {
        return foundation;
    }

    public String getStructure() {
        return structure;
    }

    public String getRoof() {
        return roof;
    }

    public boolean isFurnished() {
        return furnished;
    }

    public boolean isPainted() {
        return painted;
    }

    @Override
    public String toString() {
        return "House{" +
                "foundation='" + foundation + '\'' +
                ", structure='" + structure + '\'' +
                ", roof='" + roof + '\'' +
                ", furnished=" + furnished +
                ", painted=" + painted +
                '}';
    }

    // Builder
    public static class Builder {
        private String foundation;
        private String structure;
        private String roof;
        private boolean furnished;
        private boolean painted;

        public Builder setFoundation(String foundation) {
            this.foundation = foundation;
            return this;
        }

        public Builder setStructure(String structure) {
            this.structure = structure;
            return this;
        }

        public Builder setRoof(String roof) {
            this.roof = roof;
            return this;
        }

        public Builder setFurnished(boolean furnished) {
            this.furnished = furnished;
            return this;
        }

        public Builder setPainted(boolean painted) {
            this.painted = painted;
            return this;
        }

        public House build() {
            House house = new House();
            if(this.foundation == null)
                house.foundation = "concrete";
            else
                house.foundation = this.foundation;
            house.structure = this.structure;
            house.roof = this.roof;
            house.furnished = this.furnished;
            house.painted = this.painted;
            return house;
        }
    }
}
