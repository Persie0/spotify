package p204p;

import com.spotify.cosmos.cosmos.Request;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class f710 {
    public static int[] _values() {
        return edb.m38551G(7);
    }

    /* JADX INFO: renamed from: a */
    public static int m40933a(int i) {
        switch (i) {
            case 0:
                return 7;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final String m40934b(int i) {
        return m40936d(i);
    }

    /* JADX INFO: renamed from: c */
    public static final String m40935c(int i) {
        if (i == 1) {
            return "none";
        }
        if (i == 2) {
            return "Android-GPBL-V1";
        }
        if (i == 3) {
            return "Android-GPBL-V2-V4";
        }
        if (i == 4) {
            return "Android-GPBL-V5-V7";
        }
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m40936d(int i) {
        if (i == 1) {
            return "spotify:section:0JQ5DAroEmF9ANbLaiJ7XR";
        }
        if (i == 2) {
            return "spotify:section:0JQ5DAIiKWzVFULQfUm85Y";
        }
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ String m40937e(int i) {
        if (i == 1) {
            return "webview_create";
        }
        if (i == 2) {
            return "page_load";
        }
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public static int m40938f(int i, int i2, int i3) {
        return (edb.m38547C(i) + i2) * i3;
    }

    /* JADX INFO: renamed from: g */
    public static Observable m40939g(cbm0 cbm0Var, fnm0 fnm0Var, int i) {
        return Observable.just(new tmm0(cbm0Var, fnm0Var, i));
    }

    /* JADX INFO: renamed from: h */
    public static fxh0 m40940h(float f, fxh0 fxh0Var, boolean z) {
        return fxh0Var.mo34315F(new cr70(f, z));
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ String m40941i(int i) {
        if (i == 1) {
            return "SPOTIFY_GO_PARSE_ERROR";
        }
        if (i == 2) {
            return "SPOTIFY_GO_UNAUTHORIZED_COMMAND_TYPE";
        }
        if (i == 3) {
            return "SPOTIFY_GO_DISABLED_CLIENT_ID";
        }
        if (i == 4) {
            return "SPOTIFY_GO_UNAUTHORIZED_CLIENT_ID";
        }
        throw null;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ String m40942j(int i) {
        if (i == 1) {
            return "CACHE";
        }
        if (i == 2) {
            return "NETWORK";
        }
        throw null;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ String m40943k(int i) {
        if (i == 1) {
            return "SHORTCUT";
        }
        if (i == 2) {
            return "HERO";
        }
        if (i == 3) {
            return "FEED";
        }
        if (i == 4) {
            return "UNKNOWN";
        }
        throw null;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ String m40944l(int i) {
        switch (i) {
            case 1:
                return Request.GET;
            case 2:
                return Request.POST;
            case 3:
                return Request.PUT;
            case 4:
                return "PATCH";
            case 5:
                return Request.DELETE;
            case 6:
                return "HEAD";
            case 7:
                return "CONNECT";
            case 8:
                return "OPTIONS";
            case 9:
                return "TRACE";
            default:
                return "null";
        }
    }
}
