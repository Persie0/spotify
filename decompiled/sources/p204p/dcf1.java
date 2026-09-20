package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class dcf1 {

    /* JADX INFO: renamed from: a */
    public final String f47549a;

    /* JADX INFO: renamed from: b */
    public final long f47550b;

    public dcf1(String str, long j) {
        this.f47549a = str;
        this.f47550b = j;
    }

    /* JADX INFO: renamed from: a */
    public static oaf1 m35650a() {
        return new oaf1();
    }

    /* JADX INFO: renamed from: b */
    public final String m35651b() {
        return this.f47549a;
    }

    /* JADX INFO: renamed from: c */
    public final long m35652c() {
        return this.f47550b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dcf1) {
            dcf1 dcf1Var = (dcf1) obj;
            if (this.f47549a.equals(dcf1Var.f47549a) && this.f47550b == dcf1Var.f47550b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f47549a.hashCode() ^ 1000003;
        long j = this.f47550b;
        return (iHashCode * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServerQueueParams{queueId=");
        sb.append(this.f47549a);
        sb.append(", queueVersion=");
        return ikc0.m50938j(this.f47550b, "}", sb);
    }
}
