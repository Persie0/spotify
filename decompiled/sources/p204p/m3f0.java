package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class m3f0 extends r3f0 {

    /* JADX INFO: renamed from: a */
    public final int f139624a;

    public m3f0(int i) {
        this.f139624a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m3f0) && this.f139624a == ((m3f0) obj).f139624a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f139624a);
    }
}
