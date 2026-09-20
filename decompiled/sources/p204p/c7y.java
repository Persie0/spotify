package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class c7y {

    /* JADX INFO: renamed from: a */
    public final String f35042a;

    /* JADX INFO: renamed from: b */
    public final int f35043b;

    /* JADX INFO: renamed from: c */
    public final String f35044c;

    /* JADX INFO: renamed from: d */
    public final String f35045d;

    /* JADX INFO: renamed from: e */
    public final String f35046e;

    /* JADX INFO: renamed from: f */
    public final boolean f35047f;

    public /* synthetic */ c7y(int i, int i2, String str, String str2, String str3, String str4) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? 1 : i, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, true, (i2 & 16) != 0 ? null : str4);
    }

    /* JADX INFO: renamed from: a */
    public static c7y m31764a(c7y c7yVar, String str, int i, String str2, String str3, int i2) {
        if ((i2 & 1) != 0) {
            str = c7yVar.f35042a;
        }
        String str4 = str;
        if ((i2 & 2) != 0) {
            i = c7yVar.f35043b;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str2 = c7yVar.f35044c;
        }
        String str5 = str2;
        String str6 = c7yVar.f35045d;
        if ((i2 & 16) != 0) {
            str3 = c7yVar.f35046e;
        }
        boolean z = c7yVar.f35047f;
        c7yVar.getClass();
        return new c7y(str4, i3, str5, str6, z, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c7y)) {
            return false;
        }
        c7y c7yVar = (c7y) obj;
        return wj50.m88271j(this.f35042a, c7yVar.f35042a) && this.f35043b == c7yVar.f35043b && wj50.m88271j(this.f35044c, c7yVar.f35044c) && wj50.m88271j(this.f35045d, c7yVar.f35045d) && wj50.m88271j(this.f35046e, c7yVar.f35046e) && this.f35047f == c7yVar.f35047f;
    }

    public final int hashCode() {
        String str = this.f35042a;
        int iM40938f = f710.m40938f(this.f35043b, (str == null ? 0 : str.hashCode()) * 31, 31);
        String str2 = this.f35044c;
        int iHashCode = (iM40938f + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f35045d;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f35046e;
        return Boolean.hashCode(this.f35047f) + ((iHashCode2 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public c7y(String str, int i, String str2, String str3, boolean z, String str4) {
        this.f35042a = str;
        this.f35043b = i;
        this.f35044c = str2;
        this.f35045d = str3;
        this.f35046e = str4;
        this.f35047f = z;
    }
}
