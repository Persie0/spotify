package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class lge1 {

    /* JADX INFO: renamed from: a */
    public final String f133209a;

    /* JADX INFO: renamed from: b */
    public final String f133210b;

    /* JADX INFO: renamed from: c */
    public final sab0 f133211c;

    /* JADX INFO: renamed from: d */
    public final int f133212d;

    public lge1(String str, String str2, sab0 sab0Var, int i) {
        this.f133209a = str;
        this.f133210b = str2;
        this.f133211c = sab0Var;
        this.f133212d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lge1)) {
            return false;
        }
        lge1 lge1Var = (lge1) obj;
        return wj50.m88271j(this.f133209a, lge1Var.f133209a) && wj50.m88271j(this.f133210b, lge1Var.f133210b) && wj50.m88271j(this.f133211c, lge1Var.f133211c) && this.f133212d == lge1Var.f133212d;
    }

    public final int hashCode() {
        return edb.m38547C(this.f133212d) + ((this.f133211c.hashCode() + s571.m77243b(this.f133209a.hashCode() * 31, 31, this.f133210b)) * 31);
    }
}
