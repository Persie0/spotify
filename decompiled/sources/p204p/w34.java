package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class w34 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f247471a;

    /* JADX INFO: renamed from: b */
    public final boolean f247472b;

    /* JADX INFO: renamed from: c */
    public final boolean f247473c;

    /* JADX INFO: renamed from: d */
    public final bji f247474d;

    /* JADX INFO: renamed from: e */
    public final wg61 f247475e;

    public w34(boolean z, boolean z2, boolean z3, bji bjiVar) {
        this.f247471a = z;
        this.f247472b = z2;
        this.f247473c = z3;
        this.f247474d = bjiVar;
        this.f247475e = new wg61(new u14(this, 28));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m87098a() {
        w34 w34Var = (w34) this.f247475e.getValue();
        return w34Var != null ? w34Var.m87098a() : this.f247471a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m87099b() {
        w34 w34Var = (w34) this.f247475e.getValue();
        return w34Var != null ? w34Var.m87099b() : this.f247472b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m87100c() {
        w34 w34Var = (w34) this.f247475e.getValue();
        return w34Var != null ? w34Var.m87100c() : this.f247473c;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("create_menu_entry_point_enabled", "android-feature-ai-playlist-configuration", m87098a()), new k8a("instant_playlist_copy_enabled", "android-feature-ai-playlist-configuration", m87099b()), new k8a("show_beta_tag", "android-feature-ai-playlist-configuration", m87100c()));
    }

    public w34(bji bjiVar) {
        this(true, false, true, bjiVar);
    }
}
