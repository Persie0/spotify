package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class vb9 {

    /* JADX INFO: renamed from: a */
    public final float f239440a;

    public vb9(float f) {
        this.f239440a = f;
    }

    /* JADX INFO: renamed from: a */
    public final int m85124a(int i, int i2) {
        return ms2.m62681f(1, this.f239440a, (i2 - i) / 2.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vb9) && Float.compare(this.f239440a, ((vb9) obj).f239440a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f239440a);
    }

    public final String toString() {
        return ms2.m62684i(new StringBuilder("Vertical(bias="), this.f239440a, ')');
    }
}
