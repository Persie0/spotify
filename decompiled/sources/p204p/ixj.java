package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ixj {

    /* JADX INFO: renamed from: a */
    public final String f106694a;

    /* JADX INFO: renamed from: b */
    public final String f106695b;

    /* JADX INFO: renamed from: c */
    public final String f106696c;

    /* JADX INFO: renamed from: d */
    public final Integer f106697d;

    /* JADX INFO: renamed from: e */
    public final boolean f106698e;

    /* JADX INFO: renamed from: f */
    public final boolean f106699f;

    /* JADX INFO: renamed from: g */
    public final boolean f106700g;

    /* JADX INFO: renamed from: h */
    public final boolean f106701h;

    /* JADX INFO: renamed from: i */
    public final gh00 f106702i;

    /* JADX INFO: renamed from: j */
    public final eh00 f106703j;

    /* JADX INFO: renamed from: k */
    public final eh00 f106704k;

    /* JADX INFO: renamed from: l */
    public final String f106705l;

    /* JADX INFO: renamed from: m */
    public final vh00 f106706m;

    public ixj(String str, String str2, String str3, Integer num, boolean z, boolean z2, boolean z3, gh00 gh00Var, eh00 eh00Var, eh00 eh00Var2, String str4, vh00 vh00Var, int i) {
        str2 = (i & 2) != 0 ? "" : str2;
        String str5 = (i & 4) == 0 ? str3 : "";
        Integer num2 = (i & 8) != 0 ? null : num;
        boolean z4 = (i & 16) != 0 ? false : z;
        boolean z5 = (i & 32) != 0 ? false : z2;
        boolean z6 = (i & 64) != 0 ? false : z3;
        boolean z7 = (i & 128) == 0;
        gh00 gh00Var2 = (i & 256) != 0 ? null : gh00Var;
        eh00 eh00Var3 = (i & 512) != 0 ? null : eh00Var;
        eh00 eh00Var4 = (i & 1024) != 0 ? null : eh00Var2;
        String str6 = (i & 2048) != 0 ? null : str4;
        vh00 vh00Var2 = (i & 4096) == 0 ? vh00Var : null;
        this.f106694a = str;
        this.f106695b = str2;
        this.f106696c = str5;
        this.f106697d = num2;
        this.f106698e = z4;
        this.f106699f = z5;
        this.f106700g = z6;
        this.f106701h = z7;
        this.f106702i = gh00Var2;
        this.f106703j = eh00Var3;
        this.f106704k = eh00Var4;
        this.f106705l = str6;
        this.f106706m = vh00Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ixj)) {
            return false;
        }
        ixj ixjVar = (ixj) obj;
        return wj50.m88271j(this.f106694a, ixjVar.f106694a) && wj50.m88271j(this.f106695b, ixjVar.f106695b) && wj50.m88271j(this.f106696c, ixjVar.f106696c) && wj50.m88271j(this.f106697d, ixjVar.f106697d) && this.f106698e == ixjVar.f106698e && this.f106699f == ixjVar.f106699f && this.f106700g == ixjVar.f106700g && this.f106701h == ixjVar.f106701h && wj50.m88271j(this.f106702i, ixjVar.f106702i) && wj50.m88271j(this.f106703j, ixjVar.f106703j) && wj50.m88271j(this.f106704k, ixjVar.f106704k) && wj50.m88271j(this.f106705l, ixjVar.f106705l) && wj50.m88271j(this.f106706m, ixjVar.f106706m);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f106694a.hashCode() * 31, 31, this.f106695b), 31, this.f106696c);
        Integer num = this.f106697d;
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d((iM77243b + (num == null ? 0 : num.hashCode())) * 31, 31, this.f106698e), 31, this.f106699f), 31, this.f106700g), 31, this.f106701h);
        gh00 gh00Var = this.f106702i;
        int iHashCode = (iM77245d + (gh00Var == null ? 0 : gh00Var.hashCode())) * 31;
        eh00 eh00Var = this.f106703j;
        int iHashCode2 = (iHashCode + (eh00Var == null ? 0 : eh00Var.hashCode())) * 31;
        eh00 eh00Var2 = this.f106704k;
        int iHashCode3 = (iHashCode2 + (eh00Var2 == null ? 0 : eh00Var2.hashCode())) * 31;
        String str = this.f106705l;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        vh00 vh00Var = this.f106706m;
        return iHashCode4 + (vh00Var != null ? vh00Var.hashCode() : 0);
    }
}
