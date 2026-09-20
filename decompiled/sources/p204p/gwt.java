package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class gwt implements iwt {

    /* JADX INFO: renamed from: a */
    public final String f85098a;

    /* JADX INFO: renamed from: b */
    public final Integer f85099b;

    /* JADX INFO: renamed from: c */
    public final Integer f85100c;

    public gwt(String str, Integer num, Integer num2) {
        this.f85098a = str;
        this.f85099b = num;
        this.f85100c = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gwt)) {
            return false;
        }
        gwt gwtVar = (gwt) obj;
        return wj50.m88271j(this.f85098a, gwtVar.f85098a) && wj50.m88271j(this.f85099b, gwtVar.f85099b) && wj50.m88271j(this.f85100c, gwtVar.f85100c);
    }

    public final int hashCode() {
        int iHashCode = this.f85098a.hashCode() * 31;
        Integer num = this.f85099b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f85100c;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }
}
