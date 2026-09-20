package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class nu7 {

    /* JADX INFO: renamed from: a */
    public final int f158521a;

    /* JADX INFO: renamed from: b */
    public final boolean f158522b;

    public nu7(int i, boolean z) {
        this.f158521a = i;
        this.f158522b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nu7)) {
            return false;
        }
        nu7 nu7Var = (nu7) obj;
        return this.f158521a == nu7Var.f158521a && this.f158522b == nu7Var.f158522b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f158522b) + (Integer.hashCode(this.f158521a) * 31);
    }
}
