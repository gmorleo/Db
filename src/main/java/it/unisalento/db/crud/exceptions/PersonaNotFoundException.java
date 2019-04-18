package it.unisalento.db.crud.exceptions;

public class PersonaNotFoundException extends Exception{
    @Override
    public String getMessage() {
        return "User not found";
    }
}
