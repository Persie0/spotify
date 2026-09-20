package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ncd implements rcd {

    /* JADX INFO: renamed from: a */
    public final int f152492a;

    public ncd(int i) {
        this.f152492a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ncd) && this.f152492a == ((ncd) obj).f152492a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f152492a);
    }
}
