package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class dr01 {

    /* JADX INFO: renamed from: a */
    public final String f52133a;

    /* JADX INFO: renamed from: b */
    public final String f52134b;

    public dr01(String str, String str2) {
        this.f52133a = str;
        this.f52134b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dr01)) {
            return false;
        }
        dr01 dr01Var = (dr01) obj;
        return wj50.m88271j(this.f52133a, dr01Var.f52133a) && wj50.m88271j(this.f52134b, dr01Var.f52134b);
    }

    public final int hashCode() {
        return this.f52134b.hashCode() + (this.f52133a.hashCode() * 31);
    }
}
