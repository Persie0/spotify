package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class kxk0 {

    /* JADX INFO: renamed from: a */
    public final boolean f127519a;

    /* JADX INFO: renamed from: b */
    public final boolean f127520b;

    public kxk0(boolean z, boolean z2) {
        this.f127519a = z;
        this.f127520b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kxk0)) {
            return false;
        }
        kxk0 kxk0Var = (kxk0) obj;
        return this.f127519a == kxk0Var.f127519a && this.f127520b == kxk0Var.f127520b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f127520b) + (Boolean.hashCode(this.f127519a) * 31);
    }
}
