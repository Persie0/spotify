package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class oa2 extends ra2 {

    /* JADX INFO: renamed from: a */
    public final int f163178a;

    /* JADX INFO: renamed from: b */
    public final int f163179b;

    /* JADX INFO: renamed from: c */
    public final int f163180c;

    public oa2(int i, int i2, int i3) {
        this.f163178a = i;
        this.f163179b = i2;
        this.f163180c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oa2)) {
            return false;
        }
        oa2 oa2Var = (oa2) obj;
        return this.f163178a == oa2Var.f163178a && this.f163179b == oa2Var.f163179b && this.f163180c == oa2Var.f163180c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f163180c) + mt60.m62800g(this.f163179b, Integer.hashCode(this.f163178a) * 31, 31);
    }
}
