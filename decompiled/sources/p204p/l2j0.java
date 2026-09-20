package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class l2j0 implements gi00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f129024a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qx0 f129025b;

    public /* synthetic */ l2j0(qx0 qx0Var, int i) {
        this.f129024a = i;
        this.f129025b = qx0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m57905a(String str, d850 d850Var) {
        switch (this.f129024a) {
            case 0:
                ((kb7) this.f129025b).invoke(str, d850Var);
                break;
            case 1:
                ((kb7) this.f129025b).invoke(str, d850Var);
                break;
            default:
                ((kb7) this.f129025b).invoke(str, d850Var);
                break;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f129024a) {
            case 0:
                if ((obj instanceof l2j0) && (obj instanceof gi00)) {
                    return wj50.m88271j(getFunctionDelegate(), ((gi00) obj).getFunctionDelegate());
                }
                return false;
            case 1:
                if ((obj instanceof l2j0) && (obj instanceof gi00)) {
                    return wj50.m88271j(getFunctionDelegate(), ((gi00) obj).getFunctionDelegate());
                }
                return false;
            default:
                if ((obj instanceof l2j0) && (obj instanceof gi00)) {
                    return wj50.m88271j(getFunctionDelegate(), ((gi00) obj).getFunctionDelegate());
                }
                return false;
        }
    }

    @Override // p204p.gi00
    public final ai00 getFunctionDelegate() {
        switch (this.f129024a) {
            case 0:
                break;
            case 1:
                break;
        }
        return (kb7) this.f129025b;
    }

    public final int hashCode() {
        switch (this.f129024a) {
            case 0:
                break;
            case 1:
                break;
        }
        return getFunctionDelegate().hashCode();
    }
}
