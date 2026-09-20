package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class kht extends s1h1 {

    /* JADX INFO: renamed from: b */
    public final String f122719b;

    /* JADX INFO: renamed from: c */
    public final d850 f122720c;

    public kht(String str, d850 d850Var) {
        this.f122719b = str;
        this.f122720c = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kht)) {
            return false;
        }
        kht khtVar = (kht) obj;
        return wj50.m88271j(this.f122719b, khtVar.f122719b) && wj50.m88271j(this.f122720c, khtVar.f122720c);
    }

    public final int hashCode() {
        return this.f122720c.hashCode() + (this.f122719b.hashCode() * 31);
    }
}
