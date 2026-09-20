package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ca8 {

    /* JADX INFO: renamed from: a */
    public final String f35762a;

    /* JADX INFO: renamed from: b */
    public final String f35763b;

    /* JADX INFO: renamed from: c */
    public final String f35764c;

    /* JADX INFO: renamed from: d */
    public final Integer f35765d;

    public ca8(String str, String str2, Integer num, String str3) {
        this.f35762a = str;
        this.f35763b = str2;
        this.f35764c = str3;
        this.f35765d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ca8)) {
            return false;
        }
        ca8 ca8Var = (ca8) obj;
        return wj50.m88271j(this.f35762a, ca8Var.f35762a) && wj50.m88271j(this.f35763b, ca8Var.f35763b) && wj50.m88271j(this.f35764c, ca8Var.f35764c) && wj50.m88271j(this.f35765d, ca8Var.f35765d);
    }

    public final int hashCode() {
        String str = this.f35762a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f35763b;
        int iM77243b = s571.m77243b((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f35764c);
        Integer num = this.f35765d;
        return iM77243b + (num != null ? num.hashCode() : 0);
    }
}
