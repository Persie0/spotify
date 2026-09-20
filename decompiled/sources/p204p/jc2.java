package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class jc2 {

    /* JADX INFO: renamed from: a */
    public final int f110942a;

    /* JADX INFO: renamed from: b */
    public final Integer f110943b;

    public jc2(int i, Integer num) {
        this.f110942a = i;
        this.f110943b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jc2)) {
            return false;
        }
        jc2 jc2Var = (jc2) obj;
        return this.f110942a == jc2Var.f110942a && wj50.m88271j(this.f110943b, jc2Var.f110943b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f110942a) * 31;
        Integer num = this.f110943b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
