package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class xe30 {

    /* JADX INFO: renamed from: a */
    public final le30 f260622a;

    /* JADX INFO: renamed from: b */
    public final boolean f260623b;

    /* JADX INFO: renamed from: c */
    public final boolean f260624c;

    /* JADX INFO: renamed from: d */
    public final int f260625d;

    public /* synthetic */ xe30(le30 le30Var) {
        this(le30Var, false, false, -1);
    }

    /* JADX INFO: renamed from: a */
    public static xe30 m90432a(xe30 xe30Var, int i, int i2) {
        le30 le30Var = xe30Var.f260622a;
        boolean z = (i2 & 2) != 0 ? xe30Var.f260623b : true;
        boolean z2 = (i2 & 4) != 0 ? xe30Var.f260624c : true;
        if ((i2 & 8) != 0) {
            i = xe30Var.f260625d;
        }
        xe30Var.getClass();
        return new xe30(le30Var, z, z2, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xe30)) {
            return false;
        }
        xe30 xe30Var = (xe30) obj;
        return wj50.m88271j(this.f260622a, xe30Var.f260622a) && this.f260623b == xe30Var.f260623b && this.f260624c == xe30Var.f260624c && this.f260625d == xe30Var.f260625d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f260625d) + s571.m77245d(s571.m77245d(this.f260622a.hashCode() * 31, 31, this.f260623b), 31, this.f260624c);
    }

    public xe30(le30 le30Var, boolean z, boolean z2, int i) {
        this.f260622a = le30Var;
        this.f260623b = z;
        this.f260624c = z2;
        this.f260625d = i;
    }
}
