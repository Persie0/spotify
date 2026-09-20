package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class av41 {

    /* JADX INFO: renamed from: a */
    public final z181 f20093a;

    /* JADX INFO: renamed from: b */
    public final String f20094b;

    /* JADX INFO: renamed from: c */
    public final boolean f20095c;

    /* JADX INFO: renamed from: d */
    public final boolean f20096d;

    /* JADX INFO: renamed from: e */
    public final boolean f20097e;

    /* JADX INFO: renamed from: f */
    public final String f20098f;

    /* JADX INFO: renamed from: g */
    public final boolean f20099g;

    /* JADX INFO: renamed from: h */
    public final v181 f20100h;

    /* JADX INFO: renamed from: i */
    public final er51 f20101i;

    /* JADX INFO: renamed from: j */
    public final er51 f20102j;

    public av41(z181 z181Var, String str, boolean z, boolean z2, boolean z3, String str2, boolean z4, v181 v181Var, er51 er51Var) {
        this.f20093a = z181Var;
        this.f20094b = str;
        this.f20095c = z;
        this.f20096d = z2;
        this.f20097e = z3;
        this.f20098f = str2;
        this.f20099g = z4;
        this.f20100h = v181Var;
        this.f20101i = er51Var;
        w181 w181VarM95094b = z181.m95094b(z181Var.f278259b);
        this.f20102j = w181VarM95094b != null ? elf1.m39385x(w181VarM95094b) : er51Var;
    }

    /* JADX INFO: renamed from: a */
    public static av41 m27223a(av41 av41Var, z181 z181Var, String str, boolean z, boolean z2, String str2, int i) {
        if ((i & 1) != 0) {
            z181Var = av41Var.f20093a;
        }
        z181 z181Var2 = z181Var;
        if ((i & 2) != 0) {
            str = av41Var.f20094b;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            z = av41Var.f20095c;
        }
        boolean z3 = z;
        boolean z4 = av41Var.f20096d;
        if ((i & 16) != 0) {
            z2 = av41Var.f20097e;
        }
        boolean z5 = z2;
        String str4 = (i & 32) != 0 ? av41Var.f20098f : str2;
        boolean z6 = av41Var.f20099g;
        v181 v181Var = av41Var.f20100h;
        er51 er51Var = av41Var.f20101i;
        av41Var.getClass();
        return new av41(z181Var2, str3, z3, z4, z5, str4, z6, v181Var, er51Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof av41)) {
            return false;
        }
        av41 av41Var = (av41) obj;
        return wj50.m88271j(this.f20093a, av41Var.f20093a) && wj50.m88271j(this.f20094b, av41Var.f20094b) && this.f20095c == av41Var.f20095c && this.f20096d == av41Var.f20096d && this.f20097e == av41Var.f20097e && wj50.m88271j(this.f20098f, av41Var.f20098f) && this.f20099g == av41Var.f20099g && this.f20100h == av41Var.f20100h && wj50.m88271j(this.f20101i, av41Var.f20101i);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77245d(s571.m77243b(this.f20093a.hashCode() * 31, 31, this.f20094b), 31, this.f20095c), 31, this.f20096d), 31, this.f20097e);
        String str = this.f20098f;
        int iM77245d2 = s571.m77245d((iM77245d + (str == null ? 0 : str.hashCode())) * 31, 31, this.f20099g);
        v181 v181Var = this.f20100h;
        return this.f20101i.hashCode() + ((iM77245d2 + (v181Var != null ? v181Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "isOnline: " + this.f20095c + "\nisContentFirstLoad: " + this.f20096d + "\ndsaModeEnabled: " + this.f20097e + "\nhighlightedChipId: " + this.f20098f + "\ndefaultSubFeedType: " + lq51.m59710p(this.f20101i.f62027c) + "\nselectedFilter: " + this.f20102j;
    }

    public /* synthetic */ av41(z181 z181Var, String str, String str2, v181 v181Var, er51 er51Var, int i) {
        this(z181Var, str, false, true, false, (i & 32) != 0 ? null : str2, true, v181Var, (i & 256) != 0 ? new er51("default", "default", 1) : er51Var);
    }
}
