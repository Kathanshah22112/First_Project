class StringBuffer1{
    public static void main(String args[]){
        StringBuffer sb = new StringBuffer("Kathan");
        sb.replace(2,4,"Shah");
        System.out.println(sb);
    }
}
class StringBuffer2{
    public static void main(String args[]){
        StringBuffer sb=new StringBuffer("Kathan");
        sb.reverse();
        System.out.println(sb);
    }
}
class StringBuffer3{
    public static void main(String args[]){
        StringBuffer sb=new StringBuffer("Kathan");
        sb.delete(1,3);
        System.out.println(sb);
    }
}

