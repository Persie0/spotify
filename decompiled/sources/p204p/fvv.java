package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class fvv extends zug1 {

    /* JADX INFO: renamed from: c */
    public final ou31 f73873c;

    /* JADX INFO: renamed from: d */
    public final sr01 f73874d;

    /* JADX INFO: renamed from: e */
    public final int f73875e;

    /* JADX INFO: renamed from: f */
    public final boolean f73876f;

    public fvv(ou31 ou31Var, sr01 sr01Var, int i, boolean z) {
        this.f73873c = ou31Var;
        this.f73874d = sr01Var;
        this.f73875e = i;
        this.f73876f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fvv)) {
            return false;
        }
        fvv fvvVar = (fvv) obj;
        return wj50.m88271j(this.f73873c, fvvVar.f73873c) && wj50.m88271j(this.f73874d, fvvVar.f73874d) && this.f73875e == fvvVar.f73875e && this.f73876f == fvvVar.f73876f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f73876f) + f710.m40938f(this.f73875e, rkh0.m75733g(this.f73874d, this.f73873c.hashCode() * 31, 31), 31);
    }
}
