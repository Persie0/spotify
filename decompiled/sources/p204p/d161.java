package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class d161 {

    /* JADX INFO: renamed from: a */
    public final String f44171a;

    /* JADX INFO: renamed from: b */
    public final int f44172b;

    /* JADX INFO: renamed from: c */
    public final eh00 f44173c;

    public d161(String str, eh00 eh00Var, int i) {
        this.f44171a = str;
        this.f44172b = i;
        this.f44173c = eh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d161)) {
            return false;
        }
        d161 d161Var = (d161) obj;
        return wj50.m88271j(this.f44171a, d161Var.f44171a) && this.f44172b == d161Var.f44172b && wj50.m88271j(this.f44173c, d161Var.f44173c);
    }

    public final int hashCode() {
        return this.f44173c.hashCode() + mt60.m62800g(this.f44172b, this.f44171a.hashCode() * 31, 31);
    }
}
