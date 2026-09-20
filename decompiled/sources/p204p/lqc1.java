package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class lqc1 implements oi0 {

    /* JADX INFO: renamed from: a */
    public final int f136010a;

    public lqc1(int i) {
        this.f136010a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lqc1) && this.f136010a == ((lqc1) obj).f136010a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f136010a);
    }
}
