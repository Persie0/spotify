package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class vi90 {

    /* JADX INFO: renamed from: a */
    public final ti90 f241650a;

    /* JADX INFO: renamed from: b */
    public final Integer f241651b;

    public vi90(ti90 ti90Var, Integer num) {
        this.f241650a = ti90Var;
        this.f241651b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vi90)) {
            return false;
        }
        vi90 vi90Var = (vi90) obj;
        return this.f241650a == vi90Var.f241650a && wj50.m88271j(this.f241651b, vi90Var.f241651b);
    }

    public final int hashCode() {
        int iHashCode = this.f241650a.hashCode() * 31;
        Integer num = this.f241651b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
