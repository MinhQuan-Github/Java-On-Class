import java.io.*;

public class DataIODemo {
    public static void main(String [] args ) throws IOException {
        DataOutputStream out = new DataOutputStream(new FileOutputStream("/Users/mac/Desktop/programming/Java/onclass/Luong4/output.txt"));
        out.write((35));
        out.writeLong(12345678);
        out.writeDouble(123.45678);
        out.writeFloat(123.4567899f);
        out.writeBoolean(true);
        out.writeUTF("Day la xau ki tu xyz");
        out.close();

        DataInputStream in = new DataInputStream(new FileInputStream("/Users/mac/Desktop/programming/Java/onclass/Luong4/input.txt"));
        try {
            System.out.println("Gia tri nguyen " + in.readInt());
            System.out.println("Gia tri long " + in.readLong());
            System.out.println("Gia tri double " + in.readDouble());
            System.out.println("Gia tri float " + in.readFloat());
            System.out.println("Gia tri boolean " + in.readBoolean());
            System.out.println("Gia tri xau " + in.readUTF());
        } catch (Exception e) {
            System.out.println("Loi");
        }
        in.close();
    }
}
