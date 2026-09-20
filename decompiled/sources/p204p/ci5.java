package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ci5 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f38213a;

    /* JADX INFO: renamed from: b */
    public final boolean f38214b;

    /* JADX INFO: renamed from: c */
    public final boolean f38215c;

    /* JADX INFO: renamed from: d */
    public final boolean f38216d;

    /* JADX INFO: renamed from: e */
    public final boolean f38217e;

    /* JADX INFO: renamed from: f */
    public final boolean f38218f;

    /* JADX INFO: renamed from: g */
    public final boolean f38219g;

    /* JADX INFO: renamed from: h */
    public final boolean f38220h;

    /* JADX INFO: renamed from: i */
    public final boolean f38221i;

    /* JADX INFO: renamed from: j */
    public final boolean f38222j;

    /* JADX INFO: renamed from: k */
    public final boolean f38223k;

    /* JADX INFO: renamed from: l */
    public final bji f38224l;

    /* JADX INFO: renamed from: m */
    public final wg61 f38225m;

    public ci5(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, bji bjiVar) {
        this.f38213a = z;
        this.f38214b = z2;
        this.f38215c = z3;
        this.f38216d = z4;
        this.f38217e = z5;
        this.f38218f = z6;
        this.f38219g = z7;
        this.f38220h = z8;
        this.f38221i = z9;
        this.f38222j = z10;
        this.f38223k = z11;
        this.f38224l = bjiVar;
        this.f38225m = new wg61(new uu4(this, 28));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m32869a() {
        ci5 ci5VarM32873e = m32873e();
        return ci5VarM32873e != null ? ci5VarM32873e.m32869a() : this.f38213a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m32870b() {
        ci5 ci5VarM32873e = m32873e();
        return ci5VarM32873e != null ? ci5VarM32873e.m32870b() : this.f38214b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m32871c() {
        ci5 ci5VarM32873e = m32873e();
        return ci5VarM32873e != null ? ci5VarM32873e.m32871c() : this.f38215c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m32872d() {
        ci5 ci5VarM32873e = m32873e();
        return ci5VarM32873e != null ? ci5VarM32873e.m32872d() : this.f38216d;
    }

    /* JADX INFO: renamed from: e */
    public final ci5 m32873e() {
        return (ci5) this.f38225m.getValue();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m32874f() {
        ci5 ci5VarM32873e = m32873e();
        return ci5VarM32873e != null ? ci5VarM32873e.m32874f() : this.f38217e;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m32875g() {
        ci5 ci5VarM32873e = m32873e();
        return ci5VarM32873e != null ? ci5VarM32873e.m32875g() : this.f38218f;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m32876h() {
        ci5 ci5VarM32873e = m32873e();
        return ci5VarM32873e != null ? ci5VarM32873e.m32876h() : this.f38219g;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m32877i() {
        ci5 ci5VarM32873e = m32873e();
        return ci5VarM32873e != null ? ci5VarM32873e.m32877i() : this.f38220h;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m32878j() {
        ci5 ci5VarM32873e = m32873e();
        return ci5VarM32873e != null ? ci5VarM32873e.m32878j() : this.f38221i;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m32879k() {
        ci5 ci5VarM32873e = m32873e();
        return ci5VarM32873e != null ? ci5VarM32873e.m32879k() : this.f38222j;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m32880l() {
        ci5 ci5VarM32873e = m32873e();
        return ci5VarM32873e != null ? ci5VarM32873e.m32880l() : this.f38223k;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("canvas_enabled", "apps-music-libs-canvas", m32869a()), new k8a("canvas_on_tablets_enabled", "apps-music-libs-canvas", m32870b()), new k8a("canvas_on_tablets_landscape_enabled", "apps-music-libs-canvas", m32871c()), new k8a("canvas_on_tablets_portrait_enabled", "apps-music-libs-canvas", m32872d()), new k8a("dedupe_canvas_load_events", "apps-music-libs-canvas", m32874f()), new k8a("dim_canvas_on_mixing_transition", "apps-music-libs-canvas", m32875g()), new k8a("explicit_canvas_enabled", "apps-music-libs-canvas", m32876h()), new k8a("gate_canvas_surface_on_first_frame", "apps-music-libs-canvas", m32877i()), new k8a("pause_offscreen_canvas_playback_enabled", "apps-music-libs-canvas", m32878j()), new k8a("stable_canvas_backdrop", "apps-music-libs-canvas", m32879k()), new k8a("use_multiplayer_for_canvas_video", "apps-music-libs-canvas", m32880l()));
    }

    public ci5(bji bjiVar) {
        this(true, false, false, false, false, false, false, false, false, false, false, bjiVar);
    }
}
