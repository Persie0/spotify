package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class hhu extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f91583a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t5o0 f91584b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t5o0 f91585c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f91586d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hhu(t5o0 t5o0Var, t5o0 t5o0Var2, int i, int i2) {
        super(1);
        this.f91583a = i2;
        this.f91584b = t5o0Var;
        this.f91585c = t5o0Var2;
        this.f91586d = i;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f91583a) {
            case 0:
                s5o0 s5o0Var = (s5o0) obj;
                t5o0 t5o0Var = this.f91584b;
                s5o0Var.m77294i(t5o0Var, 0, 0, 0.0f);
                s5o0Var.m77294i(this.f91585c, 0, t5o0Var.f217323b + this.f91586d, 0.0f);
                break;
            default:
                s5o0 s5o0Var2 = (s5o0) obj;
                t5o0 t5o0Var2 = this.f91584b;
                int i = t5o0Var2.f217323b;
                int i2 = this.f91586d;
                s5o0Var2.m77294i(t5o0Var2, 0, (i2 - i) / 2, 0.0f);
                int i3 = t5o0Var2.f217322a;
                t5o0 t5o0Var3 = this.f91585c;
                s5o0Var2.m77294i(t5o0Var3, i3, (i2 - t5o0Var3.f217323b) / 2, 0.0f);
                break;
        }
        return w2a1.f247311a;
    }
}
