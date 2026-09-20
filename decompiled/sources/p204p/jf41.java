package p204p;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Objects;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes5.dex */
public final class jf41 implements CharSequence {

    /* JADX INFO: renamed from: a */
    public final byte[] f111820a;

    /* JADX INFO: renamed from: b */
    public final byte[] f111821b;

    /* JADX INFO: renamed from: c */
    public final if41 f111822c;

    public jf41(String str, if41 if41Var) {
        byte[] bytes = str.getBytes(StandardCharsets.US_ASCII);
        this.f111820a = bytes;
        this.f111822c = if41Var;
        this.f111821b = new byte[bytes.length];
    }

    /* JADX INFO: renamed from: a */
    public static int m53151a(byte b) {
        if (b >= 48 && b <= 57) {
            return b - 48;
        }
        if (b >= 65 && b <= 70) {
            return b + MessagePack.Code.EXT32;
        }
        if (b < 97 || b > 102) {
            return -1;
        }
        return b - 87;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        throw new UnsupportedOperationException("Unsupported operation");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jf41.class != obj.getClass()) {
            return false;
        }
        return Objects.deepEquals(this.f111820a, ((jf41) obj).f111820a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f111820a);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f111820a.length;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        int i3 = 0;
        while (true) {
            byte[] bArr = this.f111821b;
            if (i >= i2) {
                return new String(bArr, 0, i3, StandardCharsets.UTF_8);
            }
            int i4 = i + 1;
            byte[] bArr2 = this.f111820a;
            byte b = bArr2[i];
            if (b >= 65) {
                i = i4;
            } else {
                if (b == 43) {
                    b = 32;
                } else if (b == 37) {
                    int i5 = i + 3;
                    if41 if41Var = this.f111822c;
                    if (i5 > i2) {
                        throw if41Var.f101648a.m61610c("Badly encoded character in Spotify uri");
                    }
                    int iM53151a = m53151a(bArr2[i4]);
                    int iM53151a2 = m53151a(bArr2[i + 2]);
                    if (iM53151a < 0 || iM53151a2 < 0) {
                        throw if41Var.f101648a.m61610c("Bad hex character in Spotify uri");
                    }
                    b = (byte) ((iM53151a * 16) + iM53151a2);
                    i = i5;
                }
                i = i4;
            }
            bArr[i3] = b;
            i3++;
        }
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return ((String) subSequence(0, this.f111820a.length)).toString();
    }
}
