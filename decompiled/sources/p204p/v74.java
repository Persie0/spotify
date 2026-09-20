package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class v74 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f238042a;

    /* JADX INFO: renamed from: b */
    public final boolean f238043b;

    /* JADX INFO: renamed from: c */
    public final boolean f238044c;

    /* JADX INFO: renamed from: d */
    public final boolean f238045d;

    /* JADX INFO: renamed from: e */
    public final boolean f238046e;

    /* JADX INFO: renamed from: f */
    public final u74 f238047f;

    /* JADX INFO: renamed from: g */
    public final boolean f238048g;

    /* JADX INFO: renamed from: h */
    public final boolean f238049h;

    /* JADX INFO: renamed from: i */
    public final boolean f238050i;

    /* JADX INFO: renamed from: j */
    public final int f238051j;

    /* JADX INFO: renamed from: k */
    public final int f238052k;

    /* JADX INFO: renamed from: l */
    public final int f238053l;

    /* JADX INFO: renamed from: m */
    public final int f238054m;

    /* JADX INFO: renamed from: n */
    public final boolean f238055n;

    /* JADX INFO: renamed from: o */
    public final bji f238056o;

    /* JADX INFO: renamed from: p */
    public final wg61 f238057p;

    public v74(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, u74 u74Var, boolean z6, boolean z7, boolean z8, int i, int i2, int i3, int i4, boolean z9, bji bjiVar) {
        this.f238042a = z;
        this.f238043b = z2;
        this.f238044c = z3;
        this.f238045d = z4;
        this.f238046e = z5;
        this.f238047f = u74Var;
        this.f238048g = z6;
        this.f238049h = z7;
        this.f238050i = z8;
        this.f238051j = i;
        this.f238052k = i2;
        this.f238053l = i3;
        this.f238054m = i4;
        this.f238055n = z9;
        this.f238056o = bjiVar;
        this.f238057p = new wg61(new f74(this, 12));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m84824a() {
        v74 v74VarM84830g = m84830g();
        return v74VarM84830g != null ? v74VarM84830g.m84824a() : this.f238042a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m84825b() {
        v74 v74VarM84830g = m84830g();
        return v74VarM84830g != null ? v74VarM84830g.m84825b() : this.f238043b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m84826c() {
        v74 v74VarM84830g = m84830g();
        return v74VarM84830g != null ? v74VarM84830g.m84826c() : this.f238044c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m84827d() {
        v74 v74VarM84830g = m84830g();
        return v74VarM84830g != null ? v74VarM84830g.m84827d() : this.f238045d;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m84828e() {
        v74 v74VarM84830g = m84830g();
        return v74VarM84830g != null ? v74VarM84830g.m84828e() : this.f238046e;
    }

    /* JADX INFO: renamed from: f */
    public final u74 m84829f() {
        u74 u74VarM84829f;
        v74 v74VarM84830g = m84830g();
        return (v74VarM84830g == null || (u74VarM84829f = v74VarM84830g.m84829f()) == null) ? this.f238047f : u74VarM84829f;
    }

    /* JADX INFO: renamed from: g */
    public final v74 m84830g() {
        return (v74) this.f238057p.getValue();
    }

    /* JADX INFO: renamed from: h */
    public final boolean m84831h() {
        v74 v74VarM84830g = m84830g();
        return v74VarM84830g != null ? v74VarM84830g.m84831h() : this.f238048g;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m84832i() {
        v74 v74VarM84830g = m84830g();
        return v74VarM84830g != null ? v74VarM84830g.m84832i() : this.f238049h;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m84833j() {
        v74 v74VarM84830g = m84830g();
        return v74VarM84830g != null ? v74VarM84830g.m84833j() : this.f238050i;
    }

    /* JADX INFO: renamed from: k */
    public final int m84834k() {
        v74 v74VarM84830g = m84830g();
        return v74VarM84830g != null ? v74VarM84830g.m84834k() : this.f238051j;
    }

    /* JADX INFO: renamed from: l */
    public final int m84835l() {
        v74 v74VarM84830g = m84830g();
        return v74VarM84830g != null ? v74VarM84830g.m84835l() : this.f238052k;
    }

    /* JADX INFO: renamed from: m */
    public final int m84836m() {
        v74 v74VarM84830g = m84830g();
        return v74VarM84830g != null ? v74VarM84830g.m84836m() : this.f238053l;
    }

    @Override // p204p.iys0
    public final List models() {
        k8a k8aVar = new k8a("adaptive_buffering_enabled", "android-feature-video", m84824a());
        k8a k8aVar2 = new k8a("core_fetch_data_source_enabled", "android-feature-video", m84825b());
        k8a k8aVar3 = new k8a("core_fetch_data_source_enabled_for_audio_browse", "android-feature-video", m84826c());
        k8a k8aVar4 = new k8a("core_fetch_data_source_enabled_for_canvas", "android-feature-video", m84827d());
        k8a k8aVar5 = new k8a("core_fetch_data_source_enabled_for_watch_feed", "android-feature-video", m84828e());
        String str = m84829f().f227496a;
        u74[] u74VarArrValues = u74.values();
        ArrayList arrayList = new ArrayList(u74VarArrValues.length);
        for (u74 u74Var : u74VarArrValues) {
            arrayList.add(u74Var.f227496a);
        }
        return h6f.m46715L(k8aVar, k8aVar2, k8aVar3, k8aVar4, k8aVar5, new k8a("core_segmented_fetch_data_source_enabled", "android-feature-video", str, arrayList), new k8a("playback_trait_offline_enabled", "android-feature-video", m84831h()), new k8a("release_all_players_on_shutdown", "android-feature-video", m84832i()), new k8a("video_ad_ignore_data_saver_mode_enabled", "android-feature-video", m84833j()), new k8a("video_ad_target_bitrate", "android-feature-video", m84834k(), 0, 4000000), new k8a("video_download_bitrate", "android-feature-video", m84835l(), 200000, 3000000), new k8a("video_download_max_resolution", "android-feature-video", m84836m(), 0, 2160), new k8a("video_offline_license_redownload_threshold_days", "android-feature-video", m84837n(), 0, 3650), new k8a("video_sai_enabled", "android-feature-video", m84838o()));
    }

    /* JADX INFO: renamed from: n */
    public final int m84837n() {
        v74 v74VarM84830g = m84830g();
        return v74VarM84830g != null ? v74VarM84830g.m84837n() : this.f238054m;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m84838o() {
        v74 v74VarM84830g = m84830g();
        return v74VarM84830g != null ? v74VarM84830g.m84838o() : this.f238055n;
    }

    public v74(bji bjiVar) {
        this(false, true, false, false, false, u74.DISABLED, false, false, false, 640000, 800000, 0, 30, false, bjiVar);
    }
}
