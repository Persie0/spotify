package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class dy1 {

    /* JADX INFO: renamed from: a */
    public final int f54146a;

    /* JADX INFO: renamed from: b */
    public final String f54147b;

    /* JADX INFO: renamed from: c */
    public final String f54148c;

    /* JADX INFO: renamed from: d */
    public final gh00 f54149d;

    public dy1(int i, String str, String str2, gh00 gh00Var) {
        this.f54146a = i;
        this.f54147b = str;
        this.f54148c = str2;
        this.f54149d = gh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dy1)) {
            return false;
        }
        dy1 dy1Var = (dy1) obj;
        return this.f54146a == dy1Var.f54146a && wj50.m88271j(this.f54147b, dy1Var.f54147b) && wj50.m88271j(this.f54148c, dy1Var.f54148c) && wj50.m88271j(this.f54149d, dy1Var.f54149d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(edb.m38547C(this.f54146a) * 31, 31, this.f54147b);
        String str = this.f54148c;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        gh00 gh00Var = this.f54149d;
        return iHashCode + (gh00Var != null ? gh00Var.hashCode() : 0);
    }
}
