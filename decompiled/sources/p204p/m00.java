package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class m00 implements j10 {

    /* JADX INFO: renamed from: a */
    public final float f138480a;

    public m00(float f) {
        this.f138480a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m00) && Float.compare(this.f138480a, ((m00) obj).f138480a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f138480a);
    }
}
