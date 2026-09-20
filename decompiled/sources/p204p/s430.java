package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class s430 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f205424a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t5o0 f205425b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f205426c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f205427d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s430(t5o0 t5o0Var, int i, int i2, int i3) {
        super(1);
        this.f205424a = i3;
        this.f205425b = t5o0Var;
        this.f205426c = i;
        this.f205427d = i2;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f205424a) {
            case 0:
                ((s5o0) obj).m77294i(this.f205425b, this.f205426c, this.f205427d, 0.0f);
                break;
            case 1:
                ((s5o0) obj).m77293f(this.f205425b, -this.f205426c, -this.f205427d, 0.0f);
                break;
            case 2:
                ((s5o0) obj).m77294i(this.f205425b, this.f205426c, this.f205427d, 0.0f);
                break;
            default:
                int i = this.f205426c;
                t5o0 t5o0Var = this.f205425b;
                ((s5o0) obj).m77294i(t5o0Var, (i - t5o0Var.f217322a) / 2, (this.f205427d - t5o0Var.f217323b) / 2, 0.0f);
                break;
        }
        return w2a1.f247311a;
    }
}
