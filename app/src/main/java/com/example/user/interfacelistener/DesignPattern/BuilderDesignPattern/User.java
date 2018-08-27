package com.example.user.interfacelistener.DesignPattern.BuilderDesignPattern;

/**
 * Created by FCI on 2018-07-14.
 */

public class User {

    private String firstName;
    private String lastName;
    private int age;
    private String job;

    public User(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName  = builder.lastName;
        this.age       = builder.age;
        this.job       = builder.job;
    }

   public static class Builder {

        private String firstName;
        private String lastName;
        private int age;
        private String job;

        public Builder setFirstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public Builder setJob(String job){
            this.job = job;
            return this;
        }

        public Builder setAge(int  age){
            this.age = age;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }

}
