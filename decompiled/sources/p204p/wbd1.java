package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class wbd1 extends ybd1 {

    /* JADX INFO: renamed from: a */
    public final int f249741a;

    public wbd1(int i) {
        this.f249741a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wbd1) && this.f249741a == ((wbd1) obj).f249741a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f249741a);
    }
}
