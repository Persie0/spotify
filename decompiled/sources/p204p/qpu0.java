package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class qpu0 {

    /* JADX INFO: renamed from: a */
    public final String f191380a;

    /* JADX INFO: renamed from: b */
    public final String f191381b;

    /* JADX INFO: renamed from: c */
    public final boolean f191382c;

    /* JADX INFO: renamed from: d */
    public final boolean f191383d;

    public qpu0(String str, String str2, boolean z, int i) {
        str2 = (i & 2) != 0 ? null : str2;
        z = (i & 4) != 0 ? false : z;
        boolean z2 = (i & 8) == 0;
        this.f191380a = str;
        this.f191381b = str2;
        this.f191382c = z;
        this.f191383d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qpu0)) {
            return false;
        }
        qpu0 qpu0Var = (qpu0) obj;
        return wj50.m88271j(this.f191380a, qpu0Var.f191380a) && wj50.m88271j(this.f191381b, qpu0Var.f191381b) && this.f191382c == qpu0Var.f191382c && this.f191383d == qpu0Var.f191383d;
    }

    public final int hashCode() {
        int iHashCode = this.f191380a.hashCode() * 31;
        String str = this.f191381b;
        return Boolean.hashCode(this.f191383d) + s571.m77245d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f191382c);
    }
}
