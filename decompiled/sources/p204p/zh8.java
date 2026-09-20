package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class zh8 {

    /* JADX INFO: renamed from: a */
    public final oc8 f282825a;

    /* JADX INFO: renamed from: b */
    public final byte[] f282826b;

    public zh8(oc8 oc8Var, byte[] bArr) {
        this.f282825a = oc8Var;
        this.f282826b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zh8)) {
            return false;
        }
        zh8 zh8Var = (zh8) obj;
        return wj50.m88271j(this.f282825a, zh8Var.f282825a) && wj50.m88271j(this.f282826b, zh8Var.f282826b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f282826b) + (this.f282825a.hashCode() * 31);
    }
}
