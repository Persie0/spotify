package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class vun0 implements xun0 {

    /* JADX INFO: renamed from: a */
    public final long f245028a;

    /* JADX INFO: renamed from: b */
    public final String f245029b;

    /* JADX INFO: renamed from: c */
    public final String f245030c;

    /* JADX INFO: renamed from: d */
    public final String f245031d;

    /* JADX INFO: renamed from: e */
    public final String f245032e;

    public vun0(String str, String str2, String str3, String str4, long j) {
        this.f245028a = j;
        this.f245029b = str;
        this.f245030c = str2;
        this.f245031d = str3;
        this.f245032e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vun0)) {
            return false;
        }
        vun0 vun0Var = (vun0) obj;
        return this.f245028a == vun0Var.f245028a && wj50.m88271j(this.f245029b, vun0Var.f245029b) && wj50.m88271j(this.f245030c, vun0Var.f245030c) && wj50.m88271j(this.f245031d, vun0Var.f245031d) && wj50.m88271j(this.f245032e, vun0Var.f245032e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(Long.hashCode(this.f245028a) * 31, 31, this.f245029b);
        String str = this.f245030c;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f245031d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f245032e;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
