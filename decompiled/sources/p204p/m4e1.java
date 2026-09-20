package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class m4e1 implements a5e1 {

    /* JADX INFO: renamed from: a */
    public final String f139948a;

    /* JADX INFO: renamed from: b */
    public final int f139949b;

    /* JADX INFO: renamed from: c */
    public final int f139950c;

    public m4e1(String str, int i, int i2) {
        this.f139948a = str;
        this.f139949b = i;
        this.f139950c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m4e1)) {
            return false;
        }
        m4e1 m4e1Var = (m4e1) obj;
        return wj50.m88271j(this.f139948a, m4e1Var.f139948a) && this.f139949b == m4e1Var.f139949b && this.f139950c == m4e1Var.f139950c;
    }

    public final int hashCode() {
        int iHashCode = this.f139948a.hashCode() * 31;
        int i = this.f139949b;
        int iM38547C = (iHashCode + (i == 0 ? 0 : edb.m38547C(i))) * 31;
        int i2 = this.f139950c;
        return iM38547C + (i2 != 0 ? edb.m38547C(i2) : 0);
    }
}
