package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class fy00 extends ly00 {

    /* JADX INFO: renamed from: a */
    public final int f74501a;

    /* JADX INFO: renamed from: b */
    public final String f74502b;

    public fy00(int i, String str) {
        this.f74501a = i;
        this.f74502b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fy00)) {
            return false;
        }
        fy00 fy00Var = (fy00) obj;
        return this.f74501a == fy00Var.f74501a && wj50.m88271j(this.f74502b, fy00Var.f74502b);
    }

    public final int hashCode() {
        return this.f74502b.hashCode() + (Integer.hashCode(this.f74501a) * 31);
    }
}
