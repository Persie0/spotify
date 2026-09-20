package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class vfu extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f241030a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t5o0 f241031b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f241032c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f241033d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ t5o0 f241034e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f241035f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vfu(t5o0 t5o0Var, int i, int i2, t5o0 t5o0Var2, int i3) {
        super(1);
        this.f241031b = t5o0Var;
        this.f241032c = i;
        this.f241033d = i2;
        this.f241034e = t5o0Var2;
        this.f241035f = i3;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f241030a) {
            case 0:
                s5o0 s5o0Var = (s5o0) obj;
                s5o0Var.m77293f(this.f241031b, this.f241032c, 0, 0.0f);
                s5o0Var.m77293f(this.f241034e, this.f241033d, this.f241035f, 0.0f);
                break;
            default:
                s5o0 s5o0Var2 = (s5o0) obj;
                int i = this.f241033d;
                int i2 = this.f241032c;
                s5o0Var2.m77293f(this.f241031b, i2, i, 0.0f);
                s5o0Var2.m77293f(this.f241034e, i2, this.f241035f, 0.0f);
                break;
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vfu(t5o0 t5o0Var, int i, t5o0 t5o0Var2, int i2, int i3) {
        super(1);
        this.f241031b = t5o0Var;
        this.f241032c = i;
        this.f241034e = t5o0Var2;
        this.f241033d = i2;
        this.f241035f = i3;
    }
}
