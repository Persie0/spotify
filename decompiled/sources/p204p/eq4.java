package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class eq4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f61773a;

    /* JADX INFO: renamed from: b */
    public final bji f61774b;

    /* JADX INFO: renamed from: c */
    public final wg61 f61775c = new wg61(new kp4(this, 14));

    public eq4(boolean z, bji bjiVar) {
        this.f61773a = z;
        this.f61774b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m39720a() {
        eq4 eq4Var = (eq4) this.f61775c.getValue();
        return eq4Var != null ? eq4Var.m39720a() : this.f61773a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("enable_contextual_flair", "android-system-list-ux-platform-consumers-contextual-flair", m39720a()));
    }
}
