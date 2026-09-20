package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class coc {

    /* JADX INFO: renamed from: a */
    public final String f40225a;

    /* JADX INFO: renamed from: b */
    public final String f40226b;

    /* JADX INFO: renamed from: c */
    public final long f40227c;

    /* JADX INFO: renamed from: d */
    public final long f40228d;

    /* JADX INFO: renamed from: e */
    public final boolean f40229e;

    public coc(long j, long j2, String str, String str2, boolean z) {
        this.f40225a = str;
        this.f40226b = str2;
        this.f40227c = j;
        this.f40228d = j2;
        this.f40229e = z;
    }

    /* JADX INFO: renamed from: a */
    public static coc m33495a(coc cocVar, long j, long j2, boolean z, int i) {
        String str = cocVar.f40225a;
        String str2 = cocVar.f40226b;
        if ((i & 4) != 0) {
            j = cocVar.f40227c;
        }
        long j3 = j;
        if ((i & 8) != 0) {
            j2 = cocVar.f40228d;
        }
        long j4 = j2;
        if ((i & 16) != 0) {
            z = cocVar.f40229e;
        }
        cocVar.getClass();
        return new coc(j3, j4, str, str2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof coc)) {
            return false;
        }
        coc cocVar = (coc) obj;
        return wj50.m88271j(this.f40225a, cocVar.f40225a) && wj50.m88271j(this.f40226b, cocVar.f40226b) && this.f40227c == cocVar.f40227c && this.f40228d == cocVar.f40228d && this.f40229e == cocVar.f40229e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f40229e) + dq60.m36605e(dq60.m36605e(s571.m77243b(this.f40225a.hashCode() * 31, 31, this.f40226b), this.f40227c, 31), this.f40228d, 31);
    }
}
