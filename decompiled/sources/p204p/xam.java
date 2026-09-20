package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class xam {

    /* JADX INFO: renamed from: a */
    public final Integer f259717a;

    /* JADX INFO: renamed from: b */
    public final String f259718b;

    /* JADX INFO: renamed from: c */
    public final Integer f259719c;

    /* JADX INFO: renamed from: d */
    public final yxf f259720d;

    public xam(Integer num, String str, Integer num2, rwt0 rwt0Var, int i) {
        num = (i & 1) != 0 ? null : num;
        str = (i & 2) != 0 ? null : str;
        num2 = (i & 4) != 0 ? null : num2;
        rwt0Var = (i & 16) != 0 ? null : rwt0Var;
        this.f259717a = num;
        this.f259718b = str;
        this.f259719c = num2;
        this.f259720d = rwt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xam)) {
            return false;
        }
        xam xamVar = (xam) obj;
        return wj50.m88271j(this.f259717a, xamVar.f259717a) && wj50.m88271j(this.f259718b, xamVar.f259718b) && wj50.m88271j(this.f259719c, xamVar.f259719c) && wj50.m88271j(this.f259720d, xamVar.f259720d);
    }

    public final int hashCode() {
        Integer num = this.f259717a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f259718b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.f259719c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 961;
        yxf yxfVar = this.f259720d;
        return iHashCode3 + (yxfVar != null ? yxfVar.hashCode() : 0);
    }
}
