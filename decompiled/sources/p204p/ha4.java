package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ha4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f89106a;

    /* JADX INFO: renamed from: b */
    public final boolean f89107b;

    /* JADX INFO: renamed from: c */
    public final boolean f89108c;

    /* JADX INFO: renamed from: d */
    public final boolean f89109d;

    /* JADX INFO: renamed from: e */
    public final boolean f89110e;

    /* JADX INFO: renamed from: f */
    public final bji f89111f;

    /* JADX INFO: renamed from: g */
    public final wg61 f89112g = new wg61(new ga4(this, 0));

    public ha4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, bji bjiVar) {
        this.f89106a = z;
        this.f89107b = z2;
        this.f89108c = z3;
        this.f89109d = z4;
        this.f89110e = z5;
        this.f89111f = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m46908a() {
        ha4 ha4Var = (ha4) this.f89112g.getValue();
        return ha4Var != null ? ha4Var.m46908a() : this.f89106a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m46909b() {
        ha4 ha4Var = (ha4) this.f89112g.getValue();
        return ha4Var != null ? ha4Var.m46909b() : this.f89107b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m46910c() {
        ha4 ha4Var = (ha4) this.f89112g.getValue();
        return ha4Var != null ? ha4Var.m46910c() : this.f89108c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m46911d() {
        ha4 ha4Var = (ha4) this.f89112g.getValue();
        return ha4Var != null ? ha4Var.m46911d() : this.f89109d;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m46912e() {
        ha4 ha4Var = (ha4) this.f89112g.getValue();
        return ha4Var != null ? ha4Var.m46912e() : this.f89110e;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("curation_platform_enabled", "android-lib-aligned-curation-flags", m46908a()), new k8a("default_save_location_curation_enabled", "android-lib-aligned-curation-flags", m46909b()), new k8a("episode_curation_trait_enabled", "android-lib-aligned-curation-flags", m46910c()), new k8a("snackbars_enabled", "android-lib-aligned-curation-flags", m46911d()), new k8a("use_curation_experience_trait_for_track_uri", "android-lib-aligned-curation-flags", m46912e()));
    }
}
