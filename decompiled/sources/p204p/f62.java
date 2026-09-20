package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class f62 {

    /* JADX INFO: renamed from: a */
    public final boolean f66234a;

    /* JADX INFO: renamed from: b */
    public final Integer f66235b;

    public f62(boolean z, Integer num) {
        this.f66234a = z;
        this.f66235b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f62)) {
            return false;
        }
        f62 f62Var = (f62) obj;
        return this.f66234a == f62Var.f66234a && wj50.m88271j(this.f66235b, f62Var.f66235b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f66234a) * 31;
        Integer num = this.f66235b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
