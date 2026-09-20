package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class kaz0 {

    /* JADX INFO: renamed from: a */
    public final String f121011a;

    /* JADX INFO: renamed from: b */
    public final String f121012b;

    /* JADX INFO: renamed from: c */
    public final String f121013c;

    /* JADX INFO: renamed from: d */
    public final String f121014d;

    public kaz0(String str, String str2, String str3, String str4) {
        this.f121011a = str;
        this.f121012b = str2;
        this.f121013c = str3;
        this.f121014d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kaz0)) {
            return false;
        }
        kaz0 kaz0Var = (kaz0) obj;
        return wj50.m88271j(this.f121011a, kaz0Var.f121011a) && wj50.m88271j(this.f121012b, kaz0Var.f121012b) && wj50.m88271j(this.f121013c, kaz0Var.f121013c) && wj50.m88271j(this.f121014d, kaz0Var.f121014d);
    }

    public final int hashCode() {
        return this.f121014d.hashCode() + s571.m77243b(s571.m77243b(this.f121011a.hashCode() * 31, 31, this.f121012b), 31, this.f121013c);
    }
}
