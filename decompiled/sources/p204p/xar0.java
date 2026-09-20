package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class xar0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f259745a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f259746b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vw8 f259747c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ float[] f259748d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ float f259749e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ float f259750f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ nlv0 f259751g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xar0(long j, long j2, vw8 vw8Var, float[] fArr, float f, float f2, nlv0 nlv0Var) {
        super(1);
        this.f259745a = j;
        this.f259746b = j2;
        this.f259747c = vw8Var;
        this.f259748d = fArr;
        this.f259749e = f;
        this.f259750f = f2;
        this.f259751g = nlv0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        vw8 vw8Var;
        float fM63436m = n0e1.m63436m(((((Number) obj).longValue() - this.f259745a) / 1000000) / this.f259746b, 0.0f, 1.0f);
        float fMo30276a = gqs.f83525c.mo30276a(fM63436m);
        int i = 0;
        while (true) {
            vw8Var = this.f259747c;
            if (i >= 24) {
                break;
            }
            vw8Var.f245427a.set(i, Float.valueOf((1.0f - fMo30276a) * this.f259748d[i]));
            i++;
        }
        float f = this.f259749e;
        vw8Var.f245428b.m84032w(edb.m38555d(this.f259750f, f, fMo30276a, f));
        if (fM63436m >= 1.0f) {
            this.f259751g.f155174a = true;
        }
        return w2a1.f247311a;
    }
}
