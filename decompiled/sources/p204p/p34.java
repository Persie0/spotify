package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class p34 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f173550a;

    /* JADX INFO: renamed from: b */
    public final bji f173551b;

    /* JADX INFO: renamed from: c */
    public final wg61 f173552c = new wg61(new u14(this, 21));

    public p34(boolean z, bji bjiVar) {
        this.f173550a = z;
        this.f173551b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m68984a() {
        p34 p34Var = (p34) this.f173552c.getValue();
        return p34Var != null ? p34Var.m68984a() : this.f173550a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("allow_widget_providers_media_provider_access", "android-external-integration-service", m68984a()));
    }
}
