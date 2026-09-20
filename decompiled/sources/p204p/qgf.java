package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class qgf {

    /* JADX INFO: renamed from: a */
    public final int f188457a;

    /* JADX INFO: renamed from: b */
    public final bh71 f188458b;

    /* JADX INFO: renamed from: c */
    public final int f188459c;

    /* JADX INFO: renamed from: d */
    public final myt f188460d;

    /* JADX INFO: renamed from: e */
    public final String f188461e;

    /* JADX INFO: renamed from: f */
    public final String f188462f;

    public qgf(int i, bh71 bh71Var, int i2, myt mytVar, String str, String str2) {
        this.f188457a = i;
        this.f188458b = bh71Var;
        this.f188459c = i2;
        this.f188460d = mytVar;
        this.f188461e = str;
        this.f188462f = str2;
    }

    /* JADX INFO: renamed from: a */
    public static qgf m72742a(qgf qgfVar, bh71 bh71Var, int i, myt mytVar, String str, String str2, int i2) {
        int i3 = i;
        int i4 = qgfVar.f188457a;
        if ((i2 & 4) != 0) {
            i3 = qgfVar.f188459c;
        }
        if ((i2 & 8) != 0) {
            mytVar = qgfVar.f188460d;
        }
        if ((i2 & 16) != 0) {
            str = qgfVar.f188461e;
        }
        if ((i2 & 32) != 0) {
            str2 = qgfVar.f188462f;
        }
        String str3 = str2;
        qgfVar.getClass();
        String str4 = str;
        return new qgf(i4, bh71Var, i3, mytVar, str4, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qgf)) {
            return false;
        }
        qgf qgfVar = (qgf) obj;
        return this.f188457a == qgfVar.f188457a && wj50.m88271j(this.f188458b, qgfVar.f188458b) && this.f188459c == qgfVar.f188459c && this.f188460d == qgfVar.f188460d && wj50.m88271j(this.f188461e, qgfVar.f188461e) && wj50.m88271j(this.f188462f, qgfVar.f188462f);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b((this.f188460d.hashCode() + mt60.m62800g(this.f188459c, s571.m77244c(Integer.hashCode(this.f188457a) * 31, 31, this.f188458b.f27105a), 31)) * 31, 31, this.f188461e);
        String str = this.f188462f;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
