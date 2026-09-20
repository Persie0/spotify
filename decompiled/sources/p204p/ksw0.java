package p204p;

import android.os.SystemClock;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class ksw0 {

    /* JADX INFO: renamed from: a */
    public final double f126055a;

    /* JADX INFO: renamed from: b */
    public final double f126056b;

    /* JADX INFO: renamed from: c */
    public final long f126057c;

    /* JADX INFO: renamed from: d */
    public final long f126058d;

    /* JADX INFO: renamed from: e */
    public final int f126059e;

    /* JADX INFO: renamed from: f */
    public final ArrayBlockingQueue f126060f;

    /* JADX INFO: renamed from: g */
    public final ThreadPoolExecutor f126061g;

    /* JADX INFO: renamed from: h */
    public final hd91 f126062h;

    /* JADX INFO: renamed from: i */
    public final vw90 f126063i;

    /* JADX INFO: renamed from: j */
    public int f126064j;

    /* JADX INFO: renamed from: k */
    public long f126065k;

    public ksw0(hd91 hd91Var, y601 y601Var, vw90 vw90Var) {
        double d = y601Var.f269585d;
        double d2 = y601Var.f269586e;
        long j = ((long) y601Var.f269587f) * 1000;
        this.f126055a = d;
        this.f126056b = d2;
        this.f126057c = j;
        this.f126062h = hd91Var;
        this.f126063i = vw90Var;
        this.f126058d = SystemClock.elapsedRealtime();
        int i = (int) d;
        this.f126059e = i;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
        this.f126060f = arrayBlockingQueue;
        this.f126061g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f126064j = 0;
        this.f126065k = 0L;
    }

    /* JADX INFO: renamed from: a */
    public final int m57259a() {
        if (this.f126065k == 0) {
            this.f126065k = System.currentTimeMillis();
        }
        int iCurrentTimeMillis = (int) ((System.currentTimeMillis() - this.f126065k) / this.f126057c);
        int iMin = this.f126060f.size() == this.f126059e ? Math.min(100, this.f126064j + iCurrentTimeMillis) : Math.max(0, this.f126064j - iCurrentTimeMillis);
        if (this.f126064j != iMin) {
            this.f126064j = iMin;
            this.f126065k = System.currentTimeMillis();
        }
        return iMin;
    }

    /* JADX INFO: renamed from: b */
    public final void m57260b(vy7 vy7Var, ev61 ev61Var) {
        haz.f89320X.m46947g();
        this.f126062h.m47179a(new s08(null, vy7Var.m86710a(), ler0.f132671c), new heq(SystemClock.elapsedRealtime() - this.f126058d < 2000, this, ev61Var, vy7Var));
    }
}
