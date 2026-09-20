package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class pt5 {

    /* JADX INFO: renamed from: a */
    public final String f181042a;

    /* JADX INFO: renamed from: b */
    public final String f181043b;

    /* JADX INFO: renamed from: c */
    public final n6f f181044c;

    public pt5(String str, String str2, n6f n6fVar) {
        this.f181042a = str;
        this.f181043b = str2;
        this.f181044c = n6fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pt5)) {
            return false;
        }
        pt5 pt5Var = (pt5) obj;
        return wj50.m88271j(this.f181042a, pt5Var.f181042a) && wj50.m88271j(this.f181043b, pt5Var.f181043b) && wj50.m88271j(this.f181044c, pt5Var.f181044c);
    }

    public final int hashCode() {
        String str = this.f181042a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f181043b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        n6f n6fVar = this.f181044c;
        return iHashCode2 + (n6fVar != null ? Long.hashCode(n6fVar.f150873a) : 0);
    }
}
