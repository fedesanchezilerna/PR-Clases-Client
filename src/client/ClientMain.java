package client;

public class ClientMain {
    public static void main(String[] args) {
        System.out.println("========== TESTS ==========");

        // Use Constructor 1
        System.out.println("\nUse Constructor 1");
        Client client1 = new Client("000001", "Lenny", "Kravitz", "US", "612345678", "1234567", (byte) 60);
        System.out.println(client1);

        // Check attributes debt and active are initialize
        System.out.println("\nCheck attributes debt and active are initialize");
        System.out.println("client1 debts:          " + client1.getDebts());
        System.out.println("client1 active          " + client1.isActive());

        // Use Constructor 2
        System.out.println("\nUse Constructor 2");
        Client client2 = new Client("111111", "Madonna", "Ciccone", "7654321");
        System.out.println(client2);

        // Check all other attributes that are not in the constructor are initialize
        System.out.println("\nCheck all other attributes that are not in the constructor are initialize");
        System.out.println("Client2 nationality:    " + client2.getNationality());
        System.out.println("Client2 phone:          " + client2.getPhone());
        System.out.println("Client2 age:            " + client2.getAge());
        System.out.println("Client2 debts:          " + client2.getDebts());
        System.out.println("Client2 active:         " + client2.isActive());

        // Test getters and setter setAccount & getAccount
        System.out.println("\nTest getters and setter setAccount & getAccount");
        client1.setAccountNum("420");
        System.out.println("Client1 accountNum:     " + client1.getAccountNum());

        // Test getters and setter setName & getName
        System.out.println("\nTest getters and setter setName & getName");
        client1.setName("Leonard Albert");
        System.out.println("Client1 name:           " + client1.getName());

        // Test getters and setter setSurname & getSurname
        System.out.println("\nTest getters and setter setSurname & getSurname");
        client2.setSurname("Louise Ciccone");
        System.out.println("Client2 name            " + client2.getSurname());

        // Test getters and setter setNationality & getNationality
        System.out.println("\nTest getters and setter setNationality & getNationality");
        client2.setNationality("US");
        System.out.println("Client2 nationality:    " + client2.getNationality());

        // Test getters and setter setPhone & getPhone
        System.out.println("\nTest getters and setter setPhone & getPhone");
        client2.setPhone("666-666-666");
        System.out.println("Client2 phone:          " + client2.getPhone());

        // Test getters and setter setDni & getDni
        System.out.println("\nTest getters and setter setDni & getDni");
        client2.setDni("M4D0NN4");
        System.out.println("Client2 dni:          " + client2.getDni());

        // Test getters and setter setAge & getAge
        System.out.println("\nTest getters and setter setAge & getAge");
        client2.setAge(Byte.MAX_VALUE);
        System.out.println("Client2 age:          " + client2.getAge());

        // Test getters and setter setDebt & getDebt
        System.out.println("\nTest getters and setter setDebt & getDebt");
        client2.setDebts(3000.120f);
        System.out.println("Client2 debt:          " + client2.getDebts());

        // Test isActive and setActive
        System.out.println("\nTest isActive and setActive");
        client1.setActive(false);
        System.out.println("Client1 active:          " + client1.isActive());

        // Test toString
        System.out.println("\nTest toString");
        System.out.println(client1);
        System.out.println(client2);

        // Test cancelDebts
        // Test reduceDebt with amount = 50 (set initial debt to 120.25), result = true, debt = 70.25
        // Test reduceDebt with amount = 150 (set initial debt to 120.25), result = true, debt = 0
        // Test reduceDebt with amount = -100 (set initial debt to 120.25), result = false, debt = 120.25
        // Test increaseDebt with amount = 50 (set initial debt to 120.25), result = true, debt = 170.25
        // Test increaseDebt with amount = -50 (set initial debt to 120.25), result = false, debt = 120.25
    }
}