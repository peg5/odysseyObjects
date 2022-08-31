class hero {
	String name;
	String[] weapons = {"stick", "sword"};

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
}

class odysseyObjectsTestDrive {
	public static void main(String[] args) {
		monster cyclops = new monster();
		cyclops.name = "Polyphemus";

		hero odysseus = new hero();
		odysseus.name = "Odysseus";
		odysseus.attack(cyclops.name);

		monster seaMonster = new monster();
		seaMonster.name = "Scylla and Charibdis";
		odysseus.attack(seaMonster.name);

	}
}
