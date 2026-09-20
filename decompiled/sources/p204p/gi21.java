package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class gi21 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f80021a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f80022b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f80023c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ o6d0 f80024d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ t5o0 f80025e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gi21(hi21 hi21Var, long j, int i, int i2, o6d0 o6d0Var, t5o0 t5o0Var) {
        super(1);
        this.f80021a = j;
        this.f80022b = i;
        this.f80023c = i2;
        this.f80024d = o6d0Var;
        this.f80025e = t5o0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        s5o0 s5o0Var = (s5o0) obj;
        long j = (((long) this.f80022b) << 32) | (((long) this.f80023c) & 4294967295L);
        ko70 layoutDirection = this.f80024d.getLayoutDirection();
        long j2 = this.f80021a;
        float f = (((int) (j >> 32)) - ((int) (j2 >> 32))) / 2.0f;
        float f2 = (((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L))) / 2.0f;
        float f3 = layoutDirection == ko70.f124556a ? -1.0f : (-1) * (-1.0f);
        float f4 = 1;
        float f5 = (f3 + f4) * f;
        s5o0.m77286h(s5o0Var, this.f80025e, (((long) Math.round((f4 - 1.0f) * f2)) & 4294967295L) | (((long) Math.round(f5)) << 32));
        return w2a1.f247311a;
    }
}
