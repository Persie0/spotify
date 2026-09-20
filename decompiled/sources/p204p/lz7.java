package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class lz7 {

    /* JADX INFO: renamed from: a */
    public long f138273a;

    /* JADX INFO: renamed from: b */
    public String f138274b;

    /* JADX INFO: renamed from: c */
    public w3l f138275c;

    /* JADX INFO: renamed from: d */
    public x3l f138276d;

    /* JADX INFO: renamed from: e */
    public y3l f138277e;

    /* JADX INFO: renamed from: f */
    public b4l f138278f;

    /* JADX INFO: renamed from: g */
    public byte f138279g;

    public lz7() {
    }

    /* JADX INFO: renamed from: a */
    public final mz7 m60286a() {
        String str;
        w3l w3lVar;
        x3l x3lVar;
        if (this.f138279g == 1 && (str = this.f138274b) != null && (w3lVar = this.f138275c) != null && (x3lVar = this.f138276d) != null) {
            return new mz7(this.f138273a, str, w3lVar, x3lVar, this.f138277e, this.f138278f);
        }
        StringBuilder sb = new StringBuilder();
        if ((1 & this.f138279g) == 0) {
            sb.append(" timestamp");
        }
        if (this.f138274b == null) {
            sb.append(" type");
        }
        if (this.f138275c == null) {
            sb.append(" app");
        }
        if (this.f138276d == null) {
            sb.append(" device");
        }
        throw new IllegalStateException(edb.m38569r(sb, "Missing required properties:"));
    }

    /* JADX INFO: renamed from: b */
    public final void m60287b(oz7 oz7Var) {
        this.f138275c = oz7Var;
    }

    /* JADX INFO: renamed from: c */
    public final void m60288c(d08 d08Var) {
        this.f138276d = d08Var;
    }

    /* JADX INFO: renamed from: d */
    public final void m60289d(e08 e08Var) {
        this.f138277e = e08Var;
    }

    /* JADX INFO: renamed from: e */
    public final void m60290e(j08 j08Var) {
        this.f138278f = j08Var;
    }

    /* JADX INFO: renamed from: f */
    public final void m60291f(long j) {
        this.f138273a = j;
        this.f138279g = (byte) (this.f138279g | 1);
    }

    /* JADX INFO: renamed from: g */
    public final void m60292g(String str) {
        if (str == null) {
            throw new NullPointerException("Null type");
        }
        this.f138274b = str;
    }

    public lz7(mz7 mz7Var) {
        this.f138273a = mz7Var.f148631a;
        this.f138274b = mz7Var.f148632b;
        this.f138275c = mz7Var.f148633c;
        this.f138276d = mz7Var.f148634d;
        this.f138277e = mz7Var.f148635e;
        this.f138278f = mz7Var.f148636f;
        this.f138279g = (byte) 1;
    }
}
