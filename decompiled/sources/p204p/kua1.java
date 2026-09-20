package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class kua1 extends lua1 {

    /* JADX INFO: renamed from: a */
    public final String f126495a;

    /* JADX INFO: renamed from: b */
    public final String f126496b;

    /* JADX INFO: renamed from: c */
    public final int f126497c;

    public kua1(String str, String str2, int i) {
        this.f126495a = str;
        this.f126496b = str2;
        this.f126497c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kua1)) {
            return false;
        }
        kua1 kua1Var = (kua1) obj;
        return this.f126495a.equals(kua1Var.f126495a) && this.f126496b.equals(kua1Var.f126496b) && this.f126497c == kua1Var.f126497c;
    }

    public final int hashCode() {
        return edb.m38547C(this.f126497c) + s571.m77243b(this.f126495a.hashCode() * 31, 31, this.f126496b);
    }
}
