package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class y6c {

    /* JADX INFO: renamed from: a */
    public final String f269722a;

    /* JADX INFO: renamed from: b */
    public final String f269723b;

    /* JADX INFO: renamed from: c */
    public final qf40 f269724c;

    /* JADX INFO: renamed from: d */
    public final String f269725d;

    public y6c(String str, String str2, String str3, qf40 qf40Var) {
        this.f269722a = str;
        this.f269723b = str2;
        this.f269724c = qf40Var;
        this.f269725d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y6c)) {
            return false;
        }
        y6c y6cVar = (y6c) obj;
        return wj50.m88271j(this.f269722a, y6cVar.f269722a) && wj50.m88271j(this.f269723b, y6cVar.f269723b) && wj50.m88271j(this.f269724c, y6cVar.f269724c) && wj50.m88271j(this.f269725d, y6cVar.f269725d);
    }

    public final int hashCode() {
        int iM42461e = fr0.m42461e(this.f269724c, s571.m77243b(this.f269722a.hashCode() * 31, 31, this.f269723b), 31);
        String str = this.f269725d;
        return iM42461e + (str == null ? 0 : str.hashCode());
    }
}
