package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rhe0 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f199208a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f199209b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f199210c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f199211d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f199212e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f199213f;

    public /* synthetic */ rhe0(gb20 gb20Var, qlv0 qlv0Var, qlv0 qlv0Var2, d971 d971Var, boolean z) {
        this.f199210c = qlv0Var;
        this.f199211d = d971Var;
        this.f199209b = z;
        this.f199212e = gb20Var;
        this.f199213f = qlv0Var2;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        float fFloatValue;
        switch (this.f199208a) {
            case 0:
                yum0 yum0Var = ((oqi0) this.f199210c).f168299d;
                kqi0 kqi0Var = (kqi0) this.f199211d;
                rv41 rv41Var = (rv41) this.f199212e;
                rv41 rv41Var2 = (rv41) this.f199213f;
                fdx0 fdx0Var = (fdx0) obj;
                boolean z = this.f199209b;
                float fFloatValue2 = 0.8f;
                float fFloatValue3 = 1.0f;
                if (z) {
                    fFloatValue = ((Boolean) yum0Var.getValue()).booleanValue() ? 1.0f : 0.8f;
                } else {
                    fFloatValue = ((Number) rv41Var.getValue()).floatValue();
                }
                fdx0Var.m41390m(fFloatValue);
                if (!z) {
                    fFloatValue2 = ((Number) rv41Var.getValue()).floatValue();
                } else if (((Boolean) yum0Var.getValue()).booleanValue()) {
                    fFloatValue2 = 1.0f;
                }
                fdx0Var.m41391o(fFloatValue2);
                if (!z) {
                    fFloatValue3 = ((Number) rv41Var2.getValue()).floatValue();
                } else if (!((Boolean) yum0Var.getValue()).booleanValue()) {
                    fFloatValue3 = 0.0f;
                }
                fdx0Var.m41380b(fFloatValue3);
                fdx0Var.m41395u(((i591) kqi0Var.getValue()).f98851a);
                break;
            default:
                qlv0 qlv0Var = (qlv0) this.f199210c;
                d971 d971Var = (d971) this.f199211d;
                gb20 gb20Var = (gb20) this.f199212e;
                qlv0 qlv0Var2 = (qlv0) this.f199213f;
                long jM59317a = llz0.m59317a(d971Var.m35337o(this.f199209b));
                qlv0Var.f189932a = jM59317a;
                d971Var.m35325A(gb20Var, jM59317a);
                qlv0Var2.f189932a = 0L;
                d971Var.f46736w = -1;
                break;
        }
        return w2a1.f247311a;
    }

    public /* synthetic */ rhe0(boolean z, oqi0 oqi0Var, kqi0 kqi0Var, w691 w691Var, w691 w691Var2) {
        this.f199209b = z;
        this.f199210c = oqi0Var;
        this.f199211d = kqi0Var;
        this.f199212e = w691Var;
        this.f199213f = w691Var2;
    }
}
