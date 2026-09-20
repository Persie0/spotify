package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ygf0 implements ehf0 {

    /* JADX INFO: renamed from: a */
    public final int f272574a;

    public ygf0(int i) {
        this.f272574a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ygf0) && this.f272574a == ((ygf0) obj).f272574a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f272574a);
    }
}
