package p204p;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class xl81 {
    public static int[] _values() {
        return edb.m38551G(3);
    }

    /* JADX INFO: renamed from: a */
    public static int m91392a(int i) {
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
    public static /* synthetic */ boolean m91393b(int i) {
        if (i == 1) {
            return false;
        }
        if (i == 2 || i == 3) {
            return true;
        }
        if (i == 4) {
            return false;
        }
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m91394c(int i) {
        switch (i) {
            case 1:
                return 0;
            case 2:
                return 480;
            case 3:
                return 576;
            case 4:
                return 720;
            case 5:
                return 1080;
            case 6:
                return 2160;
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ int m91395d(int i) {
        if (i == 1) {
            return 7;
        }
        if (i == 2) {
            return 4;
        }
        if (i == 3) {
            return 3;
        }
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ String m91396e(int i) {
        if (i == 1) {
            return "getInfoResponse";
        }
        if (i == 2) {
            return "addUserResponse";
        }
        if (i == 3) {
            return "addUserError";
        }
        if (i == 4) {
            return "transferSuccess";
        }
        if (i == 5) {
            return "transferError";
        }
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ int m91397f(int i) {
        switch (i) {
            case 1:
                return 0;
            case 2:
            case 3:
                return 720;
            case 4:
                return 1280;
            case 5:
                return 1920;
            case 6:
                return 3840;
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ int m91398g() {
        return (int) ((((long) (-1)) & 4294967295L) / (4294967295L & ((long) 10)));
    }

    /* JADX INFO: renamed from: h */
    public static int m91399h(double d, int i, int i2) {
        return (Double.hashCode(d) + i) * i2;
    }

    /* JADX INFO: renamed from: j */
    public static int m91401j(qsj qsjVar, int i, int i2) {
        return (qsjVar.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ long m91402k(long j) {
        if (j < 0) {
            return Long.MAX_VALUE < (j ^ Long.MIN_VALUE) ? 0L : 1L;
        }
        long j2 = (Long.MAX_VALUE / j) << 1;
        return j2 + ((long) ((((-1) - (j2 * j)) ^ Long.MIN_VALUE) < (j ^ Long.MIN_VALUE) ? 0 : 1));
    }

    /* JADX INFO: renamed from: l */
    public static Iterator m91403l(Parcel parcel, Map map) {
        parcel.writeInt(map.size());
        return map.entrySet().iterator();
    }

    /* JADX INFO: renamed from: m */
    public static st91 m91404m(zt91 zt91Var, String str, ArrayList arrayList, zt91 zt91Var2, ArrayList arrayList2) {
        ofg1.m66846o(zt91Var, str);
        arrayList.add(zt91Var2);
        return new st91(arrayList2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m91405n(f38 f38Var) throws Exception {
        boolean zIsTerminated;
        if (f38Var instanceof AutoCloseable) {
            f38Var.close();
            return;
        }
        if (!(f38Var instanceof ExecutorService)) {
            throw new IllegalArgumentException();
        }
        ExecutorService executorService = (ExecutorService) f38Var;
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

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m91406o(hwf hwfVar) {
        if (hwfVar != null) {
            throw new ClassCastException();
        }
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ String m91407p(int i) {
        if (i == 1) {
            return "UNKNOWN";
        }
        if (i == 2) {
            return "BUILT_IN_SPEAKER";
        }
        if (i == 3) {
            return "BLUETOOTH";
        }
        if (i == 4) {
            return "WIRED";
        }
        if (i == 5) {
            return "CAR_PROJECTED";
        }
        throw null;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ String m91408q(int i) {
        switch (i) {
            case 1:
                return "ALLOWED_ADULT";
            case 2:
                return "ALLOWED_MINOR_WITH_CONSENT";
            case 3:
                return "ALLOWED_ENFORCEMENT_NOT_REQUIRED";
            case 4:
                return "ALLOWED_FAILED_TO_VERIFY";
            case 5:
                return "BLOCKED_UNDERAGE";
            case 6:
                return "BLOCKED_PARENTAL_DENIAL";
            case 7:
                return "BLOCKED_AGE_RANGE_UNKNOWN";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ String m91409r(int i) {
        if (i == 1) {
            return "NOT_SUPPORTED_BY_DEVICE";
        }
        if (i == 2) {
            return "ACCOUNT_MANAGER";
        }
        if (i == 3) {
            return "MUSIC_VIDEO_DISABLED";
        }
        if (i == 4) {
            return "OTHER_VIDEO_DISABLED";
        }
        throw null;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ String m91410s(int i) {
        if (i == 1) {
            return "Horizontal";
        }
        if (i == 2) {
            return "Vertical";
        }
        throw null;
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ String m91411t(int i) {
        if (i == 1) {
            return "UNKNOWN";
        }
        if (i == 2) {
            return "BUILT_IN_SPEAKER";
        }
        if (i == 3) {
            return "BLUETOOTH";
        }
        if (i != 4) {
            return i != 5 ? "null" : "CAR_PROJECTED";
        }
        return "WIRED";
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ String m91412u(int i) {
        if (i == 1) {
            return "INVARIANT";
        }
        if (i != 2) {
            return i != 3 ? "null" : "OUT_VARIANCE";
        }
        return "IN_VARIANCE";
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ int m91413v(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("NOT_SUPPORTED_BY_DEVICE")) {
            return 1;
        }
        if (str.equals("ACCOUNT_MANAGER")) {
            return 2;
        }
        if (str.equals("MUSIC_VIDEO_DISABLED")) {
            return 3;
        }
        if (str.equals("OTHER_VIDEO_DISABLED")) {
            return 4;
        }
        throw new IllegalArgumentException("No enum constant com.spotify.nowplaying.elements.audiovideotransition.VideoDisableReason.".concat(str));
    }
}
