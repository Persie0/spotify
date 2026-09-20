package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class jn0 implements mn0 {

    /* JADX INFO: renamed from: a */
    public final int f113977a;

    /* JADX INFO: renamed from: b */
    public final d9g0 f113978b;

    public jn0(int i, d9g0 d9g0Var) {
        this.f113977a = i;
        this.f113978b = d9g0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jn0)) {
            return false;
        }
        jn0 jn0Var = (jn0) obj;
        return this.f113977a == jn0Var.f113977a && this.f113978b == jn0Var.f113978b;
    }

    public final int hashCode() {
        return this.f113978b.hashCode() + (Integer.hashCode(this.f113977a) * 31);
    }
}
