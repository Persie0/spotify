package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class u0d0 implements onp {

    /* JADX INFO: renamed from: L0 */
    public volatile boolean f225451L0;

    /* JADX INFO: renamed from: X */
    public volatile boolean f225452X;

    /* JADX INFO: renamed from: Y */
    public volatile boolean f225453Y;

    /* JADX INFO: renamed from: Z */
    public volatile boolean f225454Z;

    /* JADX INFO: renamed from: a */
    public final l5j0 f225455a;

    /* JADX INFO: renamed from: b */
    public final wvp f225456b;

    /* JADX INFO: renamed from: c */
    public final z9j0 f225457c;

    /* JADX INFO: renamed from: d */
    public final String f225458d = xoc1.f264109i6.f243453a;

    /* JADX INFO: renamed from: e */
    public final h7m f225459e = new h7m(this, 3);

    /* JADX INFO: renamed from: f */
    public final bcp f225460f = new bcp(this, 1);

    /* JADX INFO: renamed from: g */
    public String f225461g;

    /* JADX INFO: renamed from: h */
    public String f225462h;

    /* JADX INFO: renamed from: i */
    public int f225463i;

    /* JADX INFO: renamed from: t */
    public Integer f225464t;

    public u0d0(l5j0 l5j0Var, wvp wvpVar, z9j0 z9j0Var, hc80 hc80Var) {
        this.f225455a = l5j0Var;
        this.f225456b = wvpVar;
        this.f225457c = z9j0Var;
        hc80Var.getLifecycle().mo31986a(this);
    }

    @Override // p204p.onp
    public final void onCreate(hc80 hc80Var) {
        this.f225455a.mo58244g(this.f225459e);
        this.f225456b.f255544b.add(this.f225460f);
    }

    @Override // p204p.onp
    public final void onDestroy(hc80 hc80Var) {
        this.f225451L0 = true;
        this.f225455a.mo58242e(this.f225459e);
        wvp wvpVar = this.f225456b;
        wvpVar.f255544b.remove(this.f225460f);
    }
}
