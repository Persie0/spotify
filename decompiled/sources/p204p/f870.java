package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class f870 extends z770 {

    /* JADX INFO: renamed from: a */
    public final long f66877a;

    public f870(long j) {
        this.f66877a = j;
    }

    @Override // p204p.z770
    /* JADX INFO: renamed from: a */
    public final Object mo25032a() {
        return new as91(this.f66877a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f870) && this.f66877a == ((f870) obj).f66877a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f66877a);
    }
}
