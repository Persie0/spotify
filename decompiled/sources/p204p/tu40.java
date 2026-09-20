package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class tu40 implements vu40 {

    /* JADX INFO: renamed from: a */
    public final boolean f223761a;

    /* JADX INFO: renamed from: b */
    public final String f223762b;

    /* JADX INFO: renamed from: c */
    public final String f223763c;

    /* JADX INFO: renamed from: d */
    public final boolean f223764d;

    /* JADX INFO: renamed from: e */
    public final String f223765e;

    /* JADX INFO: renamed from: f */
    public final boolean f223766f;

    /* JADX INFO: renamed from: g */
    public final boolean f223767g;

    /* JADX INFO: renamed from: h */
    public final String f223768h;

    /* JADX INFO: renamed from: i */
    public final boolean f223769i;

    /* JADX INFO: renamed from: j */
    public final boolean f223770j;

    /* JADX INFO: renamed from: k */
    public final fb3 f223771k;

    public tu40(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f223761a = z;
        this.f223762b = str;
        this.f223763c = str2;
        this.f223764d = z2;
        this.f223765e = str3;
        this.f223766f = z3;
        this.f223767g = z4;
        this.f223768h = str4;
        this.f223769i = z5;
        this.f223770j = z6;
        String strMo81549c = mo81549c();
        this.f223771k = new fb3(str, str3, strMo81549c == null ? getUri() : strMo81549c, z2, z, z3);
    }

    @Override // p204p.vu40
    /* JADX INFO: renamed from: a */
    public final boolean mo81548a() {
        return this.f223764d;
    }

    @Override // p204p.vu40
    /* JADX INFO: renamed from: c */
    public final String mo81549c() {
        return this.f223768h;
    }

    @Override // p204p.vu40
    /* JADX INFO: renamed from: d */
    public final boolean mo81550d() {
        return this.f223767g;
    }

    @Override // p204p.vu40
    /* JADX INFO: renamed from: e */
    public final boolean mo81551e() {
        return this.f223770j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tu40)) {
            return false;
        }
        tu40 tu40Var = (tu40) obj;
        return this.f223761a == tu40Var.f223761a && wj50.m88271j(this.f223762b, tu40Var.f223762b) && wj50.m88271j(this.f223763c, tu40Var.f223763c) && this.f223764d == tu40Var.f223764d && wj50.m88271j(this.f223765e, tu40Var.f223765e) && this.f223766f == tu40Var.f223766f && this.f223767g == tu40Var.f223767g && wj50.m88271j(this.f223768h, tu40Var.f223768h) && this.f223769i == tu40Var.f223769i && this.f223770j == tu40Var.f223770j;
    }

    @Override // p204p.vu40
    /* JADX INFO: renamed from: f */
    public final boolean mo81552f() {
        return this.f223769i;
    }

    @Override // p204p.vu40
    /* JADX INFO: renamed from: g */
    public final boolean mo81553g() {
        return this.f223766f;
    }

    @Override // p204p.vu40
    public final String getContextUri() {
        return this.f223765e;
    }

    @Override // p204p.vu40
    public final String getUid() {
        return this.f223763c;
    }

    @Override // p204p.vu40
    public final String getUri() {
        return this.f223762b;
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77243b(s571.m77245d(s571.m77243b(s571.m77243b(Boolean.hashCode(this.f223761a) * 31, 31, this.f223762b), 31, this.f223763c), 31, this.f223764d), 31, this.f223765e), 31, this.f223766f), 31, this.f223767g);
        String str = this.f223768h;
        return Boolean.hashCode(this.f223770j) + s571.m77245d((iM77245d + (str == null ? 0 : str.hashCode())) * 31, 31, this.f223769i);
    }

    public /* synthetic */ tu40(boolean z, String str, String str2, boolean z2, String str3, boolean z3, boolean z4, String str4, int i) {
        this(str, str2, str3, (i & 128) != 0 ? null : str4, z, z2, (i & 32) != 0 ? false : z3, (i & 64) != 0 ? false : z4, false, false);
    }
}
