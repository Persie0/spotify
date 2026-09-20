package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class o420 {

    /* JADX INFO: renamed from: a */
    public final double f161517a;

    /* JADX INFO: renamed from: b */
    public final Integer f161518b;

    public o420(double d, Integer num) {
        this.f161517a = d;
        this.f161518b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o420)) {
            return false;
        }
        o420 o420Var = (o420) obj;
        return Double.compare(this.f161517a, o420Var.f161517a) == 0 && wj50.m88271j(this.f161518b, o420Var.f161518b);
    }

    public final int hashCode() {
        int iHashCode = Double.hashCode(this.f161517a) * 31;
        Integer num = this.f161518b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
