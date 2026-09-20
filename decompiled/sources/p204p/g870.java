package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class g870 extends z770 {

    /* JADX INFO: renamed from: a */
    public final short f77430a;

    public g870(short s) {
        this.f77430a = s;
    }

    @Override // p204p.z770
    /* JADX INFO: renamed from: a */
    public final Object mo25032a() {
        return new os91(this.f77430a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g870) && this.f77430a == ((g870) obj).f77430a;
    }

    public final int hashCode() {
        return Short.hashCode(this.f77430a);
    }
}
