package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class uny0 implements xny0 {

    /* JADX INFO: renamed from: a */
    public final float f232284a;

    /* JADX INFO: renamed from: b */
    public final boolean f232285b;

    public uny0(float f, boolean z) {
        this.f232284a = f;
        this.f232285b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uny0)) {
            return false;
        }
        uny0 uny0Var = (uny0) obj;
        return Float.compare(this.f232284a, uny0Var.f232284a) == 0 && this.f232285b == uny0Var.f232285b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f232285b) + (Float.hashCode(this.f232284a) * 31);
    }
}
