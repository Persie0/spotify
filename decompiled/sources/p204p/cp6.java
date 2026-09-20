package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class cp6 implements dp6 {

    /* JADX INFO: renamed from: a */
    public final Integer f40466a;

    /* JADX INFO: renamed from: b */
    public final Integer f40467b;

    public cp6(Integer num, Integer num2) {
        this.f40466a = num;
        this.f40467b = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cp6)) {
            return false;
        }
        cp6 cp6Var = (cp6) obj;
        return wj50.m88271j(this.f40466a, cp6Var.f40466a) && wj50.m88271j(this.f40467b, cp6Var.f40467b);
    }

    public final int hashCode() {
        Integer num = this.f40466a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f40467b;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }
}
