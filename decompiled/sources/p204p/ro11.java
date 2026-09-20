package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ro11 {

    /* JADX INFO: renamed from: a */
    public final noa1 f201039a;

    /* JADX INFO: renamed from: b */
    public final lnn0 f201040b;

    /* JADX INFO: renamed from: c */
    public final boolean f201041c;

    /* JADX INFO: renamed from: d */
    public final boolean f201042d;

    /* JADX INFO: renamed from: e */
    public final boolean f201043e;

    public ro11(noa1 noa1Var, lnn0 lnn0Var, boolean z, boolean z2, boolean z3) {
        this.f201039a = noa1Var;
        this.f201040b = lnn0Var;
        this.f201041c = z;
        this.f201042d = z2;
        this.f201043e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ro11)) {
            return false;
        }
        ro11 ro11Var = (ro11) obj;
        return wj50.m88271j(this.f201039a, ro11Var.f201039a) && this.f201040b == ro11Var.f201040b && this.f201041c == ro11Var.f201041c && this.f201042d == ro11Var.f201042d && this.f201043e == ro11Var.f201043e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f201043e) + s571.m77245d(s571.m77245d((this.f201040b.hashCode() + (this.f201039a.hashCode() * 31)) * 31, 31, this.f201041c), 31, this.f201042d);
    }
}
