package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ann0 {

    /* JADX INFO: renamed from: a */
    public final boolean f17470a;

    /* JADX INFO: renamed from: b */
    public final Integer f17471b;

    public ann0(boolean z, Integer num) {
        this.f17470a = z;
        this.f17471b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ann0)) {
            return false;
        }
        ann0 ann0Var = (ann0) obj;
        return this.f17470a == ann0Var.f17470a && wj50.m88271j(this.f17471b, ann0Var.f17471b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f17470a) * 31;
        Integer num = this.f17471b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
