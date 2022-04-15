import java.io.IOException;
import java.io.RandomAccessFile;

public class rndexam {
    public static void main(String [] args) throws IOException {
        RandomAccessFile rf = new RandomAccessFile("/Users/mac/Desktop/programming/Java/onclass/Luong5/demo.txt","rw");
        rf.writeBoolean(true);
        rf.writeInt(80);
        rf.writeChar('C');
        rf.writeDouble(8.5);

        rf.seek(1);
        System.out.println(rf.readInt());
        System.out.println(rf.readChar());
        System.out.println(rf.readDouble());
        rf.seek(0);

        System.out.println(rf.readBoolean());
        rf.close();
    }
}
