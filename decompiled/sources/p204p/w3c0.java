package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class w3c0 {

    /* JADX INFO: renamed from: a */
    public final String f247550a;

    /* JADX INFO: renamed from: b */
    public final String f247551b;

    /* JADX INFO: renamed from: c */
    public final String f247552c;

    /* JADX INFO: renamed from: d */
    public final String f247553d;

    /* JADX INFO: renamed from: e */
    public final Integer f247554e;

    public w3c0(String str, String str2, Integer num, String str3, String str4) {
        this.f247550a = str;
        this.f247551b = str2;
        this.f247552c = str3;
        this.f247553d = str4;
        this.f247554e = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w3c0)) {
            return false;
        }
        w3c0 w3c0Var = (w3c0) obj;
        return wj50.m88271j(this.f247550a, w3c0Var.f247550a) && wj50.m88271j(this.f247551b, w3c0Var.f247551b) && wj50.m88271j(this.f247552c, w3c0Var.f247552c) && wj50.m88271j(this.f247553d, w3c0Var.f247553d) && wj50.m88271j(this.f247554e, w3c0Var.f247554e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f247550a.hashCode() * 31, 31, this.f247551b);
        String str = this.f247552c;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f247553d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f247554e;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }
}
