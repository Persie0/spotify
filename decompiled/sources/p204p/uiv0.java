package p204p;

/* JADX INFO: loaded from: classes.dex */
public abstract class uiv0 {

    /* JADX INFO: renamed from: a */
    public static final long f230822a = (((long) 1023) << 50) ^ (-1);

    /* JADX INFO: renamed from: b */
    public static final long f230823b = (-1) ^ (((long) 33554431) << 25);

    /* JADX INFO: renamed from: c */
    public static final long f230824c;

    static {
        long j = 33554431;
        f230824c = j | (((long) Math.min(0, 1023)) << 50) | (j << 25);
    }
}
