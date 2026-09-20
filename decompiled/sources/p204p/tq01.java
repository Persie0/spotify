package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class tq01 {

    /* JADX INFO: renamed from: a */
    public final String f222640a;

    /* JADX INFO: renamed from: b */
    public final String f222641b;

    /* JADX INFO: renamed from: c */
    public final String f222642c;

    /* JADX INFO: renamed from: d */
    public final String f222643d;

    /* JADX INFO: renamed from: e */
    public final boolean f222644e;

    public /* synthetic */ tq01(int i, String str, String str2, String str3, String str4) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, str4, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tq01)) {
            return false;
        }
        tq01 tq01Var = (tq01) obj;
        return wj50.m88271j(this.f222640a, tq01Var.f222640a) && wj50.m88271j(this.f222641b, tq01Var.f222641b) && wj50.m88271j(this.f222642c, tq01Var.f222642c) && wj50.m88271j(this.f222643d, tq01Var.f222643d) && this.f222644e == tq01Var.f222644e;
    }

    public final int hashCode() {
        int iHashCode = this.f222640a.hashCode() * 31;
        String str = this.f222641b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f222642c;
        return Boolean.hashCode(this.f222644e) + s571.m77243b((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f222643d);
    }

    public tq01(String str, String str2, String str3, String str4, boolean z) {
        this.f222640a = str;
        this.f222641b = str2;
        this.f222642c = str3;
        this.f222643d = str4;
        this.f222644e = z;
    }
}
