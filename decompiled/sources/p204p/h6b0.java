package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class h6b0 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f88056a;

    /* JADX INFO: renamed from: b */
    public final int f88057b;

    /* JADX INFO: renamed from: c */
    public final bji f88058c;

    /* JADX INFO: renamed from: d */
    public final wg61 f88059d = new wg61(new t790(this, 24));

    public h6b0(int i, bji bjiVar, boolean z) {
        this.f88056a = z;
        this.f88057b = i;
        this.f88058c = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final int m46708a() {
        h6b0 h6b0Var = (h6b0) this.f88059d.getValue();
        return h6b0Var != null ? h6b0Var.m46708a() : this.f88057b;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m46709b() {
        h6b0 h6b0Var = (h6b0) this.f88059d.getValue();
        return h6b0Var != null ? h6b0Var.m46709b() : this.f88056a;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("is_enabled", "lossless-remote-device-message-box", m46709b()), new k8a("maximum_shows_per_device", "lossless-remote-device-message-box", m46708a(), 0, 100));
    }
}
