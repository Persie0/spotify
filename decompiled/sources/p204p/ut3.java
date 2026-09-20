package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ut3 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f233748a;

    /* JADX INFO: renamed from: b */
    public final boolean f233749b;

    /* JADX INFO: renamed from: c */
    public final bji f233750c;

    /* JADX INFO: renamed from: d */
    public final wg61 f233751d;

    public ut3(boolean z, boolean z2, bji bjiVar) {
        this.f233748a = z;
        this.f233749b = z2;
        this.f233750c = bjiVar;
        this.f233751d = new wg61(new w62(this, 21));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m83920a() {
        ut3 ut3Var = (ut3) this.f233751d.getValue();
        return ut3Var != null ? ut3Var.m83920a() : this.f233748a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m83921b() {
        ut3 ut3Var = (ut3) this.f233751d.getValue();
        return ut3Var != null ? ut3Var.m83921b() : this.f233749b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("is_add_account_page_enabled", "android-accountswitching-addaccountpage", m83920a()), new k8a("is_free_managed_accounts_enabled", "android-accountswitching-addaccountpage", m83921b()));
    }

    public ut3(bji bjiVar) {
        this(false, false, bjiVar);
    }
}
