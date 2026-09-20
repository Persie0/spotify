package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class j8c {

    /* JADX INFO: renamed from: a */
    public final String f109894a;

    /* JADX INFO: renamed from: b */
    public final String f109895b;

    /* JADX INFO: renamed from: c */
    public final String f109896c;

    public j8c(String str, String str2, String str3) {
        this.f109894a = str;
        this.f109895b = str2;
        this.f109896c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j8c)) {
            return false;
        }
        j8c j8cVar = (j8c) obj;
        return wj50.m88271j(this.f109894a, j8cVar.f109894a) && wj50.m88271j(this.f109895b, j8cVar.f109895b) && wj50.m88271j(this.f109896c, j8cVar.f109896c);
    }

    public final int hashCode() {
        int iHashCode = this.f109894a.hashCode() * 31;
        String str = this.f109895b;
        return this.f109896c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
