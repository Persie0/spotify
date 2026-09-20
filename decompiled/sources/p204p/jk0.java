package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class jk0 {

    /* JADX INFO: renamed from: a */
    public final int f113132a;

    /* JADX INFO: renamed from: b */
    public final String f113133b;

    /* JADX INFO: renamed from: c */
    public final String f113134c;

    /* JADX INFO: renamed from: d */
    public final Boolean f113135d;

    /* JADX INFO: renamed from: e */
    public final Boolean f113136e;

    /* JADX INFO: renamed from: f */
    public final tdu f113137f;

    public jk0(int i, String str, String str2, Boolean bool, Boolean bool2, tdu tduVar) {
        this.f113132a = i;
        this.f113133b = str;
        this.f113134c = str2;
        this.f113135d = bool;
        this.f113136e = bool2;
        this.f113137f = tduVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jk0)) {
            return false;
        }
        jk0 jk0Var = (jk0) obj;
        return this.f113132a == jk0Var.f113132a && wj50.m88271j(this.f113133b, jk0Var.f113133b) && wj50.m88271j(this.f113134c, jk0Var.f113134c) && wj50.m88271j(this.f113135d, jk0Var.f113135d) && wj50.m88271j(this.f113136e, jk0Var.f113136e) && this.f113137f.equals(jk0Var.f113137f);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(edb.m38547C(this.f113132a) * 31, 31, this.f113133b), 31, this.f113134c);
        Boolean bool = this.f113135d;
        int iHashCode = (iM77243b + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f113136e;
        return this.f113137f.hashCode() + ((iHashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31);
    }
}
