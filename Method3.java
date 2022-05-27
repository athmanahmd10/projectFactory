public class Method3 extends Hacker{

    String passwordTest;
    private String myCombinaison = new String("abcdefghijklmnopqrstuvwxyzABCDEFGHJIKLMNOPQRSTUVWXYZ0123456789@$#&*-");
    private char[] currentPassword = new char[20];
    private boolean foundPassword = false;
   

    User user1 = new User();
    public void searchPassword(){
      int i=0, j=0;

      while( !foundPassword ){
       
        for(i=0; i<myCombinaison.length(); i++)
        {
            currentPassword[0] = myCombinaison.charAt(i);
        for(j=0; j<myCombinaison.length(); j++){
          currentPassword[1] = myCombinaison.charAt(j);
          int indice=2, place=0;
          while(place <myCombinaison.length()){
            currentPassword[indice] = myCombinaison.charAt(place);
            indice=2;
            while(indice <7) {
                while(place < myCombinaison.length()){
                  currentPassword[indice] = myCombinaison.charAt(place);
                  for(int k=0; k<myCombinaison.length(); k++){
                    currentPassword[indice+1] = myCombinaison.charAt(k);
                    String str = new String(currentPassword, 0, 4);
                    
                    foundPassword = user1.authentificate(user1.login, str);

                    if(foundPassword){
                      break;
                    }
                     
                  }
                  place ++;
                } 
                indice++;

                if(foundPassword)
                  break;
               
               }
               if(foundPassword)
                 break;
          }
       }
        }
        
       foundPassword = true;
    }
       
    }
    
}
