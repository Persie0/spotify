package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class x770 extends z770 {

    /* JADX INFO: renamed from: a */
    public final int f258844a;

    public x770(int i) {
        this.f258844a = i;
    }

    @Override // p204p.z770
    /* JADX INFO: renamed from: a */
    public final Object mo25032a() {
        return Integer.valueOf(this.f258844a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x770) && this.f258844a == ((x770) obj).f258844a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f258844a);
    }
}
