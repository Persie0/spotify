package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class m2l0 extends ehf1 {

    /* JADX INFO: renamed from: b */
    public final int f139378b;

    public m2l0(int i) {
        this.f139378b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m2l0) && this.f139378b == ((m2l0) obj).f139378b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f139378b);
    }
}
