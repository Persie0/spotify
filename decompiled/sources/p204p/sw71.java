package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class sw71 {

    /* JADX INFO: renamed from: a */
    public final String f214613a;

    /* JADX INFO: renamed from: b */
    public final String f214614b;

    /* JADX INFO: renamed from: c */
    public final boolean f214615c;

    /* JADX INFO: renamed from: d */
    public final boolean f214616d;

    public sw71(String str, boolean z, String str2, boolean z2) {
        this.f214613a = str;
        this.f214614b = str2;
        this.f214615c = z;
        this.f214616d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sw71)) {
            return false;
        }
        sw71 sw71Var = (sw71) obj;
        return wj50.m88271j(this.f214613a, sw71Var.f214613a) && wj50.m88271j(this.f214614b, sw71Var.f214614b) && this.f214615c == sw71Var.f214615c && this.f214616d == sw71Var.f214616d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f214616d) + s571.m77245d(s571.m77243b(this.f214613a.hashCode() * 31, 31, this.f214614b), 31, this.f214615c);
    }
}
