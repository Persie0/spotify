package p204p;

import com.davidehrmann.vcdiff.util.VarInt$VarIntEndOfBufferException;
import com.davidehrmann.vcdiff.util.VarInt$VarIntParseException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes16.dex */
public abstract class e4b1 {
    static {
        bsa0.m30425b(e4b1.class);
    }

    /* JADX INFO: renamed from: a */
    public static int m37767a(int i) {
        int i2 = 0;
        for (int i3 = 28; i3 >= 0; i3 -= 7) {
            if ((i >> i3) != 0 || i3 == 0) {
                i2++;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: b */
    public static int m37768b(ByteBuffer byteBuffer) throws VarInt$VarIntParseException, VarInt$VarIntEndOfBufferException {
        int iPosition = byteBuffer.position();
        int i = 0;
        while (byteBuffer.hasRemaining()) {
            if (byteBuffer.position() - iPosition >= 5) {
                throw new VarInt$VarIntParseException("Data too long for a 32-bit int");
            }
            byte b = byteBuffer.get();
            int i2 = i + (b & 127);
            if ((b & 128) == 0) {
                return i2;
            }
            if (i2 > 16777215) {
                throw new VarInt$VarIntParseException("Value too large to fit in an int");
            }
            i = i2 << 7;
        }
        throw new VarInt$VarIntEndOfBufferException();
    }

    /* JADX INFO: renamed from: c */
    public static long m37769c(ByteBuffer byteBuffer) throws VarInt$VarIntParseException, VarInt$VarIntEndOfBufferException {
        int iPosition = byteBuffer.position();
        long j = 0;
        while (byteBuffer.hasRemaining()) {
            if (byteBuffer.position() - iPosition >= 10) {
                throw new VarInt$VarIntParseException("Data too long for a 64-bit int");
            }
            byte b = byteBuffer.get();
            long j2 = j + ((long) (b & 127));
            if ((b & 128) == 0) {
                if (j2 < 0) {
                    new Exception().printStackTrace();
                }
                return j2;
            }
            if (j2 > 72057594037927935L) {
                throw new VarInt$VarIntParseException("Value too large to fit in an int");
            }
            j = j2 << 7;
        }
        throw new VarInt$VarIntEndOfBufferException();
    }
}
