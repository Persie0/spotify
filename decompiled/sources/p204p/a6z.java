package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class a6z {

    /* JADX INFO: renamed from: a */
    public final String f12893a;

    /* JADX INFO: renamed from: b */
    public final String f12894b;

    /* JADX INFO: renamed from: c */
    public final boolean f12895c;

    /* JADX INFO: renamed from: d */
    public final String f12896d;

    /* JADX INFO: renamed from: e */
    public final String f12897e;

    /* JADX INFO: renamed from: f */
    public final boolean f12898f;

    /* JADX INFO: renamed from: g */
    public final String f12899g;

    public a6z(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2) {
        this.f12893a = str;
        this.f12894b = str2;
        this.f12895c = z;
        this.f12896d = str3;
        this.f12897e = str4;
        this.f12898f = z2;
        this.f12899g = str5;
    }

    /* JADX INFO: renamed from: a */
    public static a6z m24880a(a6z a6zVar, boolean z, boolean z2, int i) {
        String str = a6zVar.f12893a;
        String str2 = a6zVar.f12894b;
        if ((i & 4) != 0) {
            z = a6zVar.f12895c;
        }
        boolean z3 = z;
        String str3 = a6zVar.f12896d;
        String str4 = a6zVar.f12897e;
        if ((i & 32) != 0) {
            z2 = a6zVar.f12898f;
        }
        String str5 = a6zVar.f12899g;
        a6zVar.getClass();
        return new a6z(str, str2, str3, str4, str5, z3, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a6z)) {
            return false;
        }
        a6z a6zVar = (a6z) obj;
        return wj50.m88271j(this.f12893a, a6zVar.f12893a) && wj50.m88271j(this.f12894b, a6zVar.f12894b) && this.f12895c == a6zVar.f12895c && wj50.m88271j(this.f12896d, a6zVar.f12896d) && wj50.m88271j(this.f12897e, a6zVar.f12897e) && this.f12898f == a6zVar.f12898f && wj50.m88271j(this.f12899g, a6zVar.f12899g);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77243b(this.f12893a.hashCode() * 31, 31, this.f12894b), 31, this.f12895c);
        String str = this.f12896d;
        int iM77245d2 = s571.m77245d(s571.m77243b((iM77245d + (str == null ? 0 : str.hashCode())) * 31, 31, this.f12897e), 31, this.f12898f);
        String str2 = this.f12899g;
        return iM77245d2 + (str2 != null ? str2.hashCode() : 0);
    }
}
