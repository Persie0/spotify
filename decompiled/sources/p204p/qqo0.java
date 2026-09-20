package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class qqo0 {

    /* JADX INFO: renamed from: a */
    public final Long f191623a;

    /* JADX INFO: renamed from: b */
    public final String f191624b;

    public qqo0(Long l, String str) {
        this.f191623a = l;
        this.f191624b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qqo0)) {
            return false;
        }
        qqo0 qqo0Var = (qqo0) obj;
        return wj50.m88271j(this.f191623a, qqo0Var.f191623a) && wj50.m88271j(this.f191624b, qqo0Var.f191624b);
    }

    public final int hashCode() {
        Long l = this.f191623a;
        return this.f191624b.hashCode() + ((l == null ? 0 : l.hashCode()) * 31);
    }
}
