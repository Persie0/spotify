package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class yz7 {

    /* JADX INFO: renamed from: a */
    public long f277714a;

    /* JADX INFO: renamed from: b */
    public String f277715b;

    /* JADX INFO: renamed from: c */
    public String f277716c;

    /* JADX INFO: renamed from: d */
    public long f277717d;

    /* JADX INFO: renamed from: e */
    public int f277718e;

    /* JADX INFO: renamed from: f */
    public byte f277719f;

    /* JADX INFO: renamed from: a */
    public final zz7 m94965a() {
        String str;
        if (this.f277719f == 7 && (str = this.f277715b) != null) {
            return new zz7(this.f277714a, str, this.f277716c, this.f277717d, this.f277718e);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f277719f & 1) == 0) {
            sb.append(" pc");
        }
        if (this.f277715b == null) {
            sb.append(" symbol");
        }
        if ((this.f277719f & 2) == 0) {
            sb.append(" offset");
        }
        if ((this.f277719f & 4) == 0) {
            sb.append(" importance");
        }
        throw new IllegalStateException(edb.m38569r(sb, "Missing required properties:"));
    }

    /* JADX INFO: renamed from: b */
    public final void m94966b(String str) {
        this.f277716c = str;
    }

    /* JADX INFO: renamed from: c */
    public final void m94967c(int i) {
        this.f277718e = i;
        this.f277719f = (byte) (this.f277719f | 4);
    }

    /* JADX INFO: renamed from: d */
    public final void m94968d(long j) {
        this.f277717d = j;
        this.f277719f = (byte) (this.f277719f | 2);
    }

    /* JADX INFO: renamed from: e */
    public final void m94969e(long j) {
        this.f277714a = j;
        this.f277719f = (byte) (this.f277719f | 1);
    }

    /* JADX INFO: renamed from: f */
    public final void m94970f(String str) {
        if (str == null) {
            throw new NullPointerException("Null symbol");
        }
        this.f277715b = str;
    }
}
