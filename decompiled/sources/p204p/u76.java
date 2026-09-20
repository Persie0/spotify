package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class u76 extends mvf1 {

    /* JADX INFO: renamed from: f */
    public final float f227519f;

    public u76(float f) {
        this.f227519f = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u76) && Float.compare(this.f227519f, ((u76) obj).f227519f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f227519f);
    }
}
