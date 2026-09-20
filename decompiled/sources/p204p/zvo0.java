package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class zvo0 implements cwo0 {

    /* JADX INFO: renamed from: a */
    public final String f286748a;

    /* JADX INFO: renamed from: b */
    public final String f286749b;

    public zvo0(String str, String str2) {
        this.f286748a = str;
        this.f286749b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zvo0)) {
            return false;
        }
        zvo0 zvo0Var = (zvo0) obj;
        return wj50.m88271j(this.f286748a, zvo0Var.f286748a) && wj50.m88271j(this.f286749b, zvo0Var.f286749b);
    }

    public final int hashCode() {
        int iHashCode = this.f286748a.hashCode() * 31;
        String str = this.f286749b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
