package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class lr50 extends xgg1 {

    /* JADX INFO: renamed from: d */
    public final boolean f136227d;

    /* JADX INFO: renamed from: e */
    public final boolean f136228e;

    public lr50(boolean z, boolean z2) {
        this.f136227d = z;
        this.f136228e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lr50)) {
            return false;
        }
        lr50 lr50Var = (lr50) obj;
        return this.f136227d == lr50Var.f136227d && this.f136228e == lr50Var.f136228e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f136228e) + (Boolean.hashCode(this.f136227d) * 31);
    }
}
