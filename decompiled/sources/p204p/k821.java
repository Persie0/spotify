package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class k821 implements b921 {

    /* JADX INFO: renamed from: a */
    public final boolean f120238a;

    /* JADX INFO: renamed from: b */
    public final dzi f120239b;

    public k821(boolean z, dzi dziVar) {
        this.f120238a = z;
        this.f120239b = dziVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k821)) {
            return false;
        }
        k821 k821Var = (k821) obj;
        return this.f120238a == k821Var.f120238a && this.f120239b == k821Var.f120239b;
    }

    public final int hashCode() {
        return this.f120239b.hashCode() + (Boolean.hashCode(this.f120238a) * 31);
    }
}
