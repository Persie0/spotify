package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class htx implements gi00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gh00 f95207a;

    public htx(gh00 gh00Var) {
        this.f95207a = gh00Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof htx) {
            return wj50.m88271j(getFunctionDelegate(), ((gi00) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // p204p.gi00
    public final ai00 getFunctionDelegate() {
        return this.f95207a;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
