package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class cvv implements vwf {

    /* JADX INFO: renamed from: a */
    public final String f42549a;

    /* JADX INFO: renamed from: b */
    public final String f42550b;

    /* JADX INFO: renamed from: c */
    public final String f42551c;

    public cvv(String str, String str2, String str3) {
        this.f42549a = str;
        this.f42550b = str2;
        this.f42551c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvv)) {
            return false;
        }
        cvv cvvVar = (cvv) obj;
        return wj50.m88271j(this.f42549a, cvvVar.f42549a) && wj50.m88271j(this.f42550b, cvvVar.f42550b) && wj50.m88271j(this.f42551c, cvvVar.f42551c);
    }

    public final int hashCode() {
        return this.f42551c.hashCode() + s571.m77243b(this.f42549a.hashCode() * 31, 31, this.f42550b);
    }
}
