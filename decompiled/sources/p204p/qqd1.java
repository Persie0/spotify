package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class qqd1 {

    /* JADX INFO: renamed from: a */
    public final qe70 f191544a;

    /* JADX INFO: renamed from: b */
    public final qe70 f191545b;

    /* JADX INFO: renamed from: c */
    public final Integer f191546c;

    /* JADX INFO: renamed from: d */
    public final boolean f191547d;

    /* JADX WARN: Multi-variable type inference failed */
    public qqd1(gh00 gh00Var, gh00 gh00Var2, Integer num, boolean z) {
        this.f191544a = (qe70) gh00Var;
        this.f191545b = (qe70) gh00Var2;
        this.f191546c = num;
        this.f191547d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qqd1)) {
            return false;
        }
        qqd1 qqd1Var = (qqd1) obj;
        return this.f191544a.equals(qqd1Var.f191544a) && this.f191545b.equals(qqd1Var.f191545b) && wj50.m88271j(this.f191546c, qqd1Var.f191546c) && this.f191547d == qqd1Var.f191547d;
    }

    public final int hashCode() {
        int iHashCode = (this.f191545b.hashCode() + ((this.f191544a.hashCode() + (Integer.hashCode(50) * 31)) * 31)) * 31;
        Integer num = this.f191546c;
        return Boolean.hashCode(this.f191547d) + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
    }
}
