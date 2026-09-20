package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class qoo implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f191014a;

    /* JADX INFO: renamed from: b */
    public final boolean f191015b;

    /* JADX INFO: renamed from: c */
    public final boolean f191016c;

    /* JADX INFO: renamed from: d */
    public final boolean f191017d;

    /* JADX INFO: renamed from: e */
    public final boolean f191018e;

    /* JADX INFO: renamed from: f */
    public final boolean f191019f;

    /* JADX INFO: renamed from: g */
    public final boolean f191020g;

    /* JADX INFO: renamed from: h */
    public final bji f191021h;

    /* JADX INFO: renamed from: i */
    public final wg61 f191022i;

    public qoo(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, bji bjiVar) {
        this.f191014a = z;
        this.f191015b = z2;
        this.f191016c = z3;
        this.f191017d = z4;
        this.f191018e = z5;
        this.f191019f = z6;
        this.f191020g = z7;
        this.f191021h = bjiVar;
        this.f191022i = new wg61(new sho(this, 6));
    }

    /* JADX INFO: renamed from: a */
    public final qoo m73394a() {
        return (qoo) this.f191022i.getValue();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m73395b() {
        qoo qooVarM73394a = m73394a();
        return qooVarM73394a != null ? qooVarM73394a.m73395b() : this.f191014a;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m73396c() {
        qoo qooVarM73394a = m73394a();
        return qooVarM73394a != null ? qooVarM73394a.m73396c() : this.f191020g;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m73397d() {
        qoo qooVarM73394a = m73394a();
        return qooVarM73394a != null ? qooVarM73394a.m73397d() : this.f191015b;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m73398e() {
        qoo qooVarM73394a = m73394a();
        return qooVarM73394a != null ? qooVarM73394a.m73398e() : this.f191016c;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m73399f() {
        qoo qooVarM73394a = m73394a();
        return qooVarM73394a != null ? qooVarM73394a.m73399f() : this.f191017d;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m73400g() {
        qoo qooVarM73394a = m73394a();
        return qooVarM73394a != null ? qooVarM73394a.m73400g() : this.f191018e;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m73401h() {
        qoo qooVarM73394a = m73394a();
        return qooVarM73394a != null ? qooVarM73394a.m73401h() : this.f191019f;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("daylist_snapshot_enabled", "daylist-playlist", m73395b()), new k8a("is_description_plugin_enabled", "daylist-playlist", m73397d()), new k8a("is_discover_section_plugin_enabled", "daylist-playlist", m73398e()), new k8a("is_metadata_plugin_enabled", "daylist-playlist", m73399f()), new k8a("is_pretitle_plugin_enabled", "daylist-playlist", m73400g()), new k8a("is_share_header_action_plugin_enabled", "daylist-playlist", m73401h()), new k8a("share_on_screenshot_enabled", "daylist-playlist", m73396c()));
    }

    public qoo(bji bjiVar) {
        this(true, true, true, true, true, true, true, bjiVar);
    }
}
