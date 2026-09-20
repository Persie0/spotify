package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class qz7 {

    /* JADX INFO: renamed from: a */
    public long f194133a;

    /* JADX INFO: renamed from: b */
    public long f194134b;

    /* JADX INFO: renamed from: c */
    public String f194135c;

    /* JADX INFO: renamed from: d */
    public String f194136d;

    /* JADX INFO: renamed from: e */
    public byte f194137e;

    /* JADX INFO: renamed from: a */
    public final rz7 m74287a() {
        String str;
        if (this.f194137e == 3 && (str = this.f194135c) != null) {
            return new rz7(str, this.f194133a, this.f194134b, this.f194136d);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f194137e & 1) == 0) {
            sb.append(" baseAddress");
        }
        if ((this.f194137e & 2) == 0) {
            sb.append(" size");
        }
        if (this.f194135c == null) {
            sb.append(" name");
        }
        throw new IllegalStateException(edb.m38569r(sb, "Missing required properties:"));
    }

    /* JADX INFO: renamed from: b */
    public final void m74288b(long j) {
        this.f194133a = j;
        this.f194137e = (byte) (this.f194137e | 1);
    }

    /* JADX INFO: renamed from: c */
    public final void m74289c(String str) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f194135c = str;
    }

    /* JADX INFO: renamed from: d */
    public final void m74290d(long j) {
        this.f194134b = j;
        this.f194137e = (byte) (this.f194137e | 2);
    }

    /* JADX INFO: renamed from: e */
    public final void m74291e(String str) {
        this.f194136d = str;
    }
}
