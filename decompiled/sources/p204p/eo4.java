package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class eo4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f61290a;

    /* JADX INFO: renamed from: b */
    public final wy91 f61291b;

    /* JADX INFO: renamed from: c */
    public final wg61 f61292c = new wg61(new cn4(this, 21));

    public eo4(boolean z, saw0 saw0Var) {
        this.f61290a = z;
        this.f61291b = saw0Var;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m39541a() {
        eo4 eo4Var = (eo4) this.f61292c.getValue();
        return eo4Var != null ? eo4Var.m39541a() : this.f61290a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("login_trials_enabled", "android-remote-config-bootstrap-quasar-service", m39541a()));
    }
}
