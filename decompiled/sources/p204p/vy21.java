package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class vy21 extends bz21 {

    /* JADX INFO: renamed from: a */
    public final boolean f245901a;

    /* JADX INFO: renamed from: b */
    public final boolean f245902b;

    public vy21(boolean z, boolean z2) {
        this.f245901a = z;
        this.f245902b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vy21)) {
            return false;
        }
        vy21 vy21Var = (vy21) obj;
        return this.f245901a == vy21Var.f245901a && this.f245902b == vy21Var.f245902b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f245902b) + (Boolean.hashCode(this.f245901a) * 31);
    }
}
