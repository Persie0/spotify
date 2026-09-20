package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class m44 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f139805a;

    /* JADX INFO: renamed from: b */
    public final boolean f139806b;

    /* JADX INFO: renamed from: c */
    public final bji f139807c;

    /* JADX INFO: renamed from: d */
    public final wg61 f139808d = new wg61(new y34(this, 11));

    public m44(boolean z, boolean z2, bji bjiVar) {
        this.f139805a = z;
        this.f139806b = z2;
        this.f139807c = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m60759a() {
        m44 m44Var = (m44) this.f139808d.getValue();
        return m44Var != null ? m44Var.m60759a() : this.f139805a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m60760b() {
        m44 m44Var = (m44) this.f139808d.getValue();
        return m44Var != null ? m44Var.m60760b() : this.f139806b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("custom_back_behaviour", "android-feature-churn-locked-state", m60759a()), new k8a("use_payment_cancellation_endpoint", "android-feature-churn-locked-state", m60760b()));
    }
}
