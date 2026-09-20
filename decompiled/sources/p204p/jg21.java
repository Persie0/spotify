package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class jg21 {

    /* JADX INFO: renamed from: a */
    public final int f112012a;

    /* JADX INFO: renamed from: b */
    public final int f112013b;

    public jg21(int i, int i2) {
        this.f112012a = i;
        this.f112013b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jg21)) {
            return false;
        }
        jg21 jg21Var = (jg21) obj;
        return this.f112012a == jg21Var.f112012a && this.f112013b == jg21Var.f112013b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f112013b) + (Integer.hashCode(this.f112012a) * 31);
    }
}
