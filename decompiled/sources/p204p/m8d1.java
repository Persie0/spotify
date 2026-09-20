package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class m8d1 extends o8d1 {

    /* JADX INFO: renamed from: a */
    public final String f141025a;

    /* JADX INFO: renamed from: b */
    public final String f141026b;

    /* JADX INFO: renamed from: c */
    public final String f141027c;

    /* JADX INFO: renamed from: d */
    public final String f141028d;

    /* JADX INFO: renamed from: e */
    public final boolean f141029e;

    /* JADX INFO: renamed from: f */
    public final n6f f141030f;

    public m8d1(String str, String str2, String str3, String str4, boolean z, n6f n6fVar) {
        this.f141025a = str;
        this.f141026b = str2;
        this.f141027c = str3;
        this.f141028d = str4;
        this.f141029e = z;
        this.f141030f = n6fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m8d1)) {
            return false;
        }
        m8d1 m8d1Var = (m8d1) obj;
        return wj50.m88271j(this.f141025a, m8d1Var.f141025a) && wj50.m88271j(this.f141026b, m8d1Var.f141026b) && wj50.m88271j(this.f141027c, m8d1Var.f141027c) && wj50.m88271j(this.f141028d, m8d1Var.f141028d) && this.f141029e == m8d1Var.f141029e && wj50.m88271j(this.f141030f, m8d1Var.f141030f);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77243b(s571.m77243b(s571.m77243b(this.f141025a.hashCode() * 31, 31, this.f141026b), 31, this.f141027c), 31, this.f141028d), 31, this.f141029e);
        n6f n6fVar = this.f141030f;
        return iM77245d + (n6fVar == null ? 0 : Long.hashCode(n6fVar.f150873a));
    }
}
