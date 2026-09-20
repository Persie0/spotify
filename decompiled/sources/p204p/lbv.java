package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class lbv extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f131721a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t5o0 f131722b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lbv(t5o0 t5o0Var, int i) {
        super(1);
        this.f131721a = i;
        this.f131722b = t5o0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f131721a) {
            case 0:
                ((s5o0) obj).m77293f(this.f131722b, 0, 0, 0.0f);
                break;
            default:
                ((s5o0) obj).m77294i(this.f131722b, 0, 0, 0.0f);
                break;
        }
        return w2a1.f247311a;
    }
}
