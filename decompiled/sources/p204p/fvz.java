package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class fvz {

    /* JADX INFO: renamed from: a */
    public final String f73900a;

    /* JADX INFO: renamed from: b */
    public final String f73901b;

    /* JADX INFO: renamed from: c */
    public final boolean f73902c;

    /* JADX INFO: renamed from: d */
    public final boolean f73903d;

    /* JADX INFO: renamed from: e */
    public final boolean f73904e;

    /* JADX INFO: renamed from: f */
    public final boolean f73905f;

    public fvz(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f73900a = str;
        this.f73901b = str2;
        this.f73902c = z;
        this.f73903d = z2;
        this.f73904e = z3;
        this.f73905f = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fvz)) {
            return false;
        }
        fvz fvzVar = (fvz) obj;
        return wj50.m88271j(this.f73900a, fvzVar.f73900a) && wj50.m88271j(this.f73901b, fvzVar.f73901b) && this.f73902c == fvzVar.f73902c && this.f73903d == fvzVar.f73903d && this.f73904e == fvzVar.f73904e && this.f73905f == fvzVar.f73905f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f73905f) + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77243b(this.f73900a.hashCode() * 31, 31, this.f73901b), 31, this.f73902c), 31, this.f73903d), 31, this.f73904e);
    }
}
