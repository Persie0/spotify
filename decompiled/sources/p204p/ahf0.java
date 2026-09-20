package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ahf0 implements ehf0 {

    /* JADX INFO: renamed from: a */
    public final int f15688a;

    public ahf0(int i) {
        this.f15688a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ahf0) && this.f15688a == ((ahf0) obj).f15688a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15688a);
    }
}
