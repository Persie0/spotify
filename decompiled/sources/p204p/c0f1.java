package p204p;

import androidx.media3.session.legacy.PlaybackStateCompat;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import p196j$.util.DesugarTimeZone;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c0f1 {

    /* JADX INFO: renamed from: a */
    public static final TimeZone f32774a;

    /* JADX INFO: renamed from: b */
    public static final String f32775b;

    static {
        TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
        wj50.m88279p(timeZone);
        f32774a = timeZone;
        f32775b = wl51.m88470T0(wl51.m88469S0(z4l0.class.getName(), "okhttp3."), "Client");
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m31130a(ph30 ph30Var, ph30 ph30Var2) {
        return wj50.m88271j(ph30Var.f177459d, ph30Var2.f177459d) && ph30Var.f177460e == ph30Var2.f177460e && wj50.m88271j(ph30Var.f177456a, ph30Var2.f177456a);
    }

    /* JADX INFO: renamed from: b */
    public static final int m31131b(String str, long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalStateException(str.concat(" < 0").toString());
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException(str.concat(" too large").toString());
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException(str.concat(" too small").toString());
    }

    /* JADX INFO: renamed from: c */
    public static final void m31132c(Socket socket) {
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!wj50.m88271j(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: d */
    public static final String m31133d(String str, Object... objArr) {
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    /* JADX INFO: renamed from: e */
    public static final long m31134e(n2x0 n2x0Var) {
        String strM78534b = n2x0Var.f149862f.m78534b("Content-Length");
        if (strM78534b == null) {
            return -1L;
        }
        byte[] bArr = a0f1.f11072a;
        try {
            return Long.parseLong(strM78534b);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    /* JADX INFO: renamed from: f */
    public static final Charset m31135f(gqa gqaVar, Charset charset) {
        int iMo45415H0 = gqaVar.mo45415H0(a0f1.f11073b);
        if (iMo45415H0 == -1) {
            return charset;
        }
        if (iMo45415H0 == 0) {
            return vuc.f244913a;
        }
        if (iMo45415H0 == 1) {
            return vuc.f244914b;
        }
        if (iMo45415H0 == 2) {
            Charset charset2 = vuc.f244913a;
            Charset charset3 = vuc.f244918f;
            if (charset3 != null) {
                return charset3;
            }
            Charset charsetForName = Charset.forName("UTF-32LE");
            vuc.f244918f = charsetForName;
            return charsetForName;
        }
        if (iMo45415H0 == 3) {
            return vuc.f244915c;
        }
        if (iMo45415H0 != 4) {
            throw new AssertionError();
        }
        Charset charset4 = vuc.f244913a;
        Charset charset5 = vuc.f244919g;
        if (charset5 != null) {
            return charset5;
        }
        Charset charsetForName2 = Charset.forName("UTF-32BE");
        vuc.f244919g = charsetForName2;
        return charsetForName2;
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m31136g(wt31 wt31Var, int i) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long jNanoTime = System.nanoTime();
        long jMo27163c = wt31Var.mo27349m().mo27165e() ? wt31Var.mo27349m().mo27163c() - jNanoTime : Long.MAX_VALUE;
        wt31Var.mo27349m().mo27164d(Math.min(jMo27163c, timeUnit.toNanos(i)) + jNanoTime);
        try {
            npa npaVar = new npa();
            while (wt31Var.mo27348g1(npaVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
                npaVar.m65306c();
            }
            if (jMo27163c == Long.MAX_VALUE) {
                wt31Var.mo27349m().mo27161a();
                return true;
            }
            wt31Var.mo27349m().mo27164d(jNanoTime + jMo27163c);
            return true;
        } catch (InterruptedIOException unused) {
            if (jMo27163c == Long.MAX_VALUE) {
                wt31Var.mo27349m().mo27161a();
                return false;
            }
            wt31Var.mo27349m().mo27164d(jNanoTime + jMo27163c);
            return false;
        } catch (Throwable th) {
            if (jMo27163c == Long.MAX_VALUE) {
                wt31Var.mo27349m().mo27161a();
            } else {
                wt31Var.mo27349m().mo27164d(jNanoTime + jMo27163c);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: h */
    public static final sn20 m31137h(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            we20 we20Var = (we20) it.next();
            iva ivaVar = we20Var.f250414a;
            iva ivaVar2 = we20Var.f250415b;
            String strM51759r = ivaVar.m51759r();
            String strM51759r2 = ivaVar2.m51759r();
            arrayList.add(strM51759r);
            arrayList.add(wl51.m88491o1(strM51759r2).toString());
        }
        return new sn20((String[]) arrayList.toArray(new String[0]));
    }

    /* JADX INFO: renamed from: i */
    public static final String m31138i(ph30 ph30Var, boolean z) {
        int i;
        int i2 = ph30Var.f177460e;
        String strM36608h = ph30Var.f177459d;
        if (wl51.m88496t0(strM36608h, ":", false)) {
            strM36608h = dq60.m36608h(']', "[", strM36608h);
        }
        if (!z) {
            String str = ph30Var.f177456a;
            if (str.equals("http")) {
                i = 80;
            } else {
                i = str.equals(pka1.f178421b) ? 443 : -1;
            }
            if (i2 == i) {
                return strM36608h;
            }
        }
        return strM36608h + ':' + i2;
    }

    /* JADX INFO: renamed from: j */
    public static final List m31139j(List list) {
        if (list.isEmpty()) {
            return lau.f131415a;
        }
        return list.size() == 1 ? Collections.singletonList(list.get(0)) : Collections.unmodifiableList(bk5.m29611g0(list.toArray()));
    }

    /* JADX INFO: renamed from: k */
    public static final List m31140k(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return lau.f131415a;
        }
        return objArr.length == 1 ? Collections.singletonList(objArr[0]) : Collections.unmodifiableList(bk5.m29611g0((Object[]) objArr.clone()));
    }
}
