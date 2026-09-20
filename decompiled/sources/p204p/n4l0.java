package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class n4l0 {

    /* JADX INFO: renamed from: a */
    public final String f150380a;

    /* JADX INFO: renamed from: b */
    public final String f150381b;

    /* JADX INFO: renamed from: c */
    public final String f150382c;

    public n4l0(String str, String str2, String str3) {
        this.f150380a = str;
        this.f150381b = str2;
        this.f150382c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4l0)) {
            return false;
        }
        n4l0 n4l0Var = (n4l0) obj;
        return wj50.m88271j(this.f150380a, n4l0Var.f150380a) && wj50.m88271j(this.f150381b, n4l0Var.f150381b) && wj50.m88271j(this.f150382c, n4l0Var.f150382c);
    }

    public final int hashCode() {
        return this.f150382c.hashCode() + s571.m77243b(this.f150380a.hashCode() * 31, 31, this.f150381b);
    }
}
