package logica;

public class DataUsers {

	private static String[][] users;

	public DataUsers() {

		users = new String[3][5];

		users[0][0] = "Aleksandr";
		users[0][1] = "123456";
		users[0][2] = "Aleksandr"; // Apellido
		users[0][3] = "Aleksandr"; // Phone
		users[0][4] = "Aleksandr"; // ID

		users[1][0] = "Amanada";
		users[1][1] = "1234";
		users[1][2] = "Aleksandr";
		users[1][3] = "Aleksandr";
		users[0][4] = "Aleksandr";

		users[2][0] = "Bryan";
		users[2][1] = "121212";
		users[2][2] = "Espinosa Valiño";
		users[2][3] = "58505864";
		users[0][4] = "03022170666";

	}

	/**
	 * 
	 * @param indicate  1 = Para user , Contrasena 2 = resto
	 * @param indicateUser 0 = Ale , 1=Amanda , 2=Bryan
	 * @return
	 */
	public static String[] getUserProfile(int indicate, int indicateUser) {
		String[] user = null;

		switch (indicate) {
		case 1: {
			user = new String[2];

			for (int i = 0; i < 2; i++) {
				user[i] = users[indicateUser][i];
			}

		}
			break;
		case 2:
			user = new String[4];

			for (int i = 0; i < 4; i++) {
				if (i != 2) {
					user[i] = users[indicateUser][i];
				}
			}
		}

		return user;
	}
}
