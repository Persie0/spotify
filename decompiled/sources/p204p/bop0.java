package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class bop0 {

    /* JADX INFO: renamed from: a */
    public final String f29235a;

    /* JADX INFO: renamed from: b */
    public final Integer f29236b;

    public bop0(Integer num, String str) {
        this.f29235a = str;
        this.f29236b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bop0)) {
            return false;
        }
        bop0 bop0Var = (bop0) obj;
        return wj50.m88271j(this.f29235a, bop0Var.f29235a) && wj50.m88271j(this.f29236b, bop0Var.f29236b);
    }

    public final int hashCode() {
        int iHashCode = this.f29235a.hashCode() * 31;
        Integer num = this.f29236b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
