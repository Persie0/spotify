package p204p;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class pi9 {
    /* JADX INFO: renamed from: a */
    public static int m70076a(int i) {
        if (i != 0) {
            return i != 2 ? 0 : 1;
        }
        return 2;
    }

    /* JADX INFO: renamed from: b */
    public static int m70077b(int i) {
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

    /* JADX INFO: renamed from: c */
    public static int m70078c(int i) {
        if (i == 0) {
            return 5;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    return i != 6 ? 0 : 4;
                }
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: d */
    public static final int m70079d(int i) {
        return m70083h(i);
    }

    /* JADX INFO: renamed from: e */
    public static final String m70080e(int i) {
        if (i == 1) {
            return "no_cache";
        }
        if (i == 2) {
            return "disk_cache";
        }
        if (i == 3) {
            return "memory_cache";
        }
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public static int m70081f(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("UNSPECIFIED")) {
            return 1;
        }
        if (str.equals("ALBUM")) {
            return 2;
        }
        if (str.equals("SINGLE")) {
            return 3;
        }
        if (str.equals("EP")) {
            return 4;
        }
        throw new IllegalArgumentException("No enum constant com.spotify.extendedmetadata.extensions.companioncontent.Body.EntityComponent.Entity.Album.AlbumType.".concat(str));
    }

    /* JADX INFO: renamed from: g */
    public static int m70082g(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("UNSPECIFIED")) {
            return 1;
        }
        if (str.equals("ARTWORK")) {
            return 2;
        }
        if (str.equals("FULL_SCREEN")) {
            return 3;
        }
        throw new IllegalArgumentException("No enum constant com.spotify.extendedmetadata.extensions.companioncontent.Body.ViewMode.".concat(str));
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ int m70083h(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        if (i == 5) {
                            return 5;
                        }
                        throw null;
                    }
                }
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ String m70084i(int i) {
        if (i == 1) {
            return "periodic";
        }
        if (i == 2) {
            return "active_device_changed";
        }
        throw null;
    }

    /* JADX INFO: renamed from: j */
    public static LinkedHashSet m70085j(LinkedHashMap linkedHashMap, String str, eo61 eo61Var) {
        linkedHashMap.put(str, eo61Var);
        return new LinkedHashSet();
    }

    /* JADX INFO: renamed from: k */
    public static void m70086k(float f, StringBuilder sb, String str) {
        sb.append((Object) ybs.m93302c(f));
        sb.append(str);
    }

    /* JADX INFO: renamed from: l */
    public static void m70087l(int i, xq00 xq00Var, int i2, yhh yhhVar) {
        xq00Var.m91793t0(Integer.valueOf(i));
        xq00Var.m91756b(Integer.valueOf(i2), yhhVar);
    }

    /* JADX INFO: renamed from: m */
    public static void m70088m(int i, xq00 xq00Var, yhh yhhVar, xq00 xq00Var2, vlh vlhVar) {
        zsf1.m96835F(Integer.valueOf(i), yhhVar, xq00Var);
        zsf1.m96833D(vlhVar, xq00Var2);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ boolean m70089n(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, bqa bqaVar, Object obj, C2617yl c2617yl) {
        while (!atomicReferenceFieldUpdater.compareAndSet(bqaVar, obj, c2617yl)) {
            if (atomicReferenceFieldUpdater.get(bqaVar) != obj) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ boolean m70090o(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, bqa bqaVar, ffz0 ffz0Var, vnc vncVar) {
        while (!atomicReferenceFieldUpdater.compareAndSet(bqaVar, ffz0Var, vncVar)) {
            if (atomicReferenceFieldUpdater.get(bqaVar) != ffz0Var) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ boolean m70091p(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, bqa bqaVar, ffz0 ffz0Var, ffz0 ffz0Var2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(bqaVar, ffz0Var, ffz0Var2)) {
            if (atomicReferenceFieldUpdater.get(bqaVar) != ffz0Var) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ String m70092q(int i) {
        if (i == 1) {
            return "SERVICE_DATA";
        }
        if (i == 2) {
            return "LOCAL_NAME";
        }
        if (i == 3) {
            return "OVERFLOW_AREA";
        }
        throw null;
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ String m70093r(int i) {
        switch (i) {
            case 1:
                return "COMMERCE_AUCTION";
            case 2:
                return "COMMERCE_BUSINESS";
            case 3:
                return "COMMERCE_OTHER";
            case 4:
                return "COMMERCE_PRODUCT";
            case 5:
                return "COMMERCE_RESTAURANT";
            case 6:
                return "COMMERCE_SERVICE";
            case 7:
                return "COMMERCE_TRAVEL_FLIGHT";
            case 8:
                return "COMMERCE_TRAVEL_HOTEL";
            case 9:
                return "COMMERCE_TRAVEL_OTHER";
            case 10:
                return "GAME_STATE";
            case 11:
                return "MEDIA_IMAGE";
            case 12:
                return "MEDIA_MIXED";
            case 13:
                return "MEDIA_MUSIC";
            case 14:
                return "MEDIA_OTHER";
            case 15:
                return "MEDIA_VIDEO";
            case 16:
                return "OTHER";
            case 17:
                return "TEXT_ARTICLE";
            case 18:
                return "TEXT_BLOG";
            case 19:
                return "TEXT_OTHER";
            case 20:
                return "TEXT_RECIPE";
            case 21:
                return "TEXT_REVIEW";
            case 22:
                return "TEXT_SEARCH_RESULTS";
            case 23:
                return "TEXT_STORY";
            case 24:
                return "TEXT_TECHNICAL_DOC";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ String m70094s(int i) {
        switch (i) {
            case 1:
                return "INITIAL";
            case 2:
                return "SEEK";
            case 3:
                return "STALL";
            case 4:
                return "STUTTER";
            case 5:
                return "FORCED";
            case 6:
                return "UNKNOWN";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ String m70095t(int i) {
        if (i == 1) {
            return "SUSPEND";
        }
        if (i != 2) {
            return i != 3 ? "null" : "DROP_LATEST";
        }
        return "DROP_OLDEST";
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ String m70096u(int i) {
        if (i == 1) {
            return "ERROR_USER_NEEDS_AUTHORIZATION";
        }
        if (i == 2) {
            return "ERROR_NOT_LOGGED_IN";
        }
        if (i == 3) {
            return "ERROR_OFFLINE_MODE_ACTIVE";
        }
        if (i != 4) {
            return i != 5 ? "null" : "ERROR_AUTHORIZATION_RESPONSE";
        }
        return "ERROR_AUTHORIZATION_TIMEOUT";
    }
}
