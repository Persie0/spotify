package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ead0 {

    /* JADX INFO: renamed from: a */
    public final String f57624a;

    /* JADX INFO: renamed from: b */
    public final String f57625b;

    /* JADX INFO: renamed from: c */
    public final int f57626c;

    /* JADX INFO: renamed from: d */
    public final int f57627d;

    /* JADX INFO: renamed from: e */
    public final int f57628e;

    /* JADX INFO: renamed from: f */
    public final long f57629f;

    public ead0(int i, int i2, int i3, long j, String str, String str2) {
        this.f57624a = str;
        this.f57625b = str2;
        this.f57626c = i;
        this.f57627d = i2;
        this.f57628e = i3;
        this.f57629f = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ead0)) {
            return false;
        }
        ead0 ead0Var = (ead0) obj;
        return wj50.m88271j(this.f57624a, ead0Var.f57624a) && wj50.m88271j(this.f57625b, ead0Var.f57625b) && this.f57626c == ead0Var.f57626c && this.f57627d == ead0Var.f57627d && this.f57628e == ead0Var.f57628e && this.f57629f == ead0Var.f57629f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f57629f) + mt60.m62800g(this.f57628e, mt60.m62800g(this.f57627d, f710.m40938f(this.f57626c, s571.m77243b(this.f57624a.hashCode() * 31, 31, this.f57625b), 31), 31), 31);
    }
}
