package p204p;

/* JADX INFO: renamed from: p.kg */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2051kg implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f122249a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t5o0 f122250b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f122251c;

    public /* synthetic */ C2051kg(t5o0 t5o0Var, int i, int i2) {
        this.f122249a = i2;
        this.f122250b = t5o0Var;
        this.f122251c = i;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        s5o0 s5o0Var = (s5o0) obj;
        switch (this.f122249a) {
            case 0:
                s5o0Var.m77293f(this.f122250b, -this.f122251c, 0, 0.0f);
                break;
            case 1:
                s5o0Var.m77293f(this.f122250b, 0, -this.f122251c, 0.0f);
                break;
            default:
                s5o0Var.m77293f(this.f122250b, 0, -this.f122251c, 0.0f);
                break;
        }
        return w2a1.f247311a;
    }
}
