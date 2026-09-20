package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class u770 extends z770 {

    /* JADX INFO: renamed from: a */
    public final double f227526a;

    public u770(double d) {
        this.f227526a = d;
    }

    @Override // p204p.z770
    /* JADX INFO: renamed from: a */
    public final Object mo25032a() {
        return Double.valueOf(this.f227526a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u770) && Double.compare(this.f227526a, ((u770) obj).f227526a) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f227526a);
    }
}
