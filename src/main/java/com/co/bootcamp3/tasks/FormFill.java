package com.co.bootcamp3.tasks;

import com.co.bootcamp3.userinterfaces.FormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class FormFill implements Task {

        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(Enter.theValue("Grupo  3").into(FormPage.TXT_INPUT));
            actor.attemptsTo(Enter.theValue("Grupo3").into(FormPage.TXT_PASSWORD));
            actor.attemptsTo(Enter.theValue("Automatizacion").into(FormPage.TXT_TAREA));
            actor.attemptsTo(SelectFromOptions.byValue("1").from(FormPage.SELECT_DROPDOWN));
            actor.attemptsTo(SelectFromOptions.byValue("New York").from(FormPage.SELECT_DROPDOWN_LIST));
            actor.attemptsTo(Click.on(FormPage.SELECT_CHECKEDBOX));
            actor.attemptsTo(Click.on(FormPage.SELECT_CHECKEDRADIO));
            actor.attemptsTo(Click.on(FormPage.BUTTON_ENVIAR));
        }
        public static FormFill fill(){
            return Tasks.instrumented(FormFill.class);
        }
}
