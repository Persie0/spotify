package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class vh30 {

    /* JADX INFO: renamed from: a */
    public final String f241397a;

    /* JADX INFO: renamed from: b */
    public final String f241398b;

    /* JADX INFO: renamed from: c */
    public final String f241399c;

    /* JADX INFO: renamed from: d */
    public final String f241400d;

    /* JADX INFO: renamed from: e */
    public final String f241401e;

    public vh30(String str, String str2, String str3, String str4, String str5) {
        this.f241397a = str;
        this.f241398b = str2;
        this.f241399c = str3;
        this.f241400d = str4;
        this.f241401e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vh30)) {
            return false;
        }
        vh30 vh30Var = (vh30) obj;
        return wj50.m88271j(this.f241397a, vh30Var.f241397a) && wj50.m88271j(this.f241398b, vh30Var.f241398b) && wj50.m88271j(this.f241399c, vh30Var.f241399c) && wj50.m88271j(this.f241400d, vh30Var.f241400d) && wj50.m88271j(this.f241401e, vh30Var.f241401e);
    }

    public final int hashCode() {
        return this.f241401e.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(this.f241397a.hashCode() * 31, 31, this.f241398b), 31, this.f241399c), 31, this.f241400d);
    }
}
