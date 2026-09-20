package p000;

import android.os.Parcel;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import p204p.b250;
import p204p.c9k;
import p204p.cxh0;
import p204p.edb;
import p204p.esa;
import p204p.f7j;
import p204p.fxh0;
import p204p.jxu;
import p204p.k0e1;
import p204p.kk40;
import p204p.leu;
import p204p.luk;
import p204p.mi21;
import p204p.ni80;
import p204p.njg1;
import p204p.nv4;
import p204p.o6j;
import p204p.opo;
import p204p.pyh0;
import p204p.riw0;
import p204p.vlh;
import p204p.w6d0;
import p204p.xfg1;
import p204p.xq00;
import p204p.yhh;
import p204p.yqq;
import p204p.zsf1;

/* JADX INFO: renamed from: a */
/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class AbstractC0000a {
    /* JADX INFO: renamed from: A */
    public static /* synthetic */ int m0A(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("PRIMARY")) {
            return 1;
        }
        if (str.equals("SECONDARY")) {
            return 2;
        }
        throw new IllegalArgumentException("No enum constant com.spotify.allboarding.allboardingdomain.Action.".concat(str));
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ int m1B(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("URL")) {
            return 1;
        }
        if (str.equals("SAVE_ENTITY")) {
            return 2;
        }
        if (str.equals("SETTINGS")) {
            return 3;
        }
        if (str.equals("START_PLAYBACK")) {
            return 4;
        }
        if (str.equals("ADD_TO_QUEUE")) {
            return 5;
        }
        if (str.equals("ADD_TO_PLAYLIST")) {
            return 6;
        }
        if (str.equals("DOWNLOAD_ENTITY")) {
            return 7;
        }
        if (str.equals("ADD_TO_YOUR_EPISODES")) {
            return 8;
        }
        throw new IllegalArgumentException("No enum constant com.spotify.notifications.pushnotificationsv2.pushnotificationapi.api.models.ActionType.".concat(str));
    }

    public static int[] _values() {
        return edb.m38551G(3);
    }

    /* JADX INFO: renamed from: a */
    public static int m2a(int i) {
        if (i == 0) {
            return 3;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: b */
    public static int m3b(int i) {
        if (i == 0) {
            return 4;
        }
        if (i == 2) {
            return 1;
        }
        if (i != 3) {
            return i != 4 ? 0 : 3;
        }
        return 2;
    }

    /* JADX INFO: renamed from: c */
    public static final String m4c(int i) {
        if (i == 1) {
            return "1";
        }
        if (i == 2) {
            return "0";
        }
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public static int m5d(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("Unknown")) {
            return 1;
        }
        if (str.equals("Male")) {
            return 2;
        }
        if (str.equals("Female")) {
            return 3;
        }
        if (str.equals("NonBinary")) {
            return 4;
        }
        if (str.equals("Other")) {
            return 5;
        }
        if (str.equals("PreferNotToSay")) {
            return 6;
        }
        throw new IllegalArgumentException("No enum constant com.spotify.login.loginflow.navigation.AccountDetailsV2.Gender.".concat(str));
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ String m6e(int i) {
        if (i == 1) {
            return "restricted";
        }
        if (i == 2) {
            return "unrestricted";
        }
        if (i == 3) {
            return "loggedOut";
        }
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ String m7f(int i) {
        switch (i) {
            case 1:
                return "image_prefetch_failure";
            case 2:
                return "image_postfetch_failure";
            case 3:
                return "image_list_empty";
            case 4:
                return "image_prefetch_exception";
            case 5:
                return "ad_data_missing";
            case 6:
                return "no_carousel_items";
            case 7:
                return "ad_cta_missing";
            case 8:
                return "video_prebuffer_error";
            case 9:
                return "page_load_error";
            case 10:
                return "dimensions_error";
            case 11:
                return "missing_creative";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: g */
    public static int m8g(int i, int i2, float f) {
        return (Float.hashCode(f) + i) * i2;
    }

    /* JADX INFO: renamed from: h */
    public static int m9h(Class cls, Parcel parcel, ArrayList arrayList, int i, int i2) {
        arrayList.add(parcel.readParcelable(cls.getClassLoader()));
        return i + i2;
    }

    /* JADX INFO: renamed from: i */
    public static int m10i(b250 b250Var, int i, int i2) {
        return (b250Var.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: j */
    public static ObservableFromPublisher m11j(Flowable flowable, Flowable flowable2) {
        flowable.getClass();
        return new ObservableFromPublisher(flowable2);
    }

    /* JADX INFO: renamed from: k */
    public static String m12k(xq00 xq00Var, int i, int i2, xq00 xq00Var2, boolean z) {
        xq00Var.m91771i0(i);
        String strM54977L = k0e1.m54977L(i2, xq00Var2);
        xq00Var.m91788r(z);
        return strM54977L;
    }

    /* JADX INFO: renamed from: l */
    public static String m13l(xq00 xq00Var, int i, Integer num, xq00 xq00Var2, boolean z) {
        xq00Var.m91771i0(i);
        String strM54977L = k0e1.m54977L(num.intValue(), xq00Var2);
        xq00Var.m91788r(z);
        return strM54977L;
    }

    /* JADX INFO: renamed from: m */
    public static o6j m14m(xq00 xq00Var) {
        o6j o6jVar = new o6j();
        xq00Var.m91793t0(o6jVar);
        return o6jVar;
    }

    /* JADX INFO: renamed from: n */
    public static f7j m15n(o6j o6jVar, xq00 xq00Var) {
        f7j f7jVar = new f7j(o6jVar);
        xq00Var.m91793t0(f7jVar);
        return f7jVar;
    }

    /* JADX INFO: renamed from: o */
    public static c9k m16o(luk lukVar) {
        return kk40.m56661c(opo.m67570t(njg1.m64613f(), lukVar));
    }

    /* JADX INFO: renamed from: p */
    public static jxu m17p(cxh0 cxh0Var, float f, xq00 xq00Var, xq00 xq00Var2) {
        riw0.m75615i(xq00Var, mi21.m61824h(f, cxh0Var));
        return leu.m58816b(xq00Var2);
    }

    /* JADX INFO: renamed from: q */
    public static w6d0 m18q(yqq yqqVar, xq00 xq00Var) {
        w6d0 w6d0Var = new w6d0(yqqVar);
        xq00Var.m91793t0(w6d0Var);
        return w6d0Var;
    }

    /* JADX INFO: renamed from: r */
    public static fxh0 m19r(nv4 nv4Var, int i, fxh0 fxh0Var) {
        return xfg1.m90478H(fxh0Var, new ni80(nv4Var, i));
    }

    /* JADX INFO: renamed from: s */
    public static void m20s(int i, xq00 xq00Var, yhh yhhVar, xq00 xq00Var2, vlh vlhVar) {
        zsf1.m96835F(Integer.valueOf(i), yhhVar, xq00Var);
        zsf1.m96833D(vlhVar, xq00Var2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m21t(esa esaVar) throws Exception {
        boolean zIsTerminated;
        if (esaVar instanceof AutoCloseable) {
            esaVar.close();
            return;
        }
        if (!(esaVar instanceof ExecutorService)) {
            throw new IllegalArgumentException();
        }
        ExecutorService executorService = (ExecutorService) esaVar;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m22u(cxh0 cxh0Var, float f, xq00 xq00Var, boolean z) {
        riw0.m75615i(xq00Var, mi21.m61824h(f, cxh0Var));
        xq00Var.m91788r(z);
    }

    /* JADX INFO: renamed from: v */
    public static void m23v(pyh0 pyh0Var) {
        boolean zIsTerminated;
        ExecutorService executorService = pyh0Var.f183408a;
        if (pyh0Var == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        pyh0Var.shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    pyh0Var.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ String m24w(int i) {
        switch (i) {
            case 1:
                return "APP";
            case 2:
                return "CAR";
            case 3:
                return "HEADPHONES";
            case 4:
                return "SPEAKER";
            case 5:
                return "WEARABLE";
            case 6:
                return "FACE_WEARABLE";
            case 7:
                return "UNKNOWN";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ String m25x(int i) {
        if (i == 1) {
            return "PRIMARY";
        }
        if (i == 2) {
            return "SECONDARY";
        }
        throw null;
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ String m26y(int i) {
        if (i == 1) {
            return "MANAGED";
        }
        if (i == 2) {
            return "UNMANAGED";
        }
        throw null;
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ String m27z(int i) {
        if (i == 1) {
            return "NORMAL";
        }
        if (i == 2) {
            return "REMINDER_AD";
        }
        throw null;
    }
}
