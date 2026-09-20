package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ylf0 implements rmf0 {

    /* JADX INFO: renamed from: a */
    public final boolean f274007a;

    /* JADX INFO: renamed from: b */
    public final d850 f274008b;

    public ylf0(d850 d850Var, boolean z) {
        this.f274007a = z;
        this.f274008b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ylf0)) {
            return false;
        }
        ylf0 ylf0Var = (ylf0) obj;
        return this.f274007a == ylf0Var.f274007a && wj50.m88271j(this.f274008b, ylf0Var.f274008b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f274007a) * 31;
        d850 d850Var = this.f274008b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
