package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class vma1 implements xma1 {

    /* JADX INFO: renamed from: a */
    public final long f242743a;

    /* JADX INFO: renamed from: b */
    public final String f242744b;

    /* JADX INFO: renamed from: c */
    public final oma1 f242745c;

    /* JADX INFO: renamed from: d */
    public final boolean f242746d;

    /* JADX INFO: renamed from: e */
    public final String f242747e;

    /* JADX INFO: renamed from: f */
    public final String f242748f;

    /* JADX INFO: renamed from: g */
    public final String f242749g;

    /* JADX INFO: renamed from: h */
    public final List f242750h;

    public vma1(long j, String str, oma1 oma1Var, boolean z, String str2, String str3, String str4, List list) {
        this.f242743a = j;
        this.f242744b = str;
        this.f242745c = oma1Var;
        this.f242746d = z;
        this.f242747e = str2;
        this.f242748f = str3;
        this.f242749g = str4;
        this.f242750h = list;
    }

    /* JADX INFO: renamed from: b */
    public static vma1 m85989b(vma1 vma1Var, long j, String str, oma1 oma1Var, boolean z, String str2, String str3, String str4, List list, int i) {
        if ((i & 1) != 0) {
            j = vma1Var.f242743a;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = vma1Var.f242744b;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            oma1Var = vma1Var.f242745c;
        }
        oma1 oma1Var2 = oma1Var;
        if ((i & 8) != 0) {
            z = vma1Var.f242746d;
        }
        boolean z2 = z;
        String str6 = (i & 16) != 0 ? vma1Var.f242747e : str2;
        String str7 = (i & 32) != 0 ? vma1Var.f242748f : str3;
        String str8 = (i & 64) != 0 ? vma1Var.f242749g : str4;
        List list2 = (i & 128) != 0 ? vma1Var.f242750h : list;
        vma1Var.getClass();
        return new vma1(j2, str5, oma1Var2, z2, str6, str7, str8, list2);
    }

    @Override // p204p.xma1
    /* JADX INFO: renamed from: a */
    public final oma1 mo83428a() {
        return this.f242745c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vma1)) {
            return false;
        }
        vma1 vma1Var = (vma1) obj;
        return this.f242743a == vma1Var.f242743a && wj50.m88271j(this.f242744b, vma1Var.f242744b) && wj50.m88271j(this.f242745c, vma1Var.f242745c) && this.f242746d == vma1Var.f242746d && wj50.m88271j(this.f242747e, vma1Var.f242747e) && wj50.m88271j(this.f242748f, vma1Var.f242748f) && wj50.m88271j(this.f242749g, vma1Var.f242749g) && wj50.m88271j(this.f242750h, vma1Var.f242750h);
    }

    @Override // p204p.xma1
    public final String getEntityUri() {
        return this.f242744b;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77245d((this.f242745c.hashCode() + s571.m77243b(Long.hashCode(this.f242743a) * 31, 31, this.f242744b)) * 31, 31, this.f242746d), 31, this.f242747e);
        String str = this.f242748f;
        return this.f242750h.hashCode() + s571.m77243b((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f242749g);
    }
}
