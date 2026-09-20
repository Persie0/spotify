package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class jlx implements klx {

    /* JADX INFO: renamed from: a */
    public final boolean f113697a;

    /* JADX INFO: renamed from: b */
    public final qsj f113698b;

    /* JADX INFO: renamed from: c */
    public final boolean f113699c;

    /* JADX INFO: renamed from: d */
    public final String f113700d;

    public jlx(boolean z, qsj qsjVar, boolean z2, String str) {
        this.f113697a = z;
        this.f113698b = qsjVar;
        this.f113699c = z2;
        this.f113700d = str;
    }

    @Override // p204p.klx
    /* JADX INFO: renamed from: a */
    public final boolean mo51048a() {
        return this.f113697a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m53729b() {
        return this.f113699c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jlx)) {
            return false;
        }
        jlx jlxVar = (jlx) obj;
        return this.f113697a == jlxVar.f113697a && this.f113698b == jlxVar.f113698b && this.f113699c == jlxVar.f113699c && wj50.m88271j(this.f113700d, jlxVar.f113700d);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(xl81.m91401j(this.f113698b, Boolean.hashCode(this.f113697a) * 31, 31), 31, this.f113699c);
        String str = this.f113700d;
        return iM77245d + (str == null ? 0 : str.hashCode());
    }

    public /* synthetic */ jlx(String str) {
        this(false, qsj.f192130d, true, str);
    }
}
