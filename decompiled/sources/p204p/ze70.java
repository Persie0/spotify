package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ze70 {

    /* JADX INFO: renamed from: a */
    public final String f281894a;

    /* JADX INFO: renamed from: b */
    public final String f281895b;

    /* JADX INFO: renamed from: c */
    public final Boolean f281896c;

    /* JADX INFO: renamed from: d */
    public final String f281897d;

    /* JADX INFO: renamed from: e */
    public final boolean f281898e;

    public ze70(String str, String str2, Boolean bool, String str3, boolean z) {
        this.f281894a = str;
        this.f281895b = str2;
        this.f281896c = bool;
        this.f281897d = str3;
        this.f281898e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ze70)) {
            return false;
        }
        ze70 ze70Var = (ze70) obj;
        return wj50.m88271j(this.f281894a, ze70Var.f281894a) && wj50.m88271j(this.f281895b, ze70Var.f281895b) && wj50.m88271j(this.f281896c, ze70Var.f281896c) && wj50.m88271j(this.f281897d, ze70Var.f281897d) && this.f281898e == ze70Var.f281898e;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f281894a.hashCode() * 31, 31, this.f281895b);
        Boolean bool = this.f281896c;
        int iHashCode = (iM77243b + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f281897d;
        return Boolean.hashCode(this.f281898e) + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }
}
