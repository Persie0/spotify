package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class u6w0 {

    /* JADX INFO: renamed from: a */
    public final String f227441a;

    /* JADX INFO: renamed from: b */
    public final String f227442b;

    /* JADX INFO: renamed from: c */
    public final String f227443c;

    /* JADX INFO: renamed from: d */
    public final String f227444d;

    /* JADX INFO: renamed from: e */
    public final Integer f227445e;

    public u6w0(String str, String str2, Integer num, String str3, String str4) {
        this.f227441a = str;
        this.f227442b = str2;
        this.f227443c = str3;
        this.f227444d = str4;
        this.f227445e = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u6w0)) {
            return false;
        }
        u6w0 u6w0Var = (u6w0) obj;
        return wj50.m88271j(this.f227441a, u6w0Var.f227441a) && wj50.m88271j(this.f227442b, u6w0Var.f227442b) && wj50.m88271j(this.f227443c, u6w0Var.f227443c) && wj50.m88271j(this.f227444d, u6w0Var.f227444d) && wj50.m88271j(this.f227445e, u6w0Var.f227445e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f227441a.hashCode() * 31, 31, this.f227442b);
        String str = this.f227443c;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f227444d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f227445e;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }
}
