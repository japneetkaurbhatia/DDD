class Hex {
    int index;
    int type;
    int initialResources;
    int neigh1;
    int neigh2;
    int neigh3;
    int neigh4;
    int neigh5;
    int neigh0;
    int resources; // the current amount of eggs/crystals on this cell
    int myAnts; // the amount of your ants on this cell
    int oppAnts; // the amount of opponent ants on this cell

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getInitialResources() {
        return initialResources;
    }

    public void setInitialResources(int initialResources) {
        this.initialResources = initialResources;
    }

    public int getNeigh1() {
        return neigh1;
    }

    public void setNeigh1(int neigh1) {
        this.neigh1 = neigh1;
    }

    public int getNeigh2() {
        return neigh2;
    }

    public void setNeigh2(int neigh2) {
        this.neigh2 = neigh2;
    }

    public int getNeigh3() {
        return neigh3;
    }

    public void setNeigh3(int neigh3) {
        this.neigh3 = neigh3;
    }

    public int getNeigh4() {
        return neigh4;
    }

    public void setNeigh4(int neigh4) {
        this.neigh4 = neigh4;
    }

    public int getNeigh5() {
        return neigh5;
    }

    public void setNeigh5(int neigh5) {
        this.neigh5 = neigh5;
    }

    public int getNeigh0() {
        return neigh0;
    }

    public void setNeigh0(int neigh0) {
        this.neigh0 = neigh0;
    }

    public int getResources() {
        return resources;
    }

    public void setResources(int resources) {
        this.resources = resources;
    }

    public int getMyAnts() {
        return myAnts;
    }

    public void setMyAnts(int myAnts) {
        this.myAnts = myAnts;
    }

    public int getOppAnts() {
        return oppAnts;
    }

    public void setOppAnts(int oppAnts) {
        this.oppAnts = oppAnts;
    }

    public Hex(int index, int type, int initialResources, int neigh1, int neigh2, int neigh3, int neigh4, int neigh5, int neigh0, int resources, int myAnts, int oppAnts) {
        this.index =index;
        this.type =type;
        this.initialResources =initialResources;
        this.neigh1 =neigh1;
        this.neigh2 =neigh2;
        this.neigh3 =neigh3;
        this.neigh4 =neigh4;
        this.neigh5 =neigh5;
        this.neigh0 =neigh0;
        this.resources =resources;
        this.myAnts =myAnts;
        this.oppAnts =oppAnts;
    }

    @Override
    public String toString() {
        return "Hex{" +
                "index=" + index +
                ", type=" + type +
                ", initialResources=" + initialResources +

    }

} 