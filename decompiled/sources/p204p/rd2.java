package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class rd2 {

    /* JADX INFO: renamed from: a */
    public final String f198011a;

    /* JADX INFO: renamed from: b */
    public final String f198012b;

    public rd2(String str, String str2) {
        this.f198011a = str;
        this.f198012b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rd2)) {
            return false;
        }
        rd2 rd2Var = (rd2) obj;
        return wj50.m88271j(this.f198011a, rd2Var.f198011a) && wj50.m88271j(this.f198012b, rd2Var.f198012b);
    }

    public final int hashCode() {
        String str = this.f198011a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f198012b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
