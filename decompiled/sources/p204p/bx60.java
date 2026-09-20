package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class bx60 implements kx60 {

    /* JADX INFO: renamed from: a */
    public final nk2 f31791a;

    /* JADX INFO: renamed from: b */
    public final String f31792b;

    public bx60(nk2 nk2Var, String str) {
        this.f31791a = nk2Var;
        this.f31792b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bx60)) {
            return false;
        }
        bx60 bx60Var = (bx60) obj;
        return this.f31791a == bx60Var.f31791a && wj50.m88271j(this.f31792b, bx60Var.f31792b);
    }

    public final int hashCode() {
        int iHashCode = this.f31791a.hashCode() * 31;
        String str = this.f31792b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
