package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ed4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f58434a;

    /* JADX INFO: renamed from: b */
    public final bji f58435b;

    /* JADX INFO: renamed from: c */
    public final wg61 f58436c = new wg61(new dd4(this, 0));

    public ed4(boolean z, bji bjiVar) {
        this.f58434a = z;
        this.f58435b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m38507a() {
        ed4 ed4Var = (ed4) this.f58436c.getValue();
        return ed4Var != null ? ed4Var.m38507a() : this.f58434a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("enable_debug_logging", "android-libs-social-radar", m38507a()));
    }
}
