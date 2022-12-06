package linkListOneDirection;

public class Queue {
    Node front;//head 
    Node rear;//tail
    
    public Queue(){
        this.front=null;
        this.rear=null;
    }
    void add(Node yeni){
        if(front==null && rear==null)
        {
            front=rear=yeni;
        } 
        else {
            rear.next=yeni;
            rear=yeni;//soldaki deger tutuyour sagdaki ise degerin kendisidir 

        }
    }
    void yazdir ()
    {
        if (front==null){
            System.err.println("liteniz bostur ");
        }
        Node tmp=front;
        while(tmp!=null){
            System.out.print(tmp.sayi+"==>");
            tmp=tmp.next;
        }
    }
    void silme()
    {
            if (front==null&&rear==null){
                System.out.println("liste bostur");
            }
            else{
            front=front.next;
        }
    }
            /**
             * @param n
             * @return
             */
            String arama(int n)
            {
                String sting;
                if (front==null&&rear==null)
                {   
                    sting="liste bostur";
                    return sting;
                }
                else
                {
                    Node tmp=front;
                  
                    while(tmp!=null)
                    {
                        if(tmp.sayi ==n)
                        {
                            sting=" !!!! aradiginiz eleman bulundu !!!! ";
                            return sting;
                            
                        }
                        tmp=tmp.next;   
                    }
                    sting=" !!! Uzgunuz Aradiginiz eleman bulunmadi !!! ";
                    
                    return sting;


                }
                
            }
        }
    

