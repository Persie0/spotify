package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class xkt implements zkt {

    /* JADX INFO: renamed from: a */
    public final String f262933a;

    /* JADX INFO: renamed from: b */
    public final String f262934b;

    /* JADX INFO: renamed from: c */
    public final String f262935c;

    /* JADX INFO: renamed from: d */
    public final String f262936d;

    /* JADX INFO: renamed from: e */
    public final String f262937e;

    /* JADX INFO: renamed from: f */
    public final boolean f262938f;

    public xkt(String str, String str2, String str3, String str4, boolean z, String str5) {
        this.f262933a = str;
        this.f262934b = str2;
        this.f262935c = str3;
        this.f262936d = str4;
        this.f262937e = str5;
        this.f262938f = z;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0016  */
    /* JADX WARN: Code duplicated, block: B:22:0x002e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0046  */
    /* JADX WARN: Code duplicated, block: B:42:0x005c  */
    public final boolean equals(Object obj) {
        boolean zM88271j;
        boolean zM88271j2;
        boolean zM88271j3;
        boolean zM88271j4;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xkt)) {
            return false;
        }
        xkt xktVar = (xkt) obj;
        String str = xktVar.f262933a;
        String str2 = this.f262933a;
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
        String str3 = xktVar.f262934b;
        String str4 = this.f262934b;
        if (str4 == null) {
            if (str3 == null) {
                zM88271j2 = true;
            } else {
                zM88271j2 = false;
            }
        } else if (str3 == null) {
            zM88271j2 = false;
        } else {
            wp6 wp6Var2 = xp6.f264511b;
            zM88271j2 = wj50.m88271j(str4, str3);
        }
        if (!zM88271j2) {
            return false;
        }
        String str5 = xktVar.f262935c;
        String str6 = this.f262935c;
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
        if (!zM88271j3) {
            return false;
        }
        String str7 = xktVar.f262936d;
        String str8 = this.f262936d;
        if (str8 == null) {
            if (str7 == null) {
                zM88271j4 = true;
            } else {
                zM88271j4 = false;
            }
        } else if (str7 == null) {
            zM88271j4 = false;
        } else {
            wp6 wp6Var3 = hjz.f92292b;
            zM88271j4 = wj50.m88271j(str8, str7);
        }
        return zM88271j4 && wj50.m88271j(this.f262937e, xktVar.f262937e) && this.f262938f == xktVar.f262938f;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3 = 0;
        String str = this.f262933a;
        if (str == null) {
            iHashCode = 0;
        } else {
            wp6 wp6Var = i1e.f97494b;
            iHashCode = str.hashCode();
        }
        int i = iHashCode * 31;
        String str2 = this.f262934b;
        if (str2 == null) {
            iHashCode2 = 0;
        } else {
            wp6 wp6Var2 = xp6.f264511b;
            iHashCode2 = str2.hashCode();
        }
        int i2 = (i + iHashCode2) * 31;
        String str3 = this.f262935c;
        int iHashCode4 = (i2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f262936d;
        if (str4 != null) {
            wp6 wp6Var3 = hjz.f92292b;
            iHashCode3 = str4.hashCode();
        }
        return Boolean.hashCode(this.f262938f) + s571.m77243b((iHashCode4 + iHashCode3) * 31, 961, this.f262937e);
    }
}
