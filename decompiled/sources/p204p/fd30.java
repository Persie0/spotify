package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class fd30 implements gh0, ro0 {

    /* JADX INFO: renamed from: a */
    public final ro0 f68308a;

    /* JADX INFO: renamed from: b */
    public final String f68309b;

    /* JADX INFO: renamed from: c */
    public final String f68310c;

    public fd30(ro0 ro0Var, String str, String str2) {
        this.f68308a = ro0Var;
        this.f68309b = str;
        this.f68310c = str2;
    }

    @Override // p204p.ro0
    /* JADX INFO: renamed from: c */
    public final String mo29280c() {
        return this.f68308a.mo29280c();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fd30)) {
            return false;
        }
        fd30 fd30Var = (fd30) obj;
        return wj50.m88271j(this.f68308a, fd30Var.f68308a) && wj50.m88271j(this.f68309b, fd30Var.f68309b) && wj50.m88271j(this.f68310c, fd30Var.f68310c);
    }

    @Override // p204p.gh0
    /* JADX INFO: renamed from: h */
    public final String mo29282h() {
        return this.f68310c;
    }

    public final int hashCode() {
        return this.f68310c.hashCode() + s571.m77243b(this.f68308a.hashCode() * 31, 31, this.f68309b);
    }

    @Override // p204p.ro0
    /* JADX INFO: renamed from: j */
    public final String mo29283j() {
        return this.f68308a.mo29283j();
    }

    @Override // p204p.gh0
    /* JADX INFO: renamed from: k */
    public final String mo29284k() {
        return this.f68309b;
    }

    @Override // p204p.ro0
    /* JADX INFO: renamed from: l */
    public final String mo29285l() {
        return this.f68308a.mo29285l();
    }
}
