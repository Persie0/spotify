package p204p;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class tfe {
    public static int[] _values() {
        return edb.m38551G(5);
    }

    /* JADX INFO: renamed from: a */
    public static int m80643a(int i) {
        if (i == 0) {
            return 5;
        }
        if (i == 3) {
            return 1;
        }
        if (i == 8) {
            return 4;
        }
        if (i != 5) {
            return i != 6 ? 0 : 3;
        }
        return 2;
    }

    /* JADX INFO: renamed from: b */
    public static final String m80644b(int i) {
        return m80646d(i);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m80645c(int i) {
        return i == 6 || i == 4;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m80646d(int i) {
        switch (i) {
            case 1:
                return "next";
            case 2:
                return "male";
            case 3:
                return "female";
            case 4:
                return "none_binary";
            case 5:
                return "other";
            case 6:
                return "prefer_not_to_say";
            case 7:
                return "dismiss";
            case 8:
                return "ok";
            case 9:
                return "back_pressed";
            case 10:
                return "back_button";
            case 11:
                return "sign_up";
            case 12:
                return "login";
            case 13:
                return "facebook";
            case 14:
                return "google_auth_button";
            case 15:
                return "naver_auth_button";
            case 16:
                return "cancel";
            case 17:
                return "magiclink_reset_password";
            case 18:
                return "open_email_app";
            case 19:
                return "magiclink_send_request";
            case 20:
                return "get_help";
            case 21:
                return "try_again_button";
            case 22:
                return "phone_number_sign_up";
            case 23:
                return "choose_calling_code";
            case 24:
                return "request_otp";
            case 25:
                return "resend_sms";
            case 26:
                return "resend_email";
            case 27:
                return "resend_email_otp";
            case 28:
                return "login_with_password";
            case 29:
                return "edit_phone_number";
            case 30:
                return "validate_otp";
            case 31:
                return "samsung_effortless_login_started";
            case 32:
                return "samsung_effortless_login_dismissed";
            case 33:
                return "log_out";
            case 34:
                return "more_options_button";
            case 35:
                return "google_registration_disabled_email_signup_button";
            case 36:
                return "google_registration_disabled_dismiss_button";
            case 37:
                return "account_switching_close_button";
            case 38:
                return "continue";
            case 39:
                return "dismiss";
            case 40:
                return "support";
            case 41:
                return "retry";
            case 42:
                return "contact";
            case 43:
                return "create_account";
            case 44:
                return "passkey_auth_button";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m80647e(int i, byte[] bArr, int i2) {
        return (Arrays.hashCode(bArr) + i) * i2;
    }

    /* JADX INFO: renamed from: f */
    public static int m80648f(c1x0 c1x0Var, int i, int i2) {
        return (Integer.hashCode(c1x0Var.f33215a) + i) * i2;
    }

    /* JADX INFO: renamed from: g */
    public static String m80649g(int i, String str, String str2) {
        return i + str + str2;
    }

    /* JADX INFO: renamed from: h */
    public static String m80650h(Exception exc, String str) {
        return str + exc;
    }

    /* JADX INFO: renamed from: i */
    public static String m80651i(cxh0 cxh0Var, float f, xq00 xq00Var, int i, xq00 xq00Var2) {
        riw0.m75615i(xq00Var, mi21.m61824h(f, cxh0Var));
        return k0e1.m54977L(i, xq00Var2);
    }

    /* JADX INFO: renamed from: j */
    public static StringBuilder m80652j(String str, kn91 kn91Var, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(kn91Var);
        sb.append(str2);
        return sb;
    }

    /* JADX INFO: renamed from: k */
    public static j15 m80653k(g15 g15Var, int i, xq00 xq00Var, boolean z) {
        g15Var.m43335k(i);
        j15 j15VarM43339o = g15Var.m43339o();
        xq00Var.m91788r(z);
        return j15VarM43339o;
    }

    /* JADX INFO: renamed from: l */
    public static sep m80654l(float f, float f2, float f3, float f4) {
        sep sepVar = new sep(3, false);
        sepVar.m77945s(f, f2);
        sepVar.m77943q(f3, f4);
        return sepVar;
    }

    /* JADX INFO: renamed from: m */
    public static fxh0 m80655m(ub9 ub9Var, fxh0 fxh0Var) {
        return fxh0Var.mo34315F(new o630(ub9Var));
    }

    /* JADX INFO: renamed from: n */
    public static woi0 m80656n(xq00 xq00Var) {
        woi0 woi0Var = new woi0();
        xq00Var.m91793t0(woi0Var);
        return woi0Var;
    }

    /* JADX INFO: renamed from: o */
    public static void m80657o(String str, String str2) {
        yif1.m93819w0(str + str2);
    }

    /* JADX INFO: renamed from: p */
    public static void m80658p(sep sepVar, float f, float f2, float f3, float f4) {
        sepVar.m77943q(f, f2);
        sepVar.m77943q(f3, f4);
        sepVar.m77937k();
    }

    /* JADX INFO: renamed from: q */
    public static void m80659q(cxh0 cxh0Var, float f, xq00 xq00Var, xq00 xq00Var2, boolean z) {
        riw0.m75615i(xq00Var, mi21.m61824h(f, cxh0Var));
        xq00Var2.m91788r(z);
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ boolean m80660r(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ boolean m80661s(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, ahi ahiVar, Object obj, ahi ahiVar2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(ahiVar, obj, ahiVar2)) {
            if (atomicReferenceFieldUpdater.get(ahiVar) != obj) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ String m80662t(int i) {
        if (i == 1) {
            return "S256";
        }
        if (i == 2) {
            return "PLAIN";
        }
        throw null;
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ String m80663u(int i) {
        if (i == 1) {
            return "NONE";
        }
        if (i != 2) {
            return i != 3 ? "null" : "POLYMORPHIC";
        }
        return "ALL_JSON_OBJECTS";
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ String m80664v(int i) {
        if (i == 1) {
            return "IMAGE";
        }
        if (i == 2) {
            return "LOOPING_VIDEO";
        }
        if (i == 3) {
            return "ENTITY_COMPONENT";
        }
        if (i != 4) {
            return i != 5 ? "null" : "BODY_NOT_SET";
        }
        return "EXTERNAL_LINK";
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ int m80665w(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("CONNECTING")) {
            return 1;
        }
        if (str.equals("INCOMPATIBLE")) {
            return 2;
        }
        if (str.equals("UNAVAILABLE")) {
            return 3;
        }
        if (str.equals("LOGGED_IN")) {
            return 4;
        }
        if (str.equals("NOT_LOGGED_IN")) {
            return 5;
        }
        if (str.equals("PREMIUM_REQUIRED")) {
            return 6;
        }
        if (str.equals("NOT_INSTALLED")) {
            return 7;
        }
        if (str.equals("UNSUPPORTED_URI")) {
            return 8;
        }
        if (str.equals("SLEEPING")) {
            return 9;
        }
        if (str.equals("NOT_AUTHORIZED")) {
            return 10;
        }
        if (str.equals("AD_PLAYING")) {
            return 11;
        }
        if (str.equals("NARRATION")) {
            return 12;
        }
        if (str.equals("TIMED_OUT_WAKEUP")) {
            return 13;
        }
        if (str.equals("WAKING_UP")) {
            return 14;
        }
        if (str.equals("NOT_LOADED")) {
            return 15;
        }
        if (str.equals("WOL")) {
            return 16;
        }
        if (str.equals("BUSY")) {
            return 17;
        }
        if (str.equals("INSTALLATION_AVAILABLE")) {
            return 18;
        }
        if (str.equals("INSTALLING")) {
            return 19;
        }
        if (str.equals("MANAGED_ACCOUNT_ON_DISALLOWED_DEVICE")) {
            return 20;
        }
        if (str.equals("UNSUPPORTED_VERSION")) {
            return 21;
        }
        if (str.equals("UNKNOWN")) {
            return 22;
        }
        throw new IllegalArgumentException("No enum constant com.spotify.connect.connectaggregator.ConnectAggregatorEntityDeviceState.".concat(str));
    }
}
