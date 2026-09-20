package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class fpl {

    /* JADX INFO: renamed from: a */
    public final int f71926a;

    /* JADX INFO: renamed from: b */
    public final String f71927b;

    /* JADX INFO: renamed from: c */
    public final String f71928c;

    /* JADX INFO: renamed from: d */
    public final String f71929d;

    /* JADX INFO: renamed from: e */
    public final boolean f71930e;

    public fpl(int i, String str, String str2, boolean z, String str3) {
        this.f71926a = i;
        this.f71927b = str;
        this.f71928c = str2;
        this.f71929d = str3;
        this.f71930e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fpl)) {
            return false;
        }
        fpl fplVar = (fpl) obj;
        return this.f71926a == fplVar.f71926a && wj50.m88271j(this.f71927b, fplVar.f71927b) && this.f71928c.equals(fplVar.f71928c) && wj50.m88271j(this.f71929d, fplVar.f71929d) && this.f71930e == fplVar.f71930e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f71930e) + s571.m77243b(s571.m77243b(s571.m77243b(edb.m38547C(this.f71926a) * 31, 31, this.f71927b), 31, this.f71928c), 31, this.f71929d);
    }
}
