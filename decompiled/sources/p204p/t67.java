package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class t67 implements x67 {

    /* JADX INFO: renamed from: a */
    public final byte[] f217458a;

    public t67(byte[] bArr) {
        this.f217458a = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t67) {
            return Arrays.equals(this.f217458a, ((t67) obj).f217458a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f217458a);
    }
}
