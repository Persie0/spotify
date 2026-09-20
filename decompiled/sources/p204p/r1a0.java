package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class r1a0 implements s1a0 {

    /* JADX INFO: renamed from: a */
    public final s7f f194813a;

    /* JADX INFO: renamed from: b */
    public final String f194814b;

    /* JADX INFO: renamed from: c */
    public final String f194815c;

    /* JADX INFO: renamed from: d */
    public final String f194816d;

    public r1a0(String str, String str2, String str3, s7f s7fVar) {
        this.f194813a = s7fVar;
        this.f194814b = str;
        this.f194815c = str2;
        this.f194816d = str3;
    }

    /* JADX INFO: renamed from: a */
    public static r1a0 m74472a(r1a0 r1a0Var) {
        s7f s7fVar = r1a0Var.f194813a;
        String str = r1a0Var.f194814b;
        String str2 = r1a0Var.f194815c;
        r1a0Var.getClass();
        return new r1a0(str, str2, null, s7fVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1a0)) {
            return false;
        }
        r1a0 r1a0Var = (r1a0) obj;
        return wj50.m88271j(this.f194813a, r1a0Var.f194813a) && wj50.m88271j(this.f194814b, r1a0Var.f194814b) && wj50.m88271j(this.f194815c, r1a0Var.f194815c) && wj50.m88271j(this.f194816d, r1a0Var.f194816d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f194813a.hashCode() * 31, 31, this.f194814b), 31, this.f194815c);
        String str = this.f194816d;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
