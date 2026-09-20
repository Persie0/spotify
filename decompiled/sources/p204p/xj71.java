package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class xj71 {

    /* JADX INFO: renamed from: a */
    public final float f262060a;

    /* JADX INFO: renamed from: b */
    public final float f262061b;

    public xj71(float f, float f2) {
        this.f262060a = f;
        this.f262061b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xj71)) {
            return false;
        }
        xj71 xj71Var = (xj71) obj;
        return Float.compare(this.f262060a, xj71Var.f262060a) == 0 && Float.compare(this.f262061b, xj71Var.f262061b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f262061b) + (Float.hashCode(this.f262060a) * 31);
    }
}
