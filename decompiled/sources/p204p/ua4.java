package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ua4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f228360a;

    /* JADX INFO: renamed from: b */
    public final bji f228361b;

    /* JADX INFO: renamed from: c */
    public final wg61 f228362c = new wg61(new ga4(this, 11));

    public ua4(boolean z, bji bjiVar) {
        this.f228360a = z;
        this.f228361b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m82687a() {
        ua4 ua4Var = (ua4) this.f228362c.getValue();
        return ua4Var != null ? ua4Var.m82687a() : this.f228360a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("enable_app_wide_bounce", "android-libs-book-bouncer", m82687a()));
    }
}
