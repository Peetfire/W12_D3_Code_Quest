package characters.types;

import things.Items.Treasure;

public enum BaddieType {

    OGRE("Ogre", "It looks like he wants to bash you!", 10, 6, 3),
    TROLL("Troll", "He's thumping his club and repeating smash, smash, smash...",10, 7, 4),
    DRAGON("Dragon", "Smoke and the ood flame are coming from her nostrils!!!",20, 9, 4),
    WICKED_WITCH("Wicked Witch", "She's a beautiful shade of green but cackling menacingly.",10, 6, 3),
    DRUNK_KNIGHT("Drunk Knight", "He's very drunk but it seems to have made him stronger!",15, 8, 4),
    BAD_AMAZON("Bad amazon", "Life has dealt her a bad hand and now she wants to take it out on you!", 10, 9, 4),
    RABID_SQUIRRELS("Pack of Rabid Squirrels", "...ever tried to swing a sword at a squirrel before?  Good luck hitting them all!", 10, 5, 10);

    private static String type;
    private static String desc;
    private static int health;
    private static int attack;
    private static int defence;

    BaddieType(String type, String desc, int health, int attack, int defence) {
    }

    public static String getType() {return type;}

    public static int getHealth() {return health;}

    public static int getAttack() {return attack;}

    public static int getDefence() {return defence;}
}