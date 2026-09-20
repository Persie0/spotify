package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class l1r {

    /* JADX INFO: renamed from: a */
    public final String f128771a;

    /* JADX INFO: renamed from: b */
    public final String f128772b;

    /* JADX INFO: renamed from: c */
    public final String f128773c;

    /* JADX INFO: renamed from: d */
    public final jiu f128774d;

    public l1r(String str, String str2, String str3, jiu jiuVar) {
        this.f128771a = str;
        this.f128772b = str2;
        this.f128773c = str3;
        this.f128774d = jiuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1r)) {
            return false;
        }
        l1r l1rVar = (l1r) obj;
        return wj50.m88271j(this.f128771a, l1rVar.f128771a) && wj50.m88271j(this.f128772b, l1rVar.f128772b) && wj50.m88271j(this.f128773c, l1rVar.f128773c) && wj50.m88271j(this.f128774d, l1rVar.f128774d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f128771a.hashCode() * 31, 31, this.f128772b), 31, this.f128773c);
        jiu jiuVar = this.f128774d;
        return iM77243b + (jiuVar == null ? 0 : jiuVar.hashCode());
    }
}
