package com.azoza.webapp.eshop;

import com.azoza.webapp.eshop.entity.User;
import com.azoza.webapp.eshop.service.UserService;
import com.azoza.webapp.eshop.util.Encryption;
import com.azoza.webapp.eshop.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.UUID;

public class Test {
    public static void main(String[] args) {
//        HibernateUtil.getSessionFactory();
//        String encrypt = Encryption.encrypt("12ABCaass34");
//        System.out.println(encrypt);

//        UserService userService = new UserService();
//        User user = new User();
//        user.setEmail("registerDTO.getEmail()");
//
//        user.setPassword(Encryption.encrypt("registerDTO.getPassword()"));
//
//        String verificationCode = UUID.randomUUID().toString();
//
//        user.setVerification_code(verificationCode);
//
//        userService.save(user);

//        Session session = HibernateUtil.getSessionFactory().openSession();
//        User email = session.createQuery("select u from User u where u.email=:email", User.class)
//                .setParameter("email", "abc@gmail.com").uniqueResult();
//        System.out.println(email.getVerification_code());
//                UserService userService = new UserService();
//        User byEmail = userService.getByEmail(email.getEmail());

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        User user = new User();
        user.setEmail("registerDTO.getEmail()");

        user.setPassword(Encryption.encrypt("registerDTO.getPassword()"));

        String verificationCode = UUID.randomUUID().toString();

        user.setVerification_code(verificationCode);

        session.save(user);
        transaction.commit();
        session.close();

    }
}
