package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class uz7 {

    /* JADX INFO: renamed from: a */
    public String f235434a;

    /* JADX INFO: renamed from: b */
    public String f235435b;

    /* JADX INFO: renamed from: c */
    public long f235436c;

    /* JADX INFO: renamed from: d */
    public byte f235437d;

    /* JADX INFO: renamed from: a */
    public final vz7 m84284a() {
        String str;
        String str2;
        if (this.f235437d == 1 && (str = this.f235434a) != null && (str2 = this.f235435b) != null) {
            return new vz7(str, str2, this.f235436c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f235434a == null) {
            sb.append(" name");
        }
        if (this.f235435b == null) {
            sb.append(" code");
        }
        if ((1 & this.f235437d) == 0) {
            sb.append(" address");
        }
        throw new IllegalStateException(edb.m38569r(sb, "Missing required properties:"));
    }

    /* JADX INFO: renamed from: b */
    public final void m84285b(long j) {
        this.f235436c = j;
        this.f235437d = (byte) (this.f235437d | 1);
    }

    /* JADX INFO: renamed from: c */
    public final void m84286c(String str) {
        if (str == null) {
            throw new NullPointerException("Null code");
        }
        this.f235435b = str;
    }

    /* JADX INFO: renamed from: d */
    public final void m84287d(String str) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f235434a = str;
    }
}
