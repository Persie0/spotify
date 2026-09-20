package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class cme1 {

    /* JADX INFO: renamed from: a */
    public final String f39658a;

    /* JADX INFO: renamed from: b */
    public final String f39659b;

    /* JADX INFO: renamed from: c */
    public final String f39660c;

    public cme1(String str, String str2, String str3) {
        this.f39658a = str;
        this.f39659b = str2;
        this.f39660c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cme1)) {
            return false;
        }
        cme1 cme1Var = (cme1) obj;
        return wj50.m88271j(this.f39658a, cme1Var.f39658a) && wj50.m88271j(this.f39659b, cme1Var.f39659b) && wj50.m88271j(this.f39660c, cme1Var.f39660c);
    }

    public final int hashCode() {
        return this.f39660c.hashCode() + s571.m77243b(this.f39658a.hashCode() * 31, 31, this.f39659b);
    }
}
