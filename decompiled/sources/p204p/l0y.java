package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class l0y {

    /* JADX INFO: renamed from: a */
    public final String f128530a;

    /* JADX INFO: renamed from: b */
    public final String f128531b;

    /* JADX INFO: renamed from: c */
    public final String f128532c;

    /* JADX INFO: renamed from: d */
    public final Integer f128533d;

    /* JADX INFO: renamed from: e */
    public final String f128534e;

    public l0y(int i, Integer num, String str, String str2, String str3, String str4) {
        str2 = (i & 2) != 0 ? null : str2;
        str3 = (i & 4) != 0 ? null : str3;
        num = (i & 8) != 0 ? null : num;
        str4 = (i & 16) != 0 ? null : str4;
        this.f128530a = str;
        this.f128531b = str2;
        this.f128532c = str3;
        this.f128533d = num;
        this.f128534e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0y)) {
            return false;
        }
        l0y l0yVar = (l0y) obj;
        return wj50.m88271j(this.f128530a, l0yVar.f128530a) && wj50.m88271j(this.f128531b, l0yVar.f128531b) && wj50.m88271j(this.f128532c, l0yVar.f128532c) && wj50.m88271j(this.f128533d, l0yVar.f128533d) && wj50.m88271j(this.f128534e, l0yVar.f128534e);
    }

    public final int hashCode() {
        int iHashCode = this.f128530a.hashCode() * 31;
        String str = this.f128531b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f128532c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f128533d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.f128534e;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }
}
