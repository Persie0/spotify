package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class pc8 {

    /* JADX INFO: renamed from: a */
    public final String f175977a;

    /* JADX INFO: renamed from: b */
    public final oc8 f175978b;

    /* JADX INFO: renamed from: c */
    public final byte[] f175979c;

    public pc8(String str, oc8 oc8Var, byte[] bArr) {
        this.f175977a = str;
        this.f175978b = oc8Var;
        this.f175979c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!pc8.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        pc8 pc8Var = (pc8) obj;
        return wj50.m88271j(this.f175977a, pc8Var.f175977a) && wj50.m88271j(this.f175978b, pc8Var.f175978b) && Arrays.equals(this.f175979c, pc8Var.f175979c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f175979c) + ((this.f175978b.hashCode() + (this.f175977a.hashCode() * 31)) * 31);
    }
}
