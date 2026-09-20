package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class qv00 {

    /* JADX INFO: renamed from: a */
    public final String f192848a;

    /* JADX INFO: renamed from: b */
    public final String f192849b;

    public qv00(String str, String str2) {
        this.f192848a = str;
        this.f192849b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qv00)) {
            return false;
        }
        qv00 qv00Var = (qv00) obj;
        return wj50.m88271j(this.f192848a, qv00Var.f192848a) && wj50.m88271j(this.f192849b, qv00Var.f192849b);
    }

    public final int hashCode() {
        int iHashCode = this.f192848a.hashCode() * 31;
        String str = this.f192849b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
