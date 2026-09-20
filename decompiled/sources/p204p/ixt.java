package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ixt implements ewr {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ slv0 f106759a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ slv0 f106760b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f106761c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ gh00 f106762d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ kqi0 f106763e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ kqi0 f106764f;

    public ixt(slv0 slv0Var, slv0 slv0Var2, String str, gh00 gh00Var, kqi0 kqi0Var, kqi0 kqi0Var2) {
        this.f106759a = slv0Var;
        this.f106760b = slv0Var2;
        this.f106761c = str;
        this.f106762d = gh00Var;
        this.f106763e = kqi0Var;
        this.f106764f = kqi0Var2;
    }

    @Override // p204p.ewr
    public final void dispose() {
        Object value = this.f106763e.getValue();
        mjh mjhVar = (mjh) this.f106764f.getValue();
        Object obj = this.f106759a.f210497a;
        if (obj == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        mif1.m61872e(value, mjhVar, 0, (xxt) obj, (b250) this.f106760b.f210497a, this.f106761c, this.f106762d);
    }
}
