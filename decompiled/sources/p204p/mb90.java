package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class mb90 {

    /* JADX INFO: renamed from: a */
    public final String f141838a;

    /* JADX INFO: renamed from: b */
    public final String f141839b;

    /* JADX INFO: renamed from: c */
    public final boolean f141840c;

    /* JADX INFO: renamed from: d */
    public final Long f141841d;

    public mb90(Long l, String str, String str2, boolean z) {
        this.f141838a = str;
        this.f141839b = str2;
        this.f141840c = z;
        this.f141841d = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mb90)) {
            return false;
        }
        mb90 mb90Var = (mb90) obj;
        return wj50.m88271j(this.f141838a, mb90Var.f141838a) && wj50.m88271j(this.f141839b, mb90Var.f141839b) && this.f141840c == mb90Var.f141840c && wj50.m88271j(this.f141841d, mb90Var.f141841d);
    }

    public final int hashCode() {
        int iHashCode = this.f141838a.hashCode() * 31;
        String str = this.f141839b;
        int iM77245d = s571.m77245d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f141840c);
        Long l = this.f141841d;
        return iM77245d + (l != null ? l.hashCode() : 0);
    }
}
