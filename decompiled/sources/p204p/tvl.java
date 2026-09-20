package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class tvl implements vvl {

    /* JADX INFO: renamed from: a */
    public final boolean f224189a;

    public tvl(boolean z) {
        this.f224189a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tvl) && this.f224189a == ((tvl) obj).f224189a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f224189a);
    }
}
