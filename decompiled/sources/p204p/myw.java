package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class myw implements a3x {

    /* JADX INFO: renamed from: a */
    public final String f148538a;

    /* JADX INFO: renamed from: b */
    public final boolean f148539b;

    /* JADX INFO: renamed from: c */
    public final boolean f148540c;

    public myw(String str, boolean z, boolean z2) {
        this.f148538a = str;
        this.f148539b = z;
        this.f148540c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof myw)) {
            return false;
        }
        myw mywVar = (myw) obj;
        return wj50.m88271j(this.f148538a, mywVar.f148538a) && this.f148539b == mywVar.f148539b && this.f148540c == mywVar.f148540c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f148540c) + s571.m77245d(this.f148538a.hashCode() * 31, 31, this.f148539b);
    }
}
