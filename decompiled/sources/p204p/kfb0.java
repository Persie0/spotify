package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class kfb0 implements rfb0 {

    /* JADX INFO: renamed from: a */
    public final int f122119a;

    public kfb0(int i) {
        this.f122119a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kfb0) && this.f122119a == ((kfb0) obj).f122119a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f122119a);
    }
}
