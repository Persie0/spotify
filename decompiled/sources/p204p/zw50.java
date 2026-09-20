package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class zw50 {

    /* JADX INFO: renamed from: a */
    public final boolean f286922a;

    /* JADX INFO: renamed from: b */
    public final boolean f286923b;

    /* JADX INFO: renamed from: c */
    public final boolean f286924c;

    /* JADX INFO: renamed from: d */
    public final boolean f286925d;

    public zw50(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f286922a = z;
        this.f286923b = z2;
        this.f286924c = z3;
        this.f286925d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zw50)) {
            return false;
        }
        zw50 zw50Var = (zw50) obj;
        return this.f286922a == zw50Var.f286922a && this.f286923b == zw50Var.f286923b && this.f286924c == zw50Var.f286924c && this.f286925d == zw50Var.f286925d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f286925d) + s571.m77245d(s571.m77245d(Boolean.hashCode(this.f286922a) * 31, 31, this.f286923b), 31, this.f286924c);
    }
}
