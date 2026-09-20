package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class bwv0 implements dwv0 {

    /* JADX INFO: renamed from: a */
    public final boolean f31736a;

    public bwv0(boolean z) {
        this.f31736a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bwv0) && this.f31736a == ((bwv0) obj).f31736a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f31736a);
    }
}
