package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class z5b {

    /* JADX INFO: renamed from: a */
    public final Integer f279526a;

    public z5b(Integer num) {
        this.f279526a = num;
    }

    /* JADX INFO: renamed from: a */
    public final Integer m95454a() {
        return this.f279526a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z5b) && wj50.m88271j(this.f279526a, ((z5b) obj).f279526a);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(5) * 31;
        Integer num = this.f279526a;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
