package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class xs9 implements bqs, gi00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f265542a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f265543b;

    public /* synthetic */ xs9(int i, gh00 gh00Var) {
        this.f265542a = i;
        this.f265543b = gh00Var;
    }

    @Override // p204p.bqs
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ float mo30276a(float f) {
        switch (this.f265542a) {
            case 0:
                break;
        }
        return ((Number) this.f265543b.invoke(Float.valueOf(f))).floatValue();
    }

    public final boolean equals(Object obj) {
        switch (this.f265542a) {
            case 0:
                if ((obj instanceof bqs) && (obj instanceof gi00)) {
                    return wj50.m88271j(getFunctionDelegate(), ((gi00) obj).getFunctionDelegate());
                }
                return false;
            default:
                if ((obj instanceof bqs) && (obj instanceof gi00)) {
                    return wj50.m88271j(getFunctionDelegate(), ((gi00) obj).getFunctionDelegate());
                }
                return false;
        }
    }

    @Override // p204p.gi00
    public final ai00 getFunctionDelegate() {
        switch (this.f265542a) {
            case 0:
                break;
        }
        return this.f265543b;
    }

    public final int hashCode() {
        switch (this.f265542a) {
            case 0:
                break;
        }
        return getFunctionDelegate().hashCode();
    }
}
