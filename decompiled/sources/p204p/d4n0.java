package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class d4n0 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f45211a;

    /* JADX INFO: renamed from: b */
    public final boolean f45212b;

    /* JADX INFO: renamed from: c */
    public final bji f45213c;

    /* JADX INFO: renamed from: d */
    public final wg61 f45214d = new wg61(new pgm0(this, 6));

    public d4n0(boolean z, boolean z2, bji bjiVar) {
        this.f45211a = z;
        this.f45212b = z2;
        this.f45213c = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m34927a() {
        d4n0 d4n0Var = (d4n0) this.f45214d.getValue();
        return d4n0Var != null ? d4n0Var.m34927a() : this.f45211a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m34928b() {
        d4n0 d4n0Var = (d4n0) this.f45214d.getValue();
        return d4n0Var != null ? d4n0Var.m34928b() : this.f45212b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("account_link_using_auth_code", "partner-account-linking", m34927a()), new k8a("samsung_linking_use_cmp", "partner-account-linking", m34928b()));
    }
}
