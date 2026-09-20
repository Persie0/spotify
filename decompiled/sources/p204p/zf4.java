package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class zf4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f282201a;

    /* JADX INFO: renamed from: b */
    public final boolean f282202b;

    /* JADX INFO: renamed from: c */
    public final bji f282203c;

    /* JADX INFO: renamed from: d */
    public final wg61 f282204d = new wg61(new ne4(this, 27));

    public zf4(boolean z, boolean z2, bji bjiVar) {
        this.f282201a = z;
        this.f282202b = z2;
        this.f282203c = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m95997a() {
        zf4 zf4Var = (zf4) this.f282204d.getValue();
        return zf4Var != null ? zf4Var.m95997a() : this.f282201a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m95998b() {
        zf4 zf4Var = (zf4) this.f282204d.getValue();
        return zf4Var != null ? zf4Var.m95998b() : this.f282202b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_auth_for_mbs", "android-media-browser-service", m95997a()), new k8a("ensure_connected_on_session_connect", "android-media-browser-service", m95998b()));
    }
}
