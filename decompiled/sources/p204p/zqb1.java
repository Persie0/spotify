package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class zqb1 extends arb1 {

    /* JADX INFO: renamed from: a */
    public final z0r f285351a;

    /* JADX INFO: renamed from: b */
    public final int f285352b;

    public zqb1(z0r z0rVar, int i) {
        this.f285351a = z0rVar;
        this.f285352b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zqb1)) {
            return false;
        }
        zqb1 zqb1Var = (zqb1) obj;
        return wj50.m88271j(this.f285351a, zqb1Var.f285351a) && this.f285352b == zqb1Var.f285352b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f285352b) + (this.f285351a.hashCode() * 31);
    }
}
