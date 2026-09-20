package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class rly {

    /* JADX INFO: renamed from: a */
    public final String f200391a;

    /* JADX INFO: renamed from: b */
    public final String f200392b;

    /* JADX INFO: renamed from: c */
    public final long f200393c;

    /* JADX INFO: renamed from: d */
    public final boolean f200394d;

    /* JADX INFO: renamed from: e */
    public final boolean f200395e;

    public rly(String str, String str2, long j, boolean z, boolean z2) {
        this.f200391a = str;
        this.f200392b = str2;
        this.f200393c = j;
        this.f200394d = z;
        this.f200395e = z2;
    }

    /* JADX INFO: renamed from: a */
    public static rly m75892a(rly rlyVar, String str, long j, boolean z, int i) {
        String str2 = rlyVar.f200391a;
        if ((i & 2) != 0) {
            str = rlyVar.f200392b;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            j = rlyVar.f200393c;
        }
        return new rly(str2, str3, j, z, rlyVar.f200395e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rly)) {
            return false;
        }
        rly rlyVar = (rly) obj;
        return wj50.m88271j(this.f200391a, rlyVar.f200391a) && wj50.m88271j(this.f200392b, rlyVar.f200392b) && this.f200393c == rlyVar.f200393c && this.f200394d == rlyVar.f200394d && this.f200395e == rlyVar.f200395e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f200395e) + s571.m77245d(dq60.m36605e(s571.m77243b(this.f200391a.hashCode() * 31, 31, this.f200392b), this.f200393c, 31), 31, this.f200394d);
    }
}
