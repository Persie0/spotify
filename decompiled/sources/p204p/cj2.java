package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class cj2 {

    /* JADX INFO: renamed from: a */
    public final String f38480a;

    /* JADX INFO: renamed from: b */
    public final dl2 f38481b;

    /* JADX INFO: renamed from: c */
    public final String f38482c;

    public cj2(String str, dl2 dl2Var, String str2) {
        this.f38480a = str;
        this.f38481b = dl2Var;
        this.f38482c = str2;
    }

    /* JADX INFO: renamed from: a */
    public final dl2 m32912a() {
        return this.f38481b;
    }

    /* JADX INFO: renamed from: b */
    public final String m32913b() {
        return this.f38482c;
    }

    /* JADX INFO: renamed from: c */
    public final String m32914c() {
        return this.f38480a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cj2)) {
            return false;
        }
        cj2 cj2Var = (cj2) obj;
        return wj50.m88271j(this.f38480a, cj2Var.f38480a) && wj50.m88271j(this.f38481b, cj2Var.f38481b) && wj50.m88271j(this.f38482c, cj2Var.f38482c);
    }

    public final int hashCode() {
        int iHashCode = this.f38480a.hashCode() * 31;
        dl2 dl2Var = this.f38481b;
        int iHashCode2 = (iHashCode + (dl2Var == null ? 0 : dl2Var.hashCode())) * 31;
        String str = this.f38482c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
