package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class q1d1 {

    /* JADX INFO: renamed from: a */
    public final String f184297a;

    /* JADX INFO: renamed from: b */
    public final String f184298b;

    /* JADX INFO: renamed from: c */
    public final String f184299c;

    /* JADX INFO: renamed from: d */
    public final String f184300d;

    public q1d1(String str, String str2, String str3, String str4) {
        this.f184297a = str;
        this.f184298b = str2;
        this.f184299c = str3;
        this.f184300d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1d1)) {
            return false;
        }
        q1d1 q1d1Var = (q1d1) obj;
        return wj50.m88271j(this.f184297a, q1d1Var.f184297a) && wj50.m88271j(this.f184298b, q1d1Var.f184298b) && wj50.m88271j(this.f184299c, q1d1Var.f184299c) && wj50.m88271j(this.f184300d, q1d1Var.f184300d);
    }

    public final int hashCode() {
        return this.f184300d.hashCode() + s571.m77243b(s571.m77243b(this.f184297a.hashCode() * 31, 31, this.f184298b), 31, this.f184299c);
    }
}
