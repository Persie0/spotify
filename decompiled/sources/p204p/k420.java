package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class k420 {

    /* JADX INFO: renamed from: a */
    public final boolean f119052a;

    /* JADX INFO: renamed from: b */
    public final boolean f119053b;

    public k420(boolean z, boolean z2) {
        this.f119052a = z;
        this.f119053b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k420)) {
            return false;
        }
        k420 k420Var = (k420) obj;
        return this.f119052a == k420Var.f119052a && this.f119053b == k420Var.f119053b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f119053b) + (Boolean.hashCode(this.f119052a) * 31);
    }
}
