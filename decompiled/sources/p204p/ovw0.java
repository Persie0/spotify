package p204p;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class ovw0 {

    /* JADX INFO: renamed from: d */
    public static final long f170576d = TimeUnit.HOURS.toMillis(24);

    /* JADX INFO: renamed from: e */
    public static final long f170577e = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: a */
    public final w0b1 f170578a;

    /* JADX INFO: renamed from: b */
    public long f170579b;

    /* JADX INFO: renamed from: c */
    public int f170580c;

    public ovw0() {
        Pattern pattern = w0b1.f246692c;
        hp3 hp3VarM48118p = hp3.m48118p();
        if (w0b1.f246693d == null) {
            w0b1.f246693d = new w0b1(hp3VarM48118p);
        }
        this.f170578a = w0b1.f246693d;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001b  */
    /* JADX INFO: renamed from: a */
    public final synchronized boolean m68138a() {
        boolean z;
        if (this.f170580c != 0) {
            this.f170578a.f246694a.getClass();
            if (hp3.m48117o() > this.f170579b) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        return z;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m68139b(int i) {
        long jMin;
        if ((i >= 200 && i < 300) || i == 401 || i == 404) {
            synchronized (this) {
                this.f170580c = 0;
            }
            return;
        }
        this.f170580c++;
        synchronized (this) {
            try {
                if (i == 429 || (i >= 500 && i < 600)) {
                    double dPow = Math.pow(2.0d, this.f170580c);
                    this.f170578a.getClass();
                    jMin = (long) Math.min(dPow + ((long) (Math.random() * 1000.0d)), f170577e);
                } else {
                    jMin = f170576d;
                }
                this.f170578a.f246694a.getClass();
                this.f170579b = hp3.m48117o() + jMin;
            } catch (Throwable th) {
                throw th;
            }
        }
        return;
        throw th;
    }
}
