package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class x72 {

    /* JADX INFO: renamed from: c */
    public static final x72 f258789c = new x72(false, null);

    /* JADX INFO: renamed from: a */
    public final boolean f258790a;

    /* JADX INFO: renamed from: b */
    public final Integer f258791b;

    public x72(boolean z, Integer num) {
        this.f258790a = z;
        this.f258791b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x72)) {
            return false;
        }
        x72 x72Var = (x72) obj;
        return this.f258790a == x72Var.f258790a && wj50.m88271j(this.f258791b, x72Var.f258791b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f258790a) * 31;
        Integer num = this.f258791b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
