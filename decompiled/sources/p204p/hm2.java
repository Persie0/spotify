package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class hm2 {

    /* JADX INFO: renamed from: a */
    public final byte[] f92798a;

    public hm2(byte[] bArr) {
        this.f92798a = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hm2) {
            return Arrays.equals(this.f92798a, ((hm2) obj).f92798a);
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f92798a) * 31) - 1487394660;
    }
}
