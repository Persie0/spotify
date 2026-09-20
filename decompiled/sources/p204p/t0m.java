package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class t0m {

    /* JADX INFO: renamed from: a */
    public final int f215905a;

    /* JADX INFO: renamed from: b */
    public final Integer f215906b;

    /* JADX INFO: renamed from: c */
    public final Integer f215907c;

    /* JADX INFO: renamed from: d */
    public final int f215908d;

    /* JADX INFO: renamed from: e */
    public final int f215909e;

    public t0m(int i, Integer num, Integer num2, int i2, int i3, int i4) {
        i = (i4 & 1) != 0 ? 0 : i;
        num = (i4 & 2) != 0 ? null : num;
        num2 = (i4 & 4) != 0 ? null : num2;
        i2 = (i4 & 8) != 0 ? 0 : i2;
        i3 = (i4 & 16) != 0 ? 0 : i3;
        this.f215905a = i;
        this.f215906b = num;
        this.f215907c = num2;
        this.f215908d = i2;
        this.f215909e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0m)) {
            return false;
        }
        t0m t0mVar = (t0m) obj;
        return this.f215905a == t0mVar.f215905a && wj50.m88271j(this.f215906b, t0mVar.f215906b) && wj50.m88271j(this.f215907c, t0mVar.f215907c) && this.f215908d == t0mVar.f215908d && this.f215909e == t0mVar.f215909e;
    }

    public final int hashCode() {
        int i = this.f215905a;
        int iM38547C = (i == 0 ? 0 : edb.m38547C(i)) * 31;
        Integer num = this.f215906b;
        int iHashCode = (iM38547C + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f215907c;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        int i2 = this.f215908d;
        int iM38547C2 = (iHashCode2 + (i2 == 0 ? 0 : edb.m38547C(i2))) * 31;
        int i3 = this.f215909e;
        return iM38547C2 + (i3 != 0 ? edb.m38547C(i3) : 0);
    }
}
