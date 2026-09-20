package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class lj20 {

    /* JADX INFO: renamed from: a */
    public final String f133941a;

    /* JADX INFO: renamed from: b */
    public final Integer f133942b;

    public lj20(Integer num, String str) {
        this.f133941a = str;
        this.f133942b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lj20)) {
            return false;
        }
        lj20 lj20Var = (lj20) obj;
        return wj50.m88271j(this.f133941a, lj20Var.f133941a) && wj50.m88271j(this.f133942b, lj20Var.f133942b);
    }

    public final int hashCode() {
        int iHashCode = this.f133941a.hashCode() * 31;
        Integer num = this.f133942b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
