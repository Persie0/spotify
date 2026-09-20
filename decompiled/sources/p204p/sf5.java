package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class sf5 {

    /* JADX INFO: renamed from: a */
    public final int f208465a;

    /* JADX INFO: renamed from: b */
    public final boolean f208466b;

    public sf5(int i, boolean z) {
        this.f208465a = i;
        this.f208466b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sf5)) {
            return false;
        }
        sf5 sf5Var = (sf5) obj;
        return this.f208465a == sf5Var.f208465a && this.f208466b == sf5Var.f208466b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f208466b) + (Integer.hashCode(this.f208465a) * 31);
    }
}
