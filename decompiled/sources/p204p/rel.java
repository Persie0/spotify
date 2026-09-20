package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class rel implements ffl {

    /* JADX INFO: renamed from: a */
    public final boolean f198384a;

    public rel(boolean z) {
        this.f198384a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rel) && this.f198384a == ((rel) obj).f198384a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f198384a);
    }
}
