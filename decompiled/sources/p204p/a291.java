package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class a291 implements d291 {

    /* JADX INFO: renamed from: a */
    public final boolean f11602a;

    /* JADX INFO: renamed from: b */
    public final boolean f11603b;

    public a291(boolean z, boolean z2) {
        this.f11602a = z;
        this.f11603b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a291)) {
            return false;
        }
        a291 a291Var = (a291) obj;
        return this.f11602a == a291Var.f11602a && this.f11603b == a291Var.f11603b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f11603b) + (Boolean.hashCode(this.f11602a) * 31);
    }
}
