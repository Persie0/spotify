package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class bgc0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ int f26906X;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ t5o0 f26907a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t5o0 f26908b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t5o0 f26909c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ t5o0 f26910d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f26911e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ t5o0 f26912f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ t5o0 f26913g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ long f26914h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f26915i;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ int f26916t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bgc0(t5o0 t5o0Var, t5o0 t5o0Var2, t5o0 t5o0Var3, t5o0 t5o0Var4, int i, t5o0 t5o0Var5, t5o0 t5o0Var6, long j, int i2, int i3, int i4, int i5) {
        super(1);
        this.f26907a = t5o0Var;
        this.f26908b = t5o0Var2;
        this.f26909c = t5o0Var3;
        this.f26910d = t5o0Var4;
        this.f26911e = i;
        this.f26912f = t5o0Var5;
        this.f26913g = t5o0Var6;
        this.f26914h = j;
        this.f26915i = i2;
        this.f26916t = i4;
        this.f26906X = i5;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        s5o0 s5o0Var = (s5o0) obj;
        t5o0 t5o0Var = this.f26907a;
        if (t5o0Var != null) {
            s5o0Var.m77294i(t5o0Var, 0, 0, 0.0f);
        }
        t5o0 t5o0Var2 = this.f26908b;
        s5o0Var.m77294i(t5o0Var2, 0, 0, 0.0f);
        int i = t5o0Var2.f217323b;
        t5o0 t5o0Var3 = this.f26909c;
        if (t5o0Var3 != null) {
            s5o0Var.m77294i(t5o0Var3, 0, i, 0.0f);
        }
        int i2 = this.f26911e;
        t5o0 t5o0Var4 = this.f26910d;
        if (t5o0Var4 != null) {
            s5o0Var.m77294i(t5o0Var4, b8j.m28430i(this.f26914h) - t5o0Var4.f217322a, ((t5o0Var2.f217323b + i2) - t5o0Var4.f217323b) / 2, 0.0f);
        }
        int i3 = i + i2;
        t5o0 t5o0Var5 = this.f26912f;
        if (t5o0Var5 != null) {
            s5o0Var.m77294i(t5o0Var5, 0, i3 + this.f26915i, 0.0f);
        }
        t5o0 t5o0Var6 = this.f26913g;
        if (t5o0Var6 != null) {
            s5o0Var.m77294i(t5o0Var6, 0, this.f26916t - this.f26906X, 0.0f);
        }
        return w2a1.f247311a;
    }
}
