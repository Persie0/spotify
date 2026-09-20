package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class gtx implements gi00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gh00 f84302a;

    public gtx(gh00 gh00Var) {
        this.f84302a = gh00Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gtx) {
            return wj50.m88271j(getFunctionDelegate(), ((gi00) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // p204p.gi00
    public final ai00 getFunctionDelegate() {
        return this.f84302a;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
