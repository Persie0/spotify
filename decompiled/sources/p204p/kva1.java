package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class kva1 {

    /* JADX INFO: renamed from: a */
    public final int f126809a;

    /* JADX INFO: renamed from: b */
    public final Integer f126810b;

    public kva1(int i, Integer num) {
        this.f126809a = i;
        this.f126810b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kva1)) {
            return false;
        }
        kva1 kva1Var = (kva1) obj;
        return this.f126809a == kva1Var.f126809a && wj50.m88271j(this.f126810b, kva1Var.f126810b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f126809a) * 31;
        Integer num = this.f126810b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
