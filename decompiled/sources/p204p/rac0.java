package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class rac0 {

    /* JADX INFO: renamed from: a */
    public final boolean f197261a;

    /* JADX INFO: renamed from: b */
    public final boolean f197262b;

    public rac0(boolean z, boolean z2) {
        this.f197261a = z;
        this.f197262b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rac0)) {
            return false;
        }
        rac0 rac0Var = (rac0) obj;
        return this.f197261a == rac0Var.f197261a && this.f197262b == rac0Var.f197262b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f197262b) + (Boolean.hashCode(this.f197261a) * 31);
    }
}
