package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ek1 {

    /* JADX INFO: renamed from: a */
    public final String f60329a;

    /* JADX INFO: renamed from: b */
    public final Boolean f60330b;

    /* JADX INFO: renamed from: c */
    public final String f60331c;

    public ek1(Boolean bool, String str, String str2) {
        this.f60329a = str;
        this.f60330b = bool;
        this.f60331c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ek1)) {
            return false;
        }
        ek1 ek1Var = (ek1) obj;
        return wj50.m88271j(this.f60329a, ek1Var.f60329a) && wj50.m88271j(this.f60330b, ek1Var.f60330b) && wj50.m88271j(this.f60331c, ek1Var.f60331c);
    }

    public final int hashCode() {
        String str = this.f60329a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.f60330b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.f60331c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
