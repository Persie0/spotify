package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class rp21 {

    /* JADX INFO: renamed from: a */
    public final String f201405a;

    /* JADX INFO: renamed from: b */
    public final zo21 f201406b;

    /* JADX INFO: renamed from: c */
    public final gh00 f201407c;

    public rp21(String str, zo21 zo21Var, gh00 gh00Var) {
        this.f201405a = str;
        this.f201406b = zo21Var;
        this.f201407c = gh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rp21)) {
            return false;
        }
        rp21 rp21Var = (rp21) obj;
        return wj50.m88271j(this.f201405a, rp21Var.f201405a) && this.f201406b == rp21Var.f201406b && wj50.m88271j(this.f201407c, rp21Var.f201407c);
    }

    public final int hashCode() {
        return this.f201407c.hashCode() + ((this.f201406b.hashCode() + (this.f201405a.hashCode() * 31)) * 31);
    }
}
