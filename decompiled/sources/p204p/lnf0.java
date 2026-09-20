package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class lnf0 implements lpf0 {

    /* JADX INFO: renamed from: a */
    public final int f135160a;

    public lnf0(int i) {
        this.f135160a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lnf0) && this.f135160a == ((lnf0) obj).f135160a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f135160a);
    }
}
