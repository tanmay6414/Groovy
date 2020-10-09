class Tanmay{

    String fname
    String fcolor


    def setfname(String name){
        fname=name
    }
    def setfcolor(String color){
        fcolor=color
    }
    def getfname(){
        println(fname)
    
    }
    def getfcolor(){
        println(fcolor)
    }



    
}


def abc(){
        Tanmay a= new Tanmay()
        a.setfcolor("blue")
        a.getfcolor()
        a.setfname("Tanmay")
        a.getfname()
    }

abc()