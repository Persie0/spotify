package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class fyd0 {

    /* JADX INFO: renamed from: a */
    public final String f74703a;

    /* JADX INFO: renamed from: b */
    public final int f74704b;

    /* JADX INFO: renamed from: c */
    public final int f74705c;

    /* JADX INFO: renamed from: d */
    public final String f74706d;

    /* JADX INFO: renamed from: e */
    public final int f74707e;

    /* JADX INFO: renamed from: f */
    public final int f74708f;

    public fyd0(int i, int i2, int i3, int i4, String str, String str2) {
        this.f74703a = str;
        this.f74704b = i;
        this.f74705c = i2;
        this.f74706d = str2;
        this.f74707e = i3;
        this.f74708f = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fyd0)) {
            return false;
        }
        fyd0 fyd0Var = (fyd0) obj;
        return wj50.m88271j(this.f74703a, fyd0Var.f74703a) && this.f74704b == fyd0Var.f74704b && this.f74705c == fyd0Var.f74705c && wj50.m88271j(this.f74706d, fyd0Var.f74706d) && this.f74707e == fyd0Var.f74707e && this.f74708f == fyd0Var.f74708f;
    }

    public final int hashCode() {
        int iM62800g = mt60.m62800g(this.f74705c, mt60.m62800g(this.f74704b, this.f74703a.hashCode() * 31, 31), 31);
        String str = this.f74706d;
        return Integer.hashCode(this.f74708f) + mt60.m62800g(this.f74707e, (iM62800g + (str == null ? 0 : str.hashCode())) * 31, 31);
    }
}
