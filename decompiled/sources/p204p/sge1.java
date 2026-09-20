package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class sge1 implements zge1 {

    /* JADX INFO: renamed from: a */
    public final String f208845a;

    /* JADX INFO: renamed from: b */
    public final String f208846b;

    public sge1(String str, String str2) {
        this.f208845a = str;
        this.f208846b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sge1)) {
            return false;
        }
        sge1 sge1Var = (sge1) obj;
        return wj50.m88271j(this.f208845a, sge1Var.f208845a) && wj50.m88271j(this.f208846b, sge1Var.f208846b);
    }

    public final int hashCode() {
        int iHashCode = this.f208845a.hashCode() * 31;
        String str = this.f208846b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
