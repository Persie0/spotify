package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class glo {

    /* JADX INFO: renamed from: a */
    public final int f81120a;

    /* JADX INFO: renamed from: b */
    public final Integer f81121b;

    /* JADX INFO: renamed from: c */
    public final Integer f81122c;

    public glo(int i, Integer num, Integer num2) {
        this.f81120a = i;
        this.f81121b = num;
        this.f81122c = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof glo)) {
            return false;
        }
        glo gloVar = (glo) obj;
        return this.f81120a == gloVar.f81120a && wj50.m88271j(this.f81121b, gloVar.f81121b) && wj50.m88271j(this.f81122c, gloVar.f81122c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f81120a) * 31;
        Integer num = this.f81121b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f81122c;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }
}
