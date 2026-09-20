package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class bx90 implements jx90 {

    /* JADX INFO: renamed from: a */
    public final boolean f31806a;

    public bx90(boolean z) {
        this.f31806a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bx90) && this.f31806a == ((bx90) obj).f31806a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f31806a);
    }
}
