package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class kob {

    /* JADX INFO: renamed from: d */
    public static final kob f124746d = new kob(false, false, false);

    /* JADX INFO: renamed from: a */
    public final boolean f124747a;

    /* JADX INFO: renamed from: b */
    public final boolean f124748b;

    /* JADX INFO: renamed from: c */
    public final boolean f124749c;

    public kob(boolean z, boolean z2, boolean z3) {
        this.f124747a = z;
        this.f124748b = z2;
        this.f124749c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kob)) {
            return false;
        }
        kob kobVar = (kob) obj;
        return this.f124747a == kobVar.f124747a && this.f124748b == kobVar.f124748b && this.f124749c == kobVar.f124749c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f124749c) + s571.m77245d(Boolean.hashCode(this.f124747a) * 31, 31, this.f124748b);
    }
}
