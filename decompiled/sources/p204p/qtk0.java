package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class qtk0 {

    /* JADX INFO: renamed from: a */
    public final int f192400a;

    /* JADX INFO: renamed from: b */
    public final String f192401b;

    /* JADX INFO: renamed from: c */
    public final String f192402c;

    /* JADX INFO: renamed from: d */
    public final String f192403d;

    /* JADX INFO: renamed from: e */
    public final String f192404e;

    /* JADX INFO: renamed from: f */
    public final String f192405f;

    /* JADX INFO: renamed from: g */
    public final Integer f192406g;

    public qtk0(int i, String str, String str2, String str3, String str4, String str5, Integer num) {
        this.f192400a = i;
        this.f192401b = str;
        this.f192402c = str2;
        this.f192403d = str3;
        this.f192404e = str4;
        this.f192405f = str5;
        this.f192406g = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qtk0)) {
            return false;
        }
        qtk0 qtk0Var = (qtk0) obj;
        return this.f192400a == qtk0Var.f192400a && wj50.m88271j(this.f192401b, qtk0Var.f192401b) && wj50.m88271j(this.f192402c, qtk0Var.f192402c) && wj50.m88271j(this.f192403d, qtk0Var.f192403d) && wj50.m88271j(this.f192404e, qtk0Var.f192404e) && wj50.m88271j(this.f192405f, qtk0Var.f192405f) && wj50.m88271j(this.f192406g, qtk0Var.f192406g);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f192400a) * 31;
        String str = this.f192401b;
        int iM77243b = s571.m77243b(s571.m77243b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f192402c), 31, this.f192403d);
        String str2 = this.f192404e;
        int iHashCode2 = (iM77243b + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f192405f;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f192406g;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }
}
