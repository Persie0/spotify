package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class hz41 {

    /* JADX INFO: renamed from: a */
    public final gz41 f96790a;

    /* JADX INFO: renamed from: b */
    public final Integer f96791b;

    public hz41(gz41 gz41Var, Integer num) {
        this.f96790a = gz41Var;
        this.f96791b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hz41)) {
            return false;
        }
        hz41 hz41Var = (hz41) obj;
        return wj50.m88271j(this.f96790a, hz41Var.f96790a) && wj50.m88271j(this.f96791b, hz41Var.f96791b);
    }

    public final int hashCode() {
        int iHashCode = this.f96790a.hashCode() * 31;
        Integer num = this.f96791b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
