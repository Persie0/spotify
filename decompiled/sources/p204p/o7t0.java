package p204p;

import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobius.Connection;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class o7t0 {
    /* JADX INFO: renamed from: a */
    public static final String m66387a(int i) {
        if (i == 1) {
            return "user_rating_permitted";
        }
        if (i == 2) {
            return "user_rating_forbidden";
        }
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public static final String m66388b(int i) {
        return m66393g(i);
    }

    /* JADX INFO: renamed from: c */
    public static final String m66389c(int i) {
        if (i == 1) {
            return "load";
        }
        if (i == 2) {
            return "add";
        }
        if (i == 3) {
            return "delete";
        }
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public static int m66390d(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("UNSPECIFIED")) {
            return 1;
        }
        if (str.equals("REQUESTED")) {
            return 2;
        }
        if (str.equals("PENDING")) {
            return 3;
        }
        if (str.equals("DOWNLOADING")) {
            return 4;
        }
        if (str.equals("DOWNLOADED")) {
            return 5;
        }
        if (str.equals("FAILURE")) {
            return 6;
        }
        throw new IllegalArgumentException("No enum constant com.spotify.offline.util.Resource.State.".concat(str));
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ String m66391e(int i) {
        switch (i) {
            case 1:
                return "Unknown Error";
            case 2:
                return "Network Error";
            case 3:
                return "Site key invalid";
            case 4:
                return "Key type invalid";
            case 5:
                return "Package name not allowed";
            case 6:
                return "Invalid action name, may only include alphanumeric characters like [A-Z], [a-z], [0-9], / and _. Do not include user-specific information";
            case 7:
                return "Invalid timeout, minimum value is 5_000L milliseconds";
            case 8:
                return "No network found on device";
            case 9:
                return "Internal Error";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ int m66392f(int i) {
        switch (i) {
            case 1:
                return 2;
            case 2:
                return 8;
            case 3:
                return 16;
            case 4:
                return 1;
            case 5:
                return 4;
            case 6:
                return 32;
            case 7:
                return 128;
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ String m66393g(int i) {
        if (i == 1) {
            return "PENDING";
        }
        if (i == 2) {
            return "PURCHASED";
        }
        if (i == 3) {
            return "UNSPECIFIED_STATE";
        }
        throw null;
    }

    /* JADX INFO: renamed from: h */
    public static float m66394h(float f, float f2, float f3, float f4) {
        return (f3 - (f * f2)) * f4;
    }

    /* JADX INFO: renamed from: i */
    public static String m66395i(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.m988G());
        return sb.toString();
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m66396j(AtomicReference atomicReference, p7t0 p7t0Var) {
        while (!atomicReference.compareAndSet(p7t0Var, null) && atomicReference.get() == p7t0Var) {
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ boolean m66397k(AtomicReference atomicReference, Object obj, Connection connection) {
        while (!atomicReference.compareAndSet(obj, connection)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ String m66398l(int i) {
        switch (i) {
            case 1:
                return "REASON_UNSPECIFIED";
            case 2:
                return "REASON_CONTENT_SHARING";
            case 3:
                return "REASON_COLLABORATIVE_PLAYLISTS";
            case 4:
                return "REASON_BLENDS";
            case 5:
                return "REASON_GROUP_SESSIONS";
            case 6:
                return "REASON_FAMILY";
            case 7:
                return "REASON_FOLLOWING";
            case 8:
                return "REASON_MESSAGING";
            case 9:
                return "REASON_WRAPPED_PARTY";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ String m66399m(int i) {
        if (i == 1) {
            return "SQUARE";
        }
        if (i == 2) {
            return "CIRCLE";
        }
        throw null;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ String m66400n(int i) {
        if (i != 1) {
            return i != 2 ? "null" : "Rtl";
        }
        return "Ltr";
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ String m66401o(int i) {
        if (i == 1) {
            return "AUTOMATIC";
        }
        if (i != 2) {
            return i != 3 ? "null" : "WRITE_AHEAD_LOGGING";
        }
        return "TRUNCATE";
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ int m66402p(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("REASON_UNSPECIFIED")) {
            return 1;
        }
        if (str.equals("REASON_CONTENT_SHARING")) {
            return 2;
        }
        if (str.equals("REASON_COLLABORATIVE_PLAYLISTS")) {
            return 3;
        }
        if (str.equals("REASON_BLENDS")) {
            return 4;
        }
        if (str.equals("REASON_GROUP_SESSIONS")) {
            return 5;
        }
        if (str.equals("REASON_FAMILY")) {
            return 6;
        }
        if (str.equals("REASON_FOLLOWING")) {
            return 7;
        }
        if (str.equals("REASON_MESSAGING")) {
            return 8;
        }
        if (str.equals("REASON_WRAPPED_PARTY")) {
            return 9;
        }
        throw new IllegalArgumentException("No enum constant com.spotify.campfire.models.Reason.".concat(str));
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ int m66403q(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("SQUARE")) {
            return 1;
        }
        if (str.equals("CIRCLE")) {
            return 2;
        }
        throw new IllegalArgumentException("No enum constant com.spotify.allboarding.allboardingdomain.model.RenderType.".concat(str));
    }
}
