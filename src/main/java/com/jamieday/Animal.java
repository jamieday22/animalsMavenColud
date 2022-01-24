package com.jamieday;




    public abstract class Animal {

             ////////////////////////Attributes///////////////////////////////

        private String name;



            ////////////////////////Constructors/////////////////////////////

        public Animal(String name){
            this.name = name;
        }


                /////////////////////////Methods/////////////////////////////////

        public abstract void eat(String food);


        public abstract void breathe();

        public void poop(){
            System.out.println("pooping time");
        }



        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }


    }

