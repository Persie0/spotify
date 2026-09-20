package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vq3 implements gi00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ eh00 f243864a;

    public vq3(eh00 eh00Var) {
        this.f243864a = eh00Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vq3) {
            return wj50.m88271j(getFunctionDelegate(), ((gi00) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // p204p.gi00
    public final ai00 getFunctionDelegate() {
        return this.f243864a;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
