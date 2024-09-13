package org.example.sizeEnum;

public enum Size {

    XXS(32){
        public String getDescription(){
            return "Детский размер";
        }
    },
    XS(36){
        public String getDescription(){
            return "Взрослый размер";
        }
    },
    S(38){
        public String getDescription(){
            return "Взрослый размер";
        }
    },
    M(40){
        public String getDescription(){
            return "Взрослый размер";
        }
    },
    L(42){
        public String getDescription(){
            return "Взрослый размер";
        }
    };
    private int euroSize;

    Size(int size) {
        this.euroSize = size;
    }


    public abstract String getDescription();


}
