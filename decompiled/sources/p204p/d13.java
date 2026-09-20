package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class d13 {

    /* JADX INFO: renamed from: a */
    public final a13 f44139a;

    /* JADX INFO: renamed from: b */
    public final String f44140b;

    /* JADX INFO: renamed from: c */
    public final int f44141c;

    public d13(a13 a13Var, String str, int i) {
        this.f44139a = a13Var;
        this.f44140b = str;
        this.f44141c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d13)) {
            return false;
        }
        d13 d13Var = (d13) obj;
        return wj50.m88271j(this.f44139a, d13Var.f44139a) && wj50.m88271j(this.f44140b, d13Var.f44140b) && this.f44141c == d13Var.f44141c;
    }

    public final int hashCode() {
        a13 a13Var = this.f44139a;
        int iHashCode = (a13Var == null ? 0 : a13Var.hashCode()) * 31;
        String str = this.f44140b;
        return edb.m38547C(this.f44141c) + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }
}
