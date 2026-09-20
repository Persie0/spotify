package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class os71 implements rs71 {

    /* JADX INFO: renamed from: a */
    public final float f168769a;

    public os71(float f) {
        this.f168769a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof os71) && Float.compare(this.f168769a, ((os71) obj).f168769a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f168769a);
    }
}
