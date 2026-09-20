package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class e9r0 extends g9r0 {

    /* JADX INFO: renamed from: a */
    public final String f57517a;

    /* JADX INFO: renamed from: b */
    public final String f57518b;

    /* JADX INFO: renamed from: c */
    public final boolean f57519c;

    /* JADX INFO: renamed from: d */
    public final boolean f57520d;

    /* JADX INFO: renamed from: e */
    public final long f57521e;

    /* JADX INFO: renamed from: f */
    public final long f57522f;

    /* JADX INFO: renamed from: g */
    public final boolean f57523g;

    /* JADX INFO: renamed from: h */
    public final long f57524h;

    /* JADX INFO: renamed from: i */
    public final boolean f57525i;

    /* JADX INFO: renamed from: j */
    public final boolean f57526j;

    /* JADX INFO: renamed from: k */
    public final qsj f57527k;

    public e9r0(String str, String str2, boolean z, boolean z2, long j, long j2, boolean z3, long j3, boolean z4, boolean z5, qsj qsjVar) {
        this.f57517a = str;
        this.f57518b = str2;
        this.f57519c = z;
        this.f57520d = z2;
        this.f57521e = j;
        this.f57522f = j2;
        this.f57523g = z3;
        this.f57524h = j3;
        this.f57525i = z4;
        this.f57526j = z5;
        this.f57527k = qsjVar;
    }

    @Override // p204p.g9r0
    /* JADX INFO: renamed from: a */
    public final String mo25163a() {
        return this.f57518b;
    }

    @Override // p204p.g9r0
    /* JADX INFO: renamed from: b */
    public final boolean mo25164b() {
        return this.f57520d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e9r0)) {
            return false;
        }
        e9r0 e9r0Var = (e9r0) obj;
        return wj50.m88271j(this.f57517a, e9r0Var.f57517a) && wj50.m88271j(this.f57518b, e9r0Var.f57518b) && this.f57519c == e9r0Var.f57519c && this.f57520d == e9r0Var.f57520d && this.f57521e == e9r0Var.f57521e && this.f57522f == e9r0Var.f57522f && this.f57523g == e9r0Var.f57523g && this.f57524h == e9r0Var.f57524h && this.f57525i == e9r0Var.f57525i && this.f57526j == e9r0Var.f57526j && this.f57527k == e9r0Var.f57527k;
    }

    public final int hashCode() {
        return this.f57527k.hashCode() + s571.m77245d(s571.m77245d(dq60.m36605e(s571.m77245d(dq60.m36605e(dq60.m36605e(s571.m77245d(s571.m77245d(s571.m77243b(this.f57517a.hashCode() * 31, 31, this.f57518b), 31, this.f57519c), 31, this.f57520d), this.f57521e, 31), this.f57522f, 31), 31, this.f57523g), this.f57524h, 31), 31, this.f57525i), 31, this.f57526j);
    }
}
