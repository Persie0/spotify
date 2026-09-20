package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class dq4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final int f51802a;

    /* JADX INFO: renamed from: b */
    public final boolean f51803b;

    /* JADX INFO: renamed from: c */
    public final bji f51804c;

    /* JADX INFO: renamed from: d */
    public final wg61 f51805d;

    public dq4(int i, bji bjiVar, boolean z) {
        this.f51802a = i;
        this.f51803b = z;
        this.f51804c = bjiVar;
        this.f51805d = new wg61(new kp4(this, 13));
    }

    /* JADX INFO: renamed from: a */
    public final int m36597a() {
        dq4 dq4Var = (dq4) this.f51805d.getValue();
        return dq4Var != null ? dq4Var.m36597a() : this.f51802a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m36598b() {
        dq4 dq4Var = (dq4) this.f51805d.getValue();
        return dq4Var != null ? dq4Var.m36598b() : this.f51803b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("shake_detector_gravity_threshold", "android-system-inappuserfeedback", m36597a(), 1000, 2500), new k8a("user_feedback_enabled", "android-system-inappuserfeedback", m36598b()));
    }

    public dq4(bji bjiVar) {
        this(1300, bjiVar, false);
    }
}
