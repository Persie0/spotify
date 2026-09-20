package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class otd0 {

    /* JADX INFO: renamed from: a */
    public final String f169039a;

    /* JADX INFO: renamed from: b */
    public final String f169040b;

    /* JADX INFO: renamed from: c */
    public final String f169041c;

    /* JADX INFO: renamed from: d */
    public final String f169042d;

    /* JADX INFO: renamed from: e */
    public final String f169043e;

    public otd0(String str, String str2, String str3, String str4, String str5) {
        this.f169039a = str;
        this.f169040b = str2;
        this.f169041c = str3;
        this.f169042d = str4;
        this.f169043e = str5;
    }

    /* JADX INFO: renamed from: a */
    public final String m67780a() {
        return this.f169040b;
    }

    /* JADX INFO: renamed from: b */
    public final String m67781b() {
        return this.f169043e;
    }

    /* JADX INFO: renamed from: c */
    public final String m67782c() {
        return this.f169039a;
    }

    /* JADX INFO: renamed from: d */
    public final String m67783d() {
        return this.f169041c;
    }

    /* JADX INFO: renamed from: e */
    public final String m67784e() {
        return this.f169042d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof otd0)) {
            return false;
        }
        otd0 otd0Var = (otd0) obj;
        return wj50.m88271j(this.f169039a, otd0Var.f169039a) && wj50.m88271j(this.f169040b, otd0Var.f169040b) && wj50.m88271j(this.f169041c, otd0Var.f169041c) && wj50.m88271j(this.f169042d, otd0Var.f169042d) && wj50.m88271j(this.f169043e, otd0Var.f169043e);
    }

    public final int hashCode() {
        return this.f169043e.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(this.f169039a.hashCode() * 31, 31, this.f169040b), 31, this.f169041c), 31, this.f169042d);
    }
}
