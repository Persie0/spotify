package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ylv0 implements zlv0 {

    /* JADX INFO: renamed from: a */
    public final String f274109a;

    /* JADX INFO: renamed from: b */
    public final String f274110b;

    /* JADX INFO: renamed from: c */
    public final String f274111c;

    /* JADX INFO: renamed from: d */
    public final String f274112d;

    public ylv0(String str, String str2, String str3, String str4) {
        this.f274109a = str;
        this.f274110b = str2;
        this.f274111c = str3;
        this.f274112d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ylv0)) {
            return false;
        }
        ylv0 ylv0Var = (ylv0) obj;
        return wj50.m88271j(this.f274109a, ylv0Var.f274109a) && wj50.m88271j(this.f274110b, ylv0Var.f274110b) && wj50.m88271j(this.f274111c, ylv0Var.f274111c) && wj50.m88271j(this.f274112d, ylv0Var.f274112d);
    }

    public final int hashCode() {
        return this.f274112d.hashCode() + s571.m77243b(s571.m77243b(this.f274109a.hashCode() * 31, 31, this.f274110b), 31, this.f274111c);
    }
}
