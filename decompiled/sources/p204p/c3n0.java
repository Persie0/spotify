package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class c3n0 {

    /* JADX INFO: renamed from: a */
    public final String f33707a;

    /* JADX INFO: renamed from: b */
    public final String f33708b;

    /* JADX INFO: renamed from: c */
    public final String f33709c;

    /* JADX INFO: renamed from: d */
    public final boolean f33710d;

    public c3n0(String str, String str2, String str3, boolean z) {
        this.f33707a = str;
        this.f33708b = str2;
        this.f33709c = str3;
        this.f33710d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c3n0)) {
            return false;
        }
        c3n0 c3n0Var = (c3n0) obj;
        return wj50.m88271j(this.f33707a, c3n0Var.f33707a) && wj50.m88271j(this.f33708b, c3n0Var.f33708b) && wj50.m88271j(this.f33709c, c3n0Var.f33709c) && this.f33710d == c3n0Var.f33710d;
    }

    public final int hashCode() {
        int iHashCode = this.f33707a.hashCode() * 31;
        String str = this.f33708b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f33709c;
        return Boolean.hashCode(this.f33710d) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
