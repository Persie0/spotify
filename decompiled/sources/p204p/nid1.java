package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class nid1 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ o690 f154234a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f154235b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f154236c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f154237d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ kqi0 f154238e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ r7g0 f154239f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ gh00 f154240g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f154241h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nid1(o690 o690Var, int i, int i2, int i3, kqi0 kqi0Var, r7g0 r7g0Var, gh00 gh00Var, int i4) {
        super(1);
        this.f154234a = o690Var;
        this.f154235b = i;
        this.f154236c = i2;
        this.f154237d = i3;
        this.f154238e = kqi0Var;
        this.f154239f = r7g0Var;
        this.f154240g = gh00Var;
        this.f154241h = i4;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        int iIntValue = ((Number) obj).intValue();
        int i = this.f154234a.f162291d;
        int iMin = Math.min(i, Math.max(Math.max(0, i - this.f154235b), this.f154236c + i + this.f154237d));
        kqi0 kqi0Var = this.f154238e;
        this.f154240g.invoke(new o7g0(lb81.f131600a, n0e1.m63437n((((uid1) kqi0Var.getValue()).f230669a ? this.f154239f.f196571a.f186104a.f24196b.f204182i : ((uid1) kqi0Var.getValue()).f230670b) + iIntValue, this.f154241h, iMin), false, true, iIntValue));
        return w2a1.f247311a;
    }
}
