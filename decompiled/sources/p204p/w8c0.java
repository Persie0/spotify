package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class w8c0 {

    /* JADX INFO: renamed from: a */
    public final int f248902a;

    /* JADX INFO: renamed from: b */
    public final String f248903b;

    public w8c0(int i, String str) {
        this.f248902a = i;
        this.f248903b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w8c0)) {
            return false;
        }
        w8c0 w8c0Var = (w8c0) obj;
        return this.f248902a == w8c0Var.f248902a && wj50.m88271j(this.f248903b, w8c0Var.f248903b);
    }

    public final int hashCode() {
        return this.f248903b.hashCode() + (edb.m38547C(this.f248902a) * 31);
    }
}
