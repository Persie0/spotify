package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class dul0 extends ebg1 {

    /* JADX INFO: renamed from: h */
    public final int f53086h;

    /* JADX INFO: renamed from: i */
    public final boolean f53087i;

    public dul0(int i, boolean z) {
        this.f53086h = i;
        this.f53087i = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dul0)) {
            return false;
        }
        dul0 dul0Var = (dul0) obj;
        return this.f53086h == dul0Var.f53086h && this.f53087i == dul0Var.f53087i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f53087i) + (Integer.hashCode(this.f53086h) * 31);
    }
}
