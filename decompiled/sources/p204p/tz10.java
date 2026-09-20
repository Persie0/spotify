package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class tz10 {

    /* JADX INFO: renamed from: a */
    public final long f225083a;

    public final boolean equals(Object obj) {
        if (obj instanceof tz10) {
            return this.f225083a == ((tz10) obj).f225083a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f225083a);
    }

    public final String toString() {
        return "GridItemSpan(packedValue=" + this.f225083a + ')';
    }
}
