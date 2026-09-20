package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class df4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f48232a;

    /* JADX INFO: renamed from: b */
    public final bji f48233b;

    /* JADX INFO: renamed from: c */
    public final wg61 f48234c = new wg61(new ne4(this, 15));

    public df4(boolean z, bji bjiVar) {
        this.f48232a = z;
        this.f48233b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m35858a() {
        df4 df4Var = (df4) this.f48234c.getValue();
        return df4Var != null ? df4Var.m35858a() : this.f48232a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("preview_ended_upsell_enabled", "android-liveroom-preview-ended-events-service", m35858a()));
    }
}
