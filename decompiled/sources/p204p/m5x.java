package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class m5x {

    /* JADX INFO: renamed from: a */
    public final String f140305a;

    /* JADX INFO: renamed from: b */
    public final int f140306b;

    /* JADX INFO: renamed from: c */
    public final String f140307c;

    /* JADX INFO: renamed from: d */
    public final String f140308d;

    /* JADX INFO: renamed from: e */
    public final Integer f140309e;

    /* JADX INFO: renamed from: f */
    public final Integer f140310f;

    public m5x(String str, int i, String str2, String str3, Integer num, Integer num2) {
        this.f140305a = str;
        this.f140306b = i;
        this.f140307c = str2;
        this.f140308d = str3;
        this.f140309e = num;
        this.f140310f = num2;
    }

    /* JADX INFO: renamed from: a */
    public static m5x m60891a(m5x m5xVar, String str, String str2, Integer num, Integer num2) {
        return new m5x(m5xVar.f140305a, m5xVar.f140306b, str, str2, num, num2);
    }

    /* JADX INFO: renamed from: b */
    public final String m60892b() {
        return this.f140307c;
    }

    /* JADX INFO: renamed from: c */
    public final String m60893c() {
        return this.f140308d;
    }

    /* JADX INFO: renamed from: d */
    public final int m60894d() {
        return this.f140306b;
    }

    /* JADX INFO: renamed from: e */
    public final String m60895e() {
        return this.f140305a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m5x)) {
            return false;
        }
        m5x m5xVar = (m5x) obj;
        return wj50.m88271j(this.f140305a, m5xVar.f140305a) && this.f140306b == m5xVar.f140306b && wj50.m88271j(this.f140307c, m5xVar.f140307c) && wj50.m88271j(this.f140308d, m5xVar.f140308d) && wj50.m88271j(this.f140309e, m5xVar.f140309e) && wj50.m88271j(this.f140310f, m5xVar.f140310f);
    }

    public final int hashCode() {
        int iM40938f = f710.m40938f(this.f140306b, this.f140305a.hashCode() * 31, 31);
        String str = this.f140307c;
        int iHashCode = (iM40938f + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f140308d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f140309e;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f140310f;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }
}
