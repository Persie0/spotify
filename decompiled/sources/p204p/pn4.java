package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class pn4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f179301a;

    /* JADX INFO: renamed from: b */
    public final boolean f179302b;

    /* JADX INFO: renamed from: c */
    public final boolean f179303c;

    /* JADX INFO: renamed from: d */
    public final bji f179304d;

    /* JADX INFO: renamed from: e */
    public final wg61 f179305e = new wg61(new cn4(this, 8));

    public pn4(boolean z, boolean z2, boolean z3, bji bjiVar) {
        this.f179301a = z;
        this.f179302b = z2;
        this.f179303c = z3;
        this.f179304d = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m70425a() {
        pn4 pn4Var = (pn4) this.f179305e.getValue();
        return pn4Var != null ? pn4Var.m70425a() : this.f179301a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m70426b() {
        pn4 pn4Var = (pn4) this.f179305e.getValue();
        return pn4Var != null ? pn4Var.m70426b() : this.f179302b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m70427c() {
        pn4 pn4Var = (pn4) this.f179305e.getValue();
        return pn4Var != null ? pn4Var.m70427c() : this.f179303c;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_external_link", "android-read-along-list", m70425a()), new k8a("enable_static_list_click_to_play", "android-read-along-list", m70426b()), new k8a("enable_transcript_translation", "android-read-along-list", m70427c()));
    }
}
