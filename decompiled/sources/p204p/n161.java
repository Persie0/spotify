package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class n161 implements p161 {

    /* JADX INFO: renamed from: a */
    public final String f149307a;

    /* JADX INFO: renamed from: b */
    public final String f149308b;

    /* JADX INFO: renamed from: c */
    public final String f149309c;

    /* JADX INFO: renamed from: d */
    public final String f149310d;

    public n161(String str, String str2, String str3, String str4) {
        this.f149307a = str;
        this.f149308b = str2;
        this.f149309c = str3;
        this.f149310d = str4;
    }

    @Override // p204p.p161
    /* JADX INFO: renamed from: a */
    public final String mo46408a() {
        return this.f149308b;
    }

    @Override // p204p.p161
    /* JADX INFO: renamed from: b */
    public final String mo46409b() {
        return this.f149307a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n161)) {
            return false;
        }
        n161 n161Var = (n161) obj;
        return wj50.m88271j(this.f149307a, n161Var.f149307a) && wj50.m88271j(this.f149308b, n161Var.f149308b) && wj50.m88271j(this.f149309c, n161Var.f149309c) && wj50.m88271j(this.f149310d, n161Var.f149310d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f149307a.hashCode() * 31, 31, this.f149308b);
        String str = this.f149309c;
        return this.f149310d.hashCode() + ((iM77243b + (str == null ? 0 : str.hashCode())) * 31);
    }
}
