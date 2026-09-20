package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class mmo0 {

    /* JADX INFO: renamed from: a */
    public final int f145191a;

    /* JADX INFO: renamed from: b */
    public final String f145192b;

    /* JADX INFO: renamed from: c */
    public final String f145193c;

    public mmo0(int i, String str, int i2, String str2) {
        str = (i2 & 2) != 0 ? null : str;
        str2 = (i2 & 4) != 0 ? null : str2;
        this.f145191a = i;
        this.f145192b = str;
        this.f145193c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mmo0)) {
            return false;
        }
        mmo0 mmo0Var = (mmo0) obj;
        return this.f145191a == mmo0Var.f145191a && wj50.m88271j(this.f145192b, mmo0Var.f145192b) && wj50.m88271j(this.f145193c, mmo0Var.f145193c);
    }

    public final int hashCode() {
        int iM38547C = edb.m38547C(this.f145191a) * 31;
        String str = this.f145192b;
        int iHashCode = (iM38547C + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f145193c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
