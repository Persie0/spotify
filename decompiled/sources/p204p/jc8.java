package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class jc8 {

    /* JADX INFO: renamed from: a */
    public final boolean f111011a;

    /* JADX INFO: renamed from: b */
    public final boolean f111012b;

    public jc8(boolean z, boolean z2) {
        this.f111011a = z;
        this.f111012b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jc8)) {
            return false;
        }
        jc8 jc8Var = (jc8) obj;
        return this.f111011a == jc8Var.f111011a && this.f111012b == jc8Var.f111012b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f111012b) + (Boolean.hashCode(this.f111011a) * 31);
    }
}
