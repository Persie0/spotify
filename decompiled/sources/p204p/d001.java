package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class d001 implements e001 {

    /* JADX INFO: renamed from: a */
    public final d201 f43690a;

    /* JADX INFO: renamed from: b */
    public final d201 f43691b;

    public d001(d201 d201Var, d201 d201Var2) {
        this.f43690a = d201Var;
        this.f43691b = d201Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d001)) {
            return false;
        }
        d001 d001Var = (d001) obj;
        return wj50.m88271j(this.f43690a, d001Var.f43690a) && wj50.m88271j(this.f43691b, d001Var.f43691b);
    }

    public final int hashCode() {
        return this.f43691b.hashCode() + (this.f43690a.hashCode() * 31);
    }
}
