package org.beatriz;

public abstract class Motor
{
    private String motor;
    
    public abstract String presenta_motor(
    );
    public String getmotor(){
        return motor;
    }

    public void setmotor(String motor){
        this.motor=motor;
    }
}
