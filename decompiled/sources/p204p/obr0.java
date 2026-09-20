package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class obr0 {

    /* JADX INFO: renamed from: a */
    public final float f163699a;

    /* JADX INFO: renamed from: b */
    public final int f163700b;

    public obr0(float f, int i) {
        this.f163699a = f;
        this.f163700b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof obr0)) {
            return false;
        }
        obr0 obr0Var = (obr0) obj;
        return Float.compare(this.f163699a, obr0Var.f163699a) == 0 && this.f163700b == obr0Var.f163700b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f163700b) + (Float.hashCode(this.f163699a) * 31);
    }
}
