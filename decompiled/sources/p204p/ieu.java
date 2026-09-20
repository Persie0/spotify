package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ieu {

    /* JADX INFO: renamed from: a */
    public final Integer f101547a;

    /* JADX INFO: renamed from: b */
    public final Integer f101548b;

    public ieu(int i, Integer num, Integer num2) {
        num = (i & 4) != 0 ? null : num;
        num2 = (i & 8) != 0 ? null : num2;
        this.f101547a = num;
        this.f101548b = num2;
        if (num != null && num.intValue() <= 0) {
            throw new IllegalArgumentException("Width must be greater than 0");
        }
        if (num2 != null && num2.intValue() <= 0) {
            throw new IllegalArgumentException("Height must be greater than 0");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ieu)) {
            return false;
        }
        ieu ieuVar = (ieu) obj;
        return wj50.m88271j(this.f101547a, ieuVar.f101547a) && wj50.m88271j(this.f101548b, ieuVar.f101548b);
    }

    public final int hashCode() {
        int iM40938f = f710.m40938f(4, edb.m38547C(6) * 31, 31);
        Integer num = this.f101547a;
        int iHashCode = (iM40938f + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f101548b;
        return edb.m38547C(1) + f710.m40938f(1, (iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31, 31);
    }
}
