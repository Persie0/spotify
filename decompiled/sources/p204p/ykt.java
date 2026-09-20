package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ykt implements zkt {

    /* JADX INFO: renamed from: a */
    public final String f273825a;

    /* JADX INFO: renamed from: b */
    public final String f273826b;

    /* JADX INFO: renamed from: c */
    public final String f273827c;

    /* JADX INFO: renamed from: d */
    public final String f273828d;

    /* JADX INFO: renamed from: e */
    public final String f273829e;

    /* JADX INFO: renamed from: f */
    public final String f273830f;

    public ykt(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f273825a = str;
        this.f273826b = str2;
        this.f273827c = str3;
        this.f273828d = str4;
        this.f273829e = str5;
        this.f273830f = str6;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0016  */
    /* JADX WARN: Code duplicated, block: B:22:0x002e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0044  */
    /* JADX WARN: Code duplicated, block: B:42:0x005c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0072  */
    public final boolean equals(Object obj) {
        boolean zM88271j;
        boolean zM88271j2;
        boolean zM88271j3;
        boolean zM88271j4;
        boolean zM88271j5;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ykt)) {
            return false;
        }
        ykt yktVar = (ykt) obj;
        String str = yktVar.f273825a;
        String str2 = this.f273825a;
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
        String str3 = yktVar.f273826b;
        String str4 = this.f273826b;
        if (str4 == null) {
            if (str3 == null) {
                zM88271j2 = true;
            } else {
                zM88271j2 = false;
            }
        } else if (str3 == null) {
            zM88271j2 = false;
        } else {
            zM88271j2 = wj50.m88271j(str4, str3);
        }
        if (!zM88271j2) {
            return false;
        }
        String str5 = yktVar.f273827c;
        String str6 = this.f273827c;
        if (str6 == null) {
            if (str5 == null) {
                zM88271j3 = true;
            } else {
                zM88271j3 = false;
            }
        } else if (str5 == null) {
            zM88271j3 = false;
        } else {
            wp6 wp6Var2 = xp6.f264511b;
            zM88271j3 = wj50.m88271j(str6, str5);
        }
        if (!zM88271j3) {
            return false;
        }
        String str7 = yktVar.f273828d;
        String str8 = this.f273828d;
        if (str8 == null) {
            if (str7 == null) {
                zM88271j4 = true;
            } else {
                zM88271j4 = false;
            }
        } else if (str7 == null) {
            zM88271j4 = false;
        } else {
            zM88271j4 = wj50.m88271j(str8, str7);
        }
        if (!zM88271j4) {
            return false;
        }
        String str9 = yktVar.f273829e;
        String str10 = this.f273829e;
        if (str10 == null) {
            if (str9 == null) {
                zM88271j5 = true;
            } else {
                zM88271j5 = false;
            }
        } else if (str9 == null) {
            zM88271j5 = false;
        } else {
            wp6 wp6Var3 = hjz.f92292b;
            zM88271j5 = wj50.m88271j(str10, str9);
        }
        return zM88271j5 && wj50.m88271j(this.f273830f, yktVar.f273830f);
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3 = 0;
        String str = this.f273825a;
        if (str == null) {
            iHashCode = 0;
        } else {
            wp6 wp6Var = i1e.f97494b;
            iHashCode = str.hashCode();
        }
        int i = iHashCode * 31;
        String str2 = this.f273826b;
        int iHashCode4 = (i + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f273827c;
        if (str3 == null) {
            iHashCode2 = 0;
        } else {
            wp6 wp6Var2 = xp6.f264511b;
            iHashCode2 = str3.hashCode();
        }
        int i2 = (iHashCode4 + iHashCode2) * 31;
        String str4 = this.f273828d;
        int iHashCode5 = (i2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f273829e;
        if (str5 != null) {
            wp6 wp6Var3 = hjz.f92292b;
            iHashCode3 = str5.hashCode();
        }
        return this.f273830f.hashCode() + ((iHashCode5 + iHashCode3) * 961);
    }
}
