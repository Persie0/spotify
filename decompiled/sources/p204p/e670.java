package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class e670 {

    /* JADX INFO: renamed from: a */
    public final String f56579a;

    /* JADX INFO: renamed from: b */
    public final String f56580b;

    /* JADX INFO: renamed from: c */
    public final String f56581c;

    /* JADX INFO: renamed from: d */
    public final Integer f56582d;

    public e670(String str, String str2, Integer num, String str3) {
        this.f56579a = str;
        this.f56580b = str2;
        this.f56581c = str3;
        this.f56582d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e670)) {
            return false;
        }
        e670 e670Var = (e670) obj;
        return wj50.m88271j(this.f56579a, e670Var.f56579a) && wj50.m88271j(this.f56580b, e670Var.f56580b) && wj50.m88271j(this.f56581c, e670Var.f56581c) && wj50.m88271j(this.f56582d, e670Var.f56582d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f56579a.hashCode() * 31, 31, this.f56580b);
        String str = this.f56581c;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f56582d;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }
}
