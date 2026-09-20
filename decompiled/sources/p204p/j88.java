package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class j88 implements n88 {

    /* JADX INFO: renamed from: a */
    public final int f109862a;

    /* JADX INFO: renamed from: b */
    public final boolean f109863b;

    public j88(int i, boolean z) {
        this.f109862a = i;
        this.f109863b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j88)) {
            return false;
        }
        j88 j88Var = (j88) obj;
        return this.f109862a == j88Var.f109862a && this.f109863b == j88Var.f109863b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f109863b) + (Integer.hashCode(this.f109862a) * 31);
    }
}
