package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class if9 {

    /* JADX INFO: renamed from: a */
    public final long f101723a;

    /* JADX INFO: renamed from: b */
    public final long f101724b;

    /* JADX INFO: renamed from: c */
    public final long f101725c;

    /* JADX INFO: renamed from: d */
    public long f101726d;

    /* JADX INFO: renamed from: e */
    public long f101727e;

    /* JADX INFO: renamed from: f */
    public long f101728f;

    /* JADX INFO: renamed from: g */
    public long f101729g;

    /* JADX INFO: renamed from: h */
    public long f101730h;

    public if9(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.f101723a = j;
        this.f101724b = j2;
        this.f101726d = j3;
        this.f101727e = j4;
        this.f101728f = j5;
        this.f101729g = j6;
        this.f101725c = j7;
        this.f101730h = m50432h(j2, j3, j4, j5, j6, j7);
    }

    /* JADX INFO: renamed from: a */
    public static long m50425a(if9 if9Var) {
        return if9Var.f101723a;
    }

    /* JADX INFO: renamed from: b */
    public static long m50426b(if9 if9Var) {
        return if9Var.f101728f;
    }

    /* JADX INFO: renamed from: c */
    public static long m50427c(if9 if9Var) {
        return if9Var.f101729g;
    }

    /* JADX INFO: renamed from: d */
    public static long m50428d(if9 if9Var) {
        return if9Var.f101730h;
    }

    /* JADX INFO: renamed from: e */
    public static long m50429e(if9 if9Var) {
        return if9Var.f101724b;
    }

    /* JADX INFO: renamed from: f */
    public static void m50430f(if9 if9Var, long j, long j2) {
        if9Var.f101727e = j;
        if9Var.f101729g = j2;
        if9Var.f101730h = m50432h(if9Var.f101724b, if9Var.f101726d, j, if9Var.f101728f, j2, if9Var.f101725c);
    }

    /* JADX INFO: renamed from: g */
    public static void m50431g(if9 if9Var, long j, long j2) {
        if9Var.f101726d = j;
        if9Var.f101728f = j2;
        if9Var.f101730h = m50432h(if9Var.f101724b, j, if9Var.f101727e, j2, if9Var.f101729g, if9Var.f101725c);
    }

    /* JADX INFO: renamed from: h */
    public static long m50432h(long j, long j2, long j3, long j4, long j5, long j6) {
        if (j4 + 1 >= j5 || j2 + 1 >= j3) {
            return j4;
        }
        long j7 = (long) ((j - j2) * ((j5 - j4) / (j3 - j2)));
        return h0b1.m46319k(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
    }
}
