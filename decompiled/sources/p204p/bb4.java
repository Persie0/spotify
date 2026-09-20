package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class bb4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f25425a;

    /* JADX INFO: renamed from: b */
    public final bji f25426b;

    /* JADX INFO: renamed from: c */
    public final wg61 f25427c = new wg61(new ga4(this, 16));

    public bb4(boolean z, bji bjiVar) {
        this.f25425a = z;
        this.f25426b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m28613a() {
        bb4 bb4Var = (bb4) this.f25427c.getValue();
        return bb4Var != null ? bb4Var.m28613a() : this.f25425a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("enable_haptic_feedback_on_heart", "android-libs-encore-consumer-entrypoint", m28613a()));
    }
}
