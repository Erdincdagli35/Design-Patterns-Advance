public abstract class Character {

    public void pickUpTheWeapon(){}

    public void defenceAction(){}

    public void moveToSafety(){}

    public void defendAgainstToAttack(){
        pickUpTheWeapon();
        defenceAction();
        moveToSafety();
        System.out.println();
    }
}
