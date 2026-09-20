package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class a66 extends hvf1 {

    /* JADX INFO: renamed from: d */
    public final float f12702d;

    public a66(float f) {
        this.f12702d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a66) && Float.compare(this.f12702d, ((a66) obj).f12702d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f12702d);
    }
}
