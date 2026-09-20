package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class dk4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f49835a;

    /* JADX INFO: renamed from: b */
    public final boolean f49836b;

    /* JADX INFO: renamed from: c */
    public final bji f49837c;

    /* JADX INFO: renamed from: d */
    public final wg61 f49838d = new wg61(new si4(this, 26));

    public dk4(boolean z, boolean z2, bji bjiVar) {
        this.f49835a = z;
        this.f49836b = z2;
        this.f49837c = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m36244a() {
        dk4 dk4Var = (dk4) this.f49838d.getValue();
        return dk4Var != null ? dk4Var.m36244a() : this.f49835a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m36245b() {
        dk4 dk4Var = (dk4) this.f49838d.getValue();
        return dk4Var != null ? dk4Var.m36245b() : this.f49836b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("reference_plugin_enabled", "android-offline-plugin-support-service", m36244a()), new k8a("shutdown_awareness_enabled", "android-offline-plugin-support-service", m36245b()));
    }
}
