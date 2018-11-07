package business.control;

import business.control.command.Command;

public class controle{
  
    public void controle (){           
            
    }
    
    public void setcommand(Persistencia p, Command command){
        command.execute(p);
    }
        
}
