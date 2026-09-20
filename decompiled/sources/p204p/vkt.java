package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class vkt implements zkt {

    /* JADX INFO: renamed from: a */
    public final String f242284a;

    /* JADX INFO: renamed from: b */
    public final String f242285b;

    /* JADX INFO: renamed from: c */
    public final String f242286c;

    /* JADX INFO: renamed from: d */
    public final boolean f242287d;

    public vkt(String str, String str2, String str3, boolean z) {
        this.f242284a = str;
        this.f242285b = str2;
        this.f242286c = str3;
        this.f242287d = z;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0016  */
    /* JADX WARN: Code duplicated, block: B:22:0x002e  */
    public final boolean equals(Object obj) {
        boolean zM88271j;
        boolean zM88271j2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vkt)) {
            return false;
        }
        vkt vktVar = (vkt) obj;
        String str = vktVar.f242284a;
        String str2 = this.f242284a;
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
        String str3 = vktVar.f242285b;
        String str4 = this.f242285b;
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
        return zM88271j2 && wj50.m88271j(this.f242286c, vktVar.f242286c) && this.f242287d == vktVar.f242287d;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2 = 0;
        String str = this.f242284a;
        if (str == null) {
            iHashCode = 0;
        } else {
            wp6 wp6Var = i1e.f97494b;
            iHashCode = str.hashCode();
        }
        int i = iHashCode * 31;
        String str2 = this.f242285b;
        if (str2 != null) {
            wp6 wp6Var2 = hjz.f92292b;
            iHashCode2 = str2.hashCode();
        }
        return Boolean.hashCode(this.f242287d) + s571.m77243b((i + iHashCode2) * 31, 31, this.f242286c);
    }
}
