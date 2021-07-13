package steps;


import io.cucumber.java.en.*;
import page.IDPortalPage;

public class ScotiaSteps {

    IDPortalPage portal = new IDPortalPage();

    @Given("^Navego a la pagina del IDPortal$")
    public void navigateToIdPortal(){
        portal.navigateToIdPortal();

    }
    @When("^Ingreso con un usuario$")
    public void enterUsuario(){
        portal.enterUsuario("Scotiaonline");

    }
    @And("^Una contraseña$")
    public void enterContra(){
        portal.enterContra("tester");

    }
    @And("^Doy click en botón Entrar$")
    public void clickEntrar(){
        portal.clickEntrar();

    }
    @And("^Selecciono la opción de la base cliente DGPNomina$")
    public void clickSelectbc(){
        portal.clickSelectbc();

    }
    @Then("^Selecciono la opción Digitalización$")
    public void clickSelectDigiOpt(){
        portal.clickSelectDigi();

    }
    @And("^Despues Nuevo Documento Electronico$")
    public void clickSelectDigiFE(){

        portal.clickSelectDigiFE();
    }
    @Then("^Elijo el expediente ScotiaBank$")
    public void selectExp(){
        portal.selectExp("ScotiaBank");

    }
    @Then("^Lleno los campos solicitados en la primer pagina$")
    public void capturaDatosP1(){
        portal.capturaDatosP1("Hernandez","Rodriguez","Angel","HERA910408A31","5563345187","angelh@digipro.com","angelh@digipro.com");

    }
    @And("^Doy click en check de autorizacion$")
    public void clickAutorizacion(){
        portal.clickAutorizacion();

    }
    @And("^Doy click en botón Continuar$")
    public void clickContinuar1(){
        portal.clickContinuar1();
    }
    @Then("^En la segunda pagina seguimos llenando los datos solicitados$")
    public void capturaDatosP2(){
        portal.capturaDatosP2("cebhicalos", "35", "55050", "méxico");

    }
    @And("^Doy click en botón Continuar pagina 2$")
    public void clickContinuar2() throws InterruptedException{
        Thread.sleep(6000);
        portal.clickContinuar2();

    }
    @Then("^En la tercera pagina seguimos llenando los datos solicitados$")
    public void capturaDatosP3(){
        portal.capturaDatosP3("Digipro", "5555555555", "5000");

    }
    @And("^Doy click en botón Continuar 3$")
    public void clickContinuar3()throws InterruptedException{
        Thread.sleep(2000);
        portal.clickContinuar3();

    }
    @And("^Click en botón continuar$")
    public void clickContinuar4()throws InterruptedException{
        Thread.sleep(2000);
        portal.clickContinuar4();

    }
    @Then("^Finalizo dando clicn en botón Continuar para publicar el expediente$")
    public void clickFinalizar()throws InterruptedException{
        Thread.sleep(2000);
        portal.clickFinalizar();
    }
}
