package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class zp90 extends sq90 {

    /* JADX INFO: renamed from: a */
    public final qp90 f285025a;

    /* JADX INFO: renamed from: b */
    public final boolean f285026b;

    public zp90(qp90 qp90Var, boolean z) {
        this.f285025a = qp90Var;
        this.f285026b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zp90)) {
            return false;
        }
        zp90 zp90Var = (zp90) obj;
        return wj50.m88271j(this.f285025a, zp90Var.f285025a) && this.f285026b == zp90Var.f285026b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f285026b) + (this.f285025a.hashCode() * 31);
    }
}
