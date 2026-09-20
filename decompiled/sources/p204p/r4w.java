package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class r4w {

    /* JADX INFO: renamed from: a */
    public final noa1 f195859a;

    /* JADX INFO: renamed from: b */
    public final lnn0 f195860b;

    /* JADX INFO: renamed from: c */
    public final boolean f195861c;

    /* JADX INFO: renamed from: d */
    public final boolean f195862d;

    /* JADX INFO: renamed from: e */
    public final boolean f195863e;

    public r4w(noa1 noa1Var, lnn0 lnn0Var, boolean z, boolean z2, boolean z3) {
        this.f195859a = noa1Var;
        this.f195860b = lnn0Var;
        this.f195861c = z;
        this.f195862d = z2;
        this.f195863e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r4w)) {
            return false;
        }
        r4w r4wVar = (r4w) obj;
        return wj50.m88271j(this.f195859a, r4wVar.f195859a) && this.f195860b == r4wVar.f195860b && this.f195861c == r4wVar.f195861c && this.f195862d == r4wVar.f195862d && this.f195863e == r4wVar.f195863e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f195863e) + s571.m77245d(s571.m77245d((this.f195860b.hashCode() + (this.f195859a.hashCode() * 31)) * 31, 31, this.f195861c), 31, this.f195862d);
    }

    public /* synthetic */ r4w() {
        this(new noa1(false, null, null, false, false, 1023), lnn0.f135183b, false, false, false);
    }
}
