package p204p;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class rbz {
    /* JADX INFO: renamed from: a */
    public static int m75183a(int i) {
        switch (i) {
            case 0:
                return 9;
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
            case 7:
                return 7;
            case 8:
                return 8;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m75184b(int i) {
        if (i != 0) {
            return i != 4 ? 0 : 1;
        }
        return 2;
    }

    /* JADX INFO: renamed from: c */
    public static int m75185c(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("CAPPED")) {
            return 1;
        }
        if (str.equals("ENTITLEMENT_MISSING")) {
            return 2;
        }
        throw new IllegalArgumentException("No enum constant com.spotify.upsells.api.GatedFeatureContext.Reason.".concat(str));
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m75186d(int i) {
        if (i == 1) {
            return "suggestedDeviceBecameUnavailable";
        }
        if (i == 2) {
            return "connectedToAnotherDevice";
        }
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ String m75187e(int i) {
        if (i == 1) {
            return "activity";
        }
        if (i == 2) {
            return "service";
        }
        if (i == 3) {
            return "receiver";
        }
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ String m75188f(int i) {
        switch (i) {
            case 1:
                return "enable_phone_number_with_new_tc";
            case 2:
                return "google_login_enabled";
            case 3:
                return "google_registration_enabled";
            case 4:
                return "naver_login_enabled";
            case 5:
                return "naver_registration_enabled";
            case 6:
                return "enable_samsung_login";
            case 7:
                return "enable_samsung_login_using_single_sign_in";
            case 8:
                return "mobile_enable_south_korea_experience";
            case 9:
                return "mobile_disable_facebook_login";
            case 10:
                return "mobile_disable_facebook_signup";
            case 11:
                return "disable_to_in_test_suite";
            case 12:
                return "enable_navigate_to_home_in_test_suite";
            case 13:
                return "android_disable_too_many_requests_dialog";
            default:
                throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x009d A[SYNTHETIC] */
    /* JADX INFO: renamed from: g */
    public static /* synthetic */ long m75189g(String str) {
        long j;
        long j2;
        long j3;
        int length = str.length();
        if (length == 0) {
            throw new NumberFormatException("empty string");
        }
        int i = 16;
        long j4 = 16;
        long j5 = 0;
        int i2 = 0;
        long j6 = Long.MIN_VALUE;
        if (j4 >= 0) {
            long j7 = (Long.MAX_VALUE / j4) << 1;
            j = j7 + ((long) ((((-1) - (j7 * j4)) ^ Long.MIN_VALUE) >= (j4 ^ Long.MIN_VALUE) ? 1 : 0));
        } else if (Long.MAX_VALUE < (j4 ^ Long.MIN_VALUE)) {
            j = 0;
            j5 = 0;
        } else {
            j = 1;
            j5 = 0;
        }
        if (str.charAt(0) == '+' && length > 1) {
            i2 = 1;
        }
        long j8 = j5;
        while (i2 < length) {
            long j9 = j6;
            int iDigit = Character.digit(str.charAt(i2), i);
            if (iDigit == -1) {
                throw new NumberFormatException(str.toString());
            }
            if (j8 >= j5 && j8 <= j) {
                if (j8 == j) {
                    if (j4 < 0) {
                        if (Long.MAX_VALUE < (j4 ^ j9)) {
                            j3 = -1;
                        } else {
                            j2 = (-1) - j4;
                        }
                        if (iDigit <= ((int) j3)) {
                        }
                    } else {
                        long j10 = (-1) - (((Long.MAX_VALUE / j4) << 1) * j4);
                        j2 = j10 - ((j10 ^ j9) >= (j4 ^ j9) ? j4 : j5);
                    }
                    j3 = j2;
                    if (iDigit <= ((int) j3)) {
                    }
                } else {
                    j4 = j4;
                }
                j8 = (j8 * j4) + ((long) iDigit);
                i2++;
                j6 = j9;
                j4 = j4;
                i = 16;
            }
            throw new NumberFormatException("Too large for unsigned long: ".concat(str.toString()));
        }
        return j8;
    }

    /* JADX INFO: renamed from: h */
    public static String m75190h(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    /* JADX INFO: renamed from: i */
    public static StringBuilder m75191i(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    /* JADX INFO: renamed from: j */
    public static pqm0 m75192j(int i, int i2, Integer num) {
        return new pqm0(new si21(i, i2), num);
    }

    /* JADX INFO: renamed from: k */
    public static pqm0 m75193k(int i, bha bhaVar) {
        return new pqm0(bhaVar, new to70(i));
    }

    /* JADX INFO: renamed from: l */
    public static pqm0 m75194l(int i, bcj bcjVar) {
        return new pqm0(bcjVar, new qbj(i));
    }

    /* JADX INFO: renamed from: m */
    public static pqm0 m75195m(int i, fox0 fox0Var) {
        return new pqm0(fox0Var, new to70(i));
    }

    /* JADX INFO: renamed from: n */
    public static void m75196n(int i, fyf fyfVar, xq00 xq00Var, boolean z) {
        fyfVar.invoke(xq00Var, Integer.valueOf(i));
        xq00Var.m91788r(z);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m75197o(AtomicReference atomicReference, Object obj) {
        while (!atomicReference.compareAndSet(obj, null) && atomicReference.get() == obj) {
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m75198p(ybs ybsVar, String str, v5j v5jVar) {
        v5jVar.m84728h(new vjr(ybsVar, str));
    }

    /* JADX INFO: renamed from: q */
    public static void m75199q(cxh0 cxh0Var, float f, xq00 xq00Var, boolean z) {
        riw0.m75615i(xq00Var, mi21.m61834r(f, cxh0Var));
        xq00Var.m91788r(z);
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ String m75200r(int i) {
        switch (i) {
            case 1:
                return "EXPLICIT";
            case 2:
                return "TIMER";
            case 3:
                return "SESSION_CHANGE";
            case 4:
                return "PERSISTED_EVENTS";
            case 5:
                return "EVENT_THRESHOLD";
            case 6:
                return "EAGER_FLUSHING_EVENT";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ String m75201s(int i) {
        switch (i) {
            case 1:
                return "BANNER";
            case 2:
                return "BOTTOM_SHEET";
            case 3:
                return "FULLSCREEN";
            case 4:
                return "INLINE_CARD";
            case 5:
                return "MODAL";
            case 6:
                return "SNACKBAR";
            case 7:
                return "TOOLTIP";
            case 8:
                return "WEB_VIEW";
            case 9:
                return "TYPE_NOT_SET";
            default:
                throw null;
        }
    }
}
