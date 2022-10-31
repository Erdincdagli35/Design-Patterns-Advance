public class Pirate extends Character{

    @Override
    public void pickUpTheWeapon() {
        System.out.println("Pick up the sword");
    }

    @Override
    public void defenceAction() {
        System.out.println("Defend with the sword");
    }

    @Override
    public void moveToSafety() {
        System.out.println("Return to the ship");
    }
}
