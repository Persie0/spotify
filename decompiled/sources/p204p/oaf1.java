package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class oaf1 {

    /* JADX INFO: renamed from: a */
    public String f163323a;

    /* JADX INFO: renamed from: b */
    public long f163324b;

    /* JADX INFO: renamed from: c */
    public byte f163325c;

    /* JADX INFO: renamed from: a */
    public final void m66548a(String str) {
        if (str == null) {
            throw new NullPointerException("Null queueId");
        }
        this.f163323a = str;
    }

    /* JADX INFO: renamed from: b */
    public final void m66549b(long j) {
        this.f163324b = j;
        this.f163325c = (byte) 1;
    }

    /* JADX INFO: renamed from: c */
    public final dcf1 m66550c() {
        String str;
        if (this.f163325c == 1 && (str = this.f163323a) != null) {
            return new dcf1(str, this.f163324b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f163323a == null) {
            sb.append(" queueId");
        }
        if (this.f163325c == 0) {
            sb.append(" queueVersion");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
