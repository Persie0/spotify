package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class m740 {

    /* JADX INFO: renamed from: a */
    public final String f140645a;

    /* JADX INFO: renamed from: b */
    public final int f140646b;

    /* JADX INFO: renamed from: c */
    public final String f140647c;

    /* JADX INFO: renamed from: d */
    public final a740 f140648d;

    /* JADX INFO: renamed from: e */
    public final f5u f140649e;

    /* JADX INFO: renamed from: f */
    public final boolean f140650f;

    /* JADX INFO: renamed from: g */
    public final boolean f140651g;

    /* JADX INFO: renamed from: h */
    public final boolean f140652h;

    /* JADX INFO: renamed from: i */
    public final boolean f140653i;

    /* JADX INFO: renamed from: j */
    public final boolean f140654j;

    /* JADX INFO: renamed from: k */
    public final abs0 f140655k;

    /* JADX INFO: renamed from: l */
    public final boolean f140656l;

    /* JADX INFO: renamed from: m */
    public final Integer f140657m;

    public /* synthetic */ m740(String str, int i, String str2, a740 a740Var, f5u f5uVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, abs0 abs0Var, boolean z6, int i2) {
        this(str, i, str2, a740Var, f5uVar, z, z2, z3, (i2 & 256) != 0 ? false : z4, z5, abs0Var, z6, (Integer) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m740)) {
            return false;
        }
        m740 m740Var = (m740) obj;
        return wj50.m88271j(this.f140645a, m740Var.f140645a) && this.f140646b == m740Var.f140646b && wj50.m88271j(this.f140647c, m740Var.f140647c) && wj50.m88271j(this.f140648d, m740Var.f140648d) && wj50.m88271j(this.f140649e, m740Var.f140649e) && this.f140650f == m740Var.f140650f && this.f140651g == m740Var.f140651g && this.f140652h == m740Var.f140652h && this.f140653i == m740Var.f140653i && this.f140654j == m740Var.f140654j && wj50.m88271j(this.f140655k, m740Var.f140655k) && this.f140656l == m740Var.f140656l && wj50.m88271j(this.f140657m, m740Var.f140657m);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(mt60.m62800g(this.f140646b, this.f140645a.hashCode() * 31, 31), 31, this.f140647c);
        this.f140648d.getClass();
        int iM38547C = (edb.m38547C(2) + iM77243b) * 31;
        f5u f5uVar = this.f140649e;
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d((iM38547C + (f5uVar == null ? 0 : f5uVar.hashCode())) * 31, 31, this.f140650f), 31, this.f140651g), 31, this.f140652h), 31, this.f140653i), 31, this.f140654j);
        abs0 abs0Var = this.f140655k;
        int iM77245d2 = s571.m77245d((iM77245d + (abs0Var == null ? 0 : abs0Var.hashCode())) * 31, 31, this.f140656l);
        Integer num = this.f140657m;
        return iM77245d2 + (num != null ? num.hashCode() : 0);
    }

    public m740(String str, int i, String str2, a740 a740Var, f5u f5uVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, abs0 abs0Var, boolean z6, Integer num) {
        this.f140645a = str;
        this.f140646b = i;
        this.f140647c = str2;
        this.f140648d = a740Var;
        this.f140649e = f5uVar;
        this.f140650f = z;
        this.f140651g = z2;
        this.f140652h = z3;
        this.f140653i = z4;
        this.f140654j = z5;
        this.f140655k = abs0Var;
        this.f140656l = z6;
        this.f140657m = num;
    }
}
