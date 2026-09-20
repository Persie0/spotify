package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class pd10 {

    /* JADX INFO: renamed from: a */
    public final String f176323a;

    /* JADX INFO: renamed from: b */
    public final String f176324b;

    /* JADX INFO: renamed from: c */
    public final String f176325c;

    /* JADX INFO: renamed from: d */
    public final String f176326d;

    /* JADX INFO: renamed from: e */
    public final String f176327e;

    public pd10(String str, String str2, String str3, String str4, String str5) {
        this.f176323a = str;
        this.f176324b = str2;
        this.f176325c = str3;
        this.f176326d = str4;
        this.f176327e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pd10)) {
            return false;
        }
        pd10 pd10Var = (pd10) obj;
        return wj50.m88271j(this.f176323a, pd10Var.f176323a) && wj50.m88271j(this.f176324b, pd10Var.f176324b) && wj50.m88271j(this.f176325c, pd10Var.f176325c) && wj50.m88271j(this.f176326d, pd10Var.f176326d) && wj50.m88271j(this.f176327e, pd10Var.f176327e);
    }

    public final int hashCode() {
        return this.f176327e.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(this.f176323a.hashCode() * 31, 31, this.f176324b), 31, this.f176325c), 31, this.f176326d);
    }
}
