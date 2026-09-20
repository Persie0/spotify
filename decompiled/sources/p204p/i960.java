package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class i960 implements m960 {

    /* JADX INFO: renamed from: a */
    public final String f99918a;

    /* JADX INFO: renamed from: b */
    public final lc8 f99919b;

    /* JADX INFO: renamed from: c */
    public final byte[] f99920c;

    public i960(String str, lc8 lc8Var, byte[] bArr) {
        this.f99918a = str;
        this.f99919b = lc8Var;
        this.f99920c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!i960.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        i960 i960Var = (i960) obj;
        return wj50.m88271j(this.f99918a, i960Var.f99918a) && wj50.m88271j(this.f99919b, i960Var.f99919b) && Arrays.equals(this.f99920c, i960Var.f99920c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f99920c) + ((this.f99919b.hashCode() + (this.f99918a.hashCode() * 31)) * 31);
    }
}
