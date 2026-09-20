package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ekd implements ykd {

    /* JADX INFO: renamed from: a */
    public final int f60428a;

    public ekd(int i) {
        this.f60428a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ekd) && this.f60428a == ((ekd) obj).f60428a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f60428a);
    }
}
