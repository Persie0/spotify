package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class af6 implements of6 {

    /* JADX INFO: renamed from: a */
    public final int f15036a;

    /* JADX INFO: renamed from: b */
    public final boolean f15037b;

    public af6(int i, boolean z) {
        this.f15036a = i;
        this.f15037b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof af6)) {
            return false;
        }
        af6 af6Var = (af6) obj;
        return this.f15036a == af6Var.f15036a && this.f15037b == af6Var.f15037b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f15037b) + (Integer.hashCode(this.f15036a) * 31);
    }
}
