package p204p;

import io.reactivex.rxjava3.core.ObservableConverter;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class z0k0 {
    public static int[] _values() {
        return edb.m38551G(3);
    }

    /* JADX INFO: renamed from: a */
    public static int m95064a(int i) {
        if (i == 0) {
            return 5;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i != 4) {
            return i != 5 ? 0 : 4;
        }
        return 3;
    }

    /* JADX INFO: renamed from: b */
    public static int m95065b(Boolean bool) {
        if (bool == null) {
            return 1;
        }
        return bool.booleanValue() ? 2 : 3;
    }

    /* JADX INFO: renamed from: c */
    public static final String m95066c(int i) {
        return m95071h(i);
    }

    /* JADX INFO: renamed from: d */
    public static final String m95067d(int i) {
        return m95073j(i);
    }

    /* JADX INFO: renamed from: e */
    public static int m95068e(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("PRIMARY")) {
            return 1;
        }
        if (str.equals("SECONDARY")) {
            return 2;
        }
        if (str.equals("TERTIARY")) {
            return 3;
        }
        if (str.equals("QUATERNARY")) {
            return 4;
        }
        throw new IllegalArgumentException("No enum constant com.spotify.profile.profilelist.model.PaginationPhase.".concat(str));
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ String m95069f(int i) {
        if (i == 1) {
            return "HmacSHA1";
        }
        if (i == 2) {
            return "HmacSHA256";
        }
        if (i == 3) {
            return "HmacSHA512";
        }
        throw null;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ boolean m95070g(int i) {
        if (i == 1) {
            return false;
        }
        if (i == 2 || i == 3) {
            return true;
        }
        if (i == 4 || i == 5) {
            return false;
        }
        throw null;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ String m95071h(int i) {
        switch (i) {
            case 1:
                return "NOTIFICATION_SETTINGS";
            case 2:
                return "MESSAGING";
            case 3:
                return "PROMPTED_PLAYLISTS";
            case 4:
                return "COMMENTS";
            case 5:
                return "CHATS";
            case 6:
                return "LIVE_EVENTS";
            case 7:
                return "NOTIFICATIONS";
            case 8:
                return "ONBOARDING";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ boolean m95072i(int i) {
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            return false;
        }
        if (i == 5) {
            return true;
        }
        throw null;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ String m95073j(int i) {
        if (i == 1) {
            return "cancellation";
        }
        if (i == 2) {
            return "failure";
        }
        if (i == 3) {
            return "success";
        }
        throw null;
    }

    /* JADX INFO: renamed from: k */
    public static void m95074k(int i, th00 th00Var, xq00 xq00Var, boolean z) {
        th00Var.invoke(xq00Var, Integer.valueOf(i));
        xq00Var.m91788r(z);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m95075l(ObservableConverter observableConverter) {
        if (observableConverter != null) {
            throw new ClassCastException();
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m95076m(qfm0 qfm0Var) {
        if (qfm0Var != null) {
            throw new ClassCastException();
        }
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ boolean m95077n(AtomicReference atomicReference, SpscLinkedArrayQueue spscLinkedArrayQueue) {
        while (!atomicReference.compareAndSet(null, spscLinkedArrayQueue)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ boolean m95078o(AtomicReference atomicReference, Object obj) {
        while (!atomicReference.compareAndSet(obj, null)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ String m95079p(int i) {
        switch (i) {
            case 1:
                return "CDP_ALBUM";
            case 2:
                return "LE_EVENT";
            case 3:
                return "LE_ARTIST_EVENTS";
            case 4:
                return "NOTIFICATION_PREFERENCE_SETTINGS_TOGGLE";
            case 5:
                return "AUDIOBOOK_PRERELEASE_PRESAVE_BUTTON";
            case 6:
                return "NPV_PRERELEASE_PRESAVE_BUTTON";
            case 7:
                return "MARQUEE_PRERELEASE_PRESAVE_BUTTON";
            case 8:
                return "MESSAGING_NOTIFICATION_OPT_IN_NUDGE";
            default:
                throw null;
        }
    }
}
