package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class b5f {

    /* JADX INFO: renamed from: a */
    public final String f23569a;

    /* JADX INFO: renamed from: b */
    public final int f23570b;

    /* JADX INFO: renamed from: c */
    public final boolean f23571c;

    /* JADX INFO: renamed from: d */
    public final qf40 f23572d;

    /* JADX INFO: renamed from: e */
    public final boolean f23573e;

    /* JADX INFO: renamed from: f */
    public final String f23574f;

    /* JADX INFO: renamed from: g */
    public final String f23575g;

    /* JADX INFO: renamed from: h */
    public final z4f f23576h;

    public b5f(int i, String str, String str2, String str3, z4f z4fVar, qf40 qf40Var, boolean z, boolean z2) {
        this.f23569a = str;
        this.f23570b = i;
        this.f23571c = z;
        this.f23572d = qf40Var;
        this.f23573e = z2;
        this.f23574f = str2;
        this.f23575g = str3;
        this.f23576h = z4fVar;
    }

    /* JADX INFO: renamed from: a */
    public static b5f m28170a(b5f b5fVar, boolean z, qf40 qf40Var, boolean z2, String str, z4f z4fVar, int i) {
        String str2 = b5fVar.f23569a;
        int i2 = b5fVar.f23570b;
        b5fVar.getClass();
        b5fVar.getClass();
        b5fVar.getClass();
        b5fVar.getClass();
        if ((i & 64) != 0) {
            z = b5fVar.f23571c;
        }
        boolean z3 = z;
        b5fVar.getClass();
        if ((i & 256) != 0) {
            qf40Var = b5fVar.f23572d;
        }
        qf40 qf40Var2 = qf40Var;
        if ((i & 512) != 0) {
            z2 = b5fVar.f23573e;
        }
        boolean z4 = z2;
        b5fVar.getClass();
        String str3 = b5fVar.f23574f;
        if ((i & 4096) != 0) {
            str = b5fVar.f23575g;
        }
        b5fVar.getClass();
        return new b5f(i2, str2, str3, str, z4fVar, qf40Var2, z3, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b5f)) {
            return false;
        }
        b5f b5fVar = (b5f) obj;
        return wj50.m88271j(this.f23569a, b5fVar.f23569a) && this.f23570b == b5fVar.f23570b && this.f23571c == b5fVar.f23571c && wj50.m88271j(this.f23572d, b5fVar.f23572d) && this.f23573e == b5fVar.f23573e && this.f23574f.equals(b5fVar.f23574f) && wj50.m88271j(this.f23575g, b5fVar.f23575g) && this.f23576h == b5fVar.f23576h;
    }

    public final int hashCode() {
        return this.f23576h.hashCode() + s571.m77243b(s571.m77243b(s571.m77245d(s571.m77245d(fr0.m42461e(this.f23572d, s571.m77245d(s571.m77245d(f710.m40938f(this.f23570b, this.f23569a.hashCode() * 31, 923521), 31, false), 961, this.f23571c), 31), 31, this.f23573e), 31, false), 31, this.f23574f), 31, this.f23575g);
    }
}
