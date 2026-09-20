package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class rgb1 extends sgb1 {

    /* JADX INFO: renamed from: a */
    public final boolean f198927a;

    public rgb1(boolean z) {
        this.f198927a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rgb1) && this.f198927a == ((rgb1) obj).f198927a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f198927a);
    }
}
