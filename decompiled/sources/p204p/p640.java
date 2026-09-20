package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class p640 implements vwf {

    /* JADX INFO: renamed from: a */
    public final String f174282a;

    /* JADX INFO: renamed from: b */
    public final String f174283b;

    /* JADX INFO: renamed from: c */
    public final String f174284c;

    public p640(String str, String str2, String str3) {
        this.f174282a = str;
        this.f174283b = str2;
        this.f174284c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p640)) {
            return false;
        }
        p640 p640Var = (p640) obj;
        return wj50.m88271j(this.f174282a, p640Var.f174282a) && wj50.m88271j(this.f174283b, p640Var.f174283b) && wj50.m88271j(this.f174284c, p640Var.f174284c);
    }

    public final int hashCode() {
        return this.f174284c.hashCode() + s571.m77243b(this.f174282a.hashCode() * 31, 31, this.f174283b);
    }
}
