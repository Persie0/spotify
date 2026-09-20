package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class fx2 {

    /* JADX INFO: renamed from: a */
    public final String f74222a;

    /* JADX INFO: renamed from: b */
    public final int f74223b;

    /* JADX INFO: renamed from: c */
    public final String f74224c;

    /* JADX INFO: renamed from: d */
    public final Integer f74225d;

    /* JADX INFO: renamed from: e */
    public final Integer f74226e;

    public fx2(int i, Integer num, Integer num2, String str, String str2) {
        this.f74222a = str;
        this.f74223b = i;
        this.f74224c = str2;
        this.f74225d = num;
        this.f74226e = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fx2)) {
            return false;
        }
        fx2 fx2Var = (fx2) obj;
        return wj50.m88271j(this.f74222a, fx2Var.f74222a) && this.f74223b == fx2Var.f74223b && wj50.m88271j(this.f74224c, fx2Var.f74224c) && wj50.m88271j(this.f74225d, fx2Var.f74225d) && wj50.m88271j(this.f74226e, fx2Var.f74226e);
    }

    public final int hashCode() {
        int iM40938f = f710.m40938f(this.f74223b, this.f74222a.hashCode() * 31, 31);
        String str = this.f74224c;
        int iHashCode = (iM40938f + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f74225d;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f74226e;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }
}
