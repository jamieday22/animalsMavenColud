package com.jamieday;

 import java.time.LocalDate;


    public abstract class Animal {

        /////////////////////////////////////Attributes//////////////////////////////////////////////

        private String name;
        private LocalDate dateOfBirth;




        /////////////////////////////////////Constructors/////////////////////////////////////////////

        public Animal(String name){
            this.name = name;
        }






        /////////////////////////////////////Methods//////////////////////////////////////////////////

        public abstract void eat(String food);

        public void sleep(int length){
            System.out.println("I will sleep for "+length +" minutes");
        }

        public abstract void breathe();

        public void poop(){
            System.out.println("I am pooping");
        }

        public abstract Animal reproduce(Animal mother, Animal father) throws Exception;

        public void die(){
            System.out.println("I am dead!");
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public LocalDate getDateOfBirth() {
            return dateOfBirth;
        }

        public void setDateOfBirth(LocalDate dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
        }
    }

