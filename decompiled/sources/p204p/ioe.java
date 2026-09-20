package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ioe {

    /* JADX INFO: renamed from: a */
    public final boolean f104211a;

    /* JADX INFO: renamed from: b */
    public final String f104212b;

    /* JADX INFO: renamed from: c */
    public final boolean f104213c;

    /* JADX INFO: renamed from: d */
    public final String f104214d;

    /* JADX INFO: renamed from: e */
    public final String f104215e;

    public ioe(String str, String str2, String str3, boolean z, boolean z2) {
        this.f104211a = z;
        this.f104212b = str;
        this.f104213c = z2;
        this.f104214d = str2;
        this.f104215e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ioe)) {
            return false;
        }
        ioe ioeVar = (ioe) obj;
        return this.f104211a == ioeVar.f104211a && wj50.m88271j(this.f104212b, ioeVar.f104212b) && this.f104213c == ioeVar.f104213c && wj50.m88271j(this.f104214d, ioeVar.f104214d) && wj50.m88271j(this.f104215e, ioeVar.f104215e);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77243b(Boolean.hashCode(this.f104211a) * 31, 31, this.f104212b), 31, this.f104213c);
        String str = this.f104214d;
        int iHashCode = (iM77245d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f104215e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public /* synthetic */ ioe(boolean z, int i) {
        this("", null, null, (i & 1) != 0 ? true : z, false);
    }
}
