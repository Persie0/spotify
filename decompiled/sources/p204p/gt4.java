package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class gt4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f84085a;

    /* JADX INFO: renamed from: b */
    public final bji f84086b;

    /* JADX INFO: renamed from: c */
    public final wg61 f84087c = new wg61(new zr4(this, 19));

    public gt4(boolean z, bji bjiVar) {
        this.f84085a = z;
        this.f84086b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m45674a() {
        gt4 gt4Var = (gt4) this.f84087c.getValue();
        return gt4Var != null ? gt4Var.m45674a() : this.f84085a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("is_offer_cta_enabled", "android-upsell-offer-flags", m45674a()));
    }
}
