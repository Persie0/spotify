package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class gx21 {

    /* JADX INFO: renamed from: a */
    public final String f85161a;

    /* JADX INFO: renamed from: b */
    public final String f85162b;

    /* JADX INFO: renamed from: c */
    public final boolean f85163c;

    public gx21(String str, String str2, boolean z) {
        this.f85161a = str;
        this.f85162b = str2;
        this.f85163c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gx21)) {
            return false;
        }
        gx21 gx21Var = (gx21) obj;
        return wj50.m88271j(this.f85161a, gx21Var.f85161a) && wj50.m88271j(this.f85162b, gx21Var.f85162b) && this.f85163c == gx21Var.f85163c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f85163c) + s571.m77243b(this.f85161a.hashCode() * 31, 31, this.f85162b);
    }
}
