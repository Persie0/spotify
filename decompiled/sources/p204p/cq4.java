package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class cq4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f40723a;

    /* JADX INFO: renamed from: b */
    public final boolean f40724b;

    /* JADX INFO: renamed from: c */
    public final bji f40725c;

    /* JADX INFO: renamed from: d */
    public final wg61 f40726d = new wg61(new kp4(this, 12));

    public cq4(boolean z, boolean z2, bji bjiVar) {
        this.f40723a = z;
        this.f40724b = z2;
        this.f40725c = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m33591a() {
        cq4 cq4Var = (cq4) this.f40726d.getValue();
        return cq4Var != null ? cq4Var.m33591a() : this.f40723a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m33592b() {
        cq4 cq4Var = (cq4) this.f40726d.getValue();
        return cq4Var != null ? cq4Var.m33592b() : this.f40724b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("is_hide_from_recents_enabled", "android-system-home-hidefromhome", m33591a()), new k8a("is_hide_from_shortcuts_enabled", "android-system-home-hidefromhome", m33592b()));
    }
}
