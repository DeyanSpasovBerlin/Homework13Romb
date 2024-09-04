public class Lesson13Romb {

    public void printRow(String rowInput){
        String row = rowInput.replace(" ","");
        System.out.println("Вы ввели предложение: "+rowInput);
        System.out.println("После устранения пробелов предложение имеет вид: "+row);
        System.out.println(" Предложевне состоит из следующих символов:");
        for (char let :row.toCharArray()){
            System.out.print(let+", ");
        }
    }
    public void middlePrint(String rowInput) {
        String row = rowInput.replace(" ", "");
        char[] st = row.toCharArray();
        System.out.println("\nКоличество символов в предложение: " + st.length);
        Integer flag ;
        if(st.length%2 ==0){
            flag = 0;
        } else {
            flag = 2;
        }
        for(int i=0;i<st.length/2;i++){
            for(int j =0;j<st.length;j++){
                if(j< st.length/2-i || j> st.length/2+i ){
                    System.out.print(" \t");
                } else {
                    System.out.print(st[j]+"\t");
                }
            }
            System.out.println();
        }
        for(int i = st.length/2+1; i < st.length;i++){
            for(int j=0;j < st.length; j++){
                if(j <=i- st.length/2 || j >= 1.5* st.length-i-flag/*tuk*/){
                    System.out.print(" \t");
                } else {
                    System.out.print(st[j]+"\t");
                }
            }
            System.out.println();
        }
    }
}
