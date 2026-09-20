package p204p;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pxy extends q3d0 {
    /* JADX INFO: renamed from: V */
    public static boolean m71562V(File file) {
        dxy dxyVar = new dxy(new fxy(file));
        while (true) {
            boolean z = true;
            while (dxyVar.hasNext()) {
                File file2 = (File) dxyVar.next();
                if (file2.delete() || !file2.exists()) {
                    if (z) {
                    }
                }
                z = false;
            }
            return z;
        }
    }

    /* JADX INFO: renamed from: W */
    public static byte[] m71563W(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i = (int) length;
            byte[] bArrCopyOf = new byte[i];
            int i2 = i;
            int i3 = 0;
            while (i2 > 0) {
                int i4 = fileInputStream.read(bArrCopyOf, i3, i2);
                if (i4 < 0) {
                    break;
                }
                i2 -= i4;
                i3 += i4;
            }
            if (i2 > 0) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i3);
            } else {
                int i5 = fileInputStream.read();
                if (i5 != -1) {
                    dox doxVar = new dox(8193);
                    doxVar.write(i5);
                    kgg1.m56350m(fileInputStream, doxVar);
                    int size = doxVar.size() + i;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] bArrM36553a = doxVar.m36553a();
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, size);
                    System.arraycopy(bArrM36553a, 0, bArrCopyOf, i, doxVar.size());
                }
            }
            fileInputStream.close();
            return bArrCopyOf;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                n0e1.m63430g(fileInputStream, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: X */
    public static String m71564X(File file) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), vuc.f244913a);
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[8192];
            for (int i = inputStreamReader.read(cArr); i >= 0; i = inputStreamReader.read(cArr)) {
                stringWriter.write(cArr, 0, i);
            }
            String string = stringWriter.toString();
            inputStreamReader.close();
            return string;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                n0e1.m63430g(inputStreamReader, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: Y */
    public static File m71565Y(File file, String str) {
        int length;
        int iM88457G0;
        File file2 = new File(str);
        String path = file2.getPath();
        char c = File.separatorChar;
        int iM88457G1 = wl51.m88457G0(path, c, 0, 4);
        if (iM88457G1 == 0) {
            if (path.length() <= 1 || path.charAt(1) != c || (iM88457G0 = wl51.m88457G0(path, c, 2, 4)) < 0) {
                length = 1;
            } else {
                int iM88457G2 = wl51.m88457G0(path, c, iM88457G0 + 1, 4);
                length = iM88457G2 >= 0 ? iM88457G2 + 1 : path.length();
            }
        } else if (iM88457G1 <= 0 || path.charAt(iM88457G1 - 1) != ':') {
            length = (iM88457G1 == -1 && wl51.m88502z0(path, ':')) ? path.length() : 0;
        } else {
            length = iM88457G1 + 1;
        }
        if (length > 0) {
            return file2;
        }
        String string = file.toString();
        if ((string.length() == 0) || wl51.m88502z0(string, c)) {
            return new File(string + file2);
        }
        return new File(string + c + file2);
    }

    /* JADX INFO: renamed from: Z */
    public static void m71566Z(File file, byte[] bArr) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bArr);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                n0e1.m63430g(fileOutputStream, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: a0 */
    public static final void m71567a0(FileOutputStream fileOutputStream, String str, Charset charset) throws IOException {
        if (str.length() < 16384) {
            fileOutputStream.write(str.getBytes(charset));
            return;
        }
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder charsetEncoderOnUnmappableCharacter = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        wj50.m88279p(charsetEncoderOnUnmappableCharacter);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8192 * ((int) Math.ceil(charsetEncoderOnUnmappableCharacter.maxBytesPerChar())));
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int iMin = Math.min(8192 - i2, str.length() - i);
            int i3 = i + iMin;
            str.getChars(i, i3, charBufferAllocate.array(), i2);
            charBufferAllocate.limit(iMin + i2);
            i2 = 1;
            if (!charsetEncoderOnUnmappableCharacter.encode(charBufferAllocate, byteBufferAllocate, i3 == str.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.");
            }
            fileOutputStream.write(byteBufferAllocate.array(), 0, byteBufferAllocate.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i2 = 0;
            }
            charBufferAllocate.clear();
            byteBufferAllocate.clear();
            i = i3;
        }
    }
}
