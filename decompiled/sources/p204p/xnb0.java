package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class xnb0 {

    /* JADX INFO: renamed from: a */
    public final float f263575a;

    public final boolean equals(Object obj) {
        if (obj instanceof xnb0) {
            return Float.compare(this.f263575a, ((xnb0) obj).f263575a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f263575a);
    }

    public final String toString() {
        return "SaveUserTextScalePreference(textScale=" + this.f263575a + ")";
    }
}
