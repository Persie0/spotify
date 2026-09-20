package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class zqr implements pjb1 {

    /* JADX INFO: renamed from: a */
    public final ro0 f285437a;

    /* JADX INFO: renamed from: b */
    public final boolean f285438b;

    public zqr(ro0 ro0Var, boolean z) {
        this.f285437a = ro0Var;
        this.f285438b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zqr)) {
            return false;
        }
        zqr zqrVar = (zqr) obj;
        return wj50.m88271j(this.f285437a, zqrVar.f285437a) && this.f285438b == zqrVar.f285438b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f285438b) + (this.f285437a.hashCode() * 31);
    }
}
