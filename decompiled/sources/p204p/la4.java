package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class la4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f131250a;

    /* JADX INFO: renamed from: b */
    public final boolean f131251b;

    /* JADX INFO: renamed from: c */
    public final boolean f131252c;

    /* JADX INFO: renamed from: d */
    public final boolean f131253d;

    /* JADX INFO: renamed from: e */
    public final boolean f131254e;

    /* JADX INFO: renamed from: f */
    public final bji f131255f;

    /* JADX INFO: renamed from: g */
    public final wg61 f131256g;

    public la4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, bji bjiVar) {
        this.f131250a = z;
        this.f131251b = z2;
        this.f131252c = z3;
        this.f131253d = z4;
        this.f131254e = z5;
        this.f131255f = bjiVar;
        this.f131256g = new wg61(new ga4(this, 4));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m58532a() {
        la4 la4Var = (la4) this.f131256g.getValue();
        return la4Var != null ? la4Var.m58532a() : this.f131250a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m58533b() {
        la4 la4Var = (la4) this.f131256g.getValue();
        return la4Var != null ? la4Var.m58533b() : this.f131251b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m58534c() {
        la4 la4Var = (la4) this.f131256g.getValue();
        return la4Var != null ? la4Var.m58534c() : this.f131252c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m58535d() {
        la4 la4Var = (la4) this.f131256g.getValue();
        return la4Var != null ? la4Var.m58535d() : this.f131253d;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m58536e() {
        la4 la4Var = (la4) this.f131256g.getValue();
        return la4Var != null ? la4Var.m58536e() : this.f131254e;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("ads_android_turn_on_comscore", "android-libs-ads-common", m58532a()), new k8a("ads_enable_one_trust_cmp_android", "android-libs-ads-common", m58533b()), new k8a("block_internal_clickthroughs", "android-libs-ads-common", m58534c()), new k8a("enable_ads_connect_state_observer", "android-libs-ads-common", m58535d()), new k8a("enable_image_loading_for_espresso_tests", "android-libs-ads-common", m58536e()));
    }

    public la4(bji bjiVar) {
        this(false, false, false, true, false, bjiVar);
    }
}
