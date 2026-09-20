package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class w160 {

    /* JADX INFO: renamed from: a */
    public final String f246982a;

    /* JADX INFO: renamed from: b */
    public final int f246983b;

    /* JADX INFO: renamed from: c */
    public final boolean f246984c;

    public w160(String str, int i, boolean z) {
        this.f246982a = str;
        this.f246983b = i;
        this.f246984c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w160)) {
            return false;
        }
        w160 w160Var = (w160) obj;
        return wj50.m88271j(this.f246982a, w160Var.f246982a) && this.f246983b == w160Var.f246983b && this.f246984c == w160Var.f246984c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f246984c) + mt60.m62800g(this.f246983b, this.f246982a.hashCode() * 31, 31);
    }
}
