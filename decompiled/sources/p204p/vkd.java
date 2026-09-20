package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class vkd implements ykd {

    /* JADX INFO: renamed from: a */
    public final gcd f242208a;

    public vkd(gcd gcdVar) {
        this.f242208a = gcdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vkd) && this.f242208a == ((vkd) obj).f242208a;
    }

    public final int hashCode() {
        return this.f242208a.hashCode();
    }
}
