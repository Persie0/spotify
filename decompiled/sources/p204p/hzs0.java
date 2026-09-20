package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class hzs0 {

    /* JADX INFO: renamed from: a */
    public final String f97006a;

    /* JADX INFO: renamed from: b */
    public final String f97007b;

    /* JADX INFO: renamed from: c */
    public final String f97008c;

    /* JADX INFO: renamed from: d */
    public final String f97009d;

    /* JADX INFO: renamed from: e */
    public final String f97010e;

    /* JADX INFO: renamed from: f */
    public final j4m0 f97011f;

    public hzs0(String str, String str2, String str3, String str4, String str5, j4m0 j4m0Var) {
        this.f97006a = str;
        this.f97007b = str2;
        this.f97008c = str3;
        this.f97009d = str4;
        this.f97010e = str5;
        this.f97011f = j4m0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hzs0)) {
            return false;
        }
        hzs0 hzs0Var = (hzs0) obj;
        return this.f97006a.equals(hzs0Var.f97006a) && this.f97007b.equals(hzs0Var.f97007b) && this.f97008c.equals(hzs0Var.f97008c) && this.f97009d.equals(hzs0Var.f97009d) && this.f97010e.equals(hzs0Var.f97010e) && this.f97011f.equals(hzs0Var.f97011f);
    }

    public final int hashCode() {
        return this.f97011f.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(edb.m38547C(1) * 31, 31, this.f97006a), 31, this.f97007b), 31, this.f97008c), 31, this.f97009d), 31, this.f97010e);
    }
}
