package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class kpd {

    /* JADX INFO: renamed from: a */
    public final int f125032a;

    /* JADX INFO: renamed from: b */
    public final int f125033b;

    /* JADX INFO: renamed from: c */
    public final boolean f125034c;

    public kpd(int i, int i2, boolean z) {
        this.f125032a = i;
        this.f125033b = i2;
        this.f125034c = z;
    }

    /* JADX INFO: renamed from: a */
    public static kpd m57026a(kpd kpdVar, int i, int i2, boolean z, int i3) {
        if ((i3 & 1) != 0) {
            i = kpdVar.f125032a;
        }
        if ((i3 & 2) != 0) {
            i2 = kpdVar.f125033b;
        }
        if ((i3 & 4) != 0) {
            z = kpdVar.f125034c;
        }
        kpdVar.getClass();
        return new kpd(i, i2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kpd)) {
            return false;
        }
        kpd kpdVar = (kpd) obj;
        return this.f125032a == kpdVar.f125032a && this.f125033b == kpdVar.f125033b && this.f125034c == kpdVar.f125034c;
    }

    public final int hashCode() {
        int i = this.f125032a;
        int iM38547C = (i == 0 ? 0 : edb.m38547C(i)) * 31;
        int i2 = this.f125033b;
        return Boolean.hashCode(this.f125034c) + ((iM38547C + (i2 != 0 ? edb.m38547C(i2) : 0)) * 31);
    }
}
