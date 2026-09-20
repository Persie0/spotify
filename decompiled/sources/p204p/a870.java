package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class a870 extends z770 {

    /* JADX INFO: renamed from: a */
    public final long f13211a;

    public a870(long j) {
        this.f13211a = j;
    }

    @Override // p204p.z770
    /* JADX INFO: renamed from: a */
    public final Object mo25032a() {
        return Long.valueOf(this.f13211a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a870) && this.f13211a == ((a870) obj).f13211a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f13211a);
    }
}
