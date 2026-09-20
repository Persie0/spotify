package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class oa01 implements qa01 {

    /* JADX INFO: renamed from: a */
    public final float f163173a;

    public oa01(float f) {
        this.f163173a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oa01) && Float.compare(this.f163173a, ((oa01) obj).f163173a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f163173a);
    }
}
