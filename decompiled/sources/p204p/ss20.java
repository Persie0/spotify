package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ss20 implements ts20 {

    /* JADX INFO: renamed from: a */
    public final c96 f213460a;

    /* JADX INFO: renamed from: b */
    public final c96 f213461b;

    /* JADX INFO: renamed from: c */
    public final c96 f213462c;

    public ss20(c96 c96Var, c96 c96Var2, c96 c96Var3) {
        this.f213460a = c96Var;
        this.f213461b = c96Var2;
        this.f213462c = c96Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ss20)) {
            return false;
        }
        ss20 ss20Var = (ss20) obj;
        return wj50.m88271j(this.f213460a, ss20Var.f213460a) && wj50.m88271j(this.f213461b, ss20Var.f213461b) && wj50.m88271j(this.f213462c, ss20Var.f213462c);
    }

    public final int hashCode() {
        return this.f213462c.hashCode() + ((this.f213461b.hashCode() + (this.f213460a.hashCode() * 31)) * 31);
    }
}
