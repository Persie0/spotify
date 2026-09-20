package p204p;

import com.davidehrmann.vcdiff.util.VarInt$VarIntEndOfBufferException;
import com.davidehrmann.vcdiff.util.VarInt$VarIntParseException;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes16.dex */
public final class o1b1 {

    /* JADX INFO: renamed from: a */
    public int f160684a;

    /* JADX INFO: renamed from: b */
    public final int[] f160685b;

    /* JADX INFO: renamed from: c */
    public final int[] f160686c;

    public o1b1(short s, short s2) {
        if (s > 254 || s < 0) {
            throw new IllegalArgumentException("Near cache size " + ((int) s) + " is invalid");
        }
        if (s2 > 254 || s2 < 0) {
            throw new IllegalArgumentException("Same cache size " + ((int) s2) + " is invalid");
        }
        if (s + s2 <= 254) {
            this.f160685b = new int[s];
            this.f160686c = new int[s2 * 256];
            return;
        }
        throw new IllegalArgumentException("Using near cache size " + ((int) s) + " and same cache size " + ((int) s2) + " would exceed maximum number of COPY modes (256");
    }

    /* JADX INFO: renamed from: a */
    public final int m66048a(int i, short s, ByteBuffer byteBuffer) throws IOException {
        int i2;
        if (i < 0) {
            throw new IllegalStateException("DecodeAddress was passed a negative value for here_address: " + i);
        }
        if (byteBuffer.remaining() == 0) {
            return -2;
        }
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        int[] iArr = this.f160685b;
        short length = (short) (iArr.length + 2);
        int[] iArr2 = this.f160686c;
        if (s < length || s > m66049b()) {
            try {
                int iM37768b = e4b1.m37768b(byteBufferDuplicate);
                if (s == 0) {
                    i2 = iM37768b;
                } else if (s == 1) {
                    i2 = i - iM37768b;
                } else {
                    if (s < 2 || s >= ((short) (iArr.length + 2))) {
                        throw new IllegalArgumentException("Invalid mode value (" + ((int) s) + ") passed to DecodeAddress; maximum mode value = " + ((int) m66049b()));
                    }
                    i2 = iArr[s - 2] + iM37768b;
                }
            } catch (VarInt$VarIntEndOfBufferException unused) {
                return -2;
            } catch (VarInt$VarIntParseException unused2) {
                throw new IOException("Found invalid variable-length integer as encoded address value");
            }
        } else {
            i2 = iArr2[((s - ((short) (iArr.length + 2))) * 256) + ((short) (byteBufferDuplicate.get() & 255))];
        }
        if (i2 < 0) {
            throw new IOException("Decoded address " + i2 + " is invalid");
        }
        if (i2 >= i) {
            throw new IOException(String.format("Decoded address (%d) is beyond location in target file (%d)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
        if (iArr.length > 0) {
            int i3 = this.f160684a;
            iArr[i3] = i2;
            this.f160684a = (i3 + 1) % iArr.length;
        }
        if (iArr2.length > 0) {
            iArr2[i2 % iArr2.length] = i2;
        }
        byteBuffer.position(byteBufferDuplicate.position());
        return i2;
    }

    /* JADX INFO: renamed from: b */
    public final short m66049b() {
        return (byte) ((((short) (this.f160685b.length + 2)) + (this.f160686c.length / 256)) - 1);
    }
}
