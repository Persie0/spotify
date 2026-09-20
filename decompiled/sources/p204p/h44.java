package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class h44 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f87414a;

    /* JADX INFO: renamed from: b */
    public final boolean f87415b;

    /* JADX INFO: renamed from: c */
    public final boolean f87416c;

    /* JADX INFO: renamed from: d */
    public final boolean f87417d;

    /* JADX INFO: renamed from: e */
    public final g44 f87418e;

    /* JADX INFO: renamed from: f */
    public final bji f87419f;

    /* JADX INFO: renamed from: g */
    public final wg61 f87420g;

    public h44(boolean z, boolean z2, boolean z3, boolean z4, g44 g44Var, bji bjiVar) {
        this.f87414a = z;
        this.f87415b = z2;
        this.f87416c = z3;
        this.f87417d = z4;
        this.f87418e = g44Var;
        this.f87419f = bjiVar;
        this.f87420g = new wg61(new y34(this, 7));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m46619a() {
        h44 h44Var = (h44) this.f87420g.getValue();
        return h44Var != null ? h44Var.m46619a() : this.f87414a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m46620b() {
        h44 h44Var = (h44) this.f87420g.getValue();
        return h44Var != null ? h44Var.m46620b() : this.f87415b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m46621c() {
        h44 h44Var = (h44) this.f87420g.getValue();
        return h44Var != null ? h44Var.m46621c() : this.f87416c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m46622d() {
        h44 h44Var = (h44) this.f87420g.getValue();
        return h44Var != null ? h44Var.m46622d() : this.f87417d;
    }

    /* JADX INFO: renamed from: e */
    public final g44 m46623e() {
        g44 g44VarM46623e;
        h44 h44Var = (h44) this.f87420g.getValue();
        return (h44Var == null || (g44VarM46623e = h44Var.m46623e()) == null) ? this.f87418e : g44VarM46623e;
    }

    @Override // p204p.iys0
    public final List models() {
        k8a k8aVar = new k8a("audio_recognition_enabled", "android-feature-browse", m46619a());
        k8a k8aVar2 = new k8a("enable_wrapped_title_density", "android-feature-browse", m46620b());
        k8a k8aVar3 = new k8a("image_grid_destination_enabled", "android-feature-browse", m46621c());
        k8a k8aVar4 = new k8a("play_link_promo_v3_migration_enabled", "android-feature-browse", m46622d());
        String str = m46623e().f76343a;
        g44[] g44VarArrValues = g44.values();
        ArrayList arrayList = new ArrayList(g44VarArrValues.length);
        for (g44 g44Var : g44VarArrValues) {
            arrayList.add(g44Var.f76343a);
        }
        return h6f.m46715L(k8aVar, k8aVar2, k8aVar3, k8aVar4, new k8a("root_page_top_offset_adjustment", "android-feature-browse", str, arrayList));
    }

    public h44(bji bjiVar) {
        this(false, false, false, false, g44.LARGE, bjiVar);
    }
}
