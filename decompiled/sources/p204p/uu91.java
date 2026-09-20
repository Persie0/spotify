package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class uu91 {

    /* JADX INFO: renamed from: a */
    public final int f234135a;

    /* JADX INFO: renamed from: b */
    public final int f234136b;

    /* JADX INFO: renamed from: c */
    public final int f234137c;

    /* JADX INFO: renamed from: d */
    public final int f234138d;

    public uu91(int i, int i2, int i3, int i4) {
        this.f234135a = i;
        this.f234136b = i2;
        this.f234137c = i3;
        this.f234138d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uu91)) {
            return false;
        }
        uu91 uu91Var = (uu91) obj;
        return this.f234135a == uu91Var.f234135a && this.f234136b == uu91Var.f234136b && this.f234137c == uu91Var.f234137c && this.f234138d == uu91Var.f234138d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f234138d) + mt60.m62800g(this.f234137c, mt60.m62800g(this.f234136b, Integer.hashCode(this.f234135a) * 31, 31), 31);
    }
}
