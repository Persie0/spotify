package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class kk51 {

    /* JADX INFO: renamed from: a */
    public final int f123513a;

    /* JADX INFO: renamed from: b */
    public final lk51 f123514b;

    /* JADX INFO: renamed from: c */
    public final int f123515c;

    public kk51(int i, lk51 lk51Var, int i2) {
        this.f123513a = i;
        this.f123514b = lk51Var;
        this.f123515c = i2;
    }

    /* JADX INFO: renamed from: a */
    public static kk51 m56685a(kk51 kk51Var, int i, lk51 lk51Var, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = kk51Var.f123513a;
        }
        if ((i3 & 2) != 0) {
            lk51Var = kk51Var.f123514b;
        }
        if ((i3 & 4) != 0) {
            i2 = kk51Var.f123515c;
        }
        kk51Var.getClass();
        return new kk51(i, lk51Var, i2);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m56686b() {
        return this.f123515c == 1 && this.f123513a == 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kk51)) {
            return false;
        }
        kk51 kk51Var = (kk51) obj;
        return this.f123513a == kk51Var.f123513a && this.f123514b == kk51Var.f123514b && this.f123515c == kk51Var.f123515c;
    }

    public final int hashCode() {
        return edb.m38547C(this.f123515c) + ((this.f123514b.hashCode() + (edb.m38547C(this.f123513a) * 31)) * 31);
    }
}
