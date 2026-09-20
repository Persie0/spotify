package p204p;

import android.os.Parcel;
import com.spotify.voiceassistants.playermodels.SearchEndpointResponseKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.ServiceConfigurationError;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class t3d1 {
    /* JADX INFO: renamed from: A */
    public static /* synthetic */ int m79985A(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("URL")) {
            return 1;
        }
        if (str.equals("MANIFEST_ID")) {
            return 2;
        }
        throw new IllegalArgumentException("No enum constant com.spotify.extendedmetadata.extensions.watchfeedentityexplorer.WatchFeedEntityExplorer.VideoFileType.".concat(str));
    }

    public static int[] _values() {
        return edb.m38551G(21);
    }

    /* JADX INFO: renamed from: a */
    public static final lba0 m79986a(int i, lba0 lba0Var, hze1 hze1Var, hze1 hze1Var2) {
        int i2 = hze1Var2.f96910b;
        int iM38547C = edb.m38547C(i);
        if (iM38547C != 0) {
            return iM38547C != 2 ? lba0Var : lba0Var.m58646B6(i2 - hze1Var.f96910b);
        }
        return lba0Var.m58646B6(i2 - hze1.f96907f.f96910b);
    }

    /* JADX INFO: renamed from: b */
    public static int m79987b(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 1;
        }
        return 2;
    }

    /* JADX INFO: renamed from: c */
    public static final String m79988c(int i) {
        return m79990e(i);
    }

    /* JADX INFO: renamed from: d */
    public static final String m79989d(int i) {
        String str;
        if (i == 1) {
            str = "STARTUP";
        } else {
            if (i != 2) {
                throw null;
            }
            str = "REQUESTED";
        }
        return str.toLowerCase(Locale.ROOT);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ String m79990e(int i) {
        if (i == 1) {
            return "com.whatsapp";
        }
        if (i == 2) {
            return "com.whatsapp.w4b";
        }
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public static int m79991f(int i, int i2, int i3) {
        return w780.m87326q0(i) + i2 + i3;
    }

    /* JADX INFO: renamed from: g */
    public static int m79992g(int i, int i2, int i3, int i4) {
        return ((i + i2) - i3) + i4;
    }

    /* JADX INFO: renamed from: h */
    public static String m79993h(String str, ho61 ho61Var, String str2, ho61 ho61Var2) {
        return str + ho61Var + str2 + ho61Var2;
    }

    /* JADX INFO: renamed from: i */
    public static UnsupportedOperationException m79994i(Parcel parcel) {
        qmf1.m73272b(parcel);
        return new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: j */
    public static ArrayList m79995j() {
        new ArrayList();
        return new ArrayList();
    }

    /* JADX INFO: renamed from: k */
    public static HashMap m79996k(Class cls, v8f1 v8f1Var) {
        HashMap map = new HashMap();
        map.put(cls, v8f1Var);
        return map;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ Iterator m79997l() {
        try {
            return Arrays.asList(new aq91[0]).iterator();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m79998m(AtomicReference atomicReference, nze1 nze1Var) {
        while (!atomicReference.compareAndSet(null, nze1Var) && atomicReference.get() == null) {
        }
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m79999n(AtomicReference atomicReference, ykf1 ykf1Var) {
        while (!atomicReference.compareAndSet(ykf1Var, null) && atomicReference.get() == ykf1Var) {
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m80000o(p300 p300Var, ck81 ck81Var) {
        ck81Var.mo33087a(new r300(p300Var));
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ boolean m80001p(AtomicReference atomicReference, jb6 jb6Var) {
        while (!atomicReference.compareAndSet(null, jb6Var)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ boolean m80002q(AtomicReference atomicReference, v4f1 v4f1Var) {
        while (!atomicReference.compareAndSet(null, v4f1Var)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ boolean m80003r(AtomicReference atomicReference, ykf1 ykf1Var) {
        while (!atomicReference.compareAndSet(null, ykf1Var)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ boolean m80004s(AtomicReferenceArray atomicReferenceArray, int i, dv61 dv61Var) {
        while (!atomicReferenceArray.compareAndSet(i, dv61Var, null)) {
            if (atomicReferenceArray.get(i) != dv61Var) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ boolean m80005t(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, dv61 dv61Var) {
        while (!atomicReferenceFieldUpdater.compareAndSet(obj, dv61Var, null)) {
            if (atomicReferenceFieldUpdater.get(obj) != dv61Var) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ boolean m80006u(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, y0e1 y0e1Var, dv61 dv61Var) {
        while (!atomicReferenceFieldUpdater.compareAndSet(y0e1Var, dv61Var, null)) {
            if (atomicReferenceFieldUpdater.get(y0e1Var) != dv61Var) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: v */
    public static int m80007v(int i, int i2, int i3, int i4) {
        return w780.m87326q0(i) + i2 + i3 + i4;
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ String m80008w(int i) {
        if (i == 1) {
            return SearchEndpointResponseKt.RESULT_SUCCESS;
        }
        if (i == 2) {
            return "FAIL";
        }
        if (i == 3) {
            return "ABORTED";
        }
        throw null;
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ String m80009x(int i) {
        if (i == 1) {
            return "RUNNING";
        }
        throw null;
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ String m80010y(int i) {
        if (i != 1) {
            return i != 2 ? "null" : "End";
        }
        return "Start";
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ String m80011z(int i) {
        if (i == 1) {
            return "UTC";
        }
        if (i != 2) {
            return i != 3 ? "null" : "STANDARD";
        }
        return "WALL";
    }
}
