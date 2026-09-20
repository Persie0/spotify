package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class k5a1 {

    /* JADX INFO: renamed from: a */
    public final Integer f119462a;

    /* JADX INFO: renamed from: b */
    public final String f119463b;

    /* JADX INFO: renamed from: c */
    public final String f119464c;

    /* JADX INFO: renamed from: d */
    public final i5a1 f119465d;

    public k5a1(Integer num, String str, String str2, i5a1 i5a1Var) {
        this.f119462a = num;
        this.f119463b = str;
        this.f119464c = str2;
        this.f119465d = i5a1Var;
    }

    /* JADX INFO: renamed from: a */
    public final i5a1 m55433a() {
        return this.f119465d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k5a1)) {
            return false;
        }
        k5a1 k5a1Var = (k5a1) obj;
        return wj50.m88271j(this.f119462a, k5a1Var.f119462a) && wj50.m88271j(this.f119463b, k5a1Var.f119463b) && wj50.m88271j(this.f119464c, k5a1Var.f119464c) && wj50.m88271j(this.f119465d, k5a1Var.f119465d);
    }

    public final int hashCode() {
        Integer num = this.f119462a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f119463b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f119464c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        i5a1 i5a1Var = this.f119465d;
        return iHashCode3 + (i5a1Var != null ? i5a1Var.hashCode() : 0);
    }
}
