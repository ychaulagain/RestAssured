package api.endpoints;
/*
Create user (Post) : https://petstore3.swagger.io/api/v3/user
Get user (Get): https://petstore3.swagger.io/api/v3/user/{username}
Update user (update/Put): https://petstore3.swagger.io/api/v3/user/{username}
Delete user (Delete): https://petstore3.swagger.io/api/v3/user/{username}
 */
public class Routes {
    public static String base_url = "https://petstore3.swagger.io/api/v3";

    // User module
    public static String post_url = base_url + "/user";
    public static String get_url = base_url + "/user/{username}";
    public static String update_url = base_url + "/user/{username}";
    public static String delete_url = base_url + "/user/{username}";

}
