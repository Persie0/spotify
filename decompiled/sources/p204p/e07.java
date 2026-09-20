package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class e07 {

    /* JADX INFO: renamed from: a */
    public final String f54886a;

    /* JADX INFO: renamed from: b */
    public final String f54887b;

    /* JADX INFO: renamed from: c */
    public final boolean f54888c;

    /* JADX INFO: renamed from: d */
    public final nzl0 f54889d;

    /* JADX INFO: renamed from: e */
    public final fu6 f54890e;

    public e07(String str, String str2, boolean z, nzl0 nzl0Var, fu6 fu6Var) {
        this.f54886a = str;
        this.f54887b = str2;
        this.f54888c = z;
        this.f54889d = nzl0Var;
        this.f54890e = fu6Var;
    }

    /* JADX INFO: renamed from: a */
    public static e07 m37479a(e07 e07Var, boolean z) {
        String str = e07Var.f54886a;
        String str2 = e07Var.f54887b;
        nzl0 nzl0Var = e07Var.f54889d;
        fu6 fu6Var = e07Var.f54890e;
        e07Var.getClass();
        return new e07(str, str2, z, nzl0Var, fu6Var);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m37480b() {
        return this.f54889d == nzl0.BUILT_IN_SPEAKER;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e07)) {
            return false;
        }
        e07 e07Var = (e07) obj;
        return wj50.m88271j(this.f54886a, e07Var.f54886a) && wj50.m88271j(this.f54887b, e07Var.f54887b) && this.f54888c == e07Var.f54888c && this.f54889d == e07Var.f54889d && wj50.m88271j(this.f54890e, e07Var.f54890e);
    }

    public final int hashCode() {
        int iHashCode = (this.f54889d.hashCode() + s571.m77245d(s571.m77243b(this.f54886a.hashCode() * 31, 31, this.f54887b), 31, this.f54888c)) * 31;
        fu6 fu6Var = this.f54890e;
        return iHashCode + (fu6Var == null ? 0 : fu6Var.hashCode());
    }
}
