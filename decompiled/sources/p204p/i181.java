package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class i181 {

    /* JADX INFO: renamed from: a */
    public final Integer f97441a;

    /* JADX INFO: renamed from: b */
    public final Integer f97442b;

    /* JADX INFO: renamed from: c */
    public final boolean f97443c;

    public i181(Integer num, Integer num2, boolean z) {
        this.f97441a = num;
        this.f97442b = num2;
        this.f97443c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i181)) {
            return false;
        }
        i181 i181Var = (i181) obj;
        return wj50.m88271j(this.f97441a, i181Var.f97441a) && wj50.m88271j(this.f97442b, i181Var.f97442b) && this.f97443c == i181Var.f97443c;
    }

    public final int hashCode() {
        Integer num = this.f97441a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f97442b;
        return Boolean.hashCode(this.f97443c) + ((iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31);
    }
}
