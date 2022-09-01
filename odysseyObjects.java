class hero {
	String name;
	String[] weapons = {"stick", "sword"};

	void setName(String heroName) {
		name = heroName;
	}

	String getName() {
		return name;
	}

	void attack(String monsterName) {
		if (monsterName == "Polyphemus") {
			System.out.println(monsterName + " attacks!");
			System.out.println(name + " counterattacks with his " + weapons[0]);
		}
		else if (monsterName == "Scylla and Charibdis") {
			System.out.println(monsterName + " attacks!");
			System.out.println(name + " counterattacks with his " + weapons[1]);
		}
	}
}

class monster {
	String name;
        void attack() {
                System.out.println(name + "attacks!");
        }

	void setName(String monsterName) {
		name = monsterName;
	}

	String getName() {
		return name;
	}
}

class odysseyObjectsTestDrive {
	public static void main(String[] args) {
		hero odysseus = new hero();
		odysseus.setName("Odysseus");

		monster cyclops = new monster();
		cyclops.setName("Polyphemus");

		odysseus.attack(cyclops.getName());

		monster seaMonster = new monster();
		seaMonster.setName("Scylla and Charibdis");
		odysseus.attack(seaMonster.getName());

	}
}
