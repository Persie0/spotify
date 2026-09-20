package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class jyk implements myk {

    /* JADX INFO: renamed from: a */
    public final int f117426a;

    /* JADX INFO: renamed from: b */
    public final int f117427b;

    public jyk(int i, int i2) {
        this.f117426a = i;
        this.f117427b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jyk)) {
            return false;
        }
        jyk jykVar = (jyk) obj;
        return this.f117426a == jykVar.f117426a && this.f117427b == jykVar.f117427b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f117427b) + (Integer.hashCode(this.f117426a) * 31);
    }
}
