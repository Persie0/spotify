package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class uga {

    /* JADX INFO: renamed from: a */
    public final int f230054a;

    /* JADX INFO: renamed from: b */
    public final int f230055b;

    /* JADX INFO: renamed from: c */
    public final int f230056c;

    /* JADX INFO: renamed from: d */
    public final int f230057d;

    public uga(int i, int i2, int i3, int i4) {
        this.f230054a = i;
        this.f230055b = i2;
        this.f230056c = i3;
        this.f230057d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uga)) {
            return false;
        }
        uga ugaVar = (uga) obj;
        return this.f230054a == ugaVar.f230054a && this.f230055b == ugaVar.f230055b && this.f230056c == ugaVar.f230056c && this.f230057d == ugaVar.f230057d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f230057d) + mt60.m62800g(this.f230056c, mt60.m62800g(this.f230055b, Integer.hashCode(this.f230054a) * 31, 31), 31);
    }
}
