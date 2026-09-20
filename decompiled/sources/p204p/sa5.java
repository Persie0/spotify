package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class sa5 implements ta5 {

    /* JADX INFO: renamed from: a */
    public final int f207141a;

    public sa5(int i) {
        this.f207141a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sa5) && this.f207141a == ((sa5) obj).f207141a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f207141a) + 644280799;
    }
}
