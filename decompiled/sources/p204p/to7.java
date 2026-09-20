package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class to7 {

    /* JADX INFO: renamed from: a */
    public final String f222191a;

    /* JADX INFO: renamed from: b */
    public final String f222192b;

    /* JADX INFO: renamed from: c */
    public final String f222193c;

    public to7(String str, String str2, String str3) {
        this.f222191a = str;
        this.f222192b = str2;
        this.f222193c = str3;
    }

    /* JADX INFO: renamed from: a */
    public final String m81192a() {
        return this.f222193c;
    }

    /* JADX INFO: renamed from: b */
    public final String m81193b() {
        return this.f222192b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof to7)) {
            return false;
        }
        to7 to7Var = (to7) obj;
        return wj50.m88271j(this.f222191a, to7Var.f222191a) && wj50.m88271j(this.f222192b, to7Var.f222192b) && wj50.m88271j(this.f222193c, to7Var.f222193c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f222191a.hashCode() * 31, 31, this.f222192b);
        String str = this.f222193c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
