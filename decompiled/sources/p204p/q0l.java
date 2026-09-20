package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class q0l implements h2l {

    /* JADX INFO: renamed from: a */
    public final float f184021a;

    public q0l(float f) {
        this.f184021a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q0l) && Float.compare(this.f184021a, ((q0l) obj).f184021a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f184021a);
    }
}
