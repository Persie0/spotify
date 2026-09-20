package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class ae4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f14742a;

    /* JADX INFO: renamed from: b */
    public final boolean f14743b;

    /* JADX INFO: renamed from: c */
    public final boolean f14744c;

    /* JADX INFO: renamed from: d */
    public final bji f14745d;

    /* JADX INFO: renamed from: e */
    public final wg61 f14746e = new wg61(new dd4(this, 19));

    public ae4(boolean z, boolean z2, boolean z3, bji bjiVar) {
        this.f14742a = z;
        this.f14743b = z2;
        this.f14744c = z3;
        this.f14745d = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m25653a() {
        ae4 ae4Var = (ae4) this.f14746e.getValue();
        return ae4Var != null ? ae4Var.m25653a() : this.f14742a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m25654b() {
        ae4 ae4Var = (ae4) this.f14746e.getValue();
        return ae4Var != null ? ae4Var.m25654b() : this.f14743b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m25655c() {
        ae4 ae4Var = (ae4) this.f14746e.getValue();
        return ae4Var != null ? ae4Var.m25655c() : this.f14744c;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("search_entrypoint_enabled", "android-list-ux-platform-consumers-extender", m25653a()), new k8a("use_kodiak_for_recommendations", "android-list-ux-platform-consumers-extender", m25654b()), new k8a("use_mixed_list_endpoint", "android-list-ux-platform-consumers-extender", m25655c()));
    }
}
