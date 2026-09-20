package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class hlb1 implements gh0 {

    /* JADX INFO: renamed from: a */
    public final String f92665a;

    /* JADX INFO: renamed from: b */
    public final gh0 f92666b;

    public hlb1(String str, gh0 gh0Var) {
        this.f92665a = str;
        this.f92666b = gh0Var;
    }

    @Override // p204p.ro0
    /* JADX INFO: renamed from: c */
    public final String mo29280c() {
        return this.f92666b.mo29280c();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hlb1)) {
            return false;
        }
        hlb1 hlb1Var = (hlb1) obj;
        return wj50.m88271j(this.f92665a, hlb1Var.f92665a) && wj50.m88271j(this.f92666b, hlb1Var.f92666b);
    }

    @Override // p204p.gh0
    /* JADX INFO: renamed from: g */
    public final boolean mo29281g() {
        return this.f92666b.mo29281g();
    }

    @Override // p204p.gh0
    /* JADX INFO: renamed from: h */
    public final String mo29282h() {
        return this.f92666b.mo29282h();
    }

    public final int hashCode() {
        String str = this.f92665a;
        return this.f92666b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @Override // p204p.ro0
    /* JADX INFO: renamed from: j */
    public final String mo29283j() {
        return this.f92666b.mo29283j();
    }

    @Override // p204p.gh0
    /* JADX INFO: renamed from: k */
    public final String mo29284k() {
        return this.f92666b.mo29284k();
    }

    @Override // p204p.ro0
    /* JADX INFO: renamed from: l */
    public final String mo29285l() {
        return this.f92666b.mo29285l();
    }
}
