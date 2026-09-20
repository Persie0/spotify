package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class rzq0 {

    /* JADX INFO: renamed from: a */
    public final int f204203a;

    /* JADX INFO: renamed from: b */
    public final int f204204b;

    public rzq0(int i, int i2) {
        this.f204203a = i;
        this.f204204b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rzq0)) {
            return false;
        }
        rzq0 rzq0Var = (rzq0) obj;
        return this.f204203a == rzq0Var.f204203a && this.f204204b == rzq0Var.f204204b;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f204203a) * 31;
        int i = this.f204204b;
        return iHashCode + (i == 0 ? 0 : edb.m38547C(i));
    }
}
