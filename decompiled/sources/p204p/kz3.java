package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class kz3 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f128002a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ oz3 f128003b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kz3(oz3 oz3Var, int i) {
        super(1);
        this.f128002a = i;
        this.f128003b = oz3Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f128002a) {
            case 0:
                ((rpz) this.f128003b.getFocusOwner()).m76203i(((roz) obj).f201376a, false);
                return w2a1.f247311a;
            default:
                oz3 oz3Var = this.f128003b;
                return new jl4(oz3Var, oz3Var.getTextInputService(), (xuk) obj);
        }
    }
}
