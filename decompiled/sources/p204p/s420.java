package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class s420 {

    /* JADX INFO: renamed from: a */
    public final double f205417a;

    /* JADX INFO: renamed from: b */
    public final Integer f205418b;

    public s420(double d, Integer num) {
        this.f205417a = d;
        this.f205418b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s420)) {
            return false;
        }
        s420 s420Var = (s420) obj;
        return Double.compare(this.f205417a, s420Var.f205417a) == 0 && wj50.m88271j(this.f205418b, s420Var.f205418b);
    }

    public final int hashCode() {
        int iHashCode = Double.hashCode(this.f205417a) * 31;
        Integer num = this.f205418b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
