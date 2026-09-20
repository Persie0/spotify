package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class znb0 implements eob0 {

    /* JADX INFO: renamed from: a */
    public final float f284452a;

    public final boolean equals(Object obj) {
        if (obj instanceof znb0) {
            return Float.compare(this.f284452a, ((znb0) obj).f284452a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f284452a);
    }

    public final String toString() {
        return "OnGestureTextScaleChanged(textScale=" + this.f284452a + ")";
    }
}
