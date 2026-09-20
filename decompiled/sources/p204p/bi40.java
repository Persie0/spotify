package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class bi40 implements ci40 {

    /* JADX INFO: renamed from: a */
    public final String f27330a;

    /* JADX INFO: renamed from: b */
    public final double f27331b;

    public bi40(String str, double d) {
        this.f27330a = str;
        this.f27331b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bi40)) {
            return false;
        }
        bi40 bi40Var = (bi40) obj;
        return wj50.m88271j(this.f27330a, bi40Var.f27330a) && Double.compare(this.f27331b, bi40Var.f27331b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f27331b) + (this.f27330a.hashCode() * 31);
    }
}
