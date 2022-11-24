package com.co.bootcamp3.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormPage {
    public static final Target TXT_INPUT = Target.the("Ingresar texto").located(By.id("//input[@id='my-text-id']"));
    public static final Target TXT_PASSWORD = Target.the("Ingresar la contraseña").located(By.id("//input[@name='my-password']"));
    public static final Target TXT_TAREA = Target.the("Ingrese otro texto").located(By.id("//textarea[@name='my-textarea']"));
    public static final Target SELECT_DROPDOWN = Target.the("Seleccione un numero").located(By.id("//select[@name='my-select']"));
    public static final Target SELECT_DROPDOWN_LIST = Target.the("Seleccione un pais").located(By.id("//input[@name='my-datalist']"));
    public static final Target SELECT_CHECKEDBOX = Target.the("Seleccione").located(By.id("//input[@id='my-check-1']"));
    public static final Target SELECT_CHECKEDRADIO = Target.the("Seleccione").located(By.id("//input[@id='my-radio-1']"));
    public static final Target BUTTON_ENVIAR = Target.the("Enviar").located(net.serenitybdd.core.annotations.findby.By.id("//button[@type='submit']"));
}
