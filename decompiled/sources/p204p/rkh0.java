package p204p;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class rkh0 {
    /* JADX INFO: renamed from: a */
    public static int m75727a(int i) {
        if (i == 0) {
            return 3;
        }
        if (i != 1) {
            return i != 4 ? 0 : 2;
        }
        return 1;
    }

    /* JADX INFO: renamed from: b */
    public static final String m75728b(int i) {
        int iM38547C = edb.m38547C(i);
        if (iM38547C == 0) {
            return "integrity_detect";
        }
        if (iM38547C == 1) {
            return "app_event_pred";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: c */
    public static final String m75729c(int i) {
        int iM38547C = edb.m38547C(i);
        if (iM38547C == 0) {
            return "MTML_INTEGRITY_DETECT";
        }
        if (iM38547C == 1) {
            return "MTML_APP_EVENT_PRED";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m75730d(int i) {
        if (i == 1) {
            return "non_social";
        }
        if (i == 2) {
            return "social";
        }
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public static int m75732f(Parcel parcel, LinkedHashMap linkedHashMap, String str, int i, int i2) {
        linkedHashMap.put(str, parcel.readString());
        return i + i2;
    }

    /* JADX INFO: renamed from: g */
    public static int m75733g(sr01 sr01Var, int i, int i2) {
        return (sr01Var.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: h */
    public static String m75734h(String str, Object obj, Object obj2) {
        return obj + str + obj2;
    }

    /* JADX INFO: renamed from: i */
    public static ArrayList m75735i(String str, LinkedHashMap linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        linkedHashMap.put(str, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m75736j(AtomicReference atomicReference, yqi0 yqi0Var) {
        while (!atomicReference.compareAndSet(yqi0Var, null) && atomicReference.get() == yqi0Var) {
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ boolean m75737k(AtomicReference atomicReference, yqi0 yqi0Var, yqi0 yqi0Var2) {
        while (!atomicReference.compareAndSet(yqi0Var, yqi0Var2)) {
            if (atomicReference.get() != yqi0Var) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ String m75738l(int i) {
        if (i == 1) {
            return "WAITING_FOR_LOCATION_CHANGE";
        }
        if (i == 2) {
            return "WAITING_FOR_COMPLETION";
        }
        throw null;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ String m75739m(int i) {
        if (i == 1) {
            return "FINAL";
        }
        if (i == 2) {
            return "SEALED";
        }
        if (i != 3) {
            return i != 4 ? "null" : "ABSTRACT";
        }
        return "OPEN";
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ String m75740n(int i) {
        if (i == 1) {
            return "FIRST";
        }
        if (i == 2) {
            return "FIRST_OR_DEFAULT";
        }
        if (i != 3) {
            return i != 4 ? "null" : "SINGLE";
        }
        return "LAST";
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ String m75741o(int i) {
        if (i == 1) {
            return "FIRST";
        }
        if (i == 2) {
            return "FIRST_OR_DEFAULT";
        }
        if (i == 3) {
            return "LAST";
        }
        if (i != 4) {
            return i != 5 ? "null" : "SINGLE_OR_DEFAULT";
        }
        return "SINGLE";
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ int m75742p(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("WAITING_FOR_LOCATION_CHANGE")) {
            return 1;
        }
        if (str.equals("WAITING_FOR_COMPLETION")) {
            return 2;
        }
        throw new IllegalArgumentException("No enum constant com.spotify.ubi.navigationlogger.NavigationTransactionState.".concat(str));
    }
}
