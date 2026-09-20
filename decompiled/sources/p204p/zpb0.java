package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class zpb0 implements bqb0 {

    /* JADX INFO: renamed from: a */
    public final int f285087a;

    /* JADX INFO: renamed from: b */
    public final boolean f285088b;

    /* JADX INFO: renamed from: c */
    public final boolean f285089c;

    public zpb0(int i, boolean z, boolean z2) {
        this.f285087a = i;
        this.f285088b = z;
        this.f285089c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zpb0)) {
            return false;
        }
        zpb0 zpb0Var = (zpb0) obj;
        return this.f285087a == zpb0Var.f285087a && this.f285088b == zpb0Var.f285088b && this.f285089c == zpb0Var.f285089c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f285089c) + s571.m77245d(Integer.hashCode(this.f285087a) * 31, 31, this.f285088b);
    }
}
