package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class sx21 extends ux21 {

    /* JADX INFO: renamed from: a */
    public final int f214792a;

    /* JADX INFO: renamed from: b */
    public final uv11 f214793b;

    /* JADX INFO: renamed from: c */
    public final d850 f214794c;

    public sx21(int i, uv11 uv11Var, d850 d850Var) {
        this.f214792a = i;
        this.f214793b = uv11Var;
        this.f214794c = d850Var;
    }

    @Override // p204p.ux21
    /* JADX INFO: renamed from: a */
    public final int mo79571a() {
        return this.f214792a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sx21)) {
            return false;
        }
        sx21 sx21Var = (sx21) obj;
        return this.f214792a == sx21Var.f214792a && this.f214793b == sx21Var.f214793b && wj50.m88271j(this.f214794c, sx21Var.f214794c);
    }

    public final int hashCode() {
        int iHashCode = (this.f214793b.hashCode() + (Integer.hashCode(this.f214792a) * 31)) * 31;
        d850 d850Var = this.f214794c;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
