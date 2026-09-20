package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ob8 implements sb8 {

    /* JADX INFO: renamed from: a */
    public final String f163560a;

    /* JADX INFO: renamed from: b */
    public final oc8 f163561b;

    /* JADX INFO: renamed from: c */
    public final byte[] f163562c;

    public ob8(String str, oc8 oc8Var, byte[] bArr) {
        this.f163560a = str;
        this.f163561b = oc8Var;
        this.f163562c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ob8.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        ob8 ob8Var = (ob8) obj;
        return wj50.m88271j(this.f163560a, ob8Var.f163560a) && wj50.m88271j(this.f163561b, ob8Var.f163561b) && Arrays.equals(this.f163562c, ob8Var.f163562c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f163562c) + ((this.f163561b.hashCode() + (this.f163560a.hashCode() * 31)) * 31);
    }
}
