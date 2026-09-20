package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class cxz0 {

    /* JADX INFO: renamed from: a */
    public final String f43120a;

    /* JADX INFO: renamed from: b */
    public final String f43121b;

    /* JADX INFO: renamed from: c */
    public final String f43122c;

    /* JADX INFO: renamed from: d */
    public final int f43123d;

    public cxz0(String str, String str2, int i, String str3) {
        this.f43120a = str;
        this.f43121b = str2;
        this.f43122c = str3;
        this.f43123d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cxz0)) {
            return false;
        }
        cxz0 cxz0Var = (cxz0) obj;
        return wj50.m88271j(this.f43120a, cxz0Var.f43120a) && wj50.m88271j(this.f43121b, cxz0Var.f43121b) && wj50.m88271j(this.f43122c, cxz0Var.f43122c) && this.f43123d == cxz0Var.f43123d;
    }

    public final int hashCode() {
        return edb.m38547C(this.f43123d) + s571.m77243b(s571.m77243b(this.f43120a.hashCode() * 31, 31, this.f43121b), 31, this.f43122c);
    }
}
