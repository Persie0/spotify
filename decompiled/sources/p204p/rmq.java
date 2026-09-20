package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class rmq implements q8f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f200604a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f200605b;

    public /* synthetic */ rmq(Object obj, int i) {
        this.f200604a = i;
        this.f200605b = obj;
    }

    @Override // p204p.q8f
    /* JADX INFO: renamed from: a */
    public final long mo43136a() {
        switch (this.f200604a) {
            case 0:
                smq smqVar = (smq) this.f200605b;
                long jMo43136a = smqVar.f210704S0.mo43136a();
                if (jMo43136a != 16) {
                    return jMo43136a;
                }
                qgx0 qgx0Var = (qgx0) oqg1.m67639h(smqVar, vgx0.f241335a);
                if (qgx0Var != null) {
                    long j = qgx0Var.f188578a;
                    if (j != 16) {
                        return j;
                    }
                }
                return ((n6f) oqg1.m67639h(smqVar, egj.f59351a)).f150873a;
            case 1:
                smq smqVar2 = (smq) this.f200605b;
                long jMo43136a2 = smqVar2.f210704S0.mo43136a();
                if (jMo43136a2 != 16) {
                    return jMo43136a2;
                }
                rgx0 rgx0Var = (rgx0) oqg1.m67639h(smqVar2, wgx0.f251195a);
                if (rgx0Var != null) {
                    long j2 = rgx0Var.f199042a;
                    if (j2 != 16) {
                        return j2;
                    }
                }
                long j3 = ((n6f) oqg1.m67639h(smqVar2, fgj.f69332a)).f150873a;
                return (((s9f) oqg1.m67639h(smqVar2, t9f.f218282a)).m77576d() || ((double) rfg1.m75426A(j3)) >= 0.5d) ? j3 : n6f.f150866f;
            case 2:
                return ((n6f) ((rv41) this.f200605b).getValue()).f150873a;
            case 3:
                return ((xgx0) this.f200605b).f261391c;
            default:
                return ((ygx0) this.f200605b).f272689b;
        }
    }
}
