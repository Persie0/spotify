package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class w94 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f249065a;

    /* JADX INFO: renamed from: b */
    public final boolean f249066b;

    /* JADX INFO: renamed from: c */
    public final boolean f249067c;

    /* JADX INFO: renamed from: d */
    public final bji f249068d;

    /* JADX INFO: renamed from: e */
    public final wg61 f249069e = new wg61(new f74(this, 26));

    public w94(boolean z, boolean z2, boolean z3, bji bjiVar) {
        this.f249065a = z;
        this.f249066b = z2;
        this.f249067c = z3;
        this.f249068d = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m87482a() {
        w94 w94Var = (w94) this.f249069e.getValue();
        return w94Var != null ? w94Var.m87482a() : this.f249065a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m87483b() {
        w94 w94Var = (w94) this.f249069e.getValue();
        return w94Var != null ? w94Var.m87483b() : this.f249066b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m87484c() {
        w94 w94Var = (w94) this.f249069e.getValue();
        return w94Var != null ? w94Var.m87484c() : this.f249067c;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("employee_validation_enabled", "android-integrity", m87482a()), new k8a("time_tracking_enabled", "android-integrity", m87483b()), new k8a("validation_enabled", "android-integrity", m87484c()));
    }
}
