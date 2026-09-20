package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ri41 implements ti41 {

    /* JADX INFO: renamed from: a */
    public final oi41 f199436a;

    /* JADX INFO: renamed from: b */
    public final xi41 f199437b;

    public ri41(oi41 oi41Var, xi41 xi41Var) {
        this.f199436a = oi41Var;
        this.f199437b = xi41Var;
    }

    @Override // p204p.ti41
    /* JADX INFO: renamed from: a */
    public final oi41 mo72853a() {
        return this.f199436a;
    }

    @Override // p204p.ti41
    /* JADX INFO: renamed from: b */
    public final xi41 mo72854b() {
        return this.f199437b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ri41)) {
            return false;
        }
        ri41 ri41Var = (ri41) obj;
        return wj50.m88271j(this.f199436a, ri41Var.f199436a) && wj50.m88271j(this.f199437b, ri41Var.f199437b);
    }

    public final int hashCode() {
        return this.f199437b.hashCode() + (this.f199436a.hashCode() * 31);
    }
}
