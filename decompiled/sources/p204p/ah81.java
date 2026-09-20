package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ah81 implements bh81 {

    /* JADX INFO: renamed from: a */
    public final int f15640a;

    /* JADX INFO: renamed from: b */
    public final String f15641b;

    public ah81(int i, String str) {
        this.f15640a = i;
        this.f15641b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ah81)) {
            return false;
        }
        ah81 ah81Var = (ah81) obj;
        return this.f15640a == ah81Var.f15640a && this.f15641b.equals(ah81Var.f15641b);
    }

    public final int hashCode() {
        int i = this.f15640a;
        return this.f15641b.hashCode() + ((i == 0 ? 0 : edb.m38547C(i)) * 31);
    }
}
