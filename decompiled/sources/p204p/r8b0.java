package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class r8b0 extends t8b0 {

    /* JADX INFO: renamed from: a */
    public final Integer f196756a;

    /* JADX INFO: renamed from: b */
    public final Integer f196757b;

    /* JADX INFO: renamed from: c */
    public final Integer f196758c;

    public r8b0(Integer num, Integer num2) {
        this.f196756a = num;
        this.f196757b = num2;
        this.f196758c = num2;
    }

    @Override // p204p.t8b0
    /* JADX INFO: renamed from: a */
    public final float mo74977a(u8b0 u8b0Var) {
        Integer num = this.f196758c;
        if (num == null) {
            return 1.0f;
        }
        return n0e1.m63436m(num.intValue() / u8b0Var.f227894m, 0.0f, 1.0f);
    }

    @Override // p204p.t8b0
    /* JADX INFO: renamed from: b */
    public final float mo74978b(u8b0 u8b0Var) {
        Integer num = this.f196756a;
        if (num == null) {
            return 0.0f;
        }
        return n0e1.m63436m(num.intValue() / u8b0Var.f227894m, 0.0f, 1.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8b0)) {
            return false;
        }
        r8b0 r8b0Var = (r8b0) obj;
        return this.f196756a.equals(r8b0Var.f196756a) && this.f196757b.equals(r8b0Var.f196757b);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.f196757b.hashCode() + (this.f196756a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Frame(min=" + this.f196756a + ", max=" + this.f196757b + ", maxInclusive=true)";
    }
}
