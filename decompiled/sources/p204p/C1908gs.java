package p204p;

/* JADX INFO: renamed from: p.gs */
/* JADX INFO: loaded from: classes4.dex */
public final class C1908gs {

    /* JADX INFO: renamed from: a */
    public final boolean f83857a;

    /* JADX INFO: renamed from: b */
    public final boolean f83858b;

    public C1908gs(boolean z, boolean z2) {
        this.f83857a = z;
        this.f83858b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1908gs)) {
            return false;
        }
        C1908gs c1908gs = (C1908gs) obj;
        return this.f83857a == c1908gs.f83857a && this.f83858b == c1908gs.f83858b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f83858b) + (Boolean.hashCode(this.f83857a) * 31);
    }
}
