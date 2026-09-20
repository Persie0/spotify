package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class me90 {

    /* JADX INFO: renamed from: a */
    public final String f142637a;

    /* JADX INFO: renamed from: b */
    public final String f142638b;

    /* JADX INFO: renamed from: c */
    public final String f142639c;

    public me90(String str, String str2, String str3) {
        this.f142637a = str;
        this.f142638b = str2;
        this.f142639c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof me90)) {
            return false;
        }
        me90 me90Var = (me90) obj;
        return wj50.m88271j(this.f142637a, me90Var.f142637a) && wj50.m88271j(this.f142638b, me90Var.f142638b) && wj50.m88271j(this.f142639c, me90Var.f142639c);
    }

    public final int hashCode() {
        String str = this.f142637a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f142638b;
        return this.f142639c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
