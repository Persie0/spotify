package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class zxc1 implements ayc1 {

    /* JADX INFO: renamed from: a */
    public final double f287285a;

    public zxc1(double d) {
        this.f287285a = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zxc1) && Double.compare(this.f287285a, ((zxc1) obj).f287285a) == 0;
    }

    public final int hashCode() {
        return (Double.hashCode(this.f287285a) * 31) - 1701542837;
    }
}
