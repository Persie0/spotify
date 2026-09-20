package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class py3 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f183327a;

    /* JADX INFO: renamed from: b */
    public final bji f183328b;

    /* JADX INFO: renamed from: c */
    public final wg61 f183329c = new wg61(new ey3(this, 6));

    public py3(boolean z, bji bjiVar) {
        this.f183327a = z;
        this.f183328b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m71568a() {
        py3 py3Var = (py3) this.f183329c.getValue();
        return py3Var != null ? py3Var.m71568a() : this.f183327a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("active_session_banner_enabled", "android-car-mobile-wazeactivesessionbanner", m71568a()));
    }
}
