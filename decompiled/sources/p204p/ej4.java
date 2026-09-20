package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ej4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f60123a;

    /* JADX INFO: renamed from: b */
    public final boolean f60124b;

    /* JADX INFO: renamed from: c */
    public final bji f60125c;

    /* JADX INFO: renamed from: d */
    public final wg61 f60126d;

    public ej4(boolean z, boolean z2, bji bjiVar) {
        this.f60123a = z;
        this.f60124b = z2;
        this.f60125c = bjiVar;
        this.f60126d = new wg61(new si4(this, 11));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m39160a() {
        ej4 ej4Var = (ej4) this.f60126d.getValue();
        return ej4Var != null ? ej4Var.m39160a() : this.f60123a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m39161b() {
        ej4 ej4Var = (ej4) this.f60126d.getValue();
        return ej4Var != null ? ej4Var.m39161b() : this.f60124b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_npv_page_load_reporting", "android-nowplaying-musicinstallation", m39160a()), new k8a("enable_page_api_npv", "android-nowplaying-musicinstallation", m39161b()));
    }

    public ej4(bji bjiVar) {
        this(false, false, bjiVar);
    }
}
