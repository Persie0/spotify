package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class f9f1 {

    /* JADX INFO: renamed from: a */
    public final byte[] f67266a;

    public f9f1(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        this.f67266a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i);
    }

    /* JADX INFO: renamed from: a */
    public static f9f1 m41055a(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("data must be non-null");
        }
        int length = bArr.length;
        int length2 = bArr.length;
        if (length > length2) {
            length = length2;
        }
        return new f9f1(bArr, length);
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m41056b() {
        byte[] bArr = this.f67266a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f9f1) {
            return Arrays.equals(((f9f1) obj).f67266a, this.f67266a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f67266a);
    }

    public final String toString() {
        byte[] bArr = this.f67266a;
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b : bArr) {
            sb.append("0123456789abcdef".charAt((b & 255) >> 4));
            sb.append("0123456789abcdef".charAt(b & 15));
        }
        String string = sb.toString();
        return dq60.m36618r(new StringBuilder(string.length() + 7), "Bytes(", string, ")");
    }
}
