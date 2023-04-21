package api.endpoints;

//https://petstore.swagger.io/
/*
 * createUser() (post) - https://petstore.swagger.io/v2/user
 * getUser() (get) - https://petstore.swagger.io/v2/user/{username}
 * updateUser() (put) -https://petstore.swagger.io/v2/user/{username}
 * deleteUser() (delete)- https://petstore.swagger.io/v2/user/{username}
 */


public class Routes {
	
	public static String base_url="https://petstore.swagger.io/v2";
	
	//User model
	public static String post_url=  base_url + "/user";
	public static String get_url=  base_url + "/user/{username}";
	public static String update_url=  base_url + "/user/{username}";
	public static String delete_url=  base_url + "/user/{username}";
	
	//Store model URLs
	
	//Pet model URLs
	
	
} //class
