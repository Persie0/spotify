package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class j4s implements k4s {

    /* JADX INFO: renamed from: a */
    public final String f108776a;

    /* JADX INFO: renamed from: b */
    public final String f108777b;

    public j4s(String str, String str2) {
        this.f108776a = str;
        this.f108777b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j4s)) {
            return false;
        }
        j4s j4sVar = (j4s) obj;
        return wj50.m88271j(this.f108776a, j4sVar.f108776a) && wj50.m88271j(this.f108777b, j4sVar.f108777b);
    }

    public final int hashCode() {
        int iHashCode = this.f108776a.hashCode() * 31;
        String str = this.f108777b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
