package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class th4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f220316a;

    /* JADX INFO: renamed from: b */
    public final boolean f220317b;

    /* JADX INFO: renamed from: c */
    public final bji f220318c;

    /* JADX INFO: renamed from: d */
    public final wg61 f220319d = new wg61(new bh4(this, 10));

    public th4(boolean z, boolean z2, bji bjiVar) {
        this.f220316a = z;
        this.f220317b = z2;
        this.f220318c = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m80826a() {
        th4 th4Var = (th4) this.f220319d.getValue();
        return th4Var != null ? th4Var.m80826a() : this.f220316a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m80827b() {
        th4 th4Var = (th4) this.f220319d.getValue();
        return th4Var != null ? th4Var.m80827b() : this.f220317b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("mup_start_page_v2_enabled", "android-multi-user-plan-verification-verification-code-start", m80826a()), new k8a("qr_capture_protection_enabled", "android-multi-user-plan-verification-verification-code-start", m80827b()));
    }
}
