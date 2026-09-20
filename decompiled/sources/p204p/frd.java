package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class frd {

    /* JADX INFO: renamed from: a */
    public final String f72446a;

    /* JADX INFO: renamed from: b */
    public final String f72447b;

    /* JADX INFO: renamed from: c */
    public final brd f72448c;

    /* JADX INFO: renamed from: d */
    public final String f72449d;

    /* JADX INFO: renamed from: e */
    public final boolean f72450e;

    /* JADX INFO: renamed from: f */
    public final boolean f72451f;

    /* JADX INFO: renamed from: g */
    public final boolean f72452g;

    public frd(String str, String str2, brd brdVar, String str3, boolean z, boolean z2, boolean z3) {
        this.f72446a = str;
        this.f72447b = str2;
        this.f72448c = brdVar;
        this.f72449d = str3;
        this.f72450e = z;
        this.f72451f = z2;
        this.f72452g = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof frd)) {
            return false;
        }
        frd frdVar = (frd) obj;
        return wj50.m88271j(this.f72446a, frdVar.f72446a) && wj50.m88271j(this.f72447b, frdVar.f72447b) && this.f72448c.equals(frdVar.f72448c) && wj50.m88271j(this.f72449d, frdVar.f72449d) && this.f72450e == frdVar.f72450e && this.f72451f == frdVar.f72451f && this.f72452g == frdVar.f72452g;
    }

    public final int hashCode() {
        int iHashCode = (this.f72448c.hashCode() + s571.m77243b(this.f72446a.hashCode() * 31, 31, this.f72447b)) * 31;
        String str = this.f72449d;
        return Boolean.hashCode(this.f72452g) + s571.m77245d(s571.m77245d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f72450e), 31, this.f72451f);
    }
}
