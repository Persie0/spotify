package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class q54 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f185391a;

    /* JADX INFO: renamed from: b */
    public final boolean f185392b;

    /* JADX INFO: renamed from: c */
    public final bji f185393c;

    /* JADX INFO: renamed from: d */
    public final wg61 f185394d = new wg61(new o54(this, 1));

    public q54(boolean z, boolean z2, bji bjiVar) {
        this.f185391a = z;
        this.f185392b = z2;
        this.f185393c = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m72187a() {
        q54 q54Var = (q54) this.f185394d.getValue();
        return q54Var != null ? q54Var.m72187a() : this.f185391a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m72188b() {
        q54 q54Var = (q54) this.f185394d.getValue();
        return q54Var != null ? q54Var.m72188b() : this.f185392b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_reinstall_notifications_prompt", "android-feature-notifications-permissions", m72187a()), new k8a("navigate_to_os_settings_only", "android-feature-notifications-permissions", m72188b()));
    }
}
