package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class dr50 {

    /* JADX INFO: renamed from: a */
    public final String f52169a;

    /* JADX INFO: renamed from: b */
    public final String f52170b;

    public dr50(String str, String str2) {
        this.f52169a = str;
        this.f52170b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dr50)) {
            return false;
        }
        dr50 dr50Var = (dr50) obj;
        return wj50.m88271j(this.f52169a, dr50Var.f52169a) && wj50.m88271j(this.f52170b, dr50Var.f52170b);
    }

    public final int hashCode() {
        return this.f52170b.hashCode() + (this.f52169a.hashCode() * 31);
    }
}
