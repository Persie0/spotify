package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class cx4 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ t5o0[] f42898a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ dx4 f42899b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f42900c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f42901d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cx4(t5o0[] t5o0VarArr, dx4 dx4Var, int i, int i2) {
        super(1);
        this.f42898a = t5o0VarArr;
        this.f42899b = dx4Var;
        this.f42900c = i;
        this.f42901d = i2;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        s5o0 s5o0Var = (s5o0) obj;
        for (t5o0 t5o0Var : this.f42898a) {
            if (t5o0Var != null) {
                long jMo66602a = this.f42899b.f53846a.f137717b.mo66602a((((long) t5o0Var.f217322a) << 32) | (((long) t5o0Var.f217323b) & 4294967295L), (((long) this.f42900c) << 32) | (((long) this.f42901d) & 4294967295L), ko70.f124556a);
                s5o0Var.m77293f(t5o0Var, (int) (jMo66602a >> 32), (int) (jMo66602a & 4294967295L), 0.0f);
            }
        }
        return w2a1.f247311a;
    }
}
