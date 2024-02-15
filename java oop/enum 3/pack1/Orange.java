package pack1;

public enum Orange {
    
    AMAL("programmer"),
    NIMAL("Manager"),
    KAMAL("Director"),
    SAMAN("Accountant");

    private final String CAREER;

    Orange(String description){
        CAREER = description;
    }

    public String getDetails(){
        return CAREER;
    }

    /* 
    NOTE: inside the enum class we can make a variable, methods and constructors also
    
    */

}
