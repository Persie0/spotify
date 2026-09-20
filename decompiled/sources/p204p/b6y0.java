package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class b6y0 extends l6y0 {

    /* JADX INFO: renamed from: a */
    public final boolean f24073a;

    /* JADX INFO: renamed from: b */
    public final String f24074b;

    /* JADX INFO: renamed from: c */
    public final String f24075c;

    public b6y0(boolean z, String str, String str2) {
        this.f24073a = z;
        this.f24074b = str;
        this.f24075c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b6y0)) {
            return false;
        }
        b6y0 b6y0Var = (b6y0) obj;
        return this.f24073a == b6y0Var.f24073a && wj50.m88271j(this.f24074b, b6y0Var.f24074b) && this.f24075c.equals(b6y0Var.f24075c);
    }

    public final int hashCode() {
        return this.f24075c.hashCode() + s571.m77243b(Boolean.hashCode(this.f24073a) * 31, 31, this.f24074b);
    }
}
