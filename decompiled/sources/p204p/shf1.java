package p204p;

import android.os.Looper;
import com.spotify.searchview.proto.AudioEpisode;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class shf1 {

    /* JADX INFO: renamed from: i */
    public static final Object f209199i = new Object();

    /* JADX INFO: renamed from: a */
    public final ura0 f209200a;

    /* JADX INFO: renamed from: b */
    public final long f209201b;

    /* JADX INFO: renamed from: c */
    public final String f209202c;

    /* JADX INFO: renamed from: g */
    public lhf1 f209206g;

    /* JADX INFO: renamed from: h */
    public n081 f209207h;

    /* JADX INFO: renamed from: e */
    public long f209204e = -1;

    /* JADX INFO: renamed from: f */
    public long f209205f = 0;

    /* JADX INFO: renamed from: d */
    public final ywh0 f209203d = new ywh0(Looper.getMainLooper(), 5);

    public shf1(long j, String str) {
        this.f209201b = j;
        this.f209202c = str;
        this.f209200a = new ura0("RequestTracker", str);
    }

    /* JADX INFO: renamed from: a */
    public final void m78129a(long j, lhf1 lhf1Var) {
        lhf1 lhf1Var2;
        long j2;
        long j3;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Object obj = f209199i;
        synchronized (obj) {
            lhf1Var2 = this.f209206g;
            j2 = this.f209204e;
            j3 = this.f209205f;
            this.f209204e = j;
            this.f209206g = lhf1Var;
            this.f209205f = jCurrentTimeMillis;
        }
        if (lhf1Var2 != null) {
            lhf1Var2.mo29655c(j2, j3, this.f209202c, jCurrentTimeMillis);
        }
        synchronized (obj) {
            try {
                n081 n081Var = this.f209207h;
                if (n081Var != null) {
                    this.f209203d.removeCallbacks(n081Var);
                }
                n081 n081Var2 = new n081(this, 18);
                this.f209207h = n081Var2;
                this.f209203d.postDelayed(n081Var2, this.f209201b);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m78130b() {
        boolean z;
        synchronized (f209199i) {
            z = this.f209204e != -1;
        }
        return z;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m78131c(long j) {
        boolean z;
        synchronized (f209199i) {
            long j2 = this.f209204e;
            z = false;
            if (j2 != -1 && j2 == j) {
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: d */
    public final void m78132d(long j, int i, dvb1 dvb1Var) {
        synchronized (f209199i) {
            try {
                if (m78131c(j)) {
                    Locale locale = Locale.ROOT;
                    m78135g("request " + j + " completed", i, dvb1Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m78133e() {
        m78134f(AudioEpisode.VIDEO_FORMAT_FIELD_NUMBER);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m78134f(int i) {
        synchronized (f209199i) {
            try {
                if (!m78130b()) {
                    return false;
                }
                Locale locale = Locale.ROOT;
                m78135g("clearing request " + this.f209204e, i, null);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m78135g(String str, int i, Object obj) {
        this.f209200a.m83848a(str, new Object[0]);
        Object obj2 = f209199i;
        synchronized (obj2) {
            try {
                if (this.f209206g != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    lhf1 lhf1Var = this.f209206g;
                    ig31.m50506x(lhf1Var);
                    lhf1Var.mo29656d(this.f209202c, this.f209204e, i, obj, this.f209205f, jCurrentTimeMillis);
                }
                this.f209204e = -1L;
                this.f209206g = null;
                synchronized (obj2) {
                    try {
                        n081 n081Var = this.f209207h;
                        if (n081Var != null) {
                            this.f209203d.removeCallbacks(n081Var);
                            this.f209207h = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
