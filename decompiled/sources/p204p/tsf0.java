package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class tsf0 {

    /* JADX INFO: renamed from: a */
    public final boolean f223303a;

    /* JADX INFO: renamed from: b */
    public final boolean f223304b;

    /* JADX INFO: renamed from: c */
    public final String f223305c;

    /* JADX INFO: renamed from: d */
    public final usf0 f223306d;

    public tsf0(boolean z, boolean z2, String str, usf0 usf0Var) {
        this.f223303a = z;
        this.f223304b = z2;
        this.f223305c = str;
        this.f223306d = usf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tsf0)) {
            return false;
        }
        tsf0 tsf0Var = (tsf0) obj;
        return this.f223303a == tsf0Var.f223303a && this.f223304b == tsf0Var.f223304b && wj50.m88271j(this.f223305c, tsf0Var.f223305c) && wj50.m88271j(this.f223306d, tsf0Var.f223306d);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(Boolean.hashCode(this.f223303a) * 31, 31, this.f223304b);
        String str = this.f223305c;
        int iHashCode = (iM77245d + (str == null ? 0 : str.hashCode())) * 31;
        usf0 usf0Var = this.f223306d;
        return iHashCode + (usf0Var != null ? usf0Var.hashCode() : 0);
    }
}
