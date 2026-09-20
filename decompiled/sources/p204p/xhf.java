package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class xhf {

    /* JADX INFO: renamed from: a */
    public final qf40 f261566a;

    /* JADX INFO: renamed from: b */
    public final ern0 f261567b;

    /* JADX INFO: renamed from: c */
    public final ern0 f261568c;

    public xhf(qf40 qf40Var, ern0 ern0Var, ern0 ern0Var2) {
        this.f261566a = qf40Var;
        this.f261567b = ern0Var;
        this.f261568c = ern0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xhf)) {
            return false;
        }
        xhf xhfVar = (xhf) obj;
        return wj50.m88271j(this.f261566a, xhfVar.f261566a) && wj50.m88271j(this.f261567b, xhfVar.f261567b) && wj50.m88271j(this.f261568c, xhfVar.f261568c);
    }

    public final int hashCode() {
        return this.f261568c.hashCode() + ((this.f261567b.hashCode() + (this.f261566a.hashCode() * 31)) * 31);
    }
}
