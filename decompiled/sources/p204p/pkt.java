package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class pkt implements bnt {

    /* JADX INFO: renamed from: a */
    public final boolean f178548a;

    public pkt(boolean z) {
        this.f178548a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pkt) && this.f178548a == ((pkt) obj).f178548a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f178548a);
    }
}
