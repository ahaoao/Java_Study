package testFive_2;

public class PathCut {
    public static void strCut(String s){
        int start = s.lastIndexOf("\\");
        int end = s.lastIndexOf(".");
        String fileName = s.substring(start+1,end);
        String file = s.substring(0,start);
        String fileType = s.substring(end+1,s.length());
        System.out.println("文件目录为： "+ file);
        System.out.println("文件名： "+fileName);
        System.out.println("文件类型： "+fileType);
    }
}
