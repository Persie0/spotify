package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class rda0 {

    /* JADX INFO: renamed from: a */
    public final Integer f198082a;

    /* JADX INFO: renamed from: b */
    public final Integer f198083b;

    public rda0(Integer num, Integer num2) {
        this.f198082a = num;
        this.f198083b = num2;
    }

    /* JADX INFO: renamed from: a */
    public final Integer m75324a() {
        return this.f198082a;
    }

    /* JADX INFO: renamed from: b */
    public final Integer m75325b() {
        return this.f198083b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rda0)) {
            return false;
        }
        rda0 rda0Var = (rda0) obj;
        return wj50.m88271j(this.f198082a, rda0Var.f198082a) && wj50.m88271j(this.f198083b, rda0Var.f198083b);
    }

    public final int hashCode() {
        Integer num = this.f198082a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f198083b;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }
}
