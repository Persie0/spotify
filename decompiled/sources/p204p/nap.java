package p204p;

import android.net.Uri;
import android.os.Parcel;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class nap {
    /* JADX INFO: renamed from: A */
    public static /* synthetic */ String m64006A(int i) {
        switch (i) {
            case 1:
                return "UNKNOWN";
            case 2:
                return "HORIZONTAL_DIMENSION";
            case 3:
                return "VERTICAL_DIMENSION";
            case 4:
                return "LEFT";
            case 5:
                return "RIGHT";
            case 6:
                return "TOP";
            case 7:
                return "BOTTOM";
            case 8:
                return "BASELINE";
            default:
                return "null";
        }
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ int m64007B(String str) {
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
        throw new IllegalArgumentException("No enum constant com.spotify.connect.core.model.DeviceState.".concat(str));
    }

    /* JADX INFO: renamed from: a */
    public static int m64008a(String str) {
        return str != null ? 4 : 1;
    }

    /* JADX INFO: renamed from: b */
    public static final int m64009b(int i) {
        return m64015h(i);
    }

    /* JADX INFO: renamed from: c */
    public static final String m64010c(int i) {
        return m64017j(i);
    }

    /* JADX INFO: renamed from: d */
    public static final String m64011d(int i) {
        if (i == 1) {
            return "preinstall_campaign";
        }
        if (i == 2) {
            return "preinstall_partner";
        }
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public static final String m64012e(int i) {
        switch (i) {
            case 1:
                return "v1/url";
            case 2:
                return "v1/app-link-settings";
            case 3:
                return "v1/install";
            case 4:
                return "v1/open";
            case 5:
                return "v1/content-events";
            case 6:
                return "v2/event/standard";
            case 7:
                return "v2/event/custom";
            case 8:
                return "v1/cpid/latd";
            case 9:
                return "v1/qr-code";
            case 10:
                return "local/logout";
            case 11:
                return "local/setIdentity";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static final String m64013f(int i) {
        if (i == 1) {
            return "tny_load";
        }
        if (i == 2) {
            return "p2p_load";
        }
        if (i == 3) {
            return "settings_change";
        }
        if (i == 4) {
            return "periodic_update";
        }
        if (i == 5) {
            return "authorization_change";
        }
        throw null;
    }

    /* JADX INFO: renamed from: g */
    public static final String m64014g(int i) {
        return m64018k(i);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ int m64015h(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    if (i == 4) {
                        return 4;
                    }
                    throw null;
                }
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ String m64016i(int i) {
        if (i == 1) {
            return "X-Branch-Request-Id";
        }
        if (i == 2) {
            return "X-Branch-Send-Close-Request";
        }
        throw null;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ String m64017j(int i) {
        if (i == 1) {
            return "branch_data";
        }
        if (i == 2) {
            return "branch_force_new_session";
        }
        if (i == 3) {
            return "branch_used";
        }
        if (i == 4) {
            return "branch";
        }
        if (i == 5) {
            return "io.branch.sdk.auto_linked";
        }
        throw null;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ String m64018k(int i) {
        switch (i) {
            case 1:
                return "email_already_exist";
            case 2:
                return "signup_terms";
            case 3:
                return "signup_policy";
            case 4:
                return "facebook_login_error";
            case 5:
                return "google_login_error";
            case 6:
                return "no_network_error";
            case 7:
                return "unknown_error";
            case 8:
                return "no_network_retry_error";
            case 9:
                return "reset_password_get_help";
            case 10:
                return "phone_number_error";
            case 11:
                return "phone_number_invalid_number";
            case 12:
                return "phone_number_resend_too_early";
            case 13:
                return "phone_nubmer_timeout";
            case 14:
                return "phone_nubmer_too_many_tries";
            case 15:
                return "phone_nubmer_try_again_later";
            case 16:
                return "retry_facebook";
            case 17:
                return "google_registration_disabled_popup";
            case 18:
                return "facebook_registration_disabled_popup";
            case 19:
                return "email_not_linked";
            case 20:
                return "none";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: l */
    public static int m64019l(Uri uri, int i, int i2) {
        return (uri.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: m */
    public static int m64020m(Parcel parcel, LinkedHashSet linkedHashSet, int i, int i2) {
        linkedHashSet.add(parcel.readString());
        return i + i2;
    }

    /* JADX INFO: renamed from: n */
    public static int m64021n(ConstraintLayout constraintLayout, int i) {
        return constraintLayout.getContext().getResources().getDimensionPixelSize(i);
    }

    /* JADX INFO: renamed from: o */
    public static Iterator m64022o(Set set, Parcel parcel) {
        parcel.writeInt(set.size());
        return set.iterator();
    }

    /* JADX INFO: renamed from: p */
    public static st91 m64023p(ArrayList arrayList, zt91 zt91Var, ArrayList arrayList2) {
        arrayList.add(zt91Var);
        return new st91(arrayList2);
    }

    /* JADX INFO: renamed from: q */
    public static void m64024q(int i, int i2, ConstraintLayout constraintLayout) {
        constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(i, i2));
    }

    /* JADX INFO: renamed from: r */
    public static void m64025r(Parcel parcel, int i, Integer num) {
        parcel.writeInt(i);
        parcel.writeInt(num.intValue());
    }

    /* JADX INFO: renamed from: s */
    public static void m64026s(Parcel parcel, int i, Long l) {
        parcel.writeInt(i);
        parcel.writeLong(l.longValue());
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ boolean m64027t(AtomicReference atomicReference, Disposable disposable) {
        while (!atomicReference.compareAndSet(null, disposable)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ boolean m64028u(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(obj, obj2, null)) {
            if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ boolean m64029v(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, Throwable th) {
        C2617yl c2617yl;
        do {
            c2617yl = vvx.f245350b;
            if (atomicReferenceFieldUpdater.compareAndSet(obj, c2617yl, th)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(obj) == c2617yl);
        return false;
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ boolean m64030w(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, lsr lsrVar, Throwable th) {
        while (!atomicReferenceFieldUpdater.compareAndSet(lsrVar, th, null)) {
            if (atomicReferenceFieldUpdater.get(lsrVar) != th) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ boolean m64031x(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, lsr lsrVar, hqb hqbVar) {
        C2617yl c2617yl;
        do {
            c2617yl = vvx.f245350b;
            if (atomicReferenceFieldUpdater.compareAndSet(lsrVar, c2617yl, hqbVar)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(lsrVar) == c2617yl);
        return false;
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ String m64032y(int i) {
        if (i == 1) {
            return "GRANTED_FINE";
        }
        if (i == 2) {
            return "GRANTED_COARSE";
        }
        if (i == 3) {
            return "NEVER_ASKED";
        }
        if (i == 4) {
            return "TEMPORARILY_DENIED";
        }
        if (i == 5) {
            return "PERMANENTLY_DENIED";
        }
        throw null;
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ String m64033z(int i) {
        switch (i) {
            case 1:
                return "CONNECTING";
            case 2:
                return "INCOMPATIBLE";
            case 3:
                return "UNAVAILABLE";
            case 4:
                return "LOGGED_IN";
            case 5:
                return "NOT_LOGGED_IN";
            case 6:
                return "PREMIUM_REQUIRED";
            case 7:
                return "NOT_INSTALLED";
            case 8:
                return "UNSUPPORTED_URI";
            case 9:
                return "SLEEPING";
            case 10:
                return "NOT_AUTHORIZED";
            case 11:
                return "AD_PLAYING";
            case 12:
                return "NARRATION";
            case 13:
                return "TIMED_OUT_WAKEUP";
            case 14:
                return "WAKING_UP";
            case 15:
                return "NOT_LOADED";
            case 16:
                return "WOL";
            case 17:
                return "BUSY";
            case 18:
                return "INSTALLATION_AVAILABLE";
            case 19:
                return "INSTALLING";
            case 20:
                return "MANAGED_ACCOUNT_ON_DISALLOWED_DEVICE";
            case 21:
                return "UNSUPPORTED_VERSION";
            case 22:
                return "UNKNOWN";
            default:
                throw null;
        }
    }
}
