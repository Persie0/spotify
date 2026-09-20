package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class sqf extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f213089a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t5o0 f213090b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f213091c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sqf(t5o0 t5o0Var, float f, int i) {
        super(1);
        this.f213089a = i;
        this.f213090b = t5o0Var;
        this.f213091c = f;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f213089a) {
            case 0:
                ((s5o0) obj).m77293f(this.f213090b, -((int) Math.floor(this.f213091c)), 0, 0.0f);
                break;
            default:
                s5o0 s5o0Var = (s5o0) obj;
                int iMo35990l0 = s5o0Var.mo35990l0(this.f213091c);
                t5o0 t5o0Var = this.f213090b;
                s5o0Var.m77293f(t5o0Var, 0, iMo35990l0 - ((t5o0Var.f217323b * 2) / 3), 0.0f);
                break;
        }
        return w2a1.f247311a;
    }
}
