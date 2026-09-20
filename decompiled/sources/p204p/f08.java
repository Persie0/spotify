package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class f08 {

    /* JADX INFO: renamed from: a */
    public h08 f64563a;

    /* JADX INFO: renamed from: b */
    public String f64564b;

    /* JADX INFO: renamed from: c */
    public String f64565c;

    /* JADX INFO: renamed from: d */
    public long f64566d;

    /* JADX INFO: renamed from: e */
    public byte f64567e;

    /* JADX INFO: renamed from: a */
    public final g08 m40440a() {
        h08 h08Var;
        String str;
        String str2;
        if (this.f64567e == 1 && (h08Var = this.f64563a) != null && (str = this.f64564b) != null && (str2 = this.f64565c) != null) {
            return new g08(h08Var, str, str2, this.f64566d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f64563a == null) {
            sb.append(" rolloutVariant");
        }
        if (this.f64564b == null) {
            sb.append(" parameterKey");
        }
        if (this.f64565c == null) {
            sb.append(" parameterValue");
        }
        if ((1 & this.f64567e) == 0) {
            sb.append(" templateVersion");
        }
        throw new IllegalStateException(edb.m38569r(sb, "Missing required properties:"));
    }

    /* JADX INFO: renamed from: b */
    public final void m40441b(String str) {
        if (str == null) {
            throw new NullPointerException("Null parameterKey");
        }
        this.f64564b = str;
    }

    /* JADX INFO: renamed from: c */
    public final void m40442c(String str) {
        if (str == null) {
            throw new NullPointerException("Null parameterValue");
        }
        this.f64565c = str;
    }

    /* JADX INFO: renamed from: d */
    public final void m40443d(long j) {
        this.f64566d = j;
        this.f64567e = (byte) (this.f64567e | 1);
    }
}
