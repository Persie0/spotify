package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class fdp0 {

    /* JADX INFO: renamed from: a */
    public final String f68538a;

    /* JADX INFO: renamed from: b */
    public final int f68539b;

    public fdp0(String str, int i) {
        this.f68538a = str;
        this.f68539b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fdp0)) {
            return false;
        }
        fdp0 fdp0Var = (fdp0) obj;
        return wj50.m88271j(this.f68538a, fdp0Var.f68538a) && this.f68539b == fdp0Var.f68539b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f68539b) + (this.f68538a.hashCode() * 31);
    }
}
