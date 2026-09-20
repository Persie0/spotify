package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ete implements fte {

    /* JADX INFO: renamed from: a */
    public final float f62691a;

    /* JADX INFO: renamed from: b */
    public final float f62692b;

    public ete(float f, float f2) {
        this.f62691a = f;
        this.f62692b = f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static boolean m39933a(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).floatValue() <= ((Number) comparable2).floatValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ete)) {
            return false;
        }
        if (isEmpty() && ((ete) obj).isEmpty()) {
            return true;
        }
        ete eteVar = (ete) obj;
        return this.f62691a == eteVar.f62691a && this.f62692b == eteVar.f62692b;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return Float.hashCode(this.f62692b) + (Float.hashCode(this.f62691a) * 31);
    }

    @Override // p204p.fte
    public final boolean isEmpty() {
        return this.f62691a > this.f62692b;
    }

    @Override // p204p.fte
    /* JADX INFO: renamed from: n */
    public final Comparable mo28071n() {
        return Float.valueOf(this.f62691a);
    }

    @Override // p204p.fte
    /* JADX INFO: renamed from: o */
    public final Comparable mo28072o() {
        return Float.valueOf(this.f62692b);
    }

    public final String toString() {
        return this.f62691a + ".." + this.f62692b;
    }
}
