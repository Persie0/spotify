package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class rcx0 {

    /* JADX INFO: renamed from: d */
    public static final rcx0 f197941d = new rcx0(0, false, false);

    /* JADX INFO: renamed from: e */
    public static final rcx0 f197942e = new rcx0(500, true, false);

    /* JADX INFO: renamed from: f */
    public static final rcx0 f197943f;

    /* JADX INFO: renamed from: a */
    public final long f197944a;

    /* JADX INFO: renamed from: b */
    public final boolean f197945b;

    /* JADX INFO: renamed from: c */
    public final boolean f197946c;

    static {
        new rcx0(100L, true, false);
        f197943f = new rcx0(0L, false, true);
    }

    public rcx0(long j, boolean z, boolean z2) {
        this.f197945b = z;
        this.f197944a = j;
        if (z2) {
            wj50.m88275l("shouldRetry must be false when completeWithoutFailure is set to true", !z);
        }
        this.f197946c = z2;
    }
}
