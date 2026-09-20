package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class sn4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f210797a;

    /* JADX INFO: renamed from: b */
    public final bji f210798b;

    /* JADX INFO: renamed from: c */
    public final wg61 f210799c = new wg61(new cn4(this, 11));

    public sn4(boolean z, bji bjiVar) {
        this.f210797a = z;
        this.f210798b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m78544a() {
        sn4 sn4Var = (sn4) this.f210799c.getValue();
        return sn4Var != null ? sn4Var.m78544a() : this.f210797a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("enable_ignore_in_recs", "android-recommendations-interactors", m78544a()));
    }
}
