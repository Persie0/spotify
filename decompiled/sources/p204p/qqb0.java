package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class qqb0 implements tqb0 {

    /* JADX INFO: renamed from: a */
    public final float f191521a;

    public final boolean equals(Object obj) {
        if (obj instanceof qqb0) {
            return Float.compare(this.f191521a, ((qqb0) obj).f191521a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f191521a);
    }

    public final String toString() {
        return "GestureTextScaleChanged(value=" + this.f191521a + ")";
    }
}
