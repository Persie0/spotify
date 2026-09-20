package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z671 implements xhz, gi00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ vys0 f279748a;

    public z671(vys0 vys0Var) {
        this.f279748a = vys0Var;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof xhz) && (obj instanceof gi00)) {
            return wj50.m88271j(getFunctionDelegate(), ((gi00) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // p204p.gi00
    public final ai00 getFunctionDelegate() {
        return this.f279748a;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // p204p.xhz
    public final float invoke() {
        return ((Number) this.f279748a.get()).floatValue();
    }
}
