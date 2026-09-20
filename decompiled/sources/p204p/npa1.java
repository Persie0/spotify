package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class npa1 implements gi00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ eh00 f156907a;

    public npa1(e651 e651Var) {
        this.f156907a = e651Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m65318a() {
        this.f156907a.invoke();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof npa1) {
            return wj50.m88271j(getFunctionDelegate(), ((gi00) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // p204p.gi00
    public final ai00 getFunctionDelegate() {
        return this.f156907a;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
