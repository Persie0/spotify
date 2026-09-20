package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class ldm0 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final int f132297a;

    /* JADX INFO: renamed from: b */
    public final bji f132298b;

    /* JADX INFO: renamed from: c */
    public final wg61 f132299c = new wg61(new vvk0(this, 27));

    public ldm0(int i, bji bjiVar) {
        this.f132297a = i;
        this.f132298b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final int m58746a() {
        ldm0 ldm0Var = (ldm0) this.f132299c.getValue();
        return ldm0Var != null ? ldm0Var.m58746a() : this.f132297a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("haptic_time_offset_threshold_seconds", "page-match-outbound-scanning", m58746a(), 1, 3600));
    }
}
