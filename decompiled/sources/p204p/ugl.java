package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ugl implements chl {

    /* JADX INFO: renamed from: a */
    public final String f230201a;

    /* JADX INFO: renamed from: b */
    public final String f230202b;

    /* JADX INFO: renamed from: c */
    public final String f230203c;

    public ugl(String str, String str2, String str3) {
        this.f230201a = str;
        this.f230202b = str2;
        this.f230203c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ugl)) {
            return false;
        }
        ugl uglVar = (ugl) obj;
        return wj50.m88271j(this.f230201a, uglVar.f230201a) && wj50.m88271j(this.f230202b, uglVar.f230202b) && wj50.m88271j(this.f230203c, uglVar.f230203c);
    }

    public final int hashCode() {
        int iHashCode = this.f230201a.hashCode() * 31;
        String str = this.f230202b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f230203c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
