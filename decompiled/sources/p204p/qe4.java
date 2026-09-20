package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class qe4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f187843a;

    /* JADX INFO: renamed from: b */
    public final boolean f187844b;

    /* JADX INFO: renamed from: c */
    public final bji f187845c;

    /* JADX INFO: renamed from: d */
    public final wg61 f187846d = new wg61(new ne4(this, 2));

    public qe4(boolean z, boolean z2, bji bjiVar) {
        this.f187843a = z;
        this.f187844b = z2;
        this.f187845c = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m72602a() {
        qe4 qe4Var = (qe4) this.f187846d.getValue();
        return qe4Var != null ? qe4Var.m72602a() : this.f187843a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m72603b() {
        qe4 qe4Var = (qe4) this.f187846d.getValue();
        return qe4Var != null ? qe4Var.m72603b() : this.f187844b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_for_lists_with_audiobook_content", "android-list-ux-platform-consumers-standard-headerplaybutton", m72602a()), new k8a("enable_omni_play_button_element", "android-list-ux-platform-consumers-standard-headerplaybutton", m72603b()));
    }
}
