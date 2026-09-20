package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class bxb0 extends cxb0 {

    /* JADX INFO: renamed from: a */
    public final float f31816a;

    public bxb0(float f) {
        this.f31816a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bxb0) && Float.compare(this.f31816a, ((bxb0) obj).f31816a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f31816a);
    }
}
