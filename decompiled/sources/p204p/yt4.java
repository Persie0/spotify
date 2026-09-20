package p204p;

import com.spotify.searchview.proto.AudioEpisode;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class yt4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f275947a;

    /* JADX INFO: renamed from: b */
    public final boolean f275948b;

    /* JADX INFO: renamed from: c */
    public final boolean f275949c;

    /* JADX INFO: renamed from: d */
    public final boolean f275950d;

    /* JADX INFO: renamed from: e */
    public final boolean f275951e;

    /* JADX INFO: renamed from: f */
    public final vt4 f275952f;

    /* JADX INFO: renamed from: g */
    public final wt4 f275953g;

    /* JADX INFO: renamed from: h */
    public final xt4 f275954h;

    /* JADX INFO: renamed from: i */
    public final int f275955i;

    /* JADX INFO: renamed from: j */
    public final bji f275956j;

    /* JADX INFO: renamed from: k */
    public final wg61 f275957k;

    public yt4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, vt4 vt4Var, wt4 wt4Var, xt4 xt4Var, int i, bji bjiVar) {
        this.f275947a = z;
        this.f275948b = z2;
        this.f275949c = z3;
        this.f275950d = z4;
        this.f275951e = z5;
        this.f275952f = vt4Var;
        this.f275953g = wt4Var;
        this.f275954h = xt4Var;
        this.f275955i = i;
        this.f275956j = bjiVar;
        this.f275957k = new wg61(new zr4(this, 22));
    }

    /* JADX INFO: renamed from: a */
    public final yt4 m94596a() {
        return (yt4) this.f275957k.getValue();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m94597b() {
        yt4 yt4VarM94596a = m94596a();
        return yt4VarM94596a != null ? yt4VarM94596a.m94597b() : this.f275947a;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m94598c() {
        yt4 yt4VarM94596a = m94596a();
        return yt4VarM94596a != null ? yt4VarM94596a.m94598c() : this.f275948b;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m94599d() {
        yt4 yt4VarM94596a = m94596a();
        return yt4VarM94596a != null ? yt4VarM94596a.m94599d() : this.f275949c;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m94600e() {
        yt4 yt4VarM94596a = m94596a();
        return yt4VarM94596a != null ? yt4VarM94596a.m94600e() : this.f275950d;
    }

    /* JADX INFO: renamed from: f */
    public final vt4 m94601f() {
        vt4 vt4VarM94601f;
        yt4 yt4VarM94596a = m94596a();
        return (yt4VarM94596a == null || (vt4VarM94601f = yt4VarM94596a.m94601f()) == null) ? this.f275952f : vt4VarM94601f;
    }

    /* JADX INFO: renamed from: g */
    public final wt4 m94602g() {
        wt4 wt4VarM94602g;
        yt4 yt4VarM94596a = m94596a();
        return (yt4VarM94596a == null || (wt4VarM94602g = yt4VarM94596a.m94602g()) == null) ? this.f275953g : wt4VarM94602g;
    }

    /* JADX INFO: renamed from: h */
    public final xt4 m94603h() {
        xt4 xt4VarM94603h;
        yt4 yt4VarM94596a = m94596a();
        return (yt4VarM94596a == null || (xt4VarM94603h = yt4VarM94596a.m94603h()) == null) ? this.f275954h : xt4VarM94603h;
    }

    /* JADX INFO: renamed from: i */
    public final int m94604i() {
        yt4 yt4VarM94596a = m94596a();
        return yt4VarM94596a != null ? yt4VarM94596a.m94604i() : this.f275955i;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m94605j() {
        yt4 yt4VarM94596a = m94596a();
        return yt4VarM94596a != null ? yt4VarM94596a.m94605j() : this.f275951e;
    }

    @Override // p204p.iys0
    public final List models() {
        k8a k8aVar = new k8a("enable_music_video_carousel_on_creator_page_in_mft_plus", "android-videorecommendation-entrypointsconfigimpl", m94597b());
        k8a k8aVar2 = new k8a("enable_music_video_carousel_on_npv_scroll_in_mft_plus", "android-videorecommendation-entrypointsconfigimpl", m94598c());
        k8a k8aVar3 = new k8a("enable_music_video_carousel_on_search_page_in_mft_plus", "android-videorecommendation-entrypointsconfigimpl", m94599d());
        k8a k8aVar4 = new k8a("enable_music_video_time_cap_upsell_for_video_first_search_results", "android-videorecommendation-entrypointsconfigimpl", m94600e());
        k8a k8aVar5 = new k8a("is_music_video_autoplay_copy_enabled", "android-videorecommendation-entrypointsconfigimpl", m94605j());
        String str = m94601f().f244547a;
        vt4[] vt4VarArrValues = vt4.values();
        ArrayList arrayList = new ArrayList(vt4VarArrValues.length);
        for (vt4 vt4Var : vt4VarArrValues) {
            arrayList.add(vt4Var.f244547a);
        }
        k8a k8aVar6 = new k8a("music_video_carousel_creator_page_cap_behavior", "android-videorecommendation-entrypointsconfigimpl", str, arrayList);
        String str2 = m94602g().f254818a;
        wt4[] wt4VarArrValues = wt4.values();
        ArrayList arrayList2 = new ArrayList(wt4VarArrValues.length);
        for (wt4 wt4Var : wt4VarArrValues) {
            arrayList2.add(wt4Var.f254818a);
        }
        k8a k8aVar7 = new k8a("music_video_carousel_npv_scroll_cap_behavior", "android-videorecommendation-entrypointsconfigimpl", str2, arrayList2);
        String str3 = m94603h().f265745a;
        xt4[] xt4VarArrValues = xt4.values();
        ArrayList arrayList3 = new ArrayList(xt4VarArrValues.length);
        for (xt4 xt4Var : xt4VarArrValues) {
            arrayList3.add(xt4Var.f265745a);
        }
        return h6f.m46715L(k8aVar, k8aVar2, k8aVar3, k8aVar4, k8aVar5, k8aVar6, k8aVar7, new k8a("music_video_carousel_search_page_cap_behavior", "android-videorecommendation-entrypointsconfigimpl", str3, arrayList3), new k8a("time_cap_music_video_upsell_delay_millis", "android-videorecommendation-entrypointsconfigimpl", m94604i(), 0, 100000));
    }

    public yt4(bji bjiVar) {
        this(false, false, false, false, false, vt4.SHOW_UPSELL, wt4.SHOW_UPSELL, xt4.SHOW_UPSELL, AudioEpisode.SHOW_URI_FIELD_NUMBER, bjiVar);
    }
}
