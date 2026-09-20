package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class dke1 implements fke1 {

    /* JADX INFO: renamed from: a */
    public final String f49963a;

    /* JADX INFO: renamed from: b */
    public final String f49964b;

    public dke1(String str, String str2) {
        this.f49963a = str;
        this.f49964b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dke1)) {
            return false;
        }
        dke1 dke1Var = (dke1) obj;
        return wj50.m88271j(this.f49963a, dke1Var.f49963a) && wj50.m88271j(this.f49964b, dke1Var.f49964b);
    }

    public final int hashCode() {
        String str = this.f49963a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f49964b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
