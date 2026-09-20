package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class kle1 {

    /* JADX INFO: renamed from: a */
    public final String f123884a;

    /* JADX INFO: renamed from: b */
    public final boolean f123885b;

    /* JADX INFO: renamed from: c */
    public final int f123886c;

    public kle1(String str, boolean z, int i) {
        this.f123884a = str;
        this.f123885b = z;
        this.f123886c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kle1)) {
            return false;
        }
        kle1 kle1Var = (kle1) obj;
        return this.f123884a.equals(kle1Var.f123884a) && this.f123885b == kle1Var.f123885b && this.f123886c == kle1Var.f123886c;
    }

    public final int hashCode() {
        return edb.m38547C(this.f123886c) + s571.m77245d(this.f123884a.hashCode() * 31, 31, this.f123885b);
    }
}
