package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class b3x0 {

    /* JADX INFO: renamed from: a */
    public final String f23144a;

    /* JADX INFO: renamed from: b */
    public final String f23145b;

    /* JADX INFO: renamed from: c */
    public final int f23146c;

    public b3x0(String str, String str2, int i) {
        this.f23144a = str;
        this.f23145b = str2;
        this.f23146c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b3x0)) {
            return false;
        }
        b3x0 b3x0Var = (b3x0) obj;
        return wj50.m88271j(this.f23144a, b3x0Var.f23144a) && wj50.m88271j(this.f23145b, b3x0Var.f23145b) && this.f23146c == b3x0Var.f23146c;
    }

    public final int hashCode() {
        return edb.m38547C(this.f23146c) + s571.m77243b(this.f23144a.hashCode() * 31, 31, this.f23145b);
    }
}
