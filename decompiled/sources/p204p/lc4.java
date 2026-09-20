package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class lc4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f131809a;

    /* JADX INFO: renamed from: b */
    public final boolean f131810b;

    /* JADX INFO: renamed from: c */
    public final boolean f131811c;

    /* JADX INFO: renamed from: d */
    public final boolean f131812d;

    /* JADX INFO: renamed from: e */
    public final boolean f131813e;

    /* JADX INFO: renamed from: f */
    public final jc4 f131814f;

    /* JADX INFO: renamed from: g */
    public final bji f131815g;

    /* JADX INFO: renamed from: h */
    public final wg61 f131816h;

    public lc4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, jc4 jc4Var, bji bjiVar) {
        this.f131809a = z;
        this.f131810b = z2;
        this.f131811c = z3;
        this.f131812d = z4;
        this.f131813e = z5;
        this.f131814f = jc4Var;
        this.f131815g = bjiVar;
        this.f131816h = new wg61(new sb4(this, 15));
    }

    /* JADX INFO: renamed from: a */
    public final lc4 m58683a() {
        return (lc4) this.f131816h.getValue();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m58684b() {
        lc4 lc4VarM58683a = m58683a();
        return lc4VarM58683a != null ? lc4VarM58683a.m58684b() : this.f131809a;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m58685c() {
        lc4 lc4VarM58683a = m58683a();
        return lc4VarM58683a != null ? lc4VarM58683a.m58685c() : this.f131810b;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m58686d() {
        lc4 lc4VarM58683a = m58683a();
        return lc4VarM58683a != null ? lc4VarM58683a.m58686d() : this.f131811c;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m58687e() {
        lc4 lc4VarM58683a = m58683a();
        return lc4VarM58683a != null ? lc4VarM58683a.m58687e() : this.f131812d;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m58688f() {
        lc4 lc4VarM58683a = m58683a();
        return lc4VarM58683a != null ? lc4VarM58683a.m58688f() : this.f131813e;
    }

    /* JADX INFO: renamed from: g */
    public final jc4 m58689g() {
        jc4 jc4VarM58689g;
        lc4 lc4VarM58683a = m58683a();
        return (lc4VarM58683a == null || (jc4VarM58689g = lc4VarM58683a.m58689g()) == null) ? this.f131814f : jc4VarM58689g;
    }

    @Override // p204p.iys0
    public final List models() {
        k8a k8aVar = new k8a("enable_contextual_shuffle_upsell", "android-libs-nowplaying-video-first-mode", m58684b());
        k8a k8aVar2 = new k8a("enable_media_mode_acceptance", "android-libs-nowplaying-video-first-mode", m58685c());
        k8a k8aVar3 = new k8a("enable_swipe_to_collapse", "android-libs-nowplaying-video-first-mode", m58686d());
        k8a k8aVar4 = new k8a("enable_video_interceptor_overlay", "android-libs-nowplaying-video-first-mode", m58687e());
        k8a k8aVar5 = new k8a("mftplus_show_upsell_skip_next_limit", "android-libs-nowplaying-video-first-mode", m58688f());
        String str = m58689g().f110985a;
        jc4[] jc4VarArrValues = jc4.values();
        ArrayList arrayList = new ArrayList(jc4VarArrValues.length);
        for (jc4 jc4Var : jc4VarArrValues) {
            arrayList.add(jc4Var.f110985a);
        }
        return h6f.m46715L(k8aVar, k8aVar2, k8aVar3, k8aVar4, k8aVar5, new k8a("video_behaviour", "android-libs-nowplaying-video-first-mode", str, arrayList));
    }

    public lc4(bji bjiVar) {
        this(true, false, false, false, false, jc4.STICKY_VIDEO_ONLY, bjiVar);
    }
}
