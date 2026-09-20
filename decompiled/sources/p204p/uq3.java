package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class uq3 implements gi00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ th00 f232920a;

    public uq3(th00 th00Var) {
        this.f232920a = th00Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof uq3) {
            return wj50.m88271j(getFunctionDelegate(), ((gi00) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // p204p.gi00
    public final ai00 getFunctionDelegate() {
        return this.f232920a;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
