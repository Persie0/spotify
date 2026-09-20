package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class dr91 {

    /* JADX INFO: renamed from: a */
    public final n95 f52268a;

    /* JADX INFO: renamed from: b */
    public final gij f52269b;

    /* JADX INFO: renamed from: c */
    public final vh00 f52270c;

    public dr91(n95 n95Var, gij gijVar, vh00 vh00Var) {
        this.f52268a = n95Var;
        this.f52269b = gijVar;
        this.f52270c = vh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dr91)) {
            return false;
        }
        dr91 dr91Var = (dr91) obj;
        return wj50.m88271j(this.f52268a, dr91Var.f52268a) && wj50.m88271j(this.f52269b, dr91Var.f52269b) && wj50.m88271j(this.f52270c, dr91Var.f52270c);
    }

    public final int hashCode() {
        int iHashCode = (this.f52269b.hashCode() + (this.f52268a.hashCode() * 31)) * 31;
        vh00 vh00Var = this.f52270c;
        return (iHashCode + (vh00Var == null ? 0 : vh00Var.hashCode())) * 31;
    }
}
