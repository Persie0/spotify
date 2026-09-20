package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class h2j implements i2j {

    /* JADX INFO: renamed from: a */
    public final boolean f87012a;

    public h2j(boolean z) {
        this.f87012a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h2j) && this.f87012a == ((h2j) obj).f87012a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f87012a);
    }
}
