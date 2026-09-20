package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class uqc0 extends erc0 {

    /* JADX INFO: renamed from: a */
    public final boolean f232976a;

    public uqc0(boolean z) {
        this.f232976a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uqc0) && this.f232976a == ((uqc0) obj).f232976a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f232976a);
    }
}
