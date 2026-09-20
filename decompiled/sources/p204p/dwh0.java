package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class dwh0 {

    /* JADX INFO: renamed from: a */
    public final String f53699a;

    /* JADX INFO: renamed from: b */
    public final String f53700b;

    /* JADX INFO: renamed from: c */
    public final String f53701c;

    /* JADX INFO: renamed from: d */
    public final String f53702d;

    /* JADX INFO: renamed from: e */
    public final boolean f53703e;

    /* JADX INFO: renamed from: f */
    public final wwu f53704f;

    /* JADX INFO: renamed from: g */
    public final int f53705g;

    public dwh0(String str, String str2, String str3, String str4, boolean z, wwu wwuVar, int i) {
        this.f53699a = str;
        this.f53700b = str2;
        this.f53701c = str3;
        this.f53702d = str4;
        this.f53703e = z;
        this.f53704f = wwuVar;
        this.f53705g = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dwh0)) {
            return false;
        }
        dwh0 dwh0Var = (dwh0) obj;
        return wj50.m88271j(this.f53699a, dwh0Var.f53699a) && this.f53700b.equals(dwh0Var.f53700b) && wj50.m88271j(this.f53701c, dwh0Var.f53701c) && wj50.m88271j(this.f53702d, dwh0Var.f53702d) && this.f53703e == dwh0Var.f53703e && wj50.m88271j(this.f53704f, dwh0Var.f53704f) && this.f53705g == dwh0Var.f53705g;
    }

    public final int hashCode() {
        return edb.m38547C(this.f53705g) + ((this.f53704f.hashCode() + s571.m77245d(s571.m77243b(s571.m77243b(s571.m77243b(this.f53699a.hashCode() * 31, 31, this.f53700b), 31, this.f53701c), 31, this.f53702d), 31, this.f53703e)) * 31);
    }
}
