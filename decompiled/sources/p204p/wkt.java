package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class wkt implements zkt {

    /* JADX INFO: renamed from: a */
    public final String f252298a;

    /* JADX INFO: renamed from: b */
    public final String f252299b;

    /* JADX INFO: renamed from: c */
    public final String f252300c;

    public wkt(String str, String str2, String str3) {
        this.f252298a = str;
        this.f252299b = str2;
        this.f252300c = str3;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0016  */
    /* JADX WARN: Code duplicated, block: B:22:0x002e  */
    public final boolean equals(Object obj) {
        boolean zM88271j;
        boolean zM88271j2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkt)) {
            return false;
        }
        wkt wktVar = (wkt) obj;
        String str = wktVar.f252298a;
        String str2 = this.f252298a;
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
        String str3 = wktVar.f252299b;
        String str4 = this.f252299b;
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
        return zM88271j2 && wj50.m88271j(this.f252300c, wktVar.f252300c);
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2 = 0;
        String str = this.f252298a;
        if (str == null) {
            iHashCode = 0;
        } else {
            wp6 wp6Var = i1e.f97494b;
            iHashCode = str.hashCode();
        }
        int i = iHashCode * 31;
        String str2 = this.f252299b;
        if (str2 != null) {
            wp6 wp6Var2 = hjz.f92292b;
            iHashCode2 = str2.hashCode();
        }
        return this.f252300c.hashCode() + ((i + iHashCode2) * 31);
    }
}
