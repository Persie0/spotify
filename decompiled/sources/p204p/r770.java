package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class r770 extends z770 {

    /* JADX INFO: renamed from: a */
    public final boolean f196457a;

    public r770(boolean z) {
        this.f196457a = z;
    }

    @Override // p204p.z770
    /* JADX INFO: renamed from: a */
    public final Object mo25032a() {
        return Boolean.valueOf(this.f196457a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r770) && this.f196457a == ((r770) obj).f196457a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f196457a);
    }
}
