package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class n340 {

    /* JADX INFO: renamed from: a */
    public final String f149927a;

    /* JADX INFO: renamed from: b */
    public final String f149928b;

    /* JADX INFO: renamed from: c */
    public final Integer f149929c;

    /* JADX INFO: renamed from: d */
    public final Integer f149930d;

    public n340(String str, Integer num, Integer num2, String str2) {
        this.f149927a = str;
        this.f149928b = str2;
        this.f149929c = num;
        this.f149930d = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n340)) {
            return false;
        }
        n340 n340Var = (n340) obj;
        return wj50.m88271j(this.f149927a, n340Var.f149927a) && wj50.m88271j(this.f149928b, n340Var.f149928b) && wj50.m88271j(this.f149929c, n340Var.f149929c) && wj50.m88271j(this.f149930d, n340Var.f149930d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f149927a.hashCode() * 31, 31, this.f149928b);
        Integer num = this.f149929c;
        int iHashCode = (iM77243b + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f149930d;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }
}
