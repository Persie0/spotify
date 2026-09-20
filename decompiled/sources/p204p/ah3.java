package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ah3 implements bh3 {

    /* JADX INFO: renamed from: a */
    public final boolean f15589a;

    public ah3(boolean z) {
        this.f15589a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ah3) && this.f15589a == ((ah3) obj).f15589a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f15589a);
    }
}
