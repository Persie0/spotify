package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class f1m {

    /* JADX INFO: renamed from: a */
    public final String f64924a;

    /* JADX INFO: renamed from: b */
    public final String f64925b;

    /* JADX INFO: renamed from: c */
    public final String f64926c;

    /* JADX INFO: renamed from: d */
    public final String f64927d;

    /* JADX INFO: renamed from: e */
    public final String f64928e;

    public f1m(String str, String str2, String str3, String str4, String str5) {
        this.f64924a = str;
        this.f64925b = str2;
        this.f64926c = str3;
        this.f64927d = str4;
        this.f64928e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1m)) {
            return false;
        }
        f1m f1mVar = (f1m) obj;
        return wj50.m88271j(this.f64924a, f1mVar.f64924a) && wj50.m88271j(this.f64925b, f1mVar.f64925b) && wj50.m88271j(this.f64926c, f1mVar.f64926c) && wj50.m88271j(this.f64927d, f1mVar.f64927d) && wj50.m88271j(this.f64928e, f1mVar.f64928e);
    }

    public final int hashCode() {
        return this.f64928e.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(this.f64924a.hashCode() * 31, 31, this.f64925b), 31, this.f64926c), 31, this.f64927d);
    }
}
