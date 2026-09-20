package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class upm0 implements ktx {

    /* JADX INFO: renamed from: a */
    public final String f232730a;

    /* JADX INFO: renamed from: b */
    public final String f232731b;

    /* JADX INFO: renamed from: c */
    public final String f232732c;

    /* JADX INFO: renamed from: d */
    public final String f232733d;

    /* JADX INFO: renamed from: e */
    public final String f232734e;

    /* JADX INFO: renamed from: f */
    public final int f232735f;

    /* JADX INFO: renamed from: g */
    public final String f232736g;

    /* JADX INFO: renamed from: h */
    public final String f232737h;

    /* JADX INFO: renamed from: i */
    public final gu8 f232738i;

    public upm0(String str, String str2, String str3, String str4, String str5, int i, String str6, String str7, gu8 gu8Var) {
        this.f232730a = str;
        this.f232731b = str2;
        this.f232732c = str3;
        this.f232733d = str4;
        this.f232734e = str5;
        this.f232735f = i;
        this.f232736g = str6;
        this.f232737h = str7;
        this.f232738i = gu8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof upm0)) {
            return false;
        }
        upm0 upm0Var = (upm0) obj;
        return wj50.m88271j(this.f232730a, upm0Var.f232730a) && wj50.m88271j(this.f232731b, upm0Var.f232731b) && wj50.m88271j(this.f232732c, upm0Var.f232732c) && wj50.m88271j(this.f232733d, upm0Var.f232733d) && wj50.m88271j(this.f232734e, upm0Var.f232734e) && this.f232735f == upm0Var.f232735f && wj50.m88271j(this.f232736g, upm0Var.f232736g) && wj50.m88271j(this.f232737h, upm0Var.f232737h) && this.f232738i.equals(upm0Var.f232738i);
    }

    public final int hashCode() {
        return this.f232738i.hashCode() + s571.m77243b(s571.m77243b(f710.m40938f(this.f232735f, s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f232730a.hashCode() * 31, 31, this.f232731b), 31, this.f232732c), 31, this.f232733d), 31, this.f232734e), 31), 31, this.f232736g), 31, this.f232737h);
    }
}
