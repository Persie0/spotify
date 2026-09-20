package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class p4z {

    /* JADX INFO: renamed from: a */
    public final qf40 f174029a;

    /* JADX INFO: renamed from: b */
    public final o4z f174030b;

    /* JADX INFO: renamed from: c */
    public final boolean f174031c;

    public p4z(AbstractC2524w8 abstractC2524w8, o4z o4zVar, boolean z, int i) {
        z = (i & 4) != 0 ? false : z;
        this.f174029a = abstractC2524w8;
        this.f174030b = o4zVar;
        this.f174031c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p4z)) {
            return false;
        }
        p4z p4zVar = (p4z) obj;
        return wj50.m88271j(this.f174029a, p4zVar.f174029a) && this.f174030b.equals(p4zVar.f174030b) && this.f174031c == p4zVar.f174031c;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + s571.m77245d((this.f174030b.hashCode() + (this.f174029a.hashCode() * 31)) * 31, 961, this.f174031c);
    }
}
