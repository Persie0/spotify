package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class umr extends pnr {

    /* JADX INFO: renamed from: a */
    public final int f231934a;

    public umr(int i) {
        this.f231934a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof umr) && this.f231934a == ((umr) obj).f231934a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f231934a);
    }
}
