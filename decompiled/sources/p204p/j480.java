package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class j480 {

    /* JADX INFO: renamed from: a */
    public final fc0 f108618a;

    /* JADX INFO: renamed from: b */
    public final t2b0 f108619b;

    public j480(fc0 fc0Var, t2b0 t2b0Var) {
        this.f108618a = fc0Var;
        this.f108619b = t2b0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j480)) {
            return false;
        }
        j480 j480Var = (j480) obj;
        return wj50.m88271j(this.f108618a, j480Var.f108618a) && wj50.m88271j(this.f108619b, j480Var.f108619b);
    }

    public final int hashCode() {
        return this.f108619b.hashCode() + (this.f108618a.hashCode() * 31);
    }
}
