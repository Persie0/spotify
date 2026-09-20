package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class res extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f198425a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f198426b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f198427c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f198428d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ uum0 f198429e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ uum0 f198430f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public res(boolean z, boolean z2, boolean z3, boolean z4, uum0 uum0Var, uum0 uum0Var2) {
        super(1);
        this.f198425a = z;
        this.f198426b = z2;
        this.f198427c = z3;
        this.f198428d = z4;
        this.f198429e = uum0Var;
        this.f198430f = uum0Var2;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        ges gesVar = (ges) obj;
        gesVar.m44522a(no40.f156576a, 0.0f);
        if (this.f198425a && this.f198426b) {
            gesVar.m44522a(no40.f156577b, -this.f198429e.m84031v());
        }
        if (this.f198427c && this.f198428d) {
            gesVar.m44522a(no40.f156578c, this.f198430f.m84031v());
        }
        return w2a1.f247311a;
    }
}
