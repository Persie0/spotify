package p204p;

import com.comscore.util.crashreport.CrashReportManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class a34 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final y24 f11848a;

    /* JADX INFO: renamed from: b */
    public final z24 f11849b;

    /* JADX INFO: renamed from: c */
    public final boolean f11850c;

    /* JADX INFO: renamed from: d */
    public final int f11851d;

    /* JADX INFO: renamed from: e */
    public final boolean f11852e;

    /* JADX INFO: renamed from: f */
    public final boolean f11853f;

    /* JADX INFO: renamed from: g */
    public final boolean f11854g;

    /* JADX INFO: renamed from: h */
    public final boolean f11855h;

    /* JADX INFO: renamed from: i */
    public final boolean f11856i;

    /* JADX INFO: renamed from: j */
    public final boolean f11857j;

    /* JADX INFO: renamed from: k */
    public final bji f11858k;

    /* JADX INFO: renamed from: l */
    public final wg61 f11859l;

    public a34(y24 y24Var, z24 z24Var, boolean z, int i, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, bji bjiVar) {
        this.f11848a = y24Var;
        this.f11849b = z24Var;
        this.f11850c = z;
        this.f11851d = i;
        this.f11852e = z2;
        this.f11853f = z3;
        this.f11854g = z4;
        this.f11855h = z5;
        this.f11856i = z6;
        this.f11857j = z7;
        this.f11858k = bjiVar;
        this.f11859l = new wg61(new u14(this, 11));
    }

    /* JADX INFO: renamed from: a */
    public final a34 m24594a() {
        return (a34) this.f11859l.getValue();
    }

    /* JADX INFO: renamed from: b */
    public final y24 m24595b() {
        y24 y24VarM24595b;
        a34 a34VarM24594a = m24594a();
        return (a34VarM24594a == null || (y24VarM24595b = a34VarM24594a.m24595b()) == null) ? this.f11848a : y24VarM24595b;
    }

    /* JADX INFO: renamed from: c */
    public final z24 m24596c() {
        z24 z24VarM24596c;
        a34 a34VarM24594a = m24594a();
        return (a34VarM24594a == null || (z24VarM24596c = a34VarM24594a.m24596c()) == null) ? this.f11849b : z24VarM24596c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m24597d() {
        a34 a34VarM24594a = m24594a();
        return a34VarM24594a != null ? a34VarM24594a.m24597d() : this.f11850c;
    }

    /* JADX INFO: renamed from: e */
    public final int m24598e() {
        a34 a34VarM24594a = m24594a();
        return a34VarM24594a != null ? a34VarM24594a.m24598e() : this.f11851d;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m24599f() {
        a34 a34VarM24594a = m24594a();
        return a34VarM24594a != null ? a34VarM24594a.m24599f() : this.f11852e;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m24600g() {
        a34 a34VarM24594a = m24594a();
        return a34VarM24594a != null ? a34VarM24594a.m24600g() : this.f11853f;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m24601h() {
        a34 a34VarM24594a = m24594a();
        return a34VarM24594a != null ? a34VarM24594a.m24601h() : this.f11854g;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m24602i() {
        a34 a34VarM24594a = m24594a();
        return a34VarM24594a != null ? a34VarM24594a.m24602i() : this.f11855h;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m24603j() {
        a34 a34VarM24594a = m24594a();
        return a34VarM24594a != null ? a34VarM24594a.m24603j() : this.f11856i;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m24604k() {
        a34 a34VarM24594a = m24594a();
        return a34VarM24594a != null ? a34VarM24594a.m24604k() : this.f11857j;
    }

    @Override // p204p.iys0
    public final List models() {
        String str = m24595b().f268451a;
        y24[] y24VarArrValues = y24.values();
        ArrayList arrayList = new ArrayList(y24VarArrValues.length);
        for (y24 y24Var : y24VarArrValues) {
            arrayList.add(y24Var.f268451a);
        }
        k8a k8aVar = new k8a("embedded_ad_placement", "android-embeddedadplaylist", str, arrayList);
        String str2 = m24596c().f278474a;
        z24[] z24VarArrValues = z24.values();
        ArrayList arrayList2 = new ArrayList(z24VarArrValues.length);
        for (z24 z24Var : z24VarArrValues) {
            arrayList2.add(z24Var.f278474a);
        }
        return h6f.m46715L(k8aVar, new k8a("embedded_ad_within_tracklist_placement", "android-embeddedadplaylist", str2, arrayList2), new k8a("filter_albums", "android-embeddedadplaylist", m24597d()), new k8a("playlist_leavebehind_fetch_deadline", "android-embeddedadplaylist", m24598e(), 0, 9999999), new k8a("prioritize_embeddedad", "android-embeddedadplaylist", m24599f()), new k8a("skip_sponsored_playlist_ad_refetch", "android-embeddedadplaylist", m24600g()), new k8a("unified_leavebehind_episode_page_enabled", "android-embeddedadplaylist", m24601h()), new k8a("unified_leavebehind_show_page_enabled", "android-embeddedadplaylist", m24602i()), new k8a("use_unified_leavebehind_fetch", "android-embeddedadplaylist", m24603j()), new k8a("use_video_ad_element_v2", "android-embeddedadplaylist", m24604k()));
    }

    public a34(bji bjiVar) {
        this(y24.NONE, z24.NONE, false, CrashReportManager.TIME_WINDOW, false, false, false, false, false, false, bjiVar);
    }
}
