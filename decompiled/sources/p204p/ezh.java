package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class ezh {

    /* JADX INFO: renamed from: a */
    public final String f64378a;

    /* JADX INFO: renamed from: b */
    public final String f64379b;

    /* JADX INFO: renamed from: c */
    public final String f64380c;

    /* JADX INFO: renamed from: d */
    public final List f64381d;

    /* JADX INFO: renamed from: e */
    public final yyh f64382e;

    /* JADX INFO: renamed from: f */
    public final gh00 f64383f;

    /* JADX INFO: renamed from: g */
    public final eh00 f64384g;

    /* JADX INFO: renamed from: h */
    public final boolean f64385h;

    public ezh(String str, String str2, String str3, List list, yyh yyhVar, gh00 gh00Var, eh00 eh00Var, boolean z) {
        this.f64378a = str;
        this.f64379b = str2;
        this.f64380c = str3;
        this.f64381d = list;
        this.f64382e = yyhVar;
        this.f64383f = gh00Var;
        this.f64384g = eh00Var;
        this.f64385h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ezh)) {
            return false;
        }
        ezh ezhVar = (ezh) obj;
        return wj50.m88271j(this.f64378a, ezhVar.f64378a) && wj50.m88271j(this.f64379b, ezhVar.f64379b) && wj50.m88271j(this.f64380c, ezhVar.f64380c) && wj50.m88271j(this.f64381d, ezhVar.f64381d) && wj50.m88271j(this.f64382e, ezhVar.f64382e) && wj50.m88271j(this.f64383f, ezhVar.f64383f) && wj50.m88271j(this.f64384g, ezhVar.f64384g) && this.f64385h == ezhVar.f64385h;
    }

    public final int hashCode() {
        int iM77244c = s571.m77244c(s571.m77243b(s571.m77243b(this.f64378a.hashCode() * 31, 31, this.f64379b), 31, this.f64380c), 31, this.f64381d);
        yyh yyhVar = this.f64382e;
        int iHashCode = (iM77244c + (yyhVar == null ? 0 : yyhVar.hashCode())) * 31;
        gh00 gh00Var = this.f64383f;
        int iHashCode2 = (iHashCode + (gh00Var == null ? 0 : gh00Var.hashCode())) * 31;
        eh00 eh00Var = this.f64384g;
        return Boolean.hashCode(this.f64385h) + ((iHashCode2 + (eh00Var != null ? eh00Var.hashCode() : 0)) * 31);
    }

    public /* synthetic */ ezh(int i, String str, String str2, String str3, List list) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "Concert Campaign Page" : str2, (i & 4) != 0 ? "https://i.scdn.co/image/ab6761610000e5eb1a9824a587cc162d8b98fa6f" : str3, (i & 8) != 0 ? lau.f131415a : list, null, null, null, true);
    }
}
