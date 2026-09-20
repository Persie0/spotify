package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class t4d0 extends u4d0 {

    /* JADX INFO: renamed from: a */
    public final int f216978a;

    public t4d0(int i) {
        this.f216978a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t4d0) && this.f216978a == ((t4d0) obj).f216978a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f216978a);
    }
}
