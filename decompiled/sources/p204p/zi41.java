package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class zi41 {

    /* JADX INFO: renamed from: a */
    public final int f283079a;

    /* JADX INFO: renamed from: b */
    public final Integer f283080b;

    public /* synthetic */ zi41() {
        this(0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zi41)) {
            return false;
        }
        zi41 zi41Var = (zi41) obj;
        return this.f283079a == zi41Var.f283079a && wj50.m88271j(this.f283080b, zi41Var.f283080b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f283079a) * 31;
        Integer num = this.f283080b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public zi41(int i, Integer num) {
        this.f283079a = i;
        this.f283080b = num;
    }
}
