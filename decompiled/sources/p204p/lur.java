package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class lur implements gh0 {

    /* JADX INFO: renamed from: a */
    public final String f137139a;

    /* JADX INFO: renamed from: b */
    public final gh0 f137140b;

    public lur(String str, fh0 fh0Var) {
        this.f137139a = str;
        this.f137140b = fh0Var;
    }

    @Override // p204p.ro0
    /* JADX INFO: renamed from: c */
    public final String mo29280c() {
        return this.f137140b.mo29280c();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lur)) {
            return false;
        }
        lur lurVar = (lur) obj;
        return wj50.m88271j(this.f137139a, lurVar.f137139a) && wj50.m88271j(this.f137140b, lurVar.f137140b);
    }

    @Override // p204p.gh0
    /* JADX INFO: renamed from: g */
    public final boolean mo29281g() {
        return this.f137140b.mo29281g();
    }

    @Override // p204p.gh0
    /* JADX INFO: renamed from: h */
    public final String mo29282h() {
        return this.f137140b.mo29282h();
    }

    public final int hashCode() {
        String str = this.f137139a;
        return this.f137140b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @Override // p204p.ro0
    /* JADX INFO: renamed from: j */
    public final String mo29283j() {
        return this.f137140b.mo29283j();
    }

    @Override // p204p.gh0
    /* JADX INFO: renamed from: k */
    public final String mo29284k() {
        return this.f137140b.mo29284k();
    }

    @Override // p204p.ro0
    /* JADX INFO: renamed from: l */
    public final String mo29285l() {
        return this.f137140b.mo29285l();
    }
}
