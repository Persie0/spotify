package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class epa0 implements fpa0 {

    /* JADX INFO: renamed from: a */
    public final String f61598a;

    /* JADX INFO: renamed from: b */
    public final String f61599b;

    /* JADX INFO: renamed from: c */
    public final String f61600c;

    /* JADX INFO: renamed from: d */
    public final String f61601d;

    public epa0(String str, String str2, String str3, String str4) {
        this.f61598a = str;
        this.f61599b = str2;
        this.f61600c = str3;
        this.f61601d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof epa0)) {
            return false;
        }
        epa0 epa0Var = (epa0) obj;
        return wj50.m88271j(this.f61598a, epa0Var.f61598a) && wj50.m88271j(this.f61599b, epa0Var.f61599b) && wj50.m88271j(this.f61600c, epa0Var.f61600c) && wj50.m88271j(this.f61601d, epa0Var.f61601d);
    }

    public final int hashCode() {
        int iHashCode = this.f61598a.hashCode() * 31;
        String str = this.f61599b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f61600c;
        return this.f61601d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
