package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class gf9 extends sz30 {

    /* JADX INFO: renamed from: b */
    public final byte[] f79307b;

    public gf9(String str, byte[] bArr) {
        super(str);
        this.f79307b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && gf9.class == obj.getClass()) {
            gf9 gf9Var = (gf9) obj;
            if (this.f215378a.equals(gf9Var.f215378a) && Arrays.equals(this.f79307b, gf9Var.f79307b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f79307b) + s571.m77243b(527, 31, this.f215378a);
    }
}
