package p204p;

/* JADX INFO: renamed from: p.ip */
/* JADX INFO: loaded from: classes7.dex */
public final class C1987ip {

    /* JADX INFO: renamed from: a */
    public final String f104316a;

    /* JADX INFO: renamed from: b */
    public final String f104317b;

    /* JADX INFO: renamed from: c */
    public final Integer f104318c;

    public C1987ip(Integer num, String str, String str2) {
        this.f104316a = str;
        this.f104317b = str2;
        this.f104318c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1987ip)) {
            return false;
        }
        C1987ip c1987ip = (C1987ip) obj;
        return wj50.m88271j(this.f104316a, c1987ip.f104316a) && wj50.m88271j(this.f104317b, c1987ip.f104317b) && wj50.m88271j(this.f104318c, c1987ip.f104318c);
    }

    public final int hashCode() {
        int iHashCode = this.f104316a.hashCode() * 31;
        String str = this.f104317b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f104318c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }
}
