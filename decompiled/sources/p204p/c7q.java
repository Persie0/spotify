package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c7q implements xhz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34976a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f34977b;

    public /* synthetic */ c7q(Object obj, int i) {
        this.f34976a = i;
        this.f34977b = obj;
    }

    @Override // p204p.xhz
    public final float invoke() {
        c581 state;
        c581 state2;
        switch (this.f34976a) {
            case 0:
                b581 b581Var = ((ch21) this.f34977b).f37883k;
                if (b581Var == null || (state = b581Var.getState()) == null) {
                    return 0.0f;
                }
                return state.f34107c.m84031v();
            default:
                b581 b581Var2 = ((sm91) this.f34977b).f210604o;
                if (b581Var2 == null || (state2 = b581Var2.getState()) == null) {
                    return 0.0f;
                }
                return state2.f34107c.m84031v();
        }
    }
}
