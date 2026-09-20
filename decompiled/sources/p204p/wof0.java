package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class wof0 implements lpf0 {

    /* JADX INFO: renamed from: a */
    public final String f253463a;

    /* JADX INFO: renamed from: b */
    public final String f253464b;

    /* JADX INFO: renamed from: c */
    public final String f253465c;

    /* JADX INFO: renamed from: d */
    public final String f253466d;

    public wof0(String str, String str2, String str3, String str4) {
        this.f253463a = str;
        this.f253464b = str2;
        this.f253465c = str3;
        this.f253466d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wof0)) {
            return false;
        }
        wof0 wof0Var = (wof0) obj;
        return wj50.m88271j(this.f253463a, wof0Var.f253463a) && wj50.m88271j(this.f253464b, wof0Var.f253464b) && wj50.m88271j(this.f253465c, wof0Var.f253465c) && wj50.m88271j(this.f253466d, wof0Var.f253466d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f253463a.hashCode() * 31, 31, this.f253464b), 31, this.f253465c);
        String str = this.f253466d;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
