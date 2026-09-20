package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class lal {

    /* JADX INFO: renamed from: a */
    public final String f131370a;

    /* JADX INFO: renamed from: b */
    public final String f131371b;

    /* JADX INFO: renamed from: c */
    public final String f131372c;

    /* JADX INFO: renamed from: d */
    public final ae50 f131373d;

    public lal(String str, String str2, String str3, ae50 ae50Var) {
        this.f131370a = str;
        this.f131371b = str2;
        this.f131372c = str3;
        this.f131373d = ae50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lal)) {
            return false;
        }
        lal lalVar = (lal) obj;
        return this.f131370a.equals(lalVar.f131370a) && this.f131371b.equals(lalVar.f131371b) && this.f131372c.equals(lalVar.f131372c) && this.f131373d.equals(lalVar.f131373d);
    }

    public final int hashCode() {
        return this.f131373d.hashCode() + s571.m77243b(s571.m77243b(this.f131370a.hashCode() * 31, 31, this.f131371b), 31, this.f131372c);
    }
}
