package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class gaw0 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f78101a;

    /* JADX INFO: renamed from: b */
    public final bji f78102b;

    /* JADX INFO: renamed from: c */
    public final wg61 f78103c = new wg61(new f8w0(this, 2));

    public gaw0(boolean z, bji bjiVar) {
        this.f78101a = z;
        this.f78102b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m44183a() {
        gaw0 gaw0Var = (gaw0) this.f78103c.getValue();
        return gaw0Var != null ? gaw0Var.m44183a() : this.f78101a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("enable_quasar_background_fetch", "remote-config-fetching", m44183a()));
    }
}
