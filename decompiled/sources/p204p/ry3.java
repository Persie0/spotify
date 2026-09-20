package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ry3 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f203804a;

    /* JADX INFO: renamed from: b */
    public final bji f203805b;

    /* JADX INFO: renamed from: c */
    public final wg61 f203806c = new wg61(new ey3(this, 7));

    public ry3(boolean z, bji bjiVar) {
        this.f203804a = z;
        this.f203805b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m76688a() {
        ry3 ry3Var = (ry3) this.f203806c.getValue();
        return ry3Var != null ? ry3Var.m76688a() : this.f203804a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("clear_stale_cookies", "android-checkout", m76688a()));
    }
}
