package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class jx0 {

    /* JADX INFO: renamed from: a */
    public final String f116750a;

    /* JADX INFO: renamed from: b */
    public final String f116751b;

    /* JADX INFO: renamed from: c */
    public final Long f116752c;

    public jx0(Long l, String str, String str2) {
        this.f116750a = str;
        this.f116751b = str2;
        this.f116752c = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jx0)) {
            return false;
        }
        jx0 jx0Var = (jx0) obj;
        return wj50.m88271j(this.f116750a, jx0Var.f116750a) && wj50.m88271j(this.f116751b, jx0Var.f116751b) && wj50.m88271j(this.f116752c, jx0Var.f116752c);
    }

    public final int hashCode() {
        int iHashCode = this.f116750a.hashCode() * 31;
        String str = this.f116751b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.f116752c;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }
}
