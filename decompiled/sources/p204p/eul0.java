package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class eul0 extends ebg1 {

    /* JADX INFO: renamed from: h */
    public final boolean f63012h;

    public eul0(boolean z) {
        this.f63012h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eul0) && this.f63012h == ((eul0) obj).f63012h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f63012h);
    }
}
