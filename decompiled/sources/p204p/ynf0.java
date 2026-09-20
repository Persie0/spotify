package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ynf0 implements lpf0 {

    /* JADX INFO: renamed from: a */
    public final String f274453a;

    /* JADX INFO: renamed from: b */
    public final d850 f274454b;

    public ynf0(String str, d850 d850Var) {
        this.f274453a = str;
        this.f274454b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ynf0)) {
            return false;
        }
        ynf0 ynf0Var = (ynf0) obj;
        return wj50.m88271j(this.f274453a, ynf0Var.f274453a) && wj50.m88271j(this.f274454b, ynf0Var.f274454b);
    }

    public final int hashCode() {
        int iHashCode = this.f274453a.hashCode() * 31;
        d850 d850Var = this.f274454b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
