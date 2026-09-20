package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class lk11 {

    /* JADX INFO: renamed from: a */
    public final String f134201a;

    /* JADX INFO: renamed from: b */
    public final String f134202b;

    /* JADX INFO: renamed from: c */
    public final String f134203c;

    /* JADX INFO: renamed from: d */
    public final String f134204d;

    public lk11(String str, String str2, String str3, String str4) {
        this.f134201a = str;
        this.f134202b = str2;
        this.f134203c = str3;
        this.f134204d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lk11)) {
            return false;
        }
        lk11 lk11Var = (lk11) obj;
        return wj50.m88271j(this.f134201a, lk11Var.f134201a) && wj50.m88271j(this.f134202b, lk11Var.f134202b) && wj50.m88271j(this.f134203c, lk11Var.f134203c) && wj50.m88271j(this.f134204d, lk11Var.f134204d);
    }

    public final int hashCode() {
        return this.f134204d.hashCode() + s571.m77243b(s571.m77243b(this.f134201a.hashCode() * 31, 31, this.f134202b), 31, this.f134203c);
    }
}
