package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class cqu0 {

    /* JADX INFO: renamed from: a */
    public final String f40995a;

    /* JADX INFO: renamed from: b */
    public final boolean f40996b;

    /* JADX INFO: renamed from: c */
    public final boolean f40997c;

    public cqu0(String str, boolean z, boolean z2) {
        this.f40995a = str;
        this.f40996b = z;
        this.f40997c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cqu0)) {
            return false;
        }
        cqu0 cqu0Var = (cqu0) obj;
        return wj50.m88271j(this.f40995a, cqu0Var.f40995a) && this.f40996b == cqu0Var.f40996b && this.f40997c == cqu0Var.f40997c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f40997c) + s571.m77245d(this.f40995a.hashCode() * 31, 31, this.f40996b);
    }
}
