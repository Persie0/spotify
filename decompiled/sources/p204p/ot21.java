package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ot21 {

    /* JADX INFO: renamed from: a */
    public final th00 f168954a;

    /* JADX INFO: renamed from: b */
    public final fyf f168955b;

    /* JADX INFO: renamed from: c */
    public final Object f168956c;

    public /* synthetic */ ot21(int i, eh00 eh00Var) {
        this((i & 1) != 0 ? null : eag.f57664a, t9h.f218298a, eh00Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ot21)) {
            return false;
        }
        ot21 ot21Var = (ot21) obj;
        return wj50.m88271j(this.f168954a, ot21Var.f168954a) && wj50.m88271j(this.f168955b, ot21Var.f168955b) && wj50.m88271j(this.f168956c, ot21Var.f168956c);
    }

    public final int hashCode() {
        th00 th00Var = this.f168954a;
        return this.f168956c.hashCode() + ((this.f168955b.hashCode() + ((th00Var == null ? 0 : th00Var.hashCode()) * 31)) * 31);
    }

    public ot21(th00 th00Var, fyf fyfVar, eh00 eh00Var) {
        this.f168954a = th00Var;
        this.f168955b = fyfVar;
        this.f168956c = eh00Var;
    }
}
