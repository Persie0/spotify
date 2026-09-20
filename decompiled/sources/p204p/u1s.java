package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class u1s {

    /* JADX INFO: renamed from: a */
    public final float f225913a;

    public u1s(float f) {
        this.f225913a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u1s) && Float.compare(this.f225913a, ((u1s) obj).f225913a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f225913a);
    }
}
