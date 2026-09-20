package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class uu90 implements iv90 {

    /* JADX INFO: renamed from: a */
    public final String f234133a;

    /* JADX INFO: renamed from: b */
    public final d850 f234134b;

    public uu90(String str, d850 d850Var) {
        this.f234133a = str;
        this.f234134b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uu90)) {
            return false;
        }
        uu90 uu90Var = (uu90) obj;
        return wj50.m88271j(this.f234133a, uu90Var.f234133a) && wj50.m88271j(this.f234134b, uu90Var.f234134b);
    }

    public final int hashCode() {
        int iHashCode = this.f234133a.hashCode() * 31;
        d850 d850Var = this.f234134b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
