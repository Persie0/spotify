package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class l3a {

    /* JADX INFO: renamed from: a */
    public final ild0 f129249a;

    /* JADX INFO: renamed from: b */
    public final boolean f129250b;

    /* JADX INFO: renamed from: c */
    public final boolean f129251c;

    public l3a(ild0 ild0Var, boolean z, boolean z2) {
        this.f129249a = ild0Var;
        this.f129250b = z;
        this.f129251c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l3a)) {
            return false;
        }
        l3a l3aVar = (l3a) obj;
        return wj50.m88271j(this.f129249a, l3aVar.f129249a) && this.f129250b == l3aVar.f129250b && this.f129251c == l3aVar.f129251c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f129251c) + s571.m77245d(this.f129249a.hashCode() * 31, 31, this.f129250b);
    }
}
