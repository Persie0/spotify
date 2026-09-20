package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ngv0 {

    /* JADX INFO: renamed from: a */
    public final rcm0 f153798a;

    /* JADX INFO: renamed from: b */
    public final qf40 f153799b;

    public ngv0(rcm0 rcm0Var, qf40 qf40Var) {
        this.f153798a = rcm0Var;
        this.f153799b = qf40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ngv0)) {
            return false;
        }
        ngv0 ngv0Var = (ngv0) obj;
        return wj50.m88271j(this.f153798a, ngv0Var.f153798a) && wj50.m88271j(this.f153799b, ngv0Var.f153799b);
    }

    public final int hashCode() {
        return this.f153799b.hashCode() + (this.f153798a.hashCode() * 31);
    }
}
