package model.repository;

import model.User;

import java.sql.SQLException;

public class TestUserRepositoryImpl {
    public static void main(String[] args) throws SQLException {
        Repository<User> repository = new UserRepositoryImpl();

        System.out.println("========== saveObj Insert ==========");
        User userInsert = new User();
        userInsert.setUser_firstname("maria");
        userInsert.setUser_lastname("martinez");
        userInsert.setUser_email("maira785@gmail.com");
        userInsert.setUser_password("maria895");
        repository.saveObj(userInsert);
        User userInsert2 = new User();
        userInsert2.setUser_firstname("andres");
        userInsert2.setUser_lastname("antonel");
        userInsert2.setUser_email("antonel7845@gmail.com");
        userInsert2.setUser_password("andres865145");
        repository.saveObj(userInsert2);

        System.out.println("========== listAllObj ==========");
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("========== byIdObj ===========");
        System.out.println(repository.byIdObj(1));
        System.out.println();

        System.out.println("========== saveObj ==========");
        User userUpdate = new User();
        userUpdate.setUser_id(2);
        userUpdate.setUser_firstname("jose");
        userUpdate.setUser_lastname("lara");
        userUpdate.setUser_email("lara875@gmail.com");
        userUpdate.setUser_password("josealara75");
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("========== deleteObj =========");
        repository.deleteObj(2);
        repository.listAllObj().forEach(System.out::println);
    }
}


