package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class wzk implements ktx {

    /* JADX INFO: renamed from: a */
    public final String f256620a;

    /* JADX INFO: renamed from: b */
    public final String f256621b;

    /* JADX INFO: renamed from: c */
    public final String f256622c;

    /* JADX INFO: renamed from: d */
    public final String f256623d;

    public wzk(String str, String str2, String str3, String str4) {
        this.f256620a = str;
        this.f256621b = str2;
        this.f256622c = str3;
        this.f256623d = str4;
    }

    /* JADX INFO: renamed from: a */
    public final String m89458a(szk szkVar) {
        String str;
        String str2;
        String str3;
        szk szkVar2 = szk.f215609d;
        if (szkVar == szkVar2 && (str3 = this.f256623d) != null && str3.length() != 0) {
            return str3;
        }
        if ((szkVar != szk.f215608c && szkVar != szkVar2) || (str = this.f256622c) == null || str.length() == 0) {
            return (szkVar != szk.f215607b || (str2 = this.f256621b) == null || str2.length() == 0) ? this.f256620a : str2;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wzk)) {
            return false;
        }
        wzk wzkVar = (wzk) obj;
        return wj50.m88271j(this.f256620a, wzkVar.f256620a) && wj50.m88271j(this.f256621b, wzkVar.f256621b) && wj50.m88271j(this.f256622c, wzkVar.f256622c) && wj50.m88271j(this.f256623d, wzkVar.f256623d);
    }

    public final int hashCode() {
        int iHashCode = this.f256620a.hashCode() * 31;
        String str = this.f256621b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f256622c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f256623d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public /* synthetic */ wzk() {
        this("", null, null, null);
    }
}
