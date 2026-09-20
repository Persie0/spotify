package p204p;

/* JADX INFO: loaded from: classes18.dex */
public final class igw0 {

    /* JADX INFO: renamed from: a */
    public final int f102077a;

    /* JADX INFO: renamed from: b */
    public final Integer f102078b;

    public igw0(int i, Integer num) {
        this.f102077a = i;
        this.f102078b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof igw0)) {
            return false;
        }
        igw0 igw0Var = (igw0) obj;
        return this.f102077a == igw0Var.f102077a && this.f102078b.equals(igw0Var.f102078b);
    }

    public final int hashCode() {
        return (edb.m38547C(this.f102077a) * 31) + this.f102078b.hashCode();
    }
}
