package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ga31 {

    /* JADX INFO: renamed from: a */
    public final int f77966a;

    /* JADX INFO: renamed from: b */
    public final int f77967b;

    /* JADX INFO: renamed from: c */
    public final boolean f77968c;

    public ga31(int i, int i2, boolean z) {
        this.f77966a = i;
        this.f77967b = i2;
        this.f77968c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ga31)) {
            return false;
        }
        ga31 ga31Var = (ga31) obj;
        return this.f77966a == ga31Var.f77966a && this.f77967b == ga31Var.f77967b && this.f77968c == ga31Var.f77968c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f77968c) + mt60.m62800g(this.f77967b, Integer.hashCode(this.f77966a) * 31, 31);
    }
}
