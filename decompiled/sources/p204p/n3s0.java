package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class n3s0 {

    /* JADX INFO: renamed from: a */
    public final int f150118a;

    /* JADX INFO: renamed from: b */
    public final Integer f150119b;

    public n3s0(int i, Integer num) {
        this.f150118a = i;
        this.f150119b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3s0)) {
            return false;
        }
        n3s0 n3s0Var = (n3s0) obj;
        return this.f150118a == n3s0Var.f150118a && wj50.m88271j(this.f150119b, n3s0Var.f150119b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f150118a) * 31;
        Integer num = this.f150119b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
