package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class c291 implements d291 {

    /* JADX INFO: renamed from: a */
    public final int f33326a;

    /* JADX INFO: renamed from: b */
    public final int f33327b;

    public c291(int i, int i2) {
        this.f33326a = i;
        this.f33327b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c291)) {
            return false;
        }
        c291 c291Var = (c291) obj;
        return this.f33326a == c291Var.f33326a && this.f33327b == c291Var.f33327b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f33327b) + (Integer.hashCode(this.f33326a) * 31);
    }
}
