package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class r1r {

    /* JADX INFO: renamed from: a */
    public final boolean f194900a;

    /* JADX INFO: renamed from: b */
    public final boolean f194901b;

    /* JADX INFO: renamed from: c */
    public final Integer f194902c;

    /* JADX INFO: renamed from: d */
    public final Integer f194903d;

    public r1r(boolean z, boolean z2, Integer num, Integer num2) {
        this.f194900a = z;
        this.f194901b = z2;
        this.f194902c = num;
        this.f194903d = num2;
    }

    /* JADX INFO: renamed from: a */
    public static r1r m74489a(r1r r1rVar, boolean z, boolean z2, Integer num, Integer num2, int i) {
        if ((i & 1) != 0) {
            z = r1rVar.f194900a;
        }
        if ((i & 2) != 0) {
            z2 = r1rVar.f194901b;
        }
        if ((i & 4) != 0) {
            num = r1rVar.f194902c;
        }
        if ((i & 8) != 0) {
            num2 = r1rVar.f194903d;
        }
        r1rVar.getClass();
        return new r1r(z, z2, num, num2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1r)) {
            return false;
        }
        r1r r1rVar = (r1r) obj;
        return this.f194900a == r1rVar.f194900a && this.f194901b == r1rVar.f194901b && wj50.m88271j(this.f194902c, r1rVar.f194902c) && wj50.m88271j(this.f194903d, r1rVar.f194903d);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(Boolean.hashCode(this.f194900a) * 31, 31, this.f194901b);
        Integer num = this.f194902c;
        int iHashCode = (iM77245d + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f194903d;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }
}
