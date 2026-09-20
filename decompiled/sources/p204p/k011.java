package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class k011 {

    /* JADX INFO: renamed from: a */
    public final up60 f117836a;

    /* JADX INFO: renamed from: b */
    public final Integer f117837b;

    public k011(up60 up60Var, Integer num) {
        this.f117836a = up60Var;
        this.f117837b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k011)) {
            return false;
        }
        k011 k011Var = (k011) obj;
        return wj50.m88271j(this.f117836a, k011Var.f117836a) && wj50.m88271j(this.f117837b, k011Var.f117837b);
    }

    public final int hashCode() {
        int iHashCode = this.f117836a.hashCode() * 31;
        Integer num = this.f117837b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
