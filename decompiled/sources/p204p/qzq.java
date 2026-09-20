package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class qzq implements k0r {

    /* JADX INFO: renamed from: a */
    public final String f194248a;

    /* JADX INFO: renamed from: b */
    public final int f194249b;

    /* JADX INFO: renamed from: c */
    public final String f194250c;

    /* JADX INFO: renamed from: d */
    public final boolean f194251d;

    /* JADX INFO: renamed from: e */
    public final String f194252e;

    public qzq(int i, String str, String str2, boolean z, String str3) {
        this.f194248a = str;
        this.f194249b = i;
        this.f194250c = str2;
        this.f194251d = z;
        this.f194252e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qzq)) {
            return false;
        }
        qzq qzqVar = (qzq) obj;
        return wj50.m88271j(this.f194248a, qzqVar.f194248a) && this.f194249b == qzqVar.f194249b && wj50.m88271j(this.f194250c, qzqVar.f194250c) && this.f194251d == qzqVar.f194251d && wj50.m88271j(this.f194252e, qzqVar.f194252e);
    }

    public final int hashCode() {
        int iM62800g = mt60.m62800g(this.f194249b, this.f194248a.hashCode() * 31, 31);
        String str = this.f194250c;
        int iM77245d = s571.m77245d((iM62800g + (str == null ? 0 : str.hashCode())) * 31, 31, this.f194251d);
        String str2 = this.f194252e;
        return iM77245d + (str2 != null ? str2.hashCode() : 0);
    }
}
