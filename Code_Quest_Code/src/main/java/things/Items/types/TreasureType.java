package things.Items.types;

public enum TreasureType {
    GOLD("Gold", 4),
    RUBY("Ruby", 3),
    DIAMOND("Diamond", 8),
    BAG_OF_NUTS("Bag of Nuts", 1);

    private final String name;
    private final int value;

    TreasureType(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
}
