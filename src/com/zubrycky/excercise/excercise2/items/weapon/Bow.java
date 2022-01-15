package com.zubrycky.excercise.excercise2.items.weapon;

public class Bow extends Weapon {
    public Bow(String name, double baseDamage, double baseDurability, int value, double weight) {
        super(name, baseDamage, baseDurability, value, weight);
    }

    @Override
    public void polish() {
        if (getDurability() < 1) {
            setDurabilityModifier(getDurabilityModifier() + Weapon.MODIFIER_CHANGE_RATE);
            System.out.println(getName() + " durability increased.");
        } else {
            System.out.println(getName() + " durability is max.");
        }
    }
}