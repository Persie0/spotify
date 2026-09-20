package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class dk7 {

    /* JADX INFO: renamed from: a */
    public final bk7 f49899a;

    /* JADX INFO: renamed from: b */
    public final boolean f49900b;

    public dk7(bk7 bk7Var, boolean z) {
        this.f49899a = bk7Var;
        this.f49900b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk7)) {
            return false;
        }
        dk7 dk7Var = (dk7) obj;
        return this.f49899a == dk7Var.f49899a && this.f49900b == dk7Var.f49900b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f49900b) + (this.f49899a.hashCode() * 31);
    }
}
