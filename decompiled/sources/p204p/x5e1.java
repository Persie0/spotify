package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class x5e1 implements l6e1 {

    /* JADX INFO: renamed from: a */
    public final String f258397a;

    /* JADX INFO: renamed from: b */
    public final String f258398b;

    /* JADX INFO: renamed from: c */
    public final int f258399c;

    public x5e1(String str, String str2, int i) {
        this.f258397a = str;
        this.f258398b = str2;
        this.f258399c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5e1)) {
            return false;
        }
        x5e1 x5e1Var = (x5e1) obj;
        return this.f258397a.equals(x5e1Var.f258397a) && this.f258398b.equals(x5e1Var.f258398b) && this.f258399c == x5e1Var.f258399c;
    }

    public final int hashCode() {
        return edb.m38547C(this.f258399c) + s571.m77243b(this.f258397a.hashCode() * 31, 31, this.f258398b);
    }
}
