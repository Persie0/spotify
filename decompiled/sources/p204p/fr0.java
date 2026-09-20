package p204p;

import android.os.Parcel;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTake;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class fr0 {
    /* JADX INFO: renamed from: A */
    public static /* synthetic */ String m42450A(int i) {
        if (i == 1) {
            return "VERIFIED_ADULT";
        }
        if (i == 2) {
            return "DECLARED_ADULT";
        }
        if (i == 3) {
            return "SUPERVISED_MINOR";
        }
        if (i == 4) {
            return "UNKNOWN";
        }
        throw null;
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ String m42451B(int i) {
        if (i == 1) {
            return "AGE_RANGE_UNKNOWN";
        }
        if (i == 2) {
            return "PARENTAL_DENIAL";
        }
        if (i == 3) {
            return "UNDERAGE";
        }
        throw null;
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ String m42452C(int i) {
        if (i == 1) {
            return "AGE_RANGE_UNKNOWN";
        }
        if (i != 2) {
            return i != 3 ? "null" : "UNDERAGE";
        }
        return "PARENTAL_DENIAL";
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ int m42453D(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("FORM_ONLY")) {
            return 1;
        }
        if (str.equals("FORM_AND_EXTRA_FIELDS")) {
            return 2;
        }
        throw new IllegalArgumentException("No enum constant com.spotify.address.address.AddressFormArgs.Presentation.".concat(str));
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ int m42454E(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("DEBUG")) {
            return 1;
        }
        if (str.equals("CHECKOUT")) {
            return 2;
        }
        if (str.equals("ACCOUNT")) {
            return 3;
        }
        throw new IllegalArgumentException("No enum constant com.spotify.address.address.AddressFormArgs.TrackingContext.".concat(str));
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ int m42455F(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("GOOGLE_PLAY")) {
            return 1;
        }
        if (str.equals("SAMSUNG_GALAXY_STORE")) {
            return 2;
        }
        if (str.equals("AMAZON_APPSTORE")) {
            return 3;
        }
        if (str.equals("APPLE_APP_STORE")) {
            return 4;
        }
        if (str.equals("UNKNOWN")) {
            return 5;
        }
        throw new IllegalArgumentException("No enum constant com.spotify.agesignal.agesignalprovider.AgeSignalSource.".concat(str));
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ int m42456G(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("AGE_RANGE_UNKNOWN")) {
            return 1;
        }
        if (str.equals("PARENTAL_DENIAL")) {
            return 2;
        }
        if (str.equals("UNDERAGE")) {
            return 3;
        }
        throw new IllegalArgumentException("No enum constant com.spotify.agesignal.agesignalverifier.AgeVerificationResult.BlockReason.".concat(str));
    }

    /* JADX INFO: renamed from: a */
    public static final String m42457a(int i) {
        switch (i) {
            case 1:
                return "eligibility_check_failed";
            case 2:
                return "core_metadata_failed";
            case 3:
                return "realtime_metadata_failed";
            case 4:
                return "buffer_failed";
            case 5:
                return "ad_ended";
            case 6:
                return "ad_skipped";
            case 7:
                return "ad_timeout";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final String m42458b(int i) {
        if (i == 1) {
            return "view_ad_on_app_open";
        }
        if (i == 2) {
            return "eligibility_check";
        }
        if (i == 3) {
            return "core_metadata_request";
        }
        if (i == 4) {
            return "realtime_metadata_request";
        }
        if (i == 5) {
            return "buffer_start";
        }
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public static int m42459c(String str) {
        return m42455F(str);
    }

    /* JADX INFO: renamed from: d */
    public static int m42460d(String str) {
        return m42456G(str);
    }

    /* JADX INFO: renamed from: e */
    public static int m42461e(qf40 qf40Var, int i, int i2) {
        return (qf40Var.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: f */
    public static int m42462f(mec0 mec0Var, int i, int i2) {
        return (mec0Var.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: g */
    public static long m42463g(wy3 wy3Var, long j) {
        wy3Var.getClass();
        return System.currentTimeMillis() - j;
    }

    /* JADX INFO: renamed from: h */
    public static CoroutinesSubtypeEffectHandlerBuilder m42464h(MobiusCoroutines.Companion companion) {
        companion.getClass();
        return new CoroutinesSubtypeEffectHandlerBuilder();
    }

    /* JADX INFO: renamed from: i */
    public static FlowableTake m42465i(Flowable flowable, Flowable flowable2) {
        flowable.getClass();
        return new FlowableTake(flowable2);
    }

    /* JADX INFO: renamed from: j */
    public static String m42466j(cxh0 cxh0Var, float f, xq00 xq00Var, int i, xq00 xq00Var2) {
        riw0.m75615i(xq00Var, mi21.m61834r(f, cxh0Var));
        return k0e1.m54977L(i, xq00Var2);
    }

    /* JADX INFO: renamed from: k */
    public static ArrayList m42467k(zt91 zt91Var) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(zt91Var);
        return arrayList;
    }

    /* JADX INFO: renamed from: l */
    public static Iterator m42468l(Parcel parcel, List list) {
        parcel.writeInt(list.size());
        return list.iterator();
    }

    /* JADX INFO: renamed from: m */
    public static Iterator m42469m(ArrayList arrayList, Parcel parcel) {
        parcel.writeInt(arrayList.size());
        return arrayList.iterator();
    }

    /* JADX INFO: renamed from: n */
    public static Iterator m42470n(xq00 xq00Var, fxh0 fxh0Var, yhh yhhVar, int i, qf40 qf40Var) {
        zsf1.m96835F(fxh0Var, yhhVar, xq00Var);
        xq00Var.m91771i0(i);
        return qf40Var.iterator();
    }

    /* JADX INFO: renamed from: o */
    public static g15 m42471o(int i, xq00 xq00Var) {
        xq00Var.m91771i0(i);
        return new g15();
    }

    /* JADX INFO: renamed from: p */
    public static f1v m42472p(cxh0 cxh0Var, float f, xq00 xq00Var, xq00 xq00Var2) {
        riw0.m75615i(xq00Var, mi21.m61838v(f, cxh0Var));
        return leu.m58818d(xq00Var2);
    }

    /* JADX INFO: renamed from: q */
    public static yt91 m42473q(yt91 yt91Var, String str) {
        zt91 zt91VarM94607a = yt91Var.m94607a();
        Collections.singletonList(str);
        return zt91VarM94607a.m96903c();
    }

    /* JADX INFO: renamed from: r */
    public static void m42474r(float f, boolean z, xq00 xq00Var) {
        riw0.m75615i(xq00Var, new cr70(f, z));
    }

    /* JADX INFO: renamed from: s */
    public static void m42475s(wy3 wy3Var, lv31 lv31Var, fv31 fv31Var) {
        wy3Var.getClass();
        lv31Var.m60050c(fv31Var, System.currentTimeMillis());
        lv31Var.m60054g();
    }

    /* JADX INFO: renamed from: t */
    public static void m42476t(boolean z, zv41 zv41Var, Object obj) {
        Boolean boolValueOf = Boolean.valueOf(z);
        zv41Var.getClass();
        zv41Var.m97091m(obj, boolValueOf);
    }

    /* JADX INFO: renamed from: u */
    public static f1v m42477u(cxh0 cxh0Var, float f, xq00 xq00Var, xq00 xq00Var2) {
        riw0.m75615i(xq00Var, mi21.m61824h(f, cxh0Var));
        return leu.m58818d(xq00Var2);
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ String m42478v(int i) {
        if (i == 1) {
            return "PASS";
        }
        if (i == 2) {
            return "FAIL";
        }
        if (i == 3) {
            return "UNCHECKED";
        }
        throw null;
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ String m42479w(int i) {
        switch (i) {
            case 1:
                return "NONE";
            case 2:
                return "API_CREATE";
            case 3:
                return "API_COMPLETE_CREATION";
            case 4:
                return "API_GET_SESSION";
            case 5:
                return "API_AUTH_CLIENT";
            case 6:
                return "CHALLENGE_IN_PROGRESS";
            case 7:
                return "SESSION_ID_MISMATCH";
            case 8:
                return "CHALLENGE_PASSKEY_AUTHN_REQUEST";
            case 9:
                return "CHALLENGE_SMSCODE_REQUEST";
            case 10:
                return "CHALLENGE_EMAILCODE_REQUEST";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ String m42480x(int i) {
        if (i == 1) {
            return "FORM_ONLY";
        }
        if (i == 2) {
            return "FORM_AND_EXTRA_FIELDS";
        }
        throw null;
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ String m42481y(int i) {
        if (i == 1) {
            return "DEBUG";
        }
        if (i == 2) {
            return "CHECKOUT";
        }
        if (i == 3) {
            return "ACCOUNT";
        }
        throw null;
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ String m42482z(int i) {
        if (i == 1) {
            return "GOOGLE_PLAY";
        }
        if (i == 2) {
            return "SAMSUNG_GALAXY_STORE";
        }
        if (i == 3) {
            return "AMAZON_APPSTORE";
        }
        if (i == 4) {
            return "APPLE_APP_STORE";
        }
        if (i == 5) {
            return "UNKNOWN";
        }
        throw null;
    }
}
