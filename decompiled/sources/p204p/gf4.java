package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class gf4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f79258a;

    /* JADX INFO: renamed from: b */
    public final bji f79259b;

    /* JADX INFO: renamed from: c */
    public final wg61 f79260c = new wg61(new ne4(this, 17));

    public gf4(boolean z, bji bjiVar) {
        this.f79258a = z;
        this.f79259b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m44568a() {
        gf4 gf4Var = (gf4) this.f79260c.getValue();
        return gf4Var != null ? gf4Var.m44568a() : this.f79258a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("enable_integration", "android-livesharing-google-meet", m44568a()));
    }
}
