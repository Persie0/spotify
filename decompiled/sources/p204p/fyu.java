package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class fyu extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ t5o0 f74847a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f74848b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f74849c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ t5o0 f74850d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f74851e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ t5o0 f74852f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ t5o0 f74853g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f74854h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f74855i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fyu(t5o0 t5o0Var, int i, int i2, t5o0 t5o0Var2, int i3, t5o0 t5o0Var3, t5o0 t5o0Var4, int i4, int i5) {
        super(1);
        this.f74847a = t5o0Var;
        this.f74848b = i;
        this.f74849c = i2;
        this.f74850d = t5o0Var2;
        this.f74851e = i3;
        this.f74852f = t5o0Var3;
        this.f74853g = t5o0Var4;
        this.f74854h = i4;
        this.f74855i = i5;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        s5o0 s5o0Var = (s5o0) obj;
        t5o0 t5o0Var = this.f74847a;
        if (t5o0Var != null) {
            s5o0Var.m77294i(t5o0Var, 0, 0, 0.0f);
        }
        int i = this.f74848b + this.f74849c;
        int i2 = this.f74851e;
        t5o0 t5o0Var2 = this.f74850d;
        s5o0Var.m77294i(t5o0Var2, i2, i, 0.0f);
        int i3 = i + t5o0Var2.f217323b;
        t5o0 t5o0Var3 = this.f74852f;
        if (t5o0Var3 != null) {
            int i4 = i3 + this.f74854h;
            s5o0Var.m77294i(t5o0Var3, i2, i4, 0.0f);
            i3 = i4 + t5o0Var3.f217323b;
        }
        t5o0 t5o0Var4 = this.f74853g;
        if (t5o0Var4 != null) {
            s5o0Var.m77294i(t5o0Var4, i2, i3 + this.f74855i, 0.0f);
        }
        return w2a1.f247311a;
    }
}
