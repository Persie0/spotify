package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class p551 {

    /* JADX INFO: renamed from: a */
    public final Object f174080a;

    /* JADX INFO: renamed from: b */
    public final boolean f174081b;

    public p551(eh00 eh00Var, boolean z) {
        this.f174080a = eh00Var;
        this.f174081b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p551)) {
            return false;
        }
        p551 p551Var = (p551) obj;
        return wj50.m88271j(this.f174080a, p551Var.f174080a) && this.f174081b == p551Var.f174081b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f174081b) + (this.f174080a.hashCode() * 31);
    }
}
