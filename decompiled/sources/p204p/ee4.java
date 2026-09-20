package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ee4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f58667a;

    /* JADX INFO: renamed from: b */
    public final boolean f58668b;

    /* JADX INFO: renamed from: c */
    public final bji f58669c;

    /* JADX INFO: renamed from: d */
    public final wg61 f58670d = new wg61(new dd4(this, 23));

    public ee4(boolean z, boolean z2, bji bjiVar) {
        this.f58667a = z;
        this.f58668b = z2;
        this.f58669c = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m38642a() {
        ee4 ee4Var = (ee4) this.f58670d.getValue();
        return ee4Var != null ? ee4Var.m38642a() : this.f58667a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m38643b() {
        ee4 ee4Var = (ee4) this.f58670d.getValue();
        return ee4Var != null ? ee4Var.m38643b() : this.f58668b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("magpie_enabled", "android-list-ux-platform-consumers-magpie", m38642a()), new k8a("reasoning_enabled", "android-list-ux-platform-consumers-magpie", m38643b()));
    }
}
