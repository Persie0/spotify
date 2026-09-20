package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class g00 implements k10 {

    /* JADX INFO: renamed from: a */
    public final float f75227a;

    public g00(float f) {
        this.f75227a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g00) && Float.compare(this.f75227a, ((g00) obj).f75227a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f75227a);
    }
}
