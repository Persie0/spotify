package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class d521 extends a621 {

    /* JADX INFO: renamed from: a */
    public final boolean f45313a;

    public d521(boolean z) {
        this.f45313a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d521) && this.f45313a == ((d521) obj).f45313a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f45313a);
    }
}
