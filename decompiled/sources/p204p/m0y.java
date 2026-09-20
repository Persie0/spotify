package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class m0y {

    /* JADX INFO: renamed from: a */
    public final String f138773a;

    /* JADX INFO: renamed from: b */
    public final int f138774b;

    /* JADX INFO: renamed from: c */
    public final String f138775c;

    public m0y(String str, int i, String str2) {
        this.f138773a = str;
        this.f138774b = i;
        this.f138775c = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m60479a() {
        return this.f138773a;
    }

    /* JADX INFO: renamed from: b */
    public final int m60480b() {
        return this.f138774b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0y)) {
            return false;
        }
        m0y m0yVar = (m0y) obj;
        return wj50.m88271j(this.f138773a, m0yVar.f138773a) && this.f138774b == m0yVar.f138774b && wj50.m88271j(this.f138775c, m0yVar.f138775c);
    }

    public final int hashCode() {
        int iM62800g = mt60.m62800g(this.f138774b, this.f138773a.hashCode() * 31, 31);
        String str = this.f138775c;
        return iM62800g + (str == null ? 0 : str.hashCode());
    }

    public /* synthetic */ m0y(String str, int i) {
        this(str, i, null);
    }
}
