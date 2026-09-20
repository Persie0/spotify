package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class k94 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f120510a;

    /* JADX INFO: renamed from: b */
    public final boolean f120511b;

    /* JADX INFO: renamed from: c */
    public final bji f120512c;

    /* JADX INFO: renamed from: d */
    public final wg61 f120513d;

    public k94(boolean z, boolean z2, bji bjiVar) {
        this.f120510a = z;
        this.f120511b = z2;
        this.f120512c = bjiVar;
        this.f120513d = new wg61(new f74(this, 24));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m55767a() {
        k94 k94Var = (k94) this.f120513d.getValue();
        return k94Var != null ? k94Var.m55767a() : this.f120510a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m55768b() {
        k94 k94Var = (k94) this.f120513d.getValue();
        return k94Var != null ? k94Var.m55768b() : this.f120511b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("kids_family_exclude_visible", "android-homeia-settings", m55767a()), new k8a("managed_account_prompt_enabled", "android-homeia-settings", m55768b()));
    }

    public k94(bji bjiVar) {
        this(false, false, bjiVar);
    }
}
