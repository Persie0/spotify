package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ciy0 {

    /* JADX INFO: renamed from: a */
    public final aiy0 f38447a;

    /* JADX INFO: renamed from: b */
    public final int f38448b;

    /* JADX INFO: renamed from: c */
    public final int f38449c;

    public ciy0(aiy0 aiy0Var, int i, int i2) {
        this.f38447a = aiy0Var;
        this.f38448b = i;
        this.f38449c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ciy0)) {
            return false;
        }
        ciy0 ciy0Var = (ciy0) obj;
        return this.f38447a == ciy0Var.f38447a && this.f38448b == ciy0Var.f38448b && this.f38449c == ciy0Var.f38449c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f38449c) + mt60.m62800g(this.f38448b, this.f38447a.hashCode() * 31, 31);
    }
}
