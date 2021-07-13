package page;

public class IDPortalPage extends BasePage {
    private String entrarButton="//input[@id='btnLogin']";
    private String ingresarUsuario="//input[@id='txtUser']";
    private String ingresarContra="//input[@id='txtPwd']";
    private String selectbc = "//body/div[2]/aside[1]/section[1]/ul[1]/li[3]/a[1]/i[1]";
    private String selectDigi = "//span[contains(text(),'Digitalización')]";
    private String selectDigiFE = "//span[contains(text(),'Nuevo Documento Electrónico')]";
    private String selectExp = "//select[@id='ctl00_ContentPlaceHolder1_ddl_tiposDoc']";
    private String ingresaApellidoP = "//body/div[2]/div[2]/form[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/input[1]";
    private String ingresaApellidoM ="//body/div[2]/div[2]/form[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/input[1]";
    private String ingresaNombre ="//body/div[2]/div[2]/form[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[4]/div[1]/div[2]/input[1]";
    private String ingresaRFC ="//body/div[2]/div[2]/form[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[7]/div[1]/div[2]/input[1]";
    private String ingresaTel ="//body/div[2]/div[2]/form[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[13]/div[1]/div[2]/input[1]";
    private String ingresaCorreo ="//body/div[2]/div[2]/form[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[15]/div[1]/div[2]/input[1]";
    private String ingresaCorreoConfirmacion ="//body/div[2]/div[2]/form[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[16]/div[1]/div[2]/input[1]";
    private String enterAtorizacion ="//body/div[2]/div[2]/form[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[17]/div[1]/div[2]/div[1]/div[1]/div[1]/label[1]/input[1]";
    private String enterContinuar1 ="//body/div[2]/div[2]/form[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]";
    private String ingresaCalle ="//body/div[2]/div[2]/form[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/input[1]";
    private String ingresaNumero ="//body/div[2]/div[2]/form[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/input[1]";
    private String ingresaCP ="//body/div[2]/div[2]/form[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[5]/div[1]/div[2]/input[1]";
    private String ingresaCiudad ="//body/div[2]/div[2]/form[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[10]/div[1]/div[2]/input[1]";
    private String enterContinuar2 ="/html[1]/body[1]/div[2]/div[2]/form[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[4]/div[1]/div[2]/div[1]/div[2]";
    private String ingresaEmpresa ="//body/div[2]/div[2]/form[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[2]/div[3]/div[1]/div[2]/input[1]";
    private String ingresaTelEmp ="//body/div[2]/div[2]/form[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]/div[1]/div[2]/input[1]";
    private String ingresaSalario ="//body/div[2]/div[2]/form[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[2]/div[7]/div[1]/div[2]/input[1]";
    private String enterContinuar3 ="//body/div[2]/div[2]/form[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[2]/div[2]/div[4]/div[1]/div[2]/div[1]/div[2]";
    private String enterContinuar4 ="//body/div[2]/div[2]/form[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[4]/div[2]/div[2]/div[4]/div[1]/div[2]/div[1]/div[2]";
    private String enterFinalizar ="//body/div[2]/div[2]/form[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[5]/div[1]/div[2]/div[4]/div[1]/div[2]/div[1]/div[3]";

    public IDPortalPage(){
        super(driver);
    }
   
    public void navigateToIdPortal(){
        navigateToIdPortal("https://test.digipromovil.com:446/IDPortal/Wfrm_Contenido.aspx");
    }
       
    public void enterUsuario(String criteria){
        write(ingresarUsuario,criteria);
    }
    public void enterContra(String criteria){
        write(ingresarContra,criteria);
    }
    public void clickEntrar(){
        clickElement(entrarButton);

    }
    public void clickSelectbc(){
        clickElement(selectbc);
    }
    public void clickSelectDigi(){
        clickElement(selectDigi);
    }
    public void clickSelectDigiFE(){
        clickElement(selectDigiFE);
    }
    public void selectExp(String category){
        selectFromDropdownByText(selectExp, category);
    }
    public void capturaDatosP1(String apellido, String apellidoM, String nombre, String rfc, String tel, String correo, String correoConf ){
        write(ingresaApellidoP, apellido);
        write(ingresaApellidoM, apellidoM);
        write(ingresaNombre, nombre);
        write(ingresaRFC, rfc);
        write(ingresaTel, tel);
        write(ingresaCorreo, correo);
        write(ingresaCorreoConfirmacion, correoConf);
    }
    public void clickAutorizacion(){
        clickElement(enterAtorizacion);
    }
    public void clickContinuar1(){
        clickElement(enterContinuar1);
    }
    public void capturaDatosP2(String calle, String numero, String cp, String ciudad){
        write(ingresaCalle, calle);
        write(ingresaNumero, numero);
        write(ingresaCP, cp);
        write(ingresaCiudad, ciudad);
        
    }
    public void clickContinuar2(){
        clickElement(enterContinuar2);
    }
    public void capturaDatosP3(String empresa, String telEmp, String salario){
        write(ingresaEmpresa, empresa);
        write(ingresaTelEmp, telEmp);
        write(ingresaSalario, salario);
    }
    public void clickContinuar3(){
        clickElement(enterContinuar3);
    }
    public void clickContinuar4(){
        clickElement(enterContinuar4);
    }
    public void clickFinalizar(){
        clickElement(enterFinalizar);
    }
}
