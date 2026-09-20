package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jx40 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f116796a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f116797b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t5o0 f116798c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f116799d;

    public /* synthetic */ jx40(int i, t5o0 t5o0Var, int i2, int i3) {
        this.f116796a = i3;
        this.f116797b = i;
        this.f116798c = t5o0Var;
        this.f116799d = i2;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f116796a) {
            case 0:
                ((s5o0) obj).m77293f(this.f116798c, this.f116797b, this.f116799d, 0.0f);
                break;
            case 1:
                t5o0 t5o0Var = this.f116798c;
                ((s5o0) obj).m77293f(t5o0Var, q3d0.m72083N((this.f116797b - t5o0Var.f217322a) / 2.0f), q3d0.m72083N((this.f116799d - t5o0Var.f217323b) / 2.0f), 0.0f);
                break;
            case 2:
                t5o0 t5o0Var2 = this.f116798c;
                ((s5o0) obj).m77293f(t5o0Var2, q3d0.m72083N((this.f116797b - t5o0Var2.f217322a) / 2.0f), q3d0.m72083N((this.f116799d - t5o0Var2.f217323b) / 2.0f), 0.0f);
                break;
            default:
                ((s5o0) obj).m77293f(this.f116798c, this.f116797b, this.f116799d, 0.0f);
                break;
        }
        return w2a1.f247311a;
    }

    public /* synthetic */ jx40(t5o0 t5o0Var, int i, int i2, int i3) {
        this.f116796a = i3;
        this.f116798c = t5o0Var;
        this.f116797b = i;
        this.f116799d = i2;
    }
}
