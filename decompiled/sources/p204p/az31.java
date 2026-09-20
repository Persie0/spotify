package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class az31 implements bz31 {

    /* JADX INFO: renamed from: a */
    public final int f21412a;

    /* JADX INFO: renamed from: b */
    public final int f21413b;

    public az31(int i, int i2) {
        this.f21412a = i;
        this.f21413b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof az31)) {
            return false;
        }
        az31 az31Var = (az31) obj;
        return this.f21412a == az31Var.f21412a && this.f21413b == az31Var.f21413b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f21413b) + (Integer.hashCode(this.f21412a) * 31);
    }
}
