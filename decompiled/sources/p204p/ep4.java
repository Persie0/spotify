package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ep4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f61541a;

    /* JADX INFO: renamed from: b */
    public final bji f61542b;

    /* JADX INFO: renamed from: c */
    public final wg61 f61543c = new wg61(new cn4(this, 28));

    public ep4(boolean z, bji bjiVar) {
        this.f61541a = z;
        this.f61542b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m39617a() {
        ep4 ep4Var = (ep4) this.f61543c.getValue();
        return ep4Var != null ? ep4Var.m39617a() : this.f61541a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("is_showcase_mdc_enabled", "android-showcase-showcase", m39617a()));
    }
}
