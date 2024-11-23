package org.example.rpg;

public class Main {
    public static void main(String[] args) {
        Troll troll = new Troll("Cave Troll", 150, 30.0);

        Werewolf werewolf = new Werewolf("Forest Werewolf", 120, 25.0);
        System.out.println(troll);
        System.out.println("Troll Attack Damage: " + troll.attack());

        System.out.println(werewolf);
        System.out.println("Werewolf Attack Damage: " + werewolf.attack());
    }
}
