package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class k3c1 extends l3c1 {

    /* JADX INFO: renamed from: a */
    public final int f118845a;

    /* JADX INFO: renamed from: b */
    public final String f118846b;

    public k3c1(int i, String str) {
        this.f118845a = i;
        this.f118846b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k3c1)) {
            return false;
        }
        k3c1 k3c1Var = (k3c1) obj;
        return this.f118845a == k3c1Var.f118845a && wj50.m88271j(this.f118846b, k3c1Var.f118846b);
    }

    public final int hashCode() {
        return this.f118846b.hashCode() + (Integer.hashCode(this.f118845a) * 31);
    }
}
