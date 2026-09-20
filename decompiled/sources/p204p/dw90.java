package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class dw90 implements ow90 {

    /* JADX INFO: renamed from: a */
    public final boolean f53647a;

    public dw90(boolean z) {
        this.f53647a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dw90) && this.f53647a == ((dw90) obj).f53647a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f53647a);
    }
}
