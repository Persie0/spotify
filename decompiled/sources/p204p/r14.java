package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class r14 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f194760a;

    /* JADX INFO: renamed from: b */
    public final bji f194761b;

    /* JADX INFO: renamed from: c */
    public final wg61 f194762c = new wg61(new ey3(this, 29));

    public r14(boolean z, bji bjiVar) {
        this.f194760a = z;
        this.f194761b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m74449a() {
        r14 r14Var = (r14) this.f194762c.getValue();
        return r14Var != null ? r14Var.m74449a() : this.f194760a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("gpu_probe_enabled", "android-device-info-device-report-impl", m74449a()));
    }
}
