package p204p;

import android.content.Intent;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class p1v {
    public static int[] _values() {
        return edb.m38551G(3);
    }

    /* JADX INFO: renamed from: a */
    public static int m68844a(int i) {
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
    public static int m68845b(int i) {
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

    /* JADX INFO: renamed from: c */
    public static int m68846c(int i) {
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

    /* JADX INFO: renamed from: d */
    public static int m68847d(int i) {
        if (i == 0) {
            return 8;
        }
        switch (i) {
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
                return 3;
            case 6:
                return 4;
            case 7:
                return 5;
            case 8:
                return 6;
            case 9:
                return 7;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m68848e(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i != 4) {
            return i != 5 ? 0 : 6;
        }
        return 5;
    }

    /* JADX INFO: renamed from: f */
    public static final int m68849f(int i) {
        return edb.m38547C(i);
    }

    /* JADX INFO: renamed from: g */
    public static final String m68850g(int i) {
        if (i == 1) {
            return "event_viewed";
        }
        if (i == 2) {
            return "event_clicked";
        }
        if (i == 3) {
            return "event_ui";
        }
        throw null;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ String m68851h(int i) {
        switch (i) {
            case 1:
                return "SUBMIT_FAILED";
            case 2:
                return "READY_FOR_PAYMENT_ERROR";
            case 3:
                return "INTENT_FAILED";
            case 4:
                return "REDIRECT_FAILED";
            case 5:
                return "PAYMENT_ERROR";
            case 6:
                return "ABUSE_BLOCK";
            case 7:
                return "PAYMENT_METHOD_ABUSE_BLOCK";
            case 8:
                return "COUNTRY_MISMATCH";
            case 9:
                return "PCI_TOKEN_ERROR";
            case 10:
                return "CALLBACK_FAILED";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ String m68852i(int i) {
        switch (i) {
            case 1:
                return "facebook_generic";
            case 2:
                return "region_missmatch";
            case 3:
                return "generic";
            case 4:
                return "email_already_exist";
            case 5:
                return "too_short_password";
            case 6:
                return "too_weak_password";
            case 7:
                return "email_format_wrong";
            case 8:
                return "too_young_age";
            case 9:
                return "too_old_age";
            case 10:
                return "invalid_country";
            case 11:
                return "invalid_argument";
            case 12:
                return "no_connection";
            case 13:
                return "network_disabled";
            case 14:
                return "rate_limit";
            case 15:
                return "age_generic";
            case 16:
                return "invalid_form_data";
            case 17:
                return "samsung_effortless_login_failure";
            case 18:
                return "request_from_datacenter";
            case 19:
                return "third_party_auth_failed";
            case 20:
                return "third_party_auth_no_email";
            case 21:
                return "signup_configuration_fetch_failed";
            case 22:
                return "adaptive_auth_api_create";
            case 23:
                return "adaptive_auth_api_get_session";
            case 24:
                return "adaptive_auth_api_complete_creation";
            case 25:
                return "adaptive_auth_challenge_in_progress";
            case 26:
                return "adaptive_auth_session_id_mismatch";
            case 27:
                return "error_endpoint_login_otp-session-expired";
            case 28:
                return "error_endpoint_login_otp-too-many-attempts";
            case 29:
                return "error_sdk_auth-client_challenge-proceed";
            case 30:
                return "error_sdk_auth-client_resend-code";
            case 31:
                return "email_not_linked";
            case 32:
                return "error_endpoint_accountrecovery-v1_username-hint";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: j */
    public static int m68853j(int i, eh00 eh00Var, int i2) {
        return (eh00Var.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: k */
    public static String m68854k(Intent intent) {
        return r46.m74726U(intent.getDataString()).m35694A();
    }

    /* JADX INFO: renamed from: l */
    public static g4h0 m68855l(ebg0 ebg0Var, ebg0 ebg0Var2, String str, String str2, String str3) {
        ebg0Var.getClass();
        return new g4h0(ebg0Var2, str, str2, str3);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ String m68856m(int i) {
        if (i == 1) {
            return "Artist";
        }
        if (i == 2) {
            return "Podcast";
        }
        if (i == 3) {
            return "Event";
        }
        if (i == 4) {
            return "ImportMusic";
        }
        throw null;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ String m68857n(int i) {
        switch (i) {
            case 1:
                return "ALBUM";
            case 2:
                return "ARTIST";
            case 3:
                return "AUDIOBOOK";
            case 4:
                return "EPISODE";
            case 5:
                return "PLAYLIST";
            case 6:
                return "PODCAST";
            case 7:
                return "TRACK";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ String m68858o(int i) {
        if (i == 1) {
            return "NO_MATCH";
        }
        if (i == 2) {
            return "UNAVAILABLE";
        }
        if (i == 3) {
            return "UNKNOWN";
        }
        throw null;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ String m68859p(int i) {
        switch (i) {
            case 1:
                return "ARTIST";
            case 2:
                return "ALBUM";
            case 3:
                return "TRACK";
            case 4:
                return "PLAYLIST";
            case 5:
                return "SHOW";
            case 6:
                return "EPISODE";
            case 7:
                return "AUDIOBOOK";
            case 8:
                return "ENTITY_NOT_SET";
            default:
                return "null";
        }
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ String m68860q(int i) {
        if (i == 1) {
            return "EXPLICIT";
        }
        if (i != 2) {
            return i != 3 ? "null" : "NONE";
        }
        return "OVER19ONLY";
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ String m68861r(int i) {
        switch (i) {
            case 1:
                return "NO_ERROR";
            case 2:
                return "PROTOCOL_ERROR";
            case 3:
                return "INTERNAL_ERROR";
            case 4:
                return "FLOW_CONTROL_ERROR";
            case 5:
                return "SETTINGS_TIMEOUT";
            case 6:
                return "STREAM_CLOSED";
            case 7:
                return "FRAME_SIZE_ERROR";
            case 8:
                return "REFUSED_STREAM";
            case 9:
                return "CANCEL";
            case 10:
                return "COMPRESSION_ERROR";
            case 11:
                return "CONNECT_ERROR";
            case 12:
                return "ENHANCE_YOUR_CALM";
            case 13:
                return "INADEQUATE_SECURITY";
            case 14:
                return "HTTP_1_1_REQUIRED";
            default:
                return "null";
        }
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ int m68862s(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("NO_MATCH")) {
            return 1;
        }
        if (str.equals("UNAVAILABLE")) {
            return 2;
        }
        if (str.equals("UNKNOWN")) {
            return 3;
        }
        throw new IllegalArgumentException("No enum constant com.spotify.pagematch.errorpage.ErrorType.".concat(str));
    }
}
