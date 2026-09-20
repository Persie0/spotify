package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ife0 extends f2h1 {

    /* JADX INFO: renamed from: b */
    public final boolean f101752b;

    public ife0(boolean z) {
        this.f101752b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ife0) && this.f101752b == ((ife0) obj).f101752b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f101752b);
    }
}
