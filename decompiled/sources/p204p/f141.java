package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class f141 implements a241 {

    /* JADX INFO: renamed from: a */
    public final int f64786a;

    public f141(int i) {
        this.f64786a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f141) && this.f64786a == ((f141) obj).f64786a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f64786a);
    }
}
