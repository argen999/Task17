package Task17;

public class Farm {
    private String adders;
    private Cow cows;
    private Horse horses;
    private Sheep sheep;
    private String OwnerName;


    public Farm(String adders, String ownerName) {
        this.adders = adders;
        OwnerName = ownerName;
    }
    public Farm() {
    }


    public void setAdders(String adders) {
        this.adders = adders;
    }
    public void setCows(Cow cows) {
        this.cows = cows;
    }
    public void setHorses(Horse horses) {
        this.horses = horses;
    }
    public void setSheep(Sheep sheep) {
        this.sheep = sheep;
    }
    public void setOwnerName(String ownerName) {
        OwnerName = ownerName;
    }


    public String getAdders() {
        return adders;
    }
    public Cow getCows() {
        return cows;
    }
    public Horse getHorses() {
        return horses;
    }
    public Sheep getSheep() {
        return sheep;
    }
    public String getOwnerName() {
        return OwnerName;
    }


    @Override
    public String toString() {
        return  "adders = " + adders + '\n' +
                "OwnerName = " + OwnerName + '\n';
    }
}
