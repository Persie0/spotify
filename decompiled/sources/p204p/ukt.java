package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ukt implements zkt {

    /* JADX INFO: renamed from: a */
    public final String f231361a;

    /* JADX INFO: renamed from: b */
    public final String f231362b;

    /* JADX INFO: renamed from: c */
    public final String f231363c;

    /* JADX INFO: renamed from: d */
    public final String f231364d;

    /* JADX INFO: renamed from: e */
    public final String f231365e;

    public ukt(String str, String str2, String str3, String str4, String str5) {
        this.f231361a = str;
        this.f231362b = str2;
        this.f231363c = str3;
        this.f231364d = str4;
        this.f231365e = str5;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0016  */
    /* JADX WARN: Code duplicated, block: B:22:0x002e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0046  */
    public final boolean equals(Object obj) {
        boolean zM88271j;
        boolean zM88271j2;
        boolean zM88271j3;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ukt)) {
            return false;
        }
        ukt uktVar = (ukt) obj;
        String str = uktVar.f231361a;
        String str2 = this.f231361a;
        if (str2 == null) {
            if (str == null) {
                zM88271j = true;
            } else {
                zM88271j = false;
            }
        } else if (str == null) {
            zM88271j = false;
        } else {
            wp6 wp6Var = i1e.f97494b;
            zM88271j = wj50.m88271j(str2, str);
        }
        if (!zM88271j) {
            return false;
        }
        String str3 = uktVar.f231362b;
        String str4 = this.f231362b;
        if (str4 == null) {
            if (str3 == null) {
                zM88271j2 = true;
            } else {
                zM88271j2 = false;
            }
        } else if (str3 == null) {
            zM88271j2 = false;
        } else {
            wp6 wp6Var2 = hjz.f92292b;
            zM88271j2 = wj50.m88271j(str4, str3);
        }
        if (!zM88271j2) {
            return false;
        }
        String str5 = uktVar.f231363c;
        String str6 = this.f231363c;
        if (str6 == null) {
            if (str5 == null) {
                zM88271j3 = true;
            } else {
                zM88271j3 = false;
            }
        } else if (str5 == null) {
            zM88271j3 = false;
        } else {
            zM88271j3 = wj50.m88271j(str6, str5);
        }
        return zM88271j3 && wj50.m88271j(this.f231364d, uktVar.f231364d) && wj50.m88271j(this.f231365e, uktVar.f231365e);
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        String str = this.f231361a;
        if (str == null) {
            iHashCode = 0;
        } else {
            wp6 wp6Var = i1e.f97494b;
            iHashCode = str.hashCode();
        }
        int i = iHashCode * 31;
        String str2 = this.f231362b;
        if (str2 == null) {
            iHashCode2 = 0;
        } else {
            wp6 wp6Var2 = hjz.f92292b;
            iHashCode2 = str2.hashCode();
        }
        int i2 = (i + iHashCode2) * 31;
        String str3 = this.f231363c;
        return this.f231365e.hashCode() + s571.m77243b((i2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.f231364d);
    }
}
