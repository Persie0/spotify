package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class bf4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f26537a;

    /* JADX INFO: renamed from: b */
    public final boolean f26538b;

    /* JADX INFO: renamed from: c */
    public final int f26539c;

    /* JADX INFO: renamed from: d */
    public final boolean f26540d;

    /* JADX INFO: renamed from: e */
    public final bji f26541e;

    /* JADX INFO: renamed from: f */
    public final wg61 f26542f;

    public bf4(boolean z, boolean z2, int i, boolean z3, bji bjiVar) {
        this.f26537a = z;
        this.f26538b = z2;
        this.f26539c = i;
        this.f26540d = z3;
        this.f26541e = bjiVar;
        this.f26542f = new wg61(new ne4(this, 13));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m28981a() {
        bf4 bf4Var = (bf4) this.f26542f.getValue();
        return bf4Var != null ? bf4Var.m28981a() : this.f26537a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m28982b() {
        bf4 bf4Var = (bf4) this.f26542f.getValue();
        return bf4Var != null ? bf4Var.m28982b() : this.f26538b;
    }

    /* JADX INFO: renamed from: c */
    public final int m28983c() {
        bf4 bf4Var = (bf4) this.f26542f.getValue();
        return bf4Var != null ? bf4Var.m28983c() : this.f26539c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m28984d() {
        bf4 bf4Var = (bf4) this.f26542f.getValue();
        return bf4Var != null ? bf4Var.m28984d() : this.f26540d;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("join_party_on_web_cta_enabled", "android-liveroom-livestreampagefragment", m28981a()), new k8a("livestream_pause_button_enabled", "android-liveroom-livestreampagefragment", m28982b()), new k8a("stream_to_main_lifecycle_message_delay_millis", "android-liveroom-livestreampagefragment", m28983c(), 0, 60000), new k8a("voting_widget_enabled", "android-liveroom-livestreampagefragment", m28984d()));
    }

    public bf4(bji bjiVar) {
        this(false, false, 20000, false, bjiVar);
    }
}
