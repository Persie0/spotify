package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class d811 {

    /* JADX INFO: renamed from: a */
    public final rv01 f46330a;

    /* JADX INFO: renamed from: b */
    public final boolean f46331b;

    public d811(rv01 rv01Var, boolean z) {
        this.f46330a = rv01Var;
        this.f46331b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d811)) {
            return false;
        }
        d811 d811Var = (d811) obj;
        return wj50.m88271j(this.f46330a, d811Var.f46330a) && this.f46331b == d811Var.f46331b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f46331b) + (this.f46330a.hashCode() * 31);
    }
}
