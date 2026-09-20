package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e511 implements gi00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gh00 f56228a;

    public e511(gh00 gh00Var) {
        this.f56228a = gh00Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e511) {
            return wj50.m88271j(getFunctionDelegate(), ((gi00) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // p204p.gi00
    public final ai00 getFunctionDelegate() {
        return this.f56228a;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
