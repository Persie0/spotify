package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class hxc0 implements rxc0 {

    /* JADX INFO: renamed from: a */
    public final String f96189a;

    /* JADX INFO: renamed from: b */
    public final d850 f96190b;

    public hxc0(String str, d850 d850Var) {
        this.f96189a = str;
        this.f96190b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hxc0)) {
            return false;
        }
        hxc0 hxc0Var = (hxc0) obj;
        return wj50.m88271j(this.f96189a, hxc0Var.f96189a) && wj50.m88271j(this.f96190b, hxc0Var.f96190b);
    }

    public final int hashCode() {
        int iHashCode = this.f96189a.hashCode() * 31;
        d850 d850Var = this.f96190b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
