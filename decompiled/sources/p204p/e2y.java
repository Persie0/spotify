package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class e2y {

    /* JADX INFO: renamed from: a */
    public final boolean f55545a;

    /* JADX INFO: renamed from: b */
    public final boolean f55546b;

    /* JADX INFO: renamed from: c */
    public final boolean f55547c;

    /* JADX INFO: renamed from: d */
    public final boolean f55548d;

    /* JADX INFO: renamed from: e */
    public final Integer f55549e;

    public e2y(boolean z, boolean z2, boolean z3, boolean z4, Integer num) {
        this.f55545a = z;
        this.f55546b = z2;
        this.f55547c = z3;
        this.f55548d = z4;
        this.f55549e = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2y)) {
            return false;
        }
        e2y e2yVar = (e2y) obj;
        return this.f55545a == e2yVar.f55545a && this.f55546b == e2yVar.f55546b && this.f55547c == e2yVar.f55547c && this.f55548d == e2yVar.f55548d && wj50.m88271j(this.f55549e, e2yVar.f55549e);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77245d(Boolean.hashCode(this.f55545a) * 31, 31, this.f55546b), 31, this.f55547c), 31, this.f55548d);
        Integer num = this.f55549e;
        return iM77245d + (num == null ? 0 : num.hashCode());
    }
}
