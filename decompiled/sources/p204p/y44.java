package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class y44 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f269070a;

    /* JADX INFO: renamed from: b */
    public final boolean f269071b;

    /* JADX INFO: renamed from: c */
    public final boolean f269072c;

    /* JADX INFO: renamed from: d */
    public final bji f269073d;

    /* JADX INFO: renamed from: e */
    public final wg61 f269074e = new wg61(new y34(this, 19));

    public y44(boolean z, boolean z2, boolean z3, bji bjiVar) {
        this.f269070a = z;
        this.f269071b = z2;
        this.f269072c = z3;
        this.f269073d = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m92790a() {
        y44 y44Var = (y44) this.f269074e.getValue();
        return y44Var != null ? y44Var.m92790a() : this.f269070a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m92791b() {
        y44 y44Var = (y44) this.f269074e.getValue();
        return y44Var != null ? y44Var.m92791b() : this.f269071b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m92792c() {
        y44 y44Var = (y44) this.f269074e.getValue();
        return y44Var != null ? y44Var.m92792c() : this.f269072c;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_artist_page_navigation", "android-feature-free-tier-track", m92790a()), new k8a("enable_free_tier_track_page", "android-feature-free-tier-track", m92791b()), new k8a("enable_play_track_as_a_list", "android-feature-free-tier-track", m92792c()));
    }
}
