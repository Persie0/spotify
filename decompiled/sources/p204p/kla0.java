package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class kla0 {

    /* JADX INFO: renamed from: a */
    public final String f123847a;

    /* JADX INFO: renamed from: b */
    public final String f123848b;

    /* JADX INFO: renamed from: c */
    public final int f123849c;

    /* JADX INFO: renamed from: d */
    public final boolean f123850d;

    public kla0(String str, int i, String str2, boolean z) {
        this.f123847a = str;
        this.f123848b = str2;
        this.f123849c = i;
        this.f123850d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kla0)) {
            return false;
        }
        kla0 kla0Var = (kla0) obj;
        return wj50.m88271j(this.f123847a, kla0Var.f123847a) && wj50.m88271j(this.f123848b, kla0Var.f123848b) && this.f123849c == kla0Var.f123849c && this.f123850d == kla0Var.f123850d;
    }

    public final int hashCode() {
        int iHashCode = this.f123847a.hashCode() * 31;
        String str = this.f123848b;
        return Boolean.hashCode(this.f123850d) + mt60.m62800g(this.f123849c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }
}
