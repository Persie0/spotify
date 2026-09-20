package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ps4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f180737a;

    /* JADX INFO: renamed from: b */
    public final int f180738b;

    /* JADX INFO: renamed from: c */
    public final bji f180739c;

    /* JADX INFO: renamed from: d */
    public final wg61 f180740d = new wg61(new zr4(this, 14));

    public ps4(int i, bji bjiVar, boolean z) {
        this.f180737a = z;
        this.f180738b = i;
        this.f180739c = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m70757a() {
        ps4 ps4Var = (ps4) this.f180740d.getValue();
        return ps4Var != null ? ps4Var.m70757a() : this.f180737a;
    }

    /* JADX INFO: renamed from: b */
    public final int m70758b() {
        ps4 ps4Var = (ps4) this.f180740d.getValue();
        return ps4Var != null ? ps4Var.m70758b() : this.f180738b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_heartbeat", "android-ubi-page-heartbeat", m70757a()), new k8a("heartbeat_interval_seconds", "android-ubi-page-heartbeat", m70758b(), 900, 60000));
    }
}
