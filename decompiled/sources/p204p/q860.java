package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class q860 {

    /* JADX INFO: renamed from: a */
    public final String f186249a;

    /* JADX INFO: renamed from: b */
    public final xx50 f186250b;

    /* JADX INFO: renamed from: c */
    public final api f186251c;

    public q860(String str, xx50 xx50Var, api apiVar) {
        this.f186249a = str;
        this.f186250b = xx50Var;
        this.f186251c = apiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q860)) {
            return false;
        }
        q860 q860Var = (q860) obj;
        return wj50.m88271j(this.f186249a, q860Var.f186249a) && wj50.m88271j(this.f186250b, q860Var.f186250b) && wj50.m88271j(this.f186251c, q860Var.f186251c);
    }

    public final int hashCode() {
        int iHashCode = (this.f186250b.hashCode() + (this.f186249a.hashCode() * 31)) * 31;
        api apiVar = this.f186251c;
        return iHashCode + (apiVar == null ? 0 : apiVar.hashCode());
    }
}
