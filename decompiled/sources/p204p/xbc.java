package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class xbc {

    /* JADX INFO: renamed from: a */
    public final String f259880a;

    /* JADX INFO: renamed from: b */
    public final String f259881b;

    /* JADX INFO: renamed from: c */
    public final int f259882c;

    /* JADX INFO: renamed from: d */
    public final int f259883d;

    /* JADX INFO: renamed from: e */
    public final String f259884e;

    public xbc(int i, int i2, String str, String str2, String str3) {
        this.f259880a = str;
        this.f259881b = str2;
        this.f259882c = i;
        this.f259883d = i2;
        this.f259884e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xbc)) {
            return false;
        }
        xbc xbcVar = (xbc) obj;
        return this.f259880a.equals(xbcVar.f259880a) && this.f259881b.equals(xbcVar.f259881b) && this.f259882c == xbcVar.f259882c && this.f259883d == xbcVar.f259883d && this.f259884e.equals(xbcVar.f259884e);
    }

    public final int hashCode() {
        return this.f259884e.hashCode() + f710.m40938f(this.f259883d, f710.m40938f(this.f259882c, s571.m77243b(this.f259880a.hashCode() * 31, 31, this.f259881b), 31), 31);
    }
}
