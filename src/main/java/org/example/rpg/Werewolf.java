package org.example.rpg;

public class Werewolf extends Monster implements Bleedable {

    public Werewolf(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double bleed() {
        return getDamage() * 0.25;
    }

    @Override
    public double attack() {
        return getDamage() + bleed();
    }

    @Override
    public String toString() {
        return "Werewolf{name='" + getName() + "', hitPoints=" + getHitPoints() + ", damage=" + getDamage() + "}";
    }
}
