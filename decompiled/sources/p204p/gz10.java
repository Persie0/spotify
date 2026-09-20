package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class gz10 {

    /* JADX INFO: renamed from: a */
    public final int f85803a;

    /* JADX INFO: renamed from: b */
    public final int f85804b;

    /* JADX INFO: renamed from: c */
    public final boolean f85805c;

    public gz10(int i, int i2, boolean z) {
        this.f85803a = i;
        this.f85804b = i2;
        this.f85805c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gz10)) {
            return false;
        }
        gz10 gz10Var = (gz10) obj;
        return this.f85803a == gz10Var.f85803a && this.f85804b == gz10Var.f85804b && this.f85805c == gz10Var.f85805c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f85805c) + mt60.m62800g(this.f85804b, Integer.hashCode(this.f85803a) * 31, 31);
    }
}
