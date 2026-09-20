package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class pd4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f176345a;

    /* JADX INFO: renamed from: b */
    public final boolean f176346b;

    /* JADX INFO: renamed from: c */
    public final bji f176347c;

    /* JADX INFO: renamed from: d */
    public final wg61 f176348d = new wg61(new dd4(this, 9));

    public pd4(boolean z, boolean z2, bji bjiVar) {
        this.f176345a = z;
        this.f176346b = z2;
        this.f176347c = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m69639a() {
        pd4 pd4Var = (pd4) this.f176348d.getValue();
        return pd4Var != null ? pd4Var.m69639a() : this.f176345a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m69640b() {
        pd4 pd4Var = (pd4) this.f176348d.getValue();
        return pd4Var != null ? pd4Var.m69640b() : this.f176346b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("listening_party_card_enabled", "android-list-ux-platform-consumers-album-shared", m69639a()), new k8a("show_locked_album_ui", "android-list-ux-platform-consumers-album-shared", m69640b()));
    }
}
