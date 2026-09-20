package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class f00 implements k10 {

    /* JADX INFO: renamed from: a */
    public final float f64510a;

    public f00(float f) {
        this.f64510a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f00) && Float.compare(this.f64510a, ((f00) obj).f64510a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f64510a);
    }
}
