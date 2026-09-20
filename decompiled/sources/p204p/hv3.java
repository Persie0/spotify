package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class hv3 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f95572a;

    /* JADX INFO: renamed from: b */
    public final boolean f95573b;

    /* JADX INFO: renamed from: c */
    public final boolean f95574c;

    /* JADX INFO: renamed from: d */
    public final fnk0 f95575d;

    /* JADX INFO: renamed from: e */
    public final bji f95576e;

    /* JADX INFO: renamed from: f */
    public final wg61 f95577f = new wg61(new f30(this, 6));

    /* JADX INFO: renamed from: g */
    public final wg61 f95578g = new wg61(new ju3(this, 16));

    public hv3(boolean z, boolean z2, boolean z3, fnk0 fnk0Var, bji bjiVar) {
        this.f95572a = z;
        this.f95573b = z2;
        this.f95574c = z3;
        this.f95575d = fnk0Var;
        this.f95576e = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m48703a() {
        hv3 hv3Var = (hv3) this.f95578g.getValue();
        return hv3Var != null ? hv3Var.m48703a() : this.f95572a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m48704b() {
        hv3 hv3Var = (hv3) this.f95578g.getValue();
        return hv3Var != null ? hv3Var.m48704b() : this.f95573b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m48705c() {
        hv3 hv3Var = (hv3) this.f95578g.getValue();
        return hv3Var != null ? hv3Var.m48705c() : this.f95574c;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("should_refresh_capping_state_on_player_error", "android-audiobook-playerlistener", m48703a()), new k8a("should_stop_player_when_capped", "android-audiobook-playerlistener", m48704b()), new k8a("use_extended_metadata_client_for_legacy_capping", "android-audiobook-playerlistener", m48705c()));
    }
}
