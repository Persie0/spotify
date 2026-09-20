package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class qid1 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f188992a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f188993b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f188994c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f188995d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ kqi0 f188996e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ r7g0 f188997f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ gh00 f188998g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f188999h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qid1(int i, int i2, int i3, int i4, kqi0 kqi0Var, r7g0 r7g0Var, gh00 gh00Var, int i5) {
        super(1);
        this.f188992a = i;
        this.f188993b = i2;
        this.f188994c = i3;
        this.f188995d = i4;
        this.f188996e = kqi0Var;
        this.f188997f = r7g0Var;
        this.f188998g = gh00Var;
        this.f188999h = i5;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        int iIntValue = ((Number) obj).intValue();
        int iMax = Math.max(-this.f188993b, Math.min(0, (this.f188995d - this.f188992a) - this.f188994c));
        kqi0 kqi0Var = this.f188996e;
        this.f188998g.invoke(new o7g0(lb81.f131601b, n0e1.m63437n((((uid1) kqi0Var.getValue()).f230669a ? this.f188997f.f196571a.f186104a.f24196b.f204183t : ((uid1) kqi0Var.getValue()).f230670b) + iIntValue, iMax, this.f188999h), false, true, iIntValue));
        return w2a1.f247311a;
    }
}
