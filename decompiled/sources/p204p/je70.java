package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class je70 implements vwf {

    /* JADX INFO: renamed from: a */
    public final String f111483a;

    /* JADX INFO: renamed from: b */
    public final String f111484b;

    /* JADX INFO: renamed from: c */
    public final String f111485c;

    /* JADX INFO: renamed from: d */
    public final String f111486d;

    /* JADX INFO: renamed from: e */
    public final vta f111487e;

    /* JADX INFO: renamed from: f */
    public final String f111488f;

    /* JADX INFO: renamed from: g */
    public final vsa f111489g;

    public je70(String str, String str2, String str3, String str4, String str5, vsa vsaVar, vta vtaVar) {
        this.f111483a = str;
        this.f111484b = str2;
        this.f111485c = str3;
        this.f111486d = str4;
        this.f111487e = vtaVar;
        this.f111488f = str5;
        this.f111489g = vsaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof je70)) {
            return false;
        }
        je70 je70Var = (je70) obj;
        return wj50.m88271j(this.f111483a, je70Var.f111483a) && wj50.m88271j(this.f111484b, je70Var.f111484b) && wj50.m88271j(this.f111485c, je70Var.f111485c) && wj50.m88271j(this.f111486d, je70Var.f111486d) && this.f111487e == je70Var.f111487e && wj50.m88271j(this.f111488f, je70Var.f111488f) && this.f111489g == je70Var.f111489g;
    }

    public final int hashCode() {
        return this.f111489g.hashCode() + s571.m77243b((this.f111487e.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(this.f111483a.hashCode() * 31, 31, this.f111484b), 31, this.f111485c), 31, this.f111486d)) * 31, 31, this.f111488f);
    }
}
