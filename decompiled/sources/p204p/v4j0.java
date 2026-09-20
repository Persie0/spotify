package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class v4j0 {

    /* JADX INFO: renamed from: a */
    public final String f237189a;

    /* JADX INFO: renamed from: b */
    public final String f237190b;

    /* JADX INFO: renamed from: c */
    public final String f237191c;

    /* JADX INFO: renamed from: d */
    public final String f237192d;

    /* JADX INFO: renamed from: e */
    public final boolean f237193e;

    /* JADX INFO: renamed from: f */
    public final String f237194f;

    /* JADX INFO: renamed from: g */
    public final v4j0 f237195g;

    public v4j0(String str, String str2, String str3, String str4, boolean z, String str5, v4j0 v4j0Var) {
        this.f237189a = str;
        this.f237190b = str2;
        this.f237191c = str3;
        this.f237192d = str4;
        this.f237193e = z;
        this.f237194f = str5;
        this.f237195g = v4j0Var;
    }

    /* JADX INFO: renamed from: a */
    public final String m84653a() {
        return this.f237190b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v4j0)) {
            return false;
        }
        v4j0 v4j0Var = (v4j0) obj;
        return wj50.m88271j(this.f237189a, v4j0Var.f237189a) && wj50.m88271j(this.f237190b, v4j0Var.f237190b) && wj50.m88271j(this.f237191c, v4j0Var.f237191c) && wj50.m88271j(this.f237192d, v4j0Var.f237192d) && this.f237193e == v4j0Var.f237193e && wj50.m88271j(this.f237194f, v4j0Var.f237194f) && wj50.m88271j(this.f237195g, v4j0Var.f237195g);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f237189a.hashCode() * 31, 31, this.f237190b), 31, this.f237191c);
        String str = this.f237192d;
        int iM77245d = s571.m77245d((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f237193e);
        String str2 = this.f237194f;
        int iHashCode = (iM77245d + (str2 == null ? 0 : str2.hashCode())) * 31;
        v4j0 v4j0Var = this.f237195g;
        return iHashCode + (v4j0Var != null ? v4j0Var.hashCode() : 0);
    }
}
