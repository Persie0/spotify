package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class r00 implements k10 {

    /* JADX INFO: renamed from: a */
    public final float f194342a;

    public r00(float f) {
        this.f194342a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r00) && Float.compare(this.f194342a, ((r00) obj).f194342a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f194342a);
    }
}
