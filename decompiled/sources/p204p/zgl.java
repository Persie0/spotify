package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class zgl implements ahl {

    /* JADX INFO: renamed from: a */
    public final String f282672a;

    /* JADX INFO: renamed from: b */
    public final String f282673b;

    /* JADX INFO: renamed from: c */
    public final long f282674c;

    /* JADX INFO: renamed from: d */
    public final long f282675d;

    public zgl(String str, long j, long j2, String str2) {
        this.f282672a = str;
        this.f282673b = str2;
        this.f282674c = j;
        this.f282675d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zgl)) {
            return false;
        }
        zgl zglVar = (zgl) obj;
        return wj50.m88271j(this.f282672a, zglVar.f282672a) && wj50.m88271j(this.f282673b, zglVar.f282673b) && this.f282674c == zglVar.f282674c && this.f282675d == zglVar.f282675d;
    }

    @Override // p204p.ahl
    public final String getContextUri() {
        return this.f282672a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f282675d) + dq60.m36605e(s571.m77243b(this.f282672a.hashCode() * 31, 31, this.f282673b), this.f282674c, 31);
    }
}
