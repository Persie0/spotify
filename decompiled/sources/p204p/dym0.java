package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class dym0 extends hrg1 {

    /* JADX INFO: renamed from: c */
    public final String f54413c;

    /* JADX INFO: renamed from: d */
    public final d850 f54414d;

    public dym0(String str, d850 d850Var) {
        this.f54413c = str;
        this.f54414d = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dym0)) {
            return false;
        }
        dym0 dym0Var = (dym0) obj;
        return wj50.m88271j(this.f54413c, dym0Var.f54413c) && wj50.m88271j(this.f54414d, dym0Var.f54414d);
    }

    public final int hashCode() {
        int iHashCode = this.f54413c.hashCode() * 31;
        d850 d850Var = this.f54414d;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
