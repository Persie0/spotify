package p204p;

import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class y8a0 {
    /* JADX INFO: renamed from: a */
    public static final long m93096a(int i) {
        if (i == 1) {
            return 60000L;
        }
        if (i == 2) {
            return 300000L;
        }
        if (i == 3) {
            return 900000L;
        }
        if (i == 4) {
            return 3600000L;
        }
        if (i == 5) {
            return Long.MAX_VALUE;
        }
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public static final String m93097b(int i) {
        return m93101f(i);
    }

    /* JADX INFO: renamed from: c */
    public static int m93098c(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("NOT_LOADED")) {
            return 1;
        }
        if (str.equals("LOADING")) {
            return 2;
        }
        if (str.equals("LOADED")) {
            return 3;
        }
        if (str.equals("FAILED")) {
            return 4;
        }
        throw new IllegalArgumentException("No enum constant com.spotify.profile.profilelist.model.LoadingState.".concat(str));
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ boolean m93099d(int i) {
        switch (i) {
            case 1:
                return true;
            case 2:
            case 3:
                return false;
            case 4:
            case 5:
                return true;
            case 6:
                return false;
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ String m93100e(int i) {
        if (i == 1) {
            return "success";
        }
        if (i == 2) {
            return "cancel";
        }
        if (i == 3) {
            return "error";
        }
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ String m93101f(int i) {
        if (i == 1) {
            return "facebook";
        }
        if (i == 2) {
            return "instagram";
        }
        throw null;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ Iterator m93102g() {
        try {
            return Arrays.asList(new o24()).iterator();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m93103h(long j, String str, StringBuilder sb) {
        sb.append((Object) n6f.m63771h(j));
        sb.append(str);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m93104i(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, fna0 fna0Var, hna0 hna0Var, hna0 hna0Var2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(fna0Var, hna0Var, hna0Var2) && atomicReferenceFieldUpdater.get(fna0Var) == hna0Var) {
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m93105j(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, hna0 hna0Var, hna0 hna0Var2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(hna0Var, null, hna0Var2) && atomicReferenceFieldUpdater.get(hna0Var) == null) {
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ boolean m93106k(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, vf60 vf60Var, Object obj, njw0 njw0Var) {
        while (!atomicReferenceFieldUpdater.compareAndSet(vf60Var, obj, njw0Var)) {
            if (atomicReferenceFieldUpdater.get(vf60Var) != obj) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ boolean m93107l(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, vf60 vf60Var, vf60 vf60Var2, dnj0 dnj0Var) {
        while (!atomicReferenceFieldUpdater.compareAndSet(vf60Var, vf60Var2, dnj0Var)) {
            if (atomicReferenceFieldUpdater.get(vf60Var) != vf60Var2) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ boolean m93108m(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, ena0 ena0Var, ena0 ena0Var2, ena0 ena0Var3) {
        while (!atomicReferenceFieldUpdater.compareAndSet(ena0Var, ena0Var2, ena0Var3)) {
            if (atomicReferenceFieldUpdater.get(ena0Var) != ena0Var2) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ String m93109n(int i) {
        if (i == 1) {
            return "ACCESS_POINT";
        }
        if (i == 2) {
            return "LOGIN5";
        }
        throw null;
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ String m93110o(int i) {
        if (i == 1) {
            return "UNSYNCED";
        }
        if (i == 2) {
            return "LINE_SYNCED";
        }
        if (i == 3) {
            return "SYLLABLE_SYNCED";
        }
        throw null;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ String m93111p(int i) {
        if (i == 1) {
            return "LEFT";
        }
        if (i == 2) {
            return "CENTER";
        }
        if (i == 3) {
            return "RIGHT";
        }
        throw null;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ String m93112q(int i) {
        if (i == 1) {
            return "None";
        }
        if (i == 2) {
            return "WithTranslation";
        }
        if (i == 3) {
            return "TranslationOnly";
        }
        throw null;
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ String m93113r(int i) {
        if (i == 1) {
            return "SearchHeader";
        }
        if (i == 2) {
            return "SearchField";
        }
        if (i == 3) {
            return "ClearButton";
        }
        if (i == 4) {
            return "BackButton";
        }
        throw null;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ String m93114s(int i) {
        switch (i) {
            case 1:
                return "JAM_NOTIFICATION_SUPPRESSED";
            case 2:
                return "CHAT_NOTIFICATION_SUPPRESSED";
            case 3:
                return "CMP_QA_NOTIFICATION_SUPPRESSED";
            case 4:
                return "SALES_NOTIFICATION_FAILURE";
            case 5:
                return "UNRECOGNIZED";
            case 6:
                return "OS_NOTIFICATIONS_DISABLED";
            case 7:
                return "IMAGE_LOAD_FAILURE";
            case 8:
                return "QAX_PARSE_FAILURE";
            case 9:
                return "METADATA_PARSE_FAILURE";
            case 10:
                return "DEFAULT_NO_ERROR";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ String m93115t(int i) {
        switch (i) {
            case 1:
                return "NATIVE_WITH_FALLBACK";
            case 2:
                return "NATIVE_ONLY";
            case 3:
                return "KATANA_ONLY";
            case 4:
                return "WEB_ONLY";
            case 5:
                return "DIALOG_ONLY";
            case 6:
                return "DEVICE_AUTH";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ String m93116u(int i) {
        if (i == 1) {
            return "ELIGIBILITY_TIMEOUT";
        }
        if (i == 2) {
            return "CONTENT_RESOLUTION_FAILED";
        }
        if (i != 3) {
            return i != 4 ? "null" : "NETWORK_ERROR";
        }
        return "INTERNAL_ERROR";
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ int m93117v(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("UNSYNCED")) {
            return 1;
        }
        if (str.equals("LINE_SYNCED")) {
            return 2;
        }
        if (str.equals("SYLLABLE_SYNCED")) {
            return 3;
        }
        throw new IllegalArgumentException("No enum constant com.spotify.lyrics.data.model.Lyrics.SyncStatus.".concat(str));
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ int m93118w(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("LEFT")) {
            return 1;
        }
        if (str.equals("CENTER")) {
            return 2;
        }
        if (str.equals("RIGHT")) {
            return 3;
        }
        throw new IllegalArgumentException("No enum constant com.spotify.lyrics.share.LyricsAlignment.".concat(str));
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ int m93119x(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("None")) {
            return 1;
        }
        if (str.equals("WithTranslation")) {
            return 2;
        }
        if (str.equals("TranslationOnly")) {
            return 3;
        }
        throw new IllegalArgumentException("No enum constant com.spotify.lyrics.textelement.data.LyricsTextElementProps.DisplaySettings.TranslationDisplay.".concat(str));
    }
}
