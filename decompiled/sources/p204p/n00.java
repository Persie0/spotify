package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class n00 implements j10 {

    /* JADX INFO: renamed from: a */
    public final float f148850a;

    public n00(float f) {
        this.f148850a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n00) && Float.compare(this.f148850a, ((n00) obj).f148850a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f148850a);
    }
}
