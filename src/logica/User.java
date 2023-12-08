package logica;

public class User implements Participated {

	// Nombre del usuario
	private String name;
	// Apellido del usuario
	private String lastName;
	// Documento de identidad del usuario
	private String ID;
	// Teléfono del usuario
	private String telephone_number;
	// Nombre de usuario para el sistema
	private String nombreUsuario;
	// Contraseña del usuario
	private String contrasena;
	// Área a la que pertenece el usuario
	private Area area;
	// Indica si el usuario es administrador o no
	private boolean esAdmin;
	// Indica si el usuario Participated en un evento o no
	private boolean participo;

	/**
	 * Constructor de la clase User.
	 * 
	 * @param nombre
	 *            Nombre del usuario
	 * @param apellido
	 *            Apellido del usuario
	 * @param telefono
	 *            Teléfono del usuario
	 * @param nombreUsuario
	 *            Nombre de usuario para el sistema
	 * @param contrasena
	 *            Contraseña del usuario
	 * @param area
	 *            Área a la que pertenece el usuario
	 * @param ID 
	 */
	public User(String name, String lastName,
			String telephone_number, String nombreUsuario, String contrasena, Area area, String ID) {
		this.name = name;
		this.lastName = lastName;
		this.ID = ID;
		this.telephone_number = telephone_number;
		this.nombreUsuario = nombreUsuario;
		this.contrasena = contrasena;
		this.area = area;
	}

	/**
	 * Devuelve el nombre del usuario.
	 * 
	 * @return Nombre del usuario
	 */
	public String getNombre() {
		return name;
	}

	/**
	 * Establece el nombre del usuario.
	 * 
	 * @param nombre
	 * 
	 */
	public void setNombre(String name) {
		this.name = name;
	}

	/**
	 * Devuelve el apellido del usuario.
	 * 
	 * @return Apellido del usuario
	 */
	public String getApellido() {
		return lastName;
	}

	/**
	 * Establece el apellido del usuario.
	 * 
	 * @param apellido
	 * 
	 */
	public void setApellido(String apellido) {
		this.lastName = apellido;
	}

	/**
	 * Devuelve el apellido del usuario.
	 * 
	 * @param apellido
	 * 
	 * @return Apellido del usuario
	 */
	public String getID() {
		return ID;
	}

	/**
	 * Establece el apellido del usuario.
	 * 
	 * @param apellido
	 * 
	 * @return Apellido del usuario
	 */
	public void setID(String iD) {
		ID = iD;
	}

	/**
	 * Devuelve el apellido del usuario.
	 * 
	 * @param apellido
	 * 
	 */
	public String getTelefono() {
		return telephone_number;
	}

	/**
	 * Establece el apellido del usuario.
	 * 
	 * @param apellido
	 * 
	 */
	public void setTelefono(String telephone_number) {
		this.telephone_number = telephone_number;
	}

	/**
	 * Devuelve el apellido del usuario.
	 * 
	 * @param apellido
	 * 
	 * @return Apellido del usuario
	 */
	public String getNombreUsuario() {
		return nombreUsuario;
	}

	/**
	 * Establece el apellido del usuario.
	 * 
	 * @param apellido
	 * 
	 */
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	/**
	 * Devuelve el contrasena del usuario.
	 * 
	 * @param contrasena
	 * 
	 * @return contrasena del usuario
	 */
	public String getContrasena() {
		return contrasena;
	}

	/**
	 * Establece el contrasena del usuario.
	 * 
	 * @param contrasena
	 */
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	/**
	 * Devuelve el Area del usuario.
	 * 
	 * @param Area
	 * 
	 * @return Area del usuario
	 */
	public Area getArea() {
		return area;
	}

	/**
	 * Establece el Area del usuario.
	 * 
	 * @param Area
	 */
	public void setArea(Area area) {
		this.area = area;
	}

	/**
	 * Devuelve si el usuario es administrador.
	 * 
	 * @param esAdmin
	 * 
	 * @return esAdmin
	 */
	public boolean getIsEsAdmin() {
		return esAdmin;
	}

	/**
	 * Establece si es administrador el usuario.
	 * 
	 * @param esAdmin
	 */
	public void setEsAdmin(boolean esAdmin) {
		this.esAdmin = esAdmin;
	}

	/**
	 * Devuelve si el usuario Participated o no.
	 * 
	 * @param Participated
	 * 
	 * @return Participated
	 */
	public boolean getParticipation() {
		return participo;
	}

	/**
	 * Establece la participacion del usuario.
	 * 
	 * @param Participated
	 */
	public void setParticipation(boolean participo) {
		this.participo = participo;
	}
	
}

