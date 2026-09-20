package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class o8b1 {

    /* JADX INFO: renamed from: a */
    public final String f162768a;

    /* JADX INFO: renamed from: b */
    public final String f162769b;

    /* JADX INFO: renamed from: c */
    public final int f162770c;

    public o8b1(String str, String str2, int i) {
        this.f162768a = str;
        this.f162769b = str2;
        this.f162770c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o8b1)) {
            return false;
        }
        o8b1 o8b1Var = (o8b1) obj;
        return wj50.m88271j(this.f162768a, o8b1Var.f162768a) && wj50.m88271j(this.f162769b, o8b1Var.f162769b) && this.f162770c == o8b1Var.f162770c;
    }

    public final int hashCode() {
        int iHashCode = this.f162768a.hashCode() * 31;
        String str = this.f162769b;
        return edb.m38547C(this.f162770c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
