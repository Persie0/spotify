package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class yr4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f275385a;

    /* JADX INFO: renamed from: b */
    public final bji f275386b;

    /* JADX INFO: renamed from: c */
    public final wg61 f275387c = new wg61(new kp4(this, 29));

    public yr4(boolean z, bji bjiVar) {
        this.f275385a = z;
        this.f275386b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m94409a() {
        yr4 yr4Var = (yr4) this.f275387c.getValue();
        return yr4Var != null ? yr4Var.m94409a() : this.f275385a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("preemptive_compose_teardown_enabled", "android-tome-page-api", m94409a()));
    }
}
