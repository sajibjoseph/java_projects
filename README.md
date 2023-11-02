#Classy Pirates!

This project involves creating classes in Java to simulate a pirate-themed game. Pirates fight each other for gold doubloons and can use weapons to enhance their combat abilities.

## Pirate Class

The `Pirate` class represents a pirate with a name, health, and gold doubloons. Pirates can attack each other, reducing the opponent's health and potentially gaining their doubloons.

Key methods include:
- A constructor to set the pirate's name, health, and doubloons.
- `getHealth()` to return the pirate's current health.
- `toString()` to return the pirate's status.
- `attack()` to simulate a pirate attacking another pirate.

## Weapon Class

The `Weapon` class represents a weapon that a pirate can use in combat. Each weapon has a name and can cause a range of damage.

Key methods include:
- A constructor to set the weapon's name and damage range.
- `toString()` to return the weapon's details.
- `getDamage()` to return the amount of damage the weapon can cause.

## ImprovedPirate Class

The `ImprovedPirate` class extends the `Pirate` class with the ability to use weapons. An improved pirate has all the attributes of a regular pirate, plus a weapon.

Key methods include:
- A constructor similar to the `Pirate` class constructor, but also sets the weapon to null.
- `setWeapon()` to assign a weapon to the pirate.
- `toString()` to return the pirate's status, including weapon information if available.
- An improved `attack()` method that uses the weapon's damage if available.

## ImprovedPirate Class

The `ImprovedPirate` class extends the `Pirate` class with the ability to use weapons. An improved pirate has all the attributes of a regular pirate, plus a weapon.

Key methods include:
- A constructor similar to the `Pirate` class constructor, but also sets the weapon to null.
- `setWeapon()` to assign a weapon to the pirate.
- `toString()` to return the pirate's status, including weapon information if available.
- An improved `attack()` method that uses the weapon's damage if available.

## PirateShip Class

The `PirateShip` class represents a pirate ship with a captain and a crew of pirates.

Key methods include:
- A constructor that sets the ship's name and captain, and initializes an empty crew.
- `getNumPirateCrew()` to return the number of pirates in the crew.
- `addPirate()` to add a pirate to the crew. This method has been improved to automatically resize the crew array when it reaches capacity.
- `removePirate()` to remove the last added pirate from the crew.
- `toString()` to return the ship's details, including the captain and each crew member.


Please note that all fields are private and all methods and constructors are public as per good object-oriented design principles. Feel free to contribute and raise any issues. Happy coding!
