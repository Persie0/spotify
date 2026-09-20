package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class k2d1 {

    /* JADX INFO: renamed from: a */
    public final String f118602a;

    /* JADX INFO: renamed from: b */
    public final String f118603b;

    public k2d1(String str, String str2) {
        this.f118602a = str;
        this.f118603b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k2d1)) {
            return false;
        }
        k2d1 k2d1Var = (k2d1) obj;
        return wj50.m88271j(this.f118602a, k2d1Var.f118602a) && wj50.m88271j(this.f118603b, k2d1Var.f118603b);
    }

    public final int hashCode() {
        return this.f118603b.hashCode() + (this.f118602a.hashCode() * 31);
    }
}
