package androidx.compose.p002ui.text.style;

/* JADX INFO: loaded from: classes.dex */
public final class BaselineShift {

    /* JADX INFO: renamed from: a */
    public final float f537a;

    public final boolean equals(Object obj) {
        if (obj instanceof BaselineShift) {
            return Float.compare(this.f537a, ((BaselineShift) obj).f537a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f537a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.f537a + ')';
    }
}
