package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class cob0 implements eob0 {

    /* JADX INFO: renamed from: a */
    public final float f40221a;

    public final boolean equals(Object obj) {
        if (obj instanceof cob0) {
            return Float.compare(this.f40221a, ((cob0) obj).f40221a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f40221a);
    }

    public final String toString() {
        return "OnUserPrefTextScaleChanged(textScale=" + this.f40221a + ")";
    }
}
