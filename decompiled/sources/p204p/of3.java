package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class of3 extends ig3 {

    /* JADX INFO: renamed from: a */
    public final boolean f164626a;

    /* JADX INFO: renamed from: b */
    public final boolean f164627b;

    public of3(boolean z, boolean z2) {
        this.f164626a = z;
        this.f164627b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof of3)) {
            return false;
        }
        of3 of3Var = (of3) obj;
        return this.f164626a == of3Var.f164626a && this.f164627b == of3Var.f164627b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f164627b) + (Boolean.hashCode(this.f164626a) * 31);
    }
}
