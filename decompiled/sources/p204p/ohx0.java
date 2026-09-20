package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public final class ohx0 implements phx0 {

    /* JADX INFO: renamed from: a */
    public final byte[] f165561a;

    public ohx0(byte[] bArr) {
        this.f165561a = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ohx0) && wj50.m88271j(this.f165561a, ((ohx0) obj).f165561a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f165561a);
    }
}
