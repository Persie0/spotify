package p204p;

import com.spotify.concertcampaignview.p047v1.CtaType;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class tl4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f221316a;

    /* JADX INFO: renamed from: b */
    public final boolean f221317b;

    /* JADX INFO: renamed from: c */
    public final boolean f221318c;

    /* JADX INFO: renamed from: d */
    public final boolean f221319d;

    /* JADX INFO: renamed from: e */
    public final boolean f221320e;

    /* JADX INFO: renamed from: f */
    public final int f221321f;

    /* JADX INFO: renamed from: g */
    public final boolean f221322g;

    /* JADX INFO: renamed from: h */
    public final sl4 f221323h;

    /* JADX INFO: renamed from: i */
    public final boolean f221324i;

    /* JADX INFO: renamed from: j */
    public final bji f221325j;

    /* JADX INFO: renamed from: k */
    public final wg61 f221326k;

    public tl4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, boolean z6, sl4 sl4Var, boolean z7, bji bjiVar) {
        this.f221316a = z;
        this.f221317b = z2;
        this.f221318c = z3;
        this.f221319d = z4;
        this.f221320e = z5;
        this.f221321f = i;
        this.f221322g = z6;
        this.f221323h = sl4Var;
        this.f221324i = z7;
        this.f221325j = bjiVar;
        this.f221326k = new wg61(new jk4(this, 11));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m81031a() {
        tl4 tl4VarM81034d = m81034d();
        return tl4VarM81034d != null ? tl4VarM81034d.m81031a() : this.f221316a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m81032b() {
        tl4 tl4VarM81034d = m81034d();
        return tl4VarM81034d != null ? tl4VarM81034d.m81032b() : this.f221317b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m81033c() {
        tl4 tl4VarM81034d = m81034d();
        return tl4VarM81034d != null ? tl4VarM81034d.m81033c() : this.f221318c;
    }

    /* JADX INFO: renamed from: d */
    public final tl4 m81034d() {
        return (tl4) this.f221326k.getValue();
    }

    /* JADX INFO: renamed from: e */
    public final boolean m81035e() {
        tl4 tl4VarM81034d = m81034d();
        return tl4VarM81034d != null ? tl4VarM81034d.m81035e() : this.f221319d;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m81036f() {
        tl4 tl4VarM81034d = m81034d();
        return tl4VarM81034d != null ? tl4VarM81034d.m81036f() : this.f221320e;
    }

    /* JADX INFO: renamed from: g */
    public final int m81037g() {
        tl4 tl4VarM81034d = m81034d();
        return tl4VarM81034d != null ? tl4VarM81034d.m81037g() : this.f221321f;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m81038h() {
        tl4 tl4VarM81034d = m81034d();
        return tl4VarM81034d != null ? tl4VarM81034d.m81038h() : this.f221322g;
    }

    /* JADX INFO: renamed from: i */
    public final sl4 m81039i() {
        sl4 sl4VarM81039i;
        tl4 tl4VarM81034d = m81034d();
        return (tl4VarM81034d == null || (sl4VarM81039i = tl4VarM81034d.m81039i()) == null) ? this.f221323h : sl4VarM81039i;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m81040j() {
        tl4 tl4VarM81034d = m81034d();
        return tl4VarM81034d != null ? tl4VarM81034d.m81040j() : this.f221324i;
    }

    @Override // p204p.iys0
    public final List models() {
        k8a k8aVar = new k8a("add_to_playlist_default_save_location_preselected_enabled", "android-playlist-curation-add-to-playlist-page", m81031a());
        k8a k8aVar2 = new k8a("allow_curating_audiobooks_and_non_audiobooks_in_the_same_list", "android-playlist-curation-add-to-playlist-page", m81032b());
        k8a k8aVar3 = new k8a("contextual_page_enabled", "android-playlist-curation-add-to-playlist-page", m81033c());
        k8a k8aVar4 = new k8a("enable_add_to_playlist_fragment", "android-playlist-curation-add-to-playlist-page", m81035e());
        k8a k8aVar5 = new k8a("explicit_cancel_done_buttons_enabled", "android-playlist-curation-add-to-playlist-page", m81036f());
        k8a k8aVar6 = new k8a("peek_visible_rows_percent", "android-playlist-curation-add-to-playlist-page", m81037g(), 100, CtaType.BUY_TICKETS_FIELD_NUMBER);
        k8a k8aVar7 = new k8a("reinvent_add_to_playlist_ui", "android-playlist-curation-add-to-playlist-page", m81038h());
        String str = m81039i().f210289a;
        sl4[] sl4VarArrValues = sl4.values();
        ArrayList arrayList = new ArrayList(sl4VarArrValues.length);
        for (sl4 sl4Var : sl4VarArrValues) {
            arrayList.add(sl4Var.f210289a);
        }
        return h6f.m46715L(k8aVar, k8aVar2, k8aVar3, k8aVar4, k8aVar5, k8aVar6, k8aVar7, new k8a("sheet_peek_height_mode", "android-playlist-curation-add-to-playlist-page", str, arrayList), new k8a("transition_save_to_non_mixed_enabled", "android-playlist-curation-add-to-playlist-page", m81040j()));
    }

    public tl4(bji bjiVar) {
        this(false, false, false, false, false, 150, false, sl4.EXPANDED, false, bjiVar);
    }
}
