package p204p;

import android.graphics.Path;
import android.icu.text.SimpleDateFormat;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.SecureRandom;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import javax.crypto.Cipher;
import p196j$.util.DesugarTimeZone;

/* JADX INFO: loaded from: classes4.dex */
public final class q32 extends ThreadLocal {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f184778a;

    public /* synthetic */ q32(int i) {
        this.f184778a = i;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0031  */
    /* JADX WARN: Code duplicated, block: B:92:0x002c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        SecureRandom secureRandom;
        Provider provider = null;
        switch (this.f184778a) {
            case 0:
                try {
                    return (Cipher) a9v.f13645e.m25166a("AES/CTR/NoPadding");
                } catch (GeneralSecurityException e) {
                    throw new IllegalStateException(e);
                }
            case 1:
                try {
                    return (Cipher) a9v.f13645e.m25166a("AES/ECB/NOPADDING");
                } catch (GeneralSecurityException e2) {
                    throw new IllegalStateException(e2);
                }
            case 2:
                try {
                    return (Cipher) a9v.f13645e.m25166a("AES/CTR/NOPADDING");
                } catch (GeneralSecurityException e3) {
                    throw new IllegalStateException(e3);
                }
            case 3:
                try {
                    return (Cipher) a9v.f13645e.m25166a("AES/GCM/NoPadding");
                } catch (GeneralSecurityException e4) {
                    throw new IllegalStateException(e4);
                }
            case 4:
                try {
                    return (Cipher) a9v.f13645e.m25166a("AES/GCM-SIV/NoPadding");
                } catch (GeneralSecurityException e5) {
                    throw new IllegalStateException(e5);
                }
            case 5:
                Locale locale = Locale.ROOT;
                List listM46715L = h6f.m46715L(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX", locale), new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX", locale));
                Iterator it = listM46715L.iterator();
                while (it.hasNext()) {
                    ((SimpleDateFormat) it.next()).setLenient(false);
                }
                return listM46715L;
            case 6:
                return new SimpleDateFormat("HH:mm", Locale.ROOT);
            case 7:
                Choreographer choreographer = Choreographer.getInstance();
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper == null) {
                    throw new IllegalStateException("no Looper on this thread");
                }
                ys4 ys4Var = new ys4(choreographer, grl0.m45545r(looperMyLooper));
                return opo.m67570t(ys4Var, ys4Var.f275673Y);
            case 8:
                return new java.text.SimpleDateFormat("yyyyMMdd", Locale.ENGLISH);
            case 9:
                return new Random();
            case 10:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    return e95.m38211p();
                }
                if (Looper.myLooper() != null) {
                    return new zb20(new Handler(Looper.myLooper()));
                }
                return null;
            case 11:
                return new char[1024];
            case 12:
                return new java.text.SimpleDateFormat("yyyyMMdd", Locale.ENGLISH);
            case 13:
                SecureRandom secureRandom2 = new SecureRandom();
                secureRandom2.nextLong();
                return secureRandom2;
            case 14:
                return new Path();
            case 15:
                return new Path();
            case 16:
                return new float[4];
            case 17:
                return new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
            case 18:
                return Boolean.FALSE;
            case 19:
                q32 q32Var = ncf1.f152507a;
                java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
                GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone("UTC"));
                gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
                simpleDateFormat.setCalendar(gregorianCalendar);
                return simpleDateFormat;
            case 20:
                return 0L;
            default:
                Provider providerM72809B = qhg1.m72809B();
                if (providerM72809B == null) {
                    provider = (Provider) Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", null).invoke(null, null);
                    if (provider != null) {
                        secureRandom = SecureRandom.getInstance("SHA1PRNG", provider);
                    } else {
                        secureRandom = new SecureRandom();
                    }
                    break;
                } else {
                    try {
                        secureRandom = SecureRandom.getInstance("SHA1PRNG", providerM72809B);
                    } catch (GeneralSecurityException unused) {
                        try {
                            provider = (Provider) Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", null).invoke(null, null);
                        } catch (Throwable unused2) {
                        }
                        if (provider != null) {
                            try {
                                secureRandom = SecureRandom.getInstance("SHA1PRNG", provider);
                            } catch (GeneralSecurityException unused3) {
                                secureRandom = new SecureRandom();
                            }
                        } else {
                            secureRandom = new SecureRandom();
                        }
                    }
                    break;
                }
                secureRandom.nextLong();
                return secureRandom;
        }
    }
}
