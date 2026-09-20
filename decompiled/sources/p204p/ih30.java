package p204p;

import io.ably.lib.types.AblyException;
import io.ably.lib.types.ErrorInfo;
import io.ably.lib.types.Param;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes16.dex */
public abstract class ih30 implements Future, Runnable {

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ km6 f102142X;

    /* JADX INFO: renamed from: a */
    public Object f102143a;

    /* JADX INFO: renamed from: b */
    public ErrorInfo f102144b;

    /* JADX INFO: renamed from: c */
    public final String f102145c;

    /* JADX INFO: renamed from: d */
    public final Param[] f102146d;

    /* JADX INFO: renamed from: e */
    public final Param[] f102147e;

    /* JADX INFO: renamed from: f */
    public final vg30 f102148f;

    /* JADX INFO: renamed from: g */
    public final xg30 f102149g;

    /* JADX INFO: renamed from: h */
    public final ymc f102150h;

    /* JADX INFO: renamed from: i */
    public boolean f102151i = false;

    /* JADX INFO: renamed from: t */
    public boolean f102152t = false;

    public ih30(km6 km6Var, String str, Param[] paramArr, Param[] paramArr2, vg30 vg30Var, xg30 xg30Var, ymc ymcVar) {
        this.f102142X = km6Var;
        this.f102145c = str;
        this.f102146d = paramArr;
        this.f102147e = paramArr2;
        this.f102148f = vg30Var;
        this.f102149g = xg30Var;
        this.f102150h = ymcVar;
    }

    /* JADX INFO: renamed from: c */
    public final Object m50576c(String str, String str2) {
        URL url;
        yg30 yg30Var = this.f102142X.f124059b;
        String str3 = yg30Var.f272461a;
        int i = yg30Var.f272462b;
        int i2 = th30.f220314a;
        StringBuilder sb = new StringBuilder(str3);
        sb.append(str);
        sb.append(':');
        sb.append(i);
        sb.append(str2);
        th30.m80821a(sb, this.f102147e);
        try {
            url = new URL(sb.toString());
        } catch (MalformedURLException unused) {
            url = null;
        }
        return yg30Var.m93584b(url, this.f102145c, this.f102146d, this.f102148f, this.f102149g);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        this.f102151i = true;
        synchronized (this) {
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final void m50577d(ErrorInfo errorInfo) {
        synchronized (this) {
            this.f102144b = errorInfo;
            this.f102152t = true;
            notifyAll();
        }
        ((C1797e0) this.f102150h.f274218a).f54818b = errorInfo;
    }

    /* JADX INFO: renamed from: e */
    public final void m50578e(Object obj) {
        synchronized (this) {
            this.f102143a = obj;
            this.f102152t = true;
            notifyAll();
        }
        ((C1797e0) this.f102150h.f274218a).f54817a = obj;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        synchronized (this) {
            while (!this.f102152t) {
                try {
                    wait();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f102144b != null) {
                throw new ExecutionException(AblyException.fromErrorInfo(this.f102144b));
            }
        }
        return this.f102143a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f102151i;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f102152t;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        long millis = timeUnit.toMillis(j);
        long jCurrentTimeMillis = System.currentTimeMillis() + millis;
        synchronized (this) {
            while (millis > 0) {
                try {
                    wait(millis);
                    if (this.f102152t) {
                        break;
                    }
                    millis = jCurrentTimeMillis - System.currentTimeMillis();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f102152t) {
                if (this.f102144b != null) {
                    throw new ExecutionException(AblyException.fromErrorInfo(this.f102144b));
                }
            } else {
                throw new TimeoutException();
            }
        }
        return this.f102143a;
    }
}
