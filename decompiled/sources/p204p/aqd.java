package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class aqd implements bqd {

    /* JADX INFO: renamed from: a */
    public final boolean f18213a;

    public aqd(boolean z) {
        this.f18213a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aqd) && this.f18213a == ((aqd) obj).f18213a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f18213a);
    }
}
