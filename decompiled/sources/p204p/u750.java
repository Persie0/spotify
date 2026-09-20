package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class u750 extends wag1 {

    /* JADX INFO: renamed from: d */
    public final int f227516d;

    /* JADX INFO: renamed from: e */
    public final boolean f227517e;

    public u750(int i, boolean z) {
        this.f227516d = i;
        this.f227517e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u750)) {
            return false;
        }
        u750 u750Var = (u750) obj;
        return this.f227516d == u750Var.f227516d && this.f227517e == u750Var.f227517e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f227517e) + (edb.m38547C(this.f227516d) * 31);
    }
}
