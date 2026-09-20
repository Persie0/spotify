package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class um1 implements sn1 {

    /* JADX INFO: renamed from: a */
    public final boolean f231703a;

    public um1(boolean z) {
        this.f231703a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof um1) && this.f231703a == ((um1) obj).f231703a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f231703a);
    }
}
