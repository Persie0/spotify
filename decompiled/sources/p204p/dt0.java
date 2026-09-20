package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class dt0 {

    /* JADX INFO: renamed from: a */
    public final String f52681a;

    /* JADX INFO: renamed from: b */
    public final Long f52682b;

    /* JADX INFO: renamed from: c */
    public final String f52683c;

    public dt0(Long l, String str, String str2) {
        this.f52681a = str;
        this.f52682b = l;
        this.f52683c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dt0)) {
            return false;
        }
        dt0 dt0Var = (dt0) obj;
        return wj50.m88271j(this.f52681a, dt0Var.f52681a) && wj50.m88271j(this.f52682b, dt0Var.f52682b) && wj50.m88271j(this.f52683c, dt0Var.f52683c);
    }

    public final int hashCode() {
        int iHashCode = this.f52681a.hashCode() * 31;
        Long l = this.f52682b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.f52683c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
