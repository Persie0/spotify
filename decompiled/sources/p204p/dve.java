package p204p;

import android.app.Application;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Build;
import android.os.Debug;
import android.os.RemoteException;
import android.os.UserManager;
import android.provider.Settings;
import android.security.advancedprotection.AdvancedProtectionManager;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.comscore.streaming.ContentDeliverySubscriptionType;
import com.comscore.streaming.ContentFeedType;
import com.ravelin.core.model.BiometricProperties;
import com.ravelin.core.model.CarrierInfo;
import com.ravelin.core.model.Connectivity;
import com.ravelin.core.model.DeviceId;
import com.ravelin.core.model.DeviceInfo;
import com.ravelin.core.model.DeviceProperties;
import com.ravelin.core.model.ErrorMetadata;
import com.ravelin.core.model.Fingerprint;
import com.ravelin.core.model.MobileError;
import com.ravelin.core.model.NetworkInfo;
import com.ravelin.core.model.Permissions;
import com.ravelin.core.model.ScreenInfo;
import com.ravelin.core.model.TimezoneInfo;
import com.spotify.concertcampaignview.p047v1.CtaType;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipFile;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p196j$.util.DesugarTimeZone;

/* JADX INFO: loaded from: classes3.dex */
public final class dve implements a2f1, ave {

    /* JADX INFO: renamed from: j */
    public static final String f53430j;

    /* JADX INFO: renamed from: a */
    public final Context f53431a;

    /* JADX INFO: renamed from: b */
    public final xd70 f53432b;

    /* JADX INFO: renamed from: c */
    public final j2f1 f53433c;

    /* JADX INFO: renamed from: d */
    public final zkk0 f53434d;

    /* JADX INFO: renamed from: e */
    public final vue f53435e;

    /* JADX INFO: renamed from: f */
    public final bve f53436f;

    /* JADX INFO: renamed from: g */
    public final tue f53437g;

    /* JADX INFO: renamed from: h */
    public final b2f1 f53438h;

    /* JADX INFO: renamed from: i */
    public final ave f53439i;

    static {
        String canonicalName = Fingerprint.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "Fingerprint";
        }
        f53430j = canonicalName;
    }

    public dve(Application application, xd70 xd70Var, j2f1 j2f1Var, zkk0 zkk0Var, vue vueVar, bve bveVar, tue tueVar, b2f1 b2f1Var, ave aveVar) {
        this.f53431a = application;
        this.f53432b = xd70Var;
        this.f53433c = j2f1Var;
        this.f53434d = zkk0Var;
        this.f53435e = vueVar;
        this.f53436f = bveVar;
        this.f53437g = tueVar;
        this.f53438h = b2f1Var;
        this.f53439i = aveVar;
    }

    /* JADX INFO: renamed from: p */
    public static String m37083p(TelephonyManager telephonyManager) {
        int phoneType = telephonyManager.getPhoneType();
        if (phoneType == 0) {
            return "NONE";
        }
        if (phoneType == 1) {
            return "GSM";
        }
        if (phoneType != 2) {
            return phoneType != 3 ? "UNKNOWN" : "SIP";
        }
        return "CDMA";
    }

    /* JADX INFO: renamed from: q */
    public static String m37084q(vue vueVar, Context context, TelephonyManager telephonyManager) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            if (((e2f1) vueVar).m37603a(context, "android.hardware.telephony.subscription")) {
                return String.valueOf(telephonyManager.getSimCarrierId());
            }
            return null;
        }
        if (28 > i || i >= 33) {
            return null;
        }
        return String.valueOf(telephonyManager.getSimCarrierId());
    }

    @Override // p204p.ave
    /* JADX INFO: renamed from: a */
    public final Float mo27239a() {
        return this.f53439i.mo27239a();
    }

    @Override // p204p.ave
    /* JADX INFO: renamed from: b */
    public final Float mo27240b() {
        return this.f53439i.mo27240b();
    }

    @Override // p204p.ave
    /* JADX INFO: renamed from: c */
    public final String mo27241c() {
        return this.f53439i.mo27241c();
    }

    @Override // p204p.ave
    /* JADX INFO: renamed from: d */
    public final Float mo27242d() {
        return this.f53439i.mo27242d();
    }

    @Override // p204p.ave
    /* JADX INFO: renamed from: f */
    public final Integer mo27243f() {
        return this.f53439i.mo27243f();
    }

    /* JADX INFO: renamed from: g */
    public final String m37086g(vue vueVar, TelephonyManager telephonyManager) {
        if (Build.VERSION.SDK_INT < 33) {
            return telephonyManager.getNetworkCountryIso();
        }
        if (((e2f1) vueVar).m37603a(this.f53431a, "android.hardware.telephony.radio.access")) {
            return telephonyManager.getNetworkCountryIso();
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final String m37087h(vue vueVar, TelephonyManager telephonyManager) {
        if (Build.VERSION.SDK_INT < 33) {
            return telephonyManager.getNetworkOperatorName();
        }
        if (((e2f1) vueVar).m37603a(this.f53431a, "android.hardware.telephony.radio.access")) {
            return telephonyManager.getNetworkOperatorName();
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final Boolean m37088i(TelephonyManager telephonyManager) {
        e2f1 e2f1Var = (e2f1) this.f53435e;
        Context context = this.f53431a;
        if (!e2f1Var.m37603a(context, "android.hardware.telephony")) {
            return null;
        }
        e2f1Var.getClass();
        if (lzj.m60353c(context, "android.permission.READ_PHONE_STATE") != 0) {
            e2f1Var.getClass();
            if (Build.VERSION.SDK_INT < 33 || lzj.m60353c(context, "android.permission.READ_BASIC_PHONE_STATE") != 0) {
                return null;
            }
        }
        return Boolean.valueOf(telephonyManager.isWorldPhone());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public final Object m37089j(long j, ibk ibkVar) {
        mue mueVar;
        if (ibkVar instanceof mue) {
            mueVar = (mue) ibkVar;
            int i = mueVar.f147320c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mueVar.f147320c = i - Integer.MIN_VALUE;
            } else {
                mueVar = new mue(this, ibkVar);
            }
        } else {
            mueVar = new mue(this, ibkVar);
        }
        Object objM76978s = mueVar.f147318a;
        int i2 = mueVar.f147320c;
        fbk fbkVar = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        try {
            if (i2 == 0) {
                bga.m29073P(objM76978s);
                C2069kx c2069kx = new C2069kx(this, fbkVar, 11);
                mueVar.f147320c = 1;
                objM76978s = s1h1.m76978s(j, c2069kx, mueVar);
                yuk yukVar = yuk.f276404a;
                if (objM76978s == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM76978s);
            }
            return (Connectivity) objM76978s;
        } catch (Exception e) {
            ((z2f1) this.f53432b).m95188a(new MobileError(System.currentTimeMillis(), null, "mobile-report", e.getMessage(), new ErrorMetadata(ContentFeedType.EAST_HD, "Connectivity", "A connectivity error occurred while trying to read the device network transport type", (String) null, pmf0.m70321g(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null)));
            return new Connectivity((String) (objArr3 == true ? 1 : 0), (String) (objArr2 == true ? 1 : 0), 2, (DefaultConstructorMarker) (objArr == true ? 1 : 0));
        }
    }

    /* JADX INFO: renamed from: k */
    public final String m37090k(Context context, TelephonyManager telephonyManager) {
        int i = Build.VERSION.SDK_INT;
        vue vueVar = this.f53435e;
        Integer numValueOf = null;
        if (i >= 33) {
            if (((e2f1) vueVar).m37603a(context, "android.hardware.telephony.radio.access") && (lzj.m60353c(context, "android.permission.READ_PHONE_STATE") == 0 || (i >= 33 && lzj.m60353c(context, "android.permission.READ_BASIC_PHONE_STATE") == 0))) {
                numValueOf = Integer.valueOf(telephonyManager.getDataNetworkType());
            }
        } else if (30 > i || i >= 33) {
            numValueOf = Integer.valueOf(telephonyManager.getNetworkType());
        } else {
            ((e2f1) vueVar).getClass();
            if (lzj.m60353c(context, "android.permission.READ_PHONE_STATE") == 0) {
                numValueOf = Integer.valueOf(telephonyManager.getDataNetworkType());
            }
        }
        if (numValueOf != null && numValueOf.intValue() == 7) {
            return "1xRTT";
        }
        if (numValueOf != null && numValueOf.intValue() == 4) {
            return "CDMA";
        }
        if (numValueOf != null && numValueOf.intValue() == 2) {
            return "EDGE";
        }
        if (numValueOf != null && numValueOf.intValue() == 14) {
            return "EHRPD";
        }
        if (numValueOf != null && numValueOf.intValue() == 5) {
            return "EVDO revision 0";
        }
        if (numValueOf != null && numValueOf.intValue() == 6) {
            return "EVDO revision A";
        }
        if (numValueOf != null && numValueOf.intValue() == 12) {
            return "EVDO revision B";
        }
        if (numValueOf != null && numValueOf.intValue() == 1) {
            return "GPRS";
        }
        if (numValueOf != null && numValueOf.intValue() == 16) {
            return "GSM";
        }
        if (numValueOf != null && numValueOf.intValue() == 8) {
            return "HSDPA";
        }
        if (numValueOf != null && numValueOf.intValue() == 10) {
            return "HSPA";
        }
        if (numValueOf != null && numValueOf.intValue() == 15) {
            return "HSPA+";
        }
        if (numValueOf != null && numValueOf.intValue() == 9) {
            return "HSUPA";
        }
        if (numValueOf != null && numValueOf.intValue() == 11) {
            return "iDen";
        }
        if (numValueOf != null && numValueOf.intValue() == 18) {
            return "IWLAN";
        }
        if (numValueOf != null && numValueOf.intValue() == 13) {
            return "LTE";
        }
        if (numValueOf != null && numValueOf.intValue() == 3) {
            return "UMTS";
        }
        if (numValueOf != null && numValueOf.intValue() == 0) {
            return "UNKNOWN";
        }
        if (numValueOf != null && numValueOf.intValue() == 20) {
            return "NR";
        }
        return (numValueOf != null && numValueOf.intValue() == 17) ? "TD_SCDMA" : "UNKNOWN";
    }

    /* JADX INFO: renamed from: l */
    public final String m37091l(vue vueVar, TelephonyManager telephonyManager) {
        if (Build.VERSION.SDK_INT < 33) {
            return telephonyManager.getNetworkOperator();
        }
        if (((e2f1) vueVar).m37603a(this.f53431a, "android.hardware.telephony.radio.access")) {
            return telephonyManager.getNetworkOperator();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: m */
    public final Object m37092m(long j, ibk ibkVar) {
        lue lueVar;
        dve dveVar;
        String string;
        if (ibkVar instanceof lue) {
            lueVar = (lue) ibkVar;
            int i = lueVar.f137074d;
            if ((i & Integer.MIN_VALUE) != 0) {
                lueVar.f137074d = i - Integer.MIN_VALUE;
            } else {
                lueVar = new lue(this, ibkVar);
            }
        } else {
            lueVar = new lue(this, ibkVar);
        }
        Object objM37089j = lueVar.f137072b;
        int i2 = lueVar.f137074d;
        if (i2 == 0) {
            bga.m29073P(objM37089j);
            lueVar.f137071a = this;
            lueVar.f137074d = 1;
            objM37089j = m37089j(j, lueVar);
            yuk yukVar = yuk.f276404a;
            if (objM37089j == yukVar) {
                return yukVar;
            }
            dveVar = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dveVar = lueVar.f137071a;
            bga.m29073P(objM37089j);
        }
        Connectivity connectivity = (Connectivity) objM37089j;
        dveVar.getClass();
        try {
            string = Settings.Global.getString(dveVar.f53431a.getContentResolver(), "http_proxy");
        } catch (Exception unused) {
            string = null;
        }
        connectivity.lpt2(string);
        return connectivity;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: n */
    public final Object m37093n(vue vueVar, ibk ibkVar) {
        rue rueVar;
        if (ibkVar instanceof rue) {
            rueVar = (rue) ibkVar;
            int i = rueVar.f202814c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rueVar.f202814c = i - Integer.MIN_VALUE;
            } else {
                rueVar = new rue(this, ibkVar);
            }
        } else {
            rueVar = new rue(this, ibkVar);
        }
        Object objM48221p = rueVar.f202812a;
        int i2 = rueVar.f202814c;
        if (i2 == 0) {
            bga.m29073P(objM48221p);
            ((e2f1) vueVar).getClass();
            if (lzj.m60353c(this.f53431a, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                rueVar.f202814c = 1;
                v1f1 v1f1Var = (v1f1) this.f53436f;
                v1f1Var.getClass();
                hqb hqbVar = new hqb(1, seg1.m77914f(rueVar));
                hqbVar.m48222q();
                boolean zIsActive = hqbVar.isActive();
                Boolean boolValueOf = Boolean.valueOf(zIsActive);
                if (!zIsActive) {
                    boolValueOf = null;
                }
                if (boolValueOf != null) {
                    try {
                        Context context = v1f1Var.f236361a;
                        int i3 = wla0.f252499a;
                        w4f1 w4f1Var = new w4f1(context, null, w4f1.f247814o, n35.f149933k, sj10.f209710c);
                        h9p h9pVarM46874g = h9p.m46874g();
                        h9pVarM46874g.f89015c = pjc1.f178226a;
                        h9pVarM46874g.f89013a = 2414;
                        y7h1 y7h1VarM80962e = w4f1Var.m80962e(0, h9pVarM46874g.m46881f());
                        int i4 = 5;
                        y7h1VarM80962e.m92993n(new c4d1(new b8i(hqbVar, i4), i4));
                        y7h1VarM80962e.mo1509a(gv61.f84648a, new qb70(hqbVar));
                        y7h1VarM80962e.m92992m(new qb70(hqbVar));
                    } catch (Exception e) {
                        String str = v1f1.f236360b;
                        String strM80650h = tfe.m80650h(e, "Error getting last location: ");
                        utu0 utu0Var = gk71.f80747a;
                        utu0Var.m83940H(str);
                        utu0Var.m83952u(strM80650h, new Object[0]);
                        hqbVar.resumeWith(null);
                    }
                }
                objM48221p = hqbVar.m48221p();
                yuk yukVar = yuk.f276404a;
                if (objM48221p == yukVar) {
                    return yukVar;
                }
            }
            return null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        bga.m29073P(objM48221p);
        Location location = (Location) objM48221p;
        if (location != null) {
            return new com.ravelin.core.model.Location(location);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x034d A[Catch: SecurityException -> 0x0355, RemoteException -> 0x0357, TryCatch #31 {RemoteException -> 0x0357, SecurityException -> 0x0355, blocks: (B:99:0x033c, B:101:0x034d, B:108:0x0359), top: B:462:0x033a }] */
    /* JADX WARN: Code duplicated, block: B:103:0x0353  */
    /* JADX WARN: Code duplicated, block: B:108:0x0359 A[Catch: SecurityException -> 0x0355, RemoteException -> 0x0357, TRY_LEAVE, TryCatch #31 {RemoteException -> 0x0357, SecurityException -> 0x0355, blocks: (B:99:0x033c, B:101:0x034d, B:108:0x0359), top: B:462:0x033a }] */
    /* JADX WARN: Code duplicated, block: B:136:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:179:0x0507  */
    /* JADX WARN: Code duplicated, block: B:182:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:183:0x05aa A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:187:0x05dd  */
    /* JADX WARN: Code duplicated, block: B:232:0x06b2  */
    /* JADX WARN: Code duplicated, block: B:241:0x0709  */
    /* JADX WARN: Code duplicated, block: B:243:0x0712  */
    /* JADX WARN: Code duplicated, block: B:245:0x0717  */
    /* JADX WARN: Code duplicated, block: B:247:0x071c  */
    /* JADX WARN: Code duplicated, block: B:249:0x0721  */
    /* JADX WARN: Code duplicated, block: B:254:0x072f  */
    /* JADX WARN: Code duplicated, block: B:257:0x0738  */
    /* JADX WARN: Code duplicated, block: B:258:0x073b  */
    /* JADX WARN: Code duplicated, block: B:261:0x0744  */
    /* JADX WARN: Code duplicated, block: B:262:0x0747  */
    /* JADX WARN: Code duplicated, block: B:265:0x0750  */
    /* JADX WARN: Code duplicated, block: B:266:0x0753  */
    /* JADX WARN: Code duplicated, block: B:341:0x08e0  */
    /* JADX WARN: Code duplicated, block: B:343:0x08e5  */
    /* JADX WARN: Code duplicated, block: B:346:0x08f6  */
    /* JADX WARN: Code duplicated, block: B:347:0x08f8  */
    /* JADX WARN: Code duplicated, block: B:349:0x0905  */
    /* JADX WARN: Code duplicated, block: B:353:0x0917  */
    /* JADX WARN: Code duplicated, block: B:354:0x0919  */
    /* JADX WARN: Code duplicated, block: B:358:0x092b  */
    /* JADX WARN: Code duplicated, block: B:359:0x092d  */
    /* JADX WARN: Code duplicated, block: B:363:0x094b A[Catch: Exception -> 0x0953, TRY_LEAVE, TryCatch #32 {Exception -> 0x0953, blocks: (B:361:0x093d, B:363:0x094b), top: B:435:0x093d }] */
    /* JADX WARN: Code duplicated, block: B:366:0x0953  */
    /* JADX WARN: Code duplicated, block: B:369:0x0961  */
    /* JADX WARN: Code duplicated, block: B:375:0x0977  */
    /* JADX WARN: Code duplicated, block: B:381:0x098d  */
    /* JADX WARN: Code duplicated, block: B:388:0x09a7  */
    /* JADX WARN: Code duplicated, block: B:389:0x09a9  */
    /* JADX WARN: Code duplicated, block: B:391:0x09ac  */
    /* JADX WARN: Code duplicated, block: B:401:0x0a06  */
    /* JADX WARN: Code duplicated, block: B:408:0x0a29  */
    /* JADX WARN: Code duplicated, block: B:412:0x0a7a  */
    /* JADX WARN: Code duplicated, block: B:454:0x030d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:460:0x0413 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:468:0x0168 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:475:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x017f  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:82:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:83:0x0308  */
    /* JADX WARN: Code duplicated, block: B:91:0x031b A[Catch: SecurityException -> 0x0376, RemoteException -> 0x0379, TRY_ENTER, TryCatch #41 {RemoteException -> 0x0379, SecurityException -> 0x0376, blocks: (B:88:0x0315, B:91:0x031b, B:93:0x032c, B:96:0x0335), top: B:449:0x0315 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x032c A[Catch: SecurityException -> 0x0376, RemoteException -> 0x0379, TryCatch #41 {RemoteException -> 0x0379, SecurityException -> 0x0376, blocks: (B:88:0x0315, B:91:0x031b, B:93:0x032c, B:96:0x0335), top: B:449:0x0315 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0333  */
    /* JADX WARN: Code duplicated, block: B:96:0x0335 A[Catch: SecurityException -> 0x0376, RemoteException -> 0x0379, TRY_LEAVE, TryCatch #41 {RemoteException -> 0x0379, SecurityException -> 0x0376, blocks: (B:88:0x0315, B:91:0x031b, B:93:0x032c, B:96:0x0335), top: B:449:0x0315 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x033c A[Catch: SecurityException -> 0x0355, RemoteException -> 0x0357, TRY_ENTER, TryCatch #31 {RemoteException -> 0x0357, SecurityException -> 0x0355, blocks: (B:99:0x033c, B:101:0x034d, B:108:0x0359), top: B:462:0x033a }] */
    /* JADX INFO: renamed from: o */
    public final Object m37094o(m5p m5pVar, boolean z, long j, ibk ibkVar) {
        kue kueVar;
        Boolean bool;
        boolean z2;
        Fingerprint fingerprint;
        vue vueVar;
        dve dveVar;
        boolean z3;
        long j2;
        vue vueVar2;
        Fingerprint fingerprint2;
        int i;
        com.ravelin.core.model.Location location;
        int i2;
        int i3;
        m5p m5pVar2;
        Fingerprint fingerprint3;
        Object objM37093n;
        Fingerprint fingerprint4;
        Fingerprint fingerprint5;
        int i4;
        int i5;
        xd70 xd70Var;
        Context context;
        TimeZone timeZone;
        int i6;
        String str;
        String id;
        boolean z4;
        String displayName;
        long j3;
        Integer numValueOf;
        Integer numValueOf2;
        e2f1 e2f1Var;
        TelephonyManager telephonyManager;
        String simCountryIso;
        String strM37095r;
        String strM37084q;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int i7;
        String simOperator;
        Boolean boolM37088i;
        String strM37086g;
        String strM37083p;
        String strM37091l;
        String strM37087h;
        String str7;
        String str8;
        String str9;
        String str10;
        String strM37090k;
        String strCON;
        ave aveVar;
        y2f1 y2f1Var;
        String str11;
        boolean z5;
        boolean z6;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        String strM92703a;
        String str12;
        String str13;
        Boolean bool2;
        vue vueVar3;
        m5p m5pVar3;
        Fingerprint fingerprint6;
        TelephonyManager telephonyManager2;
        Fingerprint fingerprint7;
        boolean z7;
        int i8;
        boolean zCanRequestPackageInstalls;
        boolean z8;
        boolean z9;
        boolean z10;
        ArrayList arrayList;
        int i9;
        ArrayList arrayList2;
        String string;
        Boolean boolValueOf4;
        boolean zM88271j;
        Fingerprint fingerprint8;
        Fingerprint fingerprint9;
        dve dveVar2;
        Fingerprint fingerprint10;
        Fingerprint fingerprint11;
        Fingerprint fingerprint12;
        PackageManager packageManager;
        PackageManager packageManager2;
        PackageManager packageManager3;
        int i10;
        int iHashCode;
        m5p m5pVar4 = m5pVar;
        if (ibkVar instanceof kue) {
            kueVar = (kue) ibkVar;
            int i11 = kueVar.f126525N0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kueVar.f126525N0 = i11 - Integer.MIN_VALUE;
            } else {
                kueVar = new kue(this, ibkVar);
            }
        } else {
            kueVar = new kue(this, ibkVar);
        }
        Object objM37092m = kueVar.f126523L0;
        int i12 = kueVar.f126525N0;
        yuk yukVar = yuk.f276404a;
        try {
            try {
                try {
                    try {
                        try {
                            try {
                                try {
                                    if (i12 != 0) {
                                        if (i12 == 1) {
                                            int i13 = kueVar.f126528Z;
                                            boolean z11 = kueVar.f126537i;
                                            i5 = kueVar.f126527Y;
                                            i3 = kueVar.f126526X;
                                            j2 = kueVar.f126538t;
                                            z3 = kueVar.f126536h;
                                            Fingerprint fingerprint13 = (Fingerprint) kueVar.f126534f;
                                            vueVar = kueVar.f126533e;
                                            fingerprint4 = kueVar.f126532d;
                                            Fingerprint fingerprint14 = kueVar.f126531c;
                                            dveVar = kueVar.f126530b;
                                            m5pVar4 = kueVar.f126529a;
                                            bga.m29073P(objM37092m);
                                            fingerprint5 = fingerprint13;
                                            fingerprint = fingerprint14;
                                            objM37093n = objM37092m;
                                            z2 = z11;
                                            i4 = i13;
                                        } else {
                                            if (i12 != 2) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            fingerprint11 = kueVar.f126535g;
                                            fingerprint12 = kueVar.f126532d;
                                            fingerprint10 = kueVar.f126531c;
                                            dveVar2 = kueVar.f126530b;
                                            bga.m29073P(objM37092m);
                                        }
                                        fingerprint11.lpt2((Connectivity) objM37092m);
                                        fingerprint12.lpt2(Permissions.INSTANCE.lpt2(dveVar2.f53431a));
                                        return fingerprint10;
                                    }
                                    bga.m29073P(objM37092m);
                                    if (m5pVar4 != null) {
                                        Object objM60868b = m5pVar4.m60868b("location group", "user location collection enabled");
                                        if (!(objM60868b instanceof Boolean)) {
                                            objM60868b = null;
                                        }
                                        bool = (Boolean) objM60868b;
                                    } else {
                                        bool = null;
                                    }
                                    z2 = !wj50.m88271j(bool, Boolean.FALSE);
                                    fingerprint = new Fingerprint(false, (CarrierInfo) null, (NetworkInfo) null, (Connectivity) null, (ScreenInfo) null, (DeviceInfo) null, (TimezoneInfo) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (com.ravelin.core.model.Location) null, (DeviceProperties) null, (Permissions) null, 131071, (DefaultConstructorMarker) null);
                                    fingerprint.lpt2(z);
                                    vueVar = this.f53435e;
                                    if (z2) {
                                        kueVar.f126529a = m5pVar4;
                                        kueVar.f126530b = this;
                                        kueVar.f126531c = fingerprint;
                                        kueVar.f126532d = fingerprint;
                                        kueVar.f126533e = vueVar;
                                        kueVar.f126534f = fingerprint;
                                        kueVar.f126536h = z;
                                        kueVar.f126538t = j;
                                        kueVar.f126526X = 0;
                                        kueVar.f126527Y = 0;
                                        kueVar.f126537i = z2;
                                        kueVar.f126528Z = 0;
                                        kueVar.f126525N0 = 1;
                                        objM37093n = m37093n(vueVar, kueVar);
                                        if (objM37093n == yukVar) {
                                            return yukVar;
                                        }
                                        dveVar = this;
                                        z3 = z;
                                        j2 = j;
                                        fingerprint4 = fingerprint;
                                        fingerprint5 = fingerprint4;
                                        i4 = 0;
                                        i5 = 0;
                                        i3 = 0;
                                    } else {
                                        dveVar = this;
                                        z3 = z;
                                        j2 = j;
                                        vueVar2 = vueVar;
                                        fingerprint2 = fingerprint;
                                        i = 0;
                                        location = null;
                                        i2 = 0;
                                        i3 = 0;
                                        m5pVar2 = m5pVar4;
                                        fingerprint3 = fingerprint2;
                                    }
                                    fingerprint3.lpt2(location);
                                    xd70Var = dveVar.f53432b;
                                    zkk0 zkk0Var = dveVar.f53434d;
                                    vue vueVar4 = dveVar.f53435e;
                                    context = dveVar.f53431a;
                                    timeZone = TimeZone.getDefault();
                                    i6 = i2;
                                    str = f53430j;
                                    if (timeZone != null) {
                                        try {
                                            id = timeZone.getID();
                                        } catch (AssertionError e) {
                                            e = e;
                                            z4 = z2;
                                            String strM38564m = edb.m38564m("Error while discovering timeZone with: ", e.getLocalizedMessage());
                                            AssertionError assertionError = e;
                                            utu0 utu0Var = gk71.f80747a;
                                            utu0Var.m83940H(str);
                                            utu0Var.m83952u(strM38564m, new Object[0]);
                                            ((z2f1) xd70Var).m95188a(new MobileError(System.currentTimeMillis(), null, "mobile-report", assertionError.getMessage(), new ErrorMetadata(ContentDeliverySubscriptionType.ADVERTISING, "JVM", "An assertion failed", (String) null, pmf0.m70321g(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null)));
                                            displayName = null;
                                            int rawOffset = new GregorianCalendar().getTimeZone().getRawOffset();
                                            j3 = j2;
                                            numValueOf = Integer.valueOf((int) TimeUnit.HOURS.convert(rawOffset, TimeUnit.MILLISECONDS));
                                            numValueOf2 = Integer.valueOf((int) TimeUnit.MINUTES.convert(rawOffset, TimeUnit.MILLISECONDS));
                                            fingerprint.lpt2(new TimezoneInfo(numValueOf, displayName, numValueOf2));
                                            e2f1Var = (e2f1) vueVar4;
                                            if (e2f1Var.m37603a(context, "android.hardware.telephony")) {
                                                telephonyManager = (TelephonyManager) context.getApplicationContext().getSystemService("phone");
                                            } else {
                                                telephonyManager = null;
                                            }
                                            if (telephonyManager != null) {
                                                try {
                                                    strM37095r = dveVar.m37095r(vueVar2, telephonyManager);
                                                    try {
                                                        strM37084q = m37084q(vueVar2, context, telephonyManager);
                                                        try {
                                                            i7 = Build.VERSION.SDK_INT;
                                                            if (i7 >= 33) {
                                                                ((e2f1) vueVar2).getClass();
                                                                if (context.getPackageManager().hasSystemFeature("android.hardware.telephony.subscription")) {
                                                                    simCountryIso = telephonyManager.getSimCountryIso();
                                                                } else {
                                                                    simCountryIso = null;
                                                                }
                                                            } else {
                                                                simCountryIso = telephonyManager.getSimCountryIso();
                                                            }
                                                            try {
                                                                try {
                                                                    if (i7 >= 33) {
                                                                        ((e2f1) vueVar2).getClass();
                                                                        if (context.getPackageManager().hasSystemFeature("android.hardware.telephony.subscription")) {
                                                                            simOperator = telephonyManager.getSimOperator();
                                                                        } else {
                                                                            str2 = null;
                                                                        }
                                                                        boolM37088i = dveVar.m37088i(telephonyManager);
                                                                        str3 = simCountryIso;
                                                                        str4 = strM37095r;
                                                                        str5 = strM37084q;
                                                                        str6 = str2;
                                                                        fingerprint.lpt2(new CarrierInfo(str4, str5, str3, str6, boolM37088i));
                                                                        if (telephonyManager != null) {
                                                                            try {
                                                                                strM37086g = dveVar.m37086g(vueVar2, telephonyManager);
                                                                                try {
                                                                                    strM37083p = m37083p(telephonyManager);
                                                                                    try {
                                                                                        strM37091l = dveVar.m37091l(vueVar2, telephonyManager);
                                                                                        try {
                                                                                            strM37087h = dveVar.m37087h(vueVar2, telephonyManager);
                                                                                            try {
                                                                                                strM37090k = dveVar.m37090k(context, telephonyManager);
                                                                                                str7 = strM37086g;
                                                                                                str8 = strM37083p;
                                                                                                str9 = strM37091l;
                                                                                                str10 = strM37087h;
                                                                                            } catch (RemoteException e2) {
                                                                                                e = e2;
                                                                                                ((z2f1) xd70Var).m95188a(new MobileError(System.currentTimeMillis(), null, "mobile-report", e.getMessage(), new ErrorMetadata(201, "Telephony", "A telephony remote error occurred", (String) null, pmf0.m70321g(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null)));
                                                                                                str7 = strM37086g;
                                                                                                str8 = strM37083p;
                                                                                                str9 = strM37091l;
                                                                                                str10 = strM37087h;
                                                                                                strM37090k = null;
                                                                                            } catch (SecurityException e3) {
                                                                                                e = e3;
                                                                                                ((z2f1) xd70Var).m95188a(new MobileError(System.currentTimeMillis(), null, "mobile-report", e.getMessage(), new ErrorMetadata(200, "Telephony", "A telephony security error occurred", (String) null, pmf0.m70321g(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null)));
                                                                                                str7 = strM37086g;
                                                                                                str8 = strM37083p;
                                                                                                str9 = strM37091l;
                                                                                                str10 = strM37087h;
                                                                                                strM37090k = null;
                                                                                            } catch (UnsupportedOperationException e4) {
                                                                                                e = e4;
                                                                                                ((z2f1) xd70Var).m95188a(new MobileError(System.currentTimeMillis(), null, "mobile-report", e.getMessage(), new ErrorMetadata(202, "Telephony", "A telephony UnsupportedOperation error occurred", (String) null, pmf0.m70321g(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null)));
                                                                                                str7 = strM37086g;
                                                                                                str8 = strM37083p;
                                                                                                str9 = strM37091l;
                                                                                                str10 = strM37087h;
                                                                                                strM37090k = null;
                                                                                            }
                                                                                        } catch (RemoteException e5) {
                                                                                            e = e5;
                                                                                            strM37087h = null;
                                                                                            ((z2f1) xd70Var).m95188a(new MobileError(System.currentTimeMillis(), null, "mobile-report", e.getMessage(), new ErrorMetadata(201, "Telephony", "A telephony remote error occurred", (String) null, pmf0.m70321g(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null)));
                                                                                            str7 = strM37086g;
                                                                                            str8 = strM37083p;
                                                                                            str9 = strM37091l;
                                                                                            str10 = strM37087h;
                                                                                            strM37090k = null;
                                                                                            fingerprint.lpt2(new NetworkInfo(str7, strM37090k, str9, str10, str8));
                                                                                            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                                                                                            fingerprint.lpt2(new ScreenInfo(displayMetrics.densityDpi, displayMetrics.heightPixels, displayMetrics.widthPixels));
                                                                                            nve nveVar = (nve) zkk0Var;
                                                                                            nveVar.getClass();
                                                                                            DeviceId.Companion coM4 = DeviceId.INSTANCE;
                                                                                            fingerprint.lpt2(new DeviceInfo(coM4.Lpt5().getBluetoothMAC(), coM4.Lpt5().getWiFiMAC(), coM4.Lpt5().getImei(), coM4.Lpt5().getImsi(), coM4.Lpt5().getAndroidId(), coM4.Lpt5().getMediaDrmId()));
                                                                                            fingerprint.Com8(Locale.getDefault().toLanguageTag());
                                                                                            fingerprint.Lpt5(Locale.getDefault().getCountry());
                                                                                            fingerprint.lpt2(context.getPackageName());
                                                                                            nveVar.getClass();
                                                                                            strCON = coM4.Lpt5().getDeviceIdProvider();
                                                                                            if (wj50.m88271j(strCON, context.getPackageName())) {
                                                                                                strCON = "self provider";
                                                                                            } else {
                                                                                                strCON = "self provider";
                                                                                            }
                                                                                            fingerprint.COM7(strCON);
                                                                                            String str14 = Build.MANUFACTURER;
                                                                                            fingerprint.cON(str14);
                                                                                            String str15 = Build.MODEL;
                                                                                            fingerprint.LPT3(str15);
                                                                                            fingerprint.COM5(String.valueOf(Build.VERSION.SDK_INT));
                                                                                            aveVar = dveVar.f53439i;
                                                                                            y2f1Var = (y2f1) dveVar.f53433c;
                                                                                            y2f1Var.getClass();
                                                                                            str11 = Build.FINGERPRINT;
                                                                                            if (!bm51.m29803n0(str11, "generic", false)) {
                                                                                                z5 = z3;
                                                                                                z6 = true;
                                                                                            } else {
                                                                                                z5 = z3;
                                                                                                z6 = true;
                                                                                            }
                                                                                            String str16 = y2f1.f268606c;
                                                                                            utu0 utu0Var2 = gk71.f80747a;
                                                                                            utu0Var2.m83940H(str16);
                                                                                            utu0Var2.m83952u("isProbablyEmulator = " + z6, new Object[0]);
                                                                                            boolValueOf = Boolean.valueOf(z6);
                                                                                            boolValueOf2 = Boolean.valueOf(((x1f1) y2f1Var.f268607a).m89639c(y2f1.m92706d(context)));
                                                                                            boolValueOf3 = Boolean.valueOf(Debug.isDebuggerConnected());
                                                                                            strM92703a = y2f1.m92703a(context);
                                                                                            if (strM92703a == null) {
                                                                                                str12 = "non valid source";
                                                                                            } else {
                                                                                                iHashCode = strM92703a.hashCode();
                                                                                                if (iHashCode != -1859733809) {
                                                                                                    if (iHashCode != -1637701853) {
                                                                                                        if (iHashCode != -1225090538) {
                                                                                                            if (iHashCode == -1046965711) {
                                                                                                                str12 = "non valid source";
                                                                                                            } else {
                                                                                                                str12 = "non valid source";
                                                                                                            }
                                                                                                        } else if (strM92703a.equals("com.sec.android.app.samsungapps")) {
                                                                                                            str12 = "Samsung Galaxy Store";
                                                                                                        } else {
                                                                                                            str12 = "non valid source";
                                                                                                        }
                                                                                                    } else if (strM92703a.equals("com.huawei.appmarket")) {
                                                                                                        str12 = "Huawei App Gallery";
                                                                                                    } else {
                                                                                                        str12 = "non valid source";
                                                                                                    }
                                                                                                } else if (strM92703a.equals("com.amazon.venezia")) {
                                                                                                    str12 = "Amazon Appstore";
                                                                                                } else {
                                                                                                    str12 = "non valid source";
                                                                                                }
                                                                                            }
                                                                                            str13 = str12;
                                                                                            bool2 = Boolean.TRUE;
                                                                                            throw new Exception("Verifying use of hookup tools");
                                                                                        } catch (SecurityException e6) {
                                                                                            e = e6;
                                                                                            strM37087h = null;
                                                                                            ((z2f1) xd70Var).m95188a(new MobileError(System.currentTimeMillis(), null, "mobile-report", e.getMessage(), new ErrorMetadata(200, "Telephony", "A telephony security error occurred", (String) null, pmf0.m70321g(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null)));
                                                                                            str7 = strM37086g;
                                                                                            str8 = strM37083p;
                                                                                            str9 = strM37091l;
                                                                                            str10 = strM37087h;
                                                                                            strM37090k = null;
                                                                                            fingerprint.lpt2(new NetworkInfo(str7, strM37090k, str9, str10, str8));
                                                                                            DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
                                                                                            fingerprint.lpt2(new ScreenInfo(displayMetrics2.densityDpi, displayMetrics2.heightPixels, displayMetrics2.widthPixels));
                                                                                            nve nveVar2 = (nve) zkk0Var;
                                                                                            nveVar2.getClass();
                                                                                            DeviceId.Companion coM5 = DeviceId.INSTANCE;
                                                                                            fingerprint.lpt2(new DeviceInfo(coM5.Lpt5().getBluetoothMAC(), coM5.Lpt5().getWiFiMAC(), coM5.Lpt5().getImei(), coM5.Lpt5().getImsi(), coM5.Lpt5().getAndroidId(), coM5.Lpt5().getMediaDrmId()));
                                                                                            fingerprint.Com8(Locale.getDefault().toLanguageTag());
                                                                                            fingerprint.Lpt5(Locale.getDefault().getCountry());
                                                                                            fingerprint.lpt2(context.getPackageName());
                                                                                            nveVar2.getClass();
                                                                                            strCON = coM5.Lpt5().getDeviceIdProvider();
                                                                                            if (wj50.m88271j(strCON, context.getPackageName())) {
                                                                                                strCON = "self provider";
                                                                                            } else {
                                                                                                strCON = "self provider";
                                                                                            }
                                                                                            fingerprint.COM7(strCON);
                                                                                            String str17 = Build.MANUFACTURER;
                                                                                            fingerprint.cON(str17);
                                                                                            String str18 = Build.MODEL;
                                                                                            fingerprint.LPT3(str18);
                                                                                            fingerprint.COM5(String.valueOf(Build.VERSION.SDK_INT));
                                                                                            aveVar = dveVar.f53439i;
                                                                                            y2f1Var = (y2f1) dveVar.f53433c;
                                                                                            y2f1Var.getClass();
                                                                                            str11 = Build.FINGERPRINT;
                                                                                            if (!bm51.m29803n0(str11, "generic", false)) {
                                                                                                z5 = z3;
                                                                                                z6 = true;
                                                                                            } else {
                                                                                                z5 = z3;
                                                                                                z6 = true;
                                                                                            }
                                                                                            String str19 = y2f1.f268606c;
                                                                                            utu0 utu0Var3 = gk71.f80747a;
                                                                                            utu0Var3.m83940H(str19);
                                                                                            utu0Var3.m83952u("isProbablyEmulator = " + z6, new Object[0]);
                                                                                            boolValueOf = Boolean.valueOf(z6);
                                                                                            boolValueOf2 = Boolean.valueOf(((x1f1) y2f1Var.f268607a).m89639c(y2f1.m92706d(context)));
                                                                                            boolValueOf3 = Boolean.valueOf(Debug.isDebuggerConnected());
                                                                                            strM92703a = y2f1.m92703a(context);
                                                                                            if (strM92703a == null) {
                                                                                                str12 = "non valid source";
                                                                                            } else {
                                                                                                iHashCode = strM92703a.hashCode();
                                                                                                if (iHashCode != -1859733809) {
                                                                                                    if (iHashCode != -1637701853) {
                                                                                                        if (iHashCode != -1225090538) {
                                                                                                            if (iHashCode == -1046965711) {
                                                                                                                str12 = "non valid source";
                                                                                                            } else {
                                                                                                                str12 = "non valid source";
                                                                                                            }
                                                                                                        } else if (strM92703a.equals("com.sec.android.app.samsungapps")) {
                                                                                                            str12 = "non valid source";
                                                                                                        } else {
                                                                                                            str12 = "Samsung Galaxy Store";
                                                                                                        }
                                                                                                    } else if (strM92703a.equals("com.huawei.appmarket")) {
                                                                                                        str12 = "non valid source";
                                                                                                    } else {
                                                                                                        str12 = "Huawei App Gallery";
                                                                                                    }
                                                                                                } else if (strM92703a.equals("com.amazon.venezia")) {
                                                                                                    str12 = "non valid source";
                                                                                                } else {
                                                                                                    str12 = "Amazon Appstore";
                                                                                                }
                                                                                            }
                                                                                            str13 = str12;
                                                                                            bool2 = Boolean.TRUE;
                                                                                            throw new Exception("Verifying use of hookup tools");
                                                                                        } catch (UnsupportedOperationException e7) {
                                                                                            e = e7;
                                                                                            strM37087h = null;
                                                                                            ((z2f1) xd70Var).m95188a(new MobileError(System.currentTimeMillis(), null, "mobile-report", e.getMessage(), new ErrorMetadata(202, "Telephony", "A telephony UnsupportedOperation error occurred", (String) null, pmf0.m70321g(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null)));
                                                                                            str7 = strM37086g;
                                                                                            str8 = strM37083p;
                                                                                            str9 = strM37091l;
                                                                                            str10 = strM37087h;
                                                                                            strM37090k = null;
                                                                                            fingerprint.lpt2(new NetworkInfo(str7, strM37090k, str9, str10, str8));
                                                                                            DisplayMetrics displayMetrics3 = context.getResources().getDisplayMetrics();
                                                                                            fingerprint.lpt2(new ScreenInfo(displayMetrics3.densityDpi, displayMetrics3.heightPixels, displayMetrics3.widthPixels));
                                                                                            nve nveVar3 = (nve) zkk0Var;
                                                                                            nveVar3.getClass();
                                                                                            DeviceId.Companion coM6 = DeviceId.INSTANCE;
                                                                                            fingerprint.lpt2(new DeviceInfo(coM6.Lpt5().getBluetoothMAC(), coM6.Lpt5().getWiFiMAC(), coM6.Lpt5().getImei(), coM6.Lpt5().getImsi(), coM6.Lpt5().getAndroidId(), coM6.Lpt5().getMediaDrmId()));
                                                                                            fingerprint.Com8(Locale.getDefault().toLanguageTag());
                                                                                            fingerprint.Lpt5(Locale.getDefault().getCountry());
                                                                                            fingerprint.lpt2(context.getPackageName());
                                                                                            nveVar3.getClass();
                                                                                            strCON = coM6.Lpt5().getDeviceIdProvider();
                                                                                            if (wj50.m88271j(strCON, context.getPackageName())) {
                                                                                                strCON = "self provider";
                                                                                            } else {
                                                                                                strCON = "self provider";
                                                                                            }
                                                                                            fingerprint.COM7(strCON);
                                                                                            String str110 = Build.MANUFACTURER;
                                                                                            fingerprint.cON(str110);
                                                                                            String str111 = Build.MODEL;
                                                                                            fingerprint.LPT3(str111);
                                                                                            fingerprint.COM5(String.valueOf(Build.VERSION.SDK_INT));
                                                                                            aveVar = dveVar.f53439i;
                                                                                            y2f1Var = (y2f1) dveVar.f53433c;
                                                                                            y2f1Var.getClass();
                                                                                            str11 = Build.FINGERPRINT;
                                                                                            if (!bm51.m29803n0(str11, "generic", false)) {
                                                                                                z5 = z3;
                                                                                                z6 = true;
                                                                                            } else {
                                                                                                z5 = z3;
                                                                                                z6 = true;
                                                                                            }
                                                                                            String str112 = y2f1.f268606c;
                                                                                            utu0 utu0Var4 = gk71.f80747a;
                                                                                            utu0Var4.m83940H(str112);
                                                                                            utu0Var4.m83952u("isProbablyEmulator = " + z6, new Object[0]);
                                                                                            boolValueOf = Boolean.valueOf(z6);
                                                                                            boolValueOf2 = Boolean.valueOf(((x1f1) y2f1Var.f268607a).m89639c(y2f1.m92706d(context)));
                                                                                            boolValueOf3 = Boolean.valueOf(Debug.isDebuggerConnected());
                                                                                            strM92703a = y2f1.m92703a(context);
                                                                                            if (strM92703a == null) {
                                                                                                str12 = "non valid source";
                                                                                            } else {
                                                                                                iHashCode = strM92703a.hashCode();
                                                                                                if (iHashCode != -1859733809) {
                                                                                                    if (iHashCode != -1637701853) {
                                                                                                        if (iHashCode != -1225090538) {
                                                                                                            if (iHashCode == -1046965711) {
                                                                                                                str12 = "non valid source";
                                                                                                            } else {
                                                                                                                str12 = "non valid source";
                                                                                                            }
                                                                                                        } else if (strM92703a.equals("com.sec.android.app.samsungapps")) {
                                                                                                            str12 = "non valid source";
                                                                                                        } else {
                                                                                                            str12 = "Samsung Galaxy Store";
                                                                                                        }
                                                                                                    } else if (strM92703a.equals("com.huawei.appmarket")) {
                                                                                                        str12 = "non valid source";
                                                                                                    } else {
                                                                                                        str12 = "Huawei App Gallery";
                                                                                                    }
                                                                                                } else if (strM92703a.equals("com.amazon.venezia")) {
                                                                                                    str12 = "non valid source";
                                                                                                } else {
                                                                                                    str12 = "Amazon Appstore";
                                                                                                }
                                                                                            }
                                                                                            str13 = str12;
                                                                                            bool2 = Boolean.TRUE;
                                                                                            throw new Exception("Verifying use of hookup tools");
                                                                                        }
                                                                                    } catch (RemoteException e8) {
                                                                                        e = e8;
                                                                                        strM37091l = null;
                                                                                        strM37087h = null;
                                                                                        ((z2f1) xd70Var).m95188a(new MobileError(System.currentTimeMillis(), null, "mobile-report", e.getMessage(), new ErrorMetadata(201, "Telephony", "A telephony remote error occurred", (String) null, pmf0.m70321g(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null)));
                                                                                        str7 = strM37086g;
                                                                                        str8 = strM37083p;
                                                                                        str9 = strM37091l;
                                                                                        str10 = strM37087h;
                                                                                        strM37090k = null;
                                                                                        fingerprint.lpt2(new NetworkInfo(str7, strM37090k, str9, str10, str8));
                                                                                        DisplayMetrics displayMetrics4 = context.getResources().getDisplayMetrics();
                                                                                        fingerprint.lpt2(new ScreenInfo(displayMetrics4.densityDpi, displayMetrics4.heightPixels, displayMetrics4.widthPixels));
                                                                                        nve nveVar4 = (nve) zkk0Var;
                                                                                        nveVar4.getClass();
                                                                                        DeviceId.Companion coM7 = DeviceId.INSTANCE;
                                                                                        fingerprint.lpt2(new DeviceInfo(coM7.Lpt5().getBluetoothMAC(), coM7.Lpt5().getWiFiMAC(), coM7.Lpt5().getImei(), coM7.Lpt5().getImsi(), coM7.Lpt5().getAndroidId(), coM7.Lpt5().getMediaDrmId()));
                                                                                        fingerprint.Com8(Locale.getDefault().toLanguageTag());
                                                                                        fingerprint.Lpt5(Locale.getDefault().getCountry());
                                                                                        fingerprint.lpt2(context.getPackageName());
                                                                                        nveVar4.getClass();
                                                                                        strCON = coM7.Lpt5().getDeviceIdProvider();
                                                                                        if (wj50.m88271j(strCON, context.getPackageName())) {
                                                                                            strCON = "self provider";
                                                                                        } else {
                                                                                            strCON = "self provider";
                                                                                        }
                                                                                        fingerprint.COM7(strCON);
                                                                                        String str113 = Build.MANUFACTURER;
                                                                                        fingerprint.cON(str113);
                                                                                        String str114 = Build.MODEL;
                                                                                        fingerprint.LPT3(str114);
                                                                                        fingerprint.COM5(String.valueOf(Build.VERSION.SDK_INT));
                                                                                        aveVar = dveVar.f53439i;
                                                                                        y2f1Var = (y2f1) dveVar.f53433c;
                                                                                        y2f1Var.getClass();
                                                                                        str11 = Build.FINGERPRINT;
                                                                                        if (!bm51.m29803n0(str11, "generic", false)) {
                                                                                            z5 = z3;
                                                                                            z6 = true;
                                                                                        } else {
                                                                                            z5 = z3;
                                                                                            z6 = true;
                                                                                        }
                                                                                        String str115 = y2f1.f268606c;
                                                                                        utu0 utu0Var5 = gk71.f80747a;
                                                                                        utu0Var5.m83940H(str115);
                                                                                        utu0Var5.m83952u("isProbablyEmulator = " + z6, new Object[0]);
                                                                                        boolValueOf = Boolean.valueOf(z6);
                                                                                        boolValueOf2 = Boolean.valueOf(((x1f1) y2f1Var.f268607a).m89639c(y2f1.m92706d(context)));
                                                                                        boolValueOf3 = Boolean.valueOf(Debug.isDebuggerConnected());
                                                                                        strM92703a = y2f1.m92703a(context);
                                                                                        if (strM92703a == null) {
                                                                                            str12 = "non valid source";
                                                                                        } else {
                                                                                            iHashCode = strM92703a.hashCode();
                                                                                            if (iHashCode != -1859733809) {
                                                                                                if (iHashCode != -1637701853) {
                                                                                                    if (iHashCode != -1225090538) {
                                                                                                        if (iHashCode == -1046965711) {
                                                                                                            str12 = "non valid source";
                                                                                                        } else {
                                                                                                            str12 = "non valid source";
                                                                                                        }
                                                                                                    } else if (strM92703a.equals("com.sec.android.app.samsungapps")) {
                                                                                                        str12 = "non valid source";
                                                                                                    } else {
                                                                                                        str12 = "Samsung Galaxy Store";
                                                                                                    }
                                                                                                } else if (strM92703a.equals("com.huawei.appmarket")) {
                                                                                                    str12 = "non valid source";
                                                                                                } else {
                                                                                                    str12 = "Huawei App Gallery";
                                                                                                }
                                                                                            } else if (strM92703a.equals("com.amazon.venezia")) {
                                                                                                str12 = "non valid source";
                                                                                            } else {
                                                                                                str12 = "Amazon Appstore";
                                                                                            }
                                                                                        }
                                                                                        str13 = str12;
                                                                                        bool2 = Boolean.TRUE;
                                                                                        throw new Exception("Verifying use of hookup tools");
                                                                                    } catch (SecurityException e9) {
                                                                                        e = e9;
                                                                                        strM37091l = null;
                                                                                        strM37087h = null;
                                                                                        ((z2f1) xd70Var).m95188a(new MobileError(System.currentTimeMillis(), null, "mobile-report", e.getMessage(), new ErrorMetadata(200, "Telephony", "A telephony security error occurred", (String) null, pmf0.m70321g(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null)));
                                                                                        str7 = strM37086g;
                                                                                        str8 = strM37083p;
                                                                                        str9 = strM37091l;
                                                                                        str10 = strM37087h;
                                                                                        strM37090k = null;
                                                                                        fingerprint.lpt2(new NetworkInfo(str7, strM37090k, str9, str10, str8));
                                                                                        DisplayMetrics displayMetrics5 = context.getResources().getDisplayMetrics();
                                                                                        fingerprint.lpt2(new ScreenInfo(displayMetrics5.densityDpi, displayMetrics5.heightPixels, displayMetrics5.widthPixels));
                                                                                        nve nveVar5 = (nve) zkk0Var;
                                                                                        nveVar5.getClass();
                                                                                        DeviceId.Companion coM8 = DeviceId.INSTANCE;
                                                                                        fingerprint.lpt2(new DeviceInfo(coM8.Lpt5().getBluetoothMAC(), coM8.Lpt5().getWiFiMAC(), coM8.Lpt5().getImei(), coM8.Lpt5().getImsi(), coM8.Lpt5().getAndroidId(), coM8.Lpt5().getMediaDrmId()));
                                                                                        fingerprint.Com8(Locale.getDefault().toLanguageTag());
                                                                                        fingerprint.Lpt5(Locale.getDefault().getCountry());
                                                                                        fingerprint.lpt2(context.getPackageName());
                                                                                        nveVar5.getClass();
                                                                                        strCON = coM8.Lpt5().getDeviceIdProvider();
                                                                                        if (wj50.m88271j(strCON, context.getPackageName())) {
                                                                                            strCON = "self provider";
                                                                                        } else {
                                                                                            strCON = "self provider";
                                                                                        }
                                                                                        fingerprint.COM7(strCON);
                                                                                        String str116 = Build.MANUFACTURER;
                                                                                        fingerprint.cON(str116);
                                                                                        String str117 = Build.MODEL;
                                                                                        fingerprint.LPT3(str117);
                                                                                        fingerprint.COM5(String.valueOf(Build.VERSION.SDK_INT));
                                                                                        aveVar = dveVar.f53439i;
                                                                                        y2f1Var = (y2f1) dveVar.f53433c;
                                                                                        y2f1Var.getClass();
                                                                                        str11 = Build.FINGERPRINT;
                                                                                        if (!bm51.m29803n0(str11, "generic", false)) {
                                                                                            z5 = z3;
                                                                                            z6 = true;
                                                                                        } else {
                                                                                            z5 = z3;
                                                                                            z6 = true;
                                                                                        }
                                                                                        String str118 = y2f1.f268606c;
                                                                                        utu0 utu0Var6 = gk71.f80747a;
                                                                                        utu0Var6.m83940H(str118);
                                                                                        utu0Var6.m83952u("isProbablyEmulator = " + z6, new Object[0]);
                                                                                        boolValueOf = Boolean.valueOf(z6);
                                                                                        boolValueOf2 = Boolean.valueOf(((x1f1) y2f1Var.f268607a).m89639c(y2f1.m92706d(context)));
                                                                                        boolValueOf3 = Boolean.valueOf(Debug.isDebuggerConnected());
                                                                                        strM92703a = y2f1.m92703a(context);
                                                                                        if (strM92703a == null) {
                                                                                            str12 = "non valid source";
                                                                                        } else {
                                                                                            iHashCode = strM92703a.hashCode();
                                                                                            if (iHashCode != -1859733809) {
                                                                                                if (iHashCode != -1637701853) {
                                                                                                    if (iHashCode != -1225090538) {
                                                                                                        if (iHashCode == -1046965711) {
                                                                                                            str12 = "non valid source";
                                                                                                        } else {
                                                                                                            str12 = "non valid source";
                                                                                                        }
                                                                                                    } else if (strM92703a.equals("com.sec.android.app.samsungapps")) {
                                                                                                        str12 = "non valid source";
                                                                                                    } else {
                                                                                                        str12 = "Samsung Galaxy Store";
                                                                                                    }
                                                                                                } else if (strM92703a.equals("com.huawei.appmarket")) {
                                                                                                    str12 = "non valid source";
                                                                                                } else {
                                                                                                    str12 = "Huawei App Gallery";
                                                                                                }
                                                                                            } else if (strM92703a.equals("com.amazon.venezia")) {
                                                                                                str12 = "non valid source";
                                                                                            } else {
                                                                                                str12 = "Amazon Appstore";
                                                                                            }
                                                                                        }
                                                                                        str13 = str12;
                                                                                        bool2 = Boolean.TRUE;
                                                                                        throw new Exception("Verifying use of hookup tools");
                                                                                    } catch (UnsupportedOperationException e10) {
                                                                                        e = e10;
                                                                                        strM37091l = null;
                                                                                        strM37087h = null;
                                                                                        ((z2f1) xd70Var).m95188a(new MobileError(System.currentTimeMillis(), null, "mobile-report", e.getMessage(), new ErrorMetadata(202, "Telephony", "A telephony UnsupportedOperation error occurred", (String) null, pmf0.m70321g(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null)));
                                                                                        str7 = strM37086g;
                                                                                        str8 = strM37083p;
                                                                                        str9 = strM37091l;
                                                                                        str10 = strM37087h;
                                                                                        strM37090k = null;
                                                                                        fingerprint.lpt2(new NetworkInfo(str7, strM37090k, str9, str10, str8));
                                                                                        DisplayMetrics displayMetrics6 = context.getResources().getDisplayMetrics();
                                                                                        fingerprint.lpt2(new ScreenInfo(displayMetrics6.densityDpi, displayMetrics6.heightPixels, displayMetrics6.widthPixels));
                                                                                        nve nveVar6 = (nve) zkk0Var;
                                                                                        nveVar6.getClass();
                                                                                        DeviceId.Companion coM9 = DeviceId.INSTANCE;
                                                                                        fingerprint.lpt2(new DeviceInfo(coM9.Lpt5().getBluetoothMAC(), coM9.Lpt5().getWiFiMAC(), coM9.Lpt5().getImei(), coM9.Lpt5().getImsi(), coM9.Lpt5().getAndroidId(), coM9.Lpt5().getMediaDrmId()));
                                                                                        fingerprint.Com8(Locale.getDefault().toLanguageTag());
                                                                                        fingerprint.Lpt5(Locale.getDefault().getCountry());
                                                                                        fingerprint.lpt2(context.getPackageName());
                                                                                        nveVar6.getClass();
                                                                                        strCON = coM9.Lpt5().getDeviceIdProvider();
                                                                                        if (wj50.m88271j(strCON, context.getPackageName())) {
                                                                                            strCON = "self provider";
                                                                                        } else {
                                                                                            strCON = "self provider";
                                                                                        }
                                                                                        fingerprint.COM7(strCON);
                                                                                        String str119 = Build.MANUFACTURER;
                                                                                        fingerprint.cON(str119);
                                                                                        String str1110 = Build.MODEL;
                                                                                        fingerprint.LPT3(str1110);
                                                                                        fingerprint.COM5(String.valueOf(Build.VERSION.SDK_INT));
                                                                                        aveVar = dveVar.f53439i;
                                                                                        y2f1Var = (y2f1) dveVar.f53433c;
                                                                                        y2f1Var.getClass();
                                                                                        str11 = Build.FINGERPRINT;
                                                                                        if (!bm51.m29803n0(str11, "generic", false)) {
                                                                                            z5 = z3;
                                                                                            z6 = true;
                                                                                        } else {
                                                                                            z5 = z3;
                                                                                            z6 = true;
                                                                                        }
                                                                                        String str1111 = y2f1.f268606c;
                                                                                        utu0 utu0Var7 = gk71.f80747a;
                                                                                        utu0Var7.m83940H(str1111);
                                                                                        utu0Var7.m83952u("isProbablyEmulator = " + z6, new Object[0]);
                                                                                        boolValueOf = Boolean.valueOf(z6);
                                                                                        boolValueOf2 = Boolean.valueOf(((x1f1) y2f1Var.f268607a).m89639c(y2f1.m92706d(context)));
                                                                                        boolValueOf3 = Boolean.valueOf(Debug.isDebuggerConnected());
                                                                                        strM92703a = y2f1.m92703a(context);
                                                                                        if (strM92703a == null) {
                                                                                            str12 = "non valid source";
                                                                                        } else {
                                                                                            iHashCode = strM92703a.hashCode();
                                                                                            if (iHashCode != -1859733809) {
                                                                                                if (iHashCode != -1637701853) {
                                                                                                    if (iHashCode != -1225090538) {
                                                                                                        if (iHashCode == -1046965711) {
                                                                                                            str12 = "non valid source";
                                                                                                        } else {
                                                                                                            str12 = "non valid source";
                                                                                                        }
                                                                                                    } else if (strM92703a.equals("com.sec.android.app.samsungapps")) {
                                                                                                        str12 = "non valid source";
                                                                                                    } else {
                                                                                                        str12 = "Samsung Galaxy Store";
                                                                                                    }
                                                                                                } else if (strM92703a.equals("com.huawei.appmarket")) {
                                                                                                    str12 = "non valid source";
                                                                                                } else {
                                                                                                    str12 = "Huawei App Gallery";
                                                                                                }
                                                                                            } else if (strM92703a.equals("com.amazon.venezia")) {
                                                                                                str12 = "non valid source";
                                                                                            } else {
                                                                                                str12 = "Amazon Appstore";
                                                                                            }
                                                                                        }
                                                                                        str13 = str12;
                                                                                        bool2 = Boolean.TRUE;
                                                                                        throw new Exception("Verifying use of hookup tools");
                                                                                    }
                                                                                } catch (RemoteException e11) {
                                                                                    e = e11;
                                                                                    strM37083p = null;
                                                                                    strM37091l = null;
                                                                                    strM37087h = null;
                                                                                    ((z2f1) xd70Var).m95188a(new MobileError(System.currentTimeMillis(), null, "mobile-report", e.getMessage(), new ErrorMetadata(201, "Telephony", "A telephony remote error occurred", (String) null, pmf0.m70321g(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null)));
                                                                                    str7 = strM37086g;
                                                                                    str8 = strM37083p;
                                                                                    str9 = strM37091l;
                                                                                    str10 = strM37087h;
                                                                                    strM37090k = null;
                                                                                    fingerprint.lpt2(new NetworkInfo(str7, strM37090k, str9, str10, str8));
                                                                                    DisplayMetrics displayMetrics7 = context.getResources().getDisplayMetrics();
                                                                                    fingerprint.lpt2(new ScreenInfo(displayMetrics7.densityDpi, displayMetrics7.heightPixels, displayMetrics7.widthPixels));
                                                                                    nve nveVar7 = (nve) zkk0Var;
                                                                                    nveVar7.getClass();
                                                                                    DeviceId.Companion coM10 = DeviceId.INSTANCE;
                                                                                    fingerprint.lpt2(new DeviceInfo(coM10.Lpt5().getBluetoothMAC(), coM10.Lpt5().getWiFiMAC(), coM10.Lpt5().getImei(), coM10.Lpt5().getImsi(), coM10.Lpt5().getAndroidId(), coM10.Lpt5().getMediaDrmId()));
                                                                                    fingerprint.Com8(Locale.getDefault().toLanguageTag());
                                                                                    fingerprint.Lpt5(Locale.getDefault().getCountry());
                                                                                    fingerprint.lpt2(context.getPackageName());
                                                                                    nveVar7.getClass();
                                                                                    strCON = coM10.Lpt5().getDeviceIdProvider();
                                                                                    if (wj50.m88271j(strCON, context.getPackageName())) {
                                                                                        strCON = "self provider";
                                                                                    } else {
                                                                                        strCON = "self provider";
                                                                                    }
                                                                                    fingerprint.COM7(strCON);
                                                                                    String str1112 = Build.MANUFACTURER;
                                                                                    fingerprint.cON(str1112);
                                                                                    String str1113 = Build.MODEL;
                                                                                    fingerprint.LPT3(str1113);
                                                                                    fingerprint.COM5(String.valueOf(Build.VERSION.SDK_INT));
                                                                                    aveVar = dveVar.f53439i;
                                                                                    y2f1Var = (y2f1) dveVar.f53433c;
                                                                                    y2f1Var.getClass();
                                                                                    str11 = Build.FINGERPRINT;
                                                                                    if (!bm51.m29803n0(str11, "generic", false)) {
                                                                                        z5 = z3;
                                                                                        z6 = true;
                                                                                    } else {
                                                                                        z5 = z3;
                                                                                        z6 = true;
                                                                                    }
                                                                                    String str1114 = y2f1.f268606c;
                                                                                    utu0 utu0Var8 = gk71.f80747a;
                                                                                    utu0Var8.m83940H(str1114);
                                                                                    utu0Var8.m83952u("isProbablyEmulator = " + z6, new Object[0]);
                                                                                    boolValueOf = Boolean.valueOf(z6);
                                                                                    boolValueOf2 = Boolean.valueOf(((x1f1) y2f1Var.f268607a).m89639c(y2f1.m92706d(context)));
                                                                                    boolValueOf3 = Boolean.valueOf(Debug.isDebuggerConnected());
                                                                                    strM92703a = y2f1.m92703a(context);
                                                                                    if (strM92703a == null) {
                                                                                        str12 = "non valid source";
                                                                                    } else {
                                                                                        iHashCode = strM92703a.hashCode();
                                                                                        if (iHashCode != -1859733809) {
                                                                                            if (iHashCode != -1637701853) {
                                                                                                if (iHashCode != -1225090538) {
                                                                                                    if (iHashCode == -1046965711) {
                                                                                                        str12 = "non valid source";
                                                                                                    } else {
                                                                                                        str12 = "non valid source";
                                                                                                    }
                                                                                                } else if (strM92703a.equals("com.sec.android.app.samsungapps")) {
                                                                                                    str12 = "non valid source";
                                                                                                } else {
                                                                                                    str12 = "Samsung Galaxy Store";
                                                                                                }
                                                                                            } else if (strM92703a.equals("com.huawei.appmarket")) {
                                                                                                str12 = "non valid source";
                                                                                            } else {
                                                                                                str12 = "Huawei App Gallery";
                                                                                            }
                                                                                        } else if (strM92703a.equals("com.amazon.venezia")) {
                                                                                            str12 = "non valid source";
                                                                                        } else {
                                                                                            str12 = "Amazon Appstore";
                                                                                        }
                                                                                    }
                                                                                    str13 = str12;
                                                                                    bool2 = Boolean.TRUE;
                                                                                    throw new Exception("Verifying use of hookup tools");
                                                                                } catch (SecurityException e12) {
                                                                                    e = e12;
                                                                                    strM37083p = null;
                                                                                    strM37091l = null;
                                                                                    strM37087h = null;
                                                                                    ((z2f1) xd70Var).m95188a(new MobileError(System.currentTimeMillis(), null, "mobile-report", e.getMessage(), new ErrorMetadata(200, "Telephony", "A telephony security error occurred", (String) null, pmf0.m70321g(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null)));
                                                                                    str7 = strM37086g;
                                                                                    str8 = strM37083p;
                                                                                    str9 = strM37091l;
                                                                                    str10 = strM37087h;
                                                                                    strM37090k = null;
                                                                                    fingerprint.lpt2(new NetworkInfo(str7, strM37090k, str9, str10, str8));
                                                                                    DisplayMetrics displayMetrics8 = context.getResources().getDisplayMetrics();
                                                                                    fingerprint.lpt2(new ScreenInfo(displayMetrics8.densityDpi, displayMetrics8.heightPixels, displayMetrics8.widthPixels));
                                                                                    nve nveVar8 = (nve) zkk0Var;
                                                                                    nveVar8.getClass();
                                                                                    DeviceId.Companion coM11 = DeviceId.INSTANCE;
                                                                                    fingerprint.lpt2(new DeviceInfo(coM11.Lpt5().getBluetoothMAC(), coM11.Lpt5().getWiFiMAC(), coM11.Lpt5().getImei(), coM11.Lpt5().getImsi(), coM11.Lpt5().getAndroidId(), coM11.Lpt5().getMediaDrmId()));
                                                                                    fingerprint.Com8(Locale.getDefault().toLanguageTag());
                                                                                    fingerprint.Lpt5(Locale.getDefault().getCountry());
                                                                                    fingerprint.lpt2(context.getPackageName());
                                                                                    nveVar8.getClass();
                                                                                    strCON = coM11.Lpt5().getDeviceIdProvider();
                                                                                    if (wj50.m88271j(strCON, context.getPackageName())) {
                                                                                        strCON = "self provider";
                                                                                    } else {
                                                                                        strCON = "self provider";
                                                                                    }
                                                                                    fingerprint.COM7(strCON);
                                                                                    String str1115 = Build.MANUFACTURER;
                                                                                    fingerprint.cON(str1115);
                                                                                    String str1116 = Build.MODEL;
                                                                                    fingerprint.LPT3(str1116);
                                                                                    fingerprint.COM5(String.valueOf(Build.VERSION.SDK_INT));
                                                                                    aveVar = dveVar.f53439i;
                                                                                    y2f1Var = (y2f1) dveVar.f53433c;
                                                                                    y2f1Var.getClass();
                                                                                    str11 = Build.FINGERPRINT;
                                                                                    if (!bm51.m29803n0(str11, "generic", false)) {
                                                                                        z5 = z3;
                                                                                        z6 = true;
                                                                                    } else {
                                                                                        z5 = z3;
                                                                                        z6 = true;
                                                                                    }
                                                                                    String str1117 = y2f1.f268606c;
                                                                                    utu0 utu0Var9 = gk71.f80747a;
                                                                                    utu0Var9.m83940H(str1117);
                                                                                    utu0Var9.m83952u("isProbablyEmulator = " + z6, new Object[0]);
                                                                                    boolValueOf = Boolean.valueOf(z6);
                                                                                    boolValueOf2 = Boolean.valueOf(((x1f1) y2f1Var.f268607a).m89639c(y2f1.m92706d(context)));
                                                                                    boolValueOf3 = Boolean.valueOf(Debug.isDebuggerConnected());
                                                                                    strM92703a = y2f1.m92703a(context);
                                                                                    if (strM92703a == null) {
                                                                                        str12 = "non valid source";
                                                                                    } else {
                                                                                        iHashCode = strM92703a.hashCode();
                                                                                        if (iHashCode != -1859733809) {
                                                                                            if (iHashCode != -1637701853) {
                                                                                                if (iHashCode != -1225090538) {
                                                                                                    if (iHashCode == -1046965711) {
                                                                                                        str12 = "non valid source";
                                                                                                    } else {
                                                                                                        str12 = "non valid source";
                                                                                                    }
                                                                                                } else if (strM92703a.equals("com.sec.android.app.samsungapps")) {
                                                                                                    str12 = "non valid source";
                                                                                                } else {
                                                                                                    str12 = "Samsung Galaxy Store";
                                                                                                }
                                                                                            } else if (strM92703a.equals("com.huawei.appmarket")) {
                                                                                                str12 = "non valid source";
                                                                                            } else {
                                                                                                str12 = "Huawei App Gallery";
                                                                                            }
                                                                                        } else if (strM92703a.equals("com.amazon.venezia")) {
                                                                                            str12 = "non valid source";
                                                                                        } else {
                                                                                            str12 = "Amazon Appstore";
                                                                                        }
                                                                                    }
                                                                                    str13 = str12;
                                                                                    bool2 = Boolean.TRUE;
                                                                                    throw new Exception("Verifying use of hookup tools");
                                                                                } catch (UnsupportedOperationException e13) {
                                                                                    e = e13;
                                                                                    strM37083p = null;
                                                                                    strM37091l = null;
                                                                                    strM37087h = null;
                                                                                    ((z2f1) xd70Var).m95188a(new MobileError(System.currentTimeMillis(), null, "mobile-report", e.getMessage(), new ErrorMetadata(202, "Telephony", "A telephony UnsupportedOperation error occurred", (String) null, pmf0.m70321g(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null)));
                                                                                    str7 = strM37086g;
                                                                                    str8 = strM37083p;
                                                                                    str9 = strM37091l;
                                                                                    str10 = strM37087h;
                                                                                    strM37090k = null;
                                                                                    fingerprint.lpt2(new NetworkInfo(str7, strM37090k, str9, str10, str8));
                                                                                    DisplayMetrics displayMetrics9 = context.getResources().getDisplayMetrics();
                                                                                    fingerprint.lpt2(new ScreenInfo(displayMetrics9.densityDpi, displayMetrics9.heightPixels, displayMetrics9.widthPixels));
                                                                                    nve nveVar9 = (nve) zkk0Var;
                                                                                    nveVar9.getClass();
                                                                                    DeviceId.Companion coM12 = DeviceId.INSTANCE;
                                                                                    fingerprint.lpt2(new DeviceInfo(coM12.Lpt5().getBluetoothMAC(), coM12.Lpt5().getWiFiMAC(), coM12.Lpt5().getImei(), coM12.Lpt5().getImsi(), coM12.Lpt5().getAndroidId(), coM12.Lpt5().getMediaDrmId()));
                                                                                    fingerprint.Com8(Locale.getDefault().toLanguageTag());
                                                                                    fingerprint.Lpt5(Locale.getDefault().getCountry());
                                                                                    fingerprint.lpt2(context.getPackageName());
                                                                                    nveVar9.getClass();
                                                                                    strCON = coM12.Lpt5().getDeviceIdProvider();
                                                                                    if (wj50.m88271j(strCON, context.getPackageName())) {
                                                                                        strCON = "self provider";
                                                                                    } else {
                                                                                        strCON = "self provider";
                                                                                    }
                                                                                    fingerprint.COM7(strCON);
                                                                                    String str1118 = Build.MANUFACTURER;
                                                                                    fingerprint.cON(str1118);
                                                                                    String str1119 = Build.MODEL;
                                                                                    fingerprint.LPT3(str1119);
                                                                                    fingerprint.COM5(String.valueOf(Build.VERSION.SDK_INT));
                                                                                    aveVar = dveVar.f53439i;
                                                                                    y2f1Var = (y2f1) dveVar.f53433c;
                                                                                    y2f1Var.getClass();
                                                                                    str11 = Build.FINGERPRINT;
                                                                                    if (!bm51.m29803n0(str11, "generic", false)) {
                                                                                        z5 = z3;
                                                                                        z6 = true;
                                                                                    } else {
                                                                                        z5 = z3;
                                                                                        z6 = true;
                                                                                    }
                                                                                    String str11110 = y2f1.f268606c;
                                                                                    utu0 utu0Var10 = gk71.f80747a;
                                                                                    utu0Var10.m83940H(str11110);
                                                                                    utu0Var10.m83952u("isProbablyEmulator = " + z6, new Object[0]);
                                                                                    boolValueOf = Boolean.valueOf(z6);
                                                                                    boolValueOf2 = Boolean.valueOf(((x1f1) y2f1Var.f268607a).m89639c(y2f1.m92706d(context)));
                                                                                    boolValueOf3 = Boolean.valueOf(Debug.isDebuggerConnected());
                                                                                    strM92703a = y2f1.m92703a(context);
                                                                                    if (strM92703a == null) {
                                                                                        str12 = "non valid source";
                                                                                    } else {
                                                                                        iHashCode = strM92703a.hashCode();
                                                                                        if (iHashCode != -1859733809) {
                                                                                            if (iHashCode != -1637701853) {
                                                                                                if (iHashCode != -1225090538) {
                                                                                                    if (iHashCode == -1046965711) {
                                                                                                        str12 = "non valid source";
                                                                                                    } else {
                                                                                                        str12 = "non valid source";
                                                                                                    }
                                                                                                } else if (strM92703a.equals("com.sec.android.app.samsungapps")) {
                                                                                                    str12 = "non valid source";
                                                                                                } else {
                                                                                                    str12 = "Samsung Galaxy Store";
                                                                                                }
                                                                                            } else if (strM92703a.equals("com.huawei.appmarket")) {
                                                                                                str12 = "non valid source";
                                                                                            } else {
                                                                                                str12 = "Huawei App Gallery";
                                                                                            }
                                                                                        } else if (strM92703a.equals("com.amazon.venezia")) {
                                                                                            str12 = "non valid source";
                                                                                        } else {
                                                                                            str12 = "Amazon Appstore";
                                                                                        }
                                                                                    }
                                                                                    str13 = str12;
                                                                                    bool2 = Boolean.TRUE;
                                                                                    throw new Exception("Verifying use of hookup tools");
                                                                                }
                                                                            } catch (RemoteException e14) {
                                                                                e = e14;
                                                                                strM37086g = null;
                                                                            } catch (SecurityException e15) {
                                                                                e = e15;
                                                                                strM37086g = null;
                                                                            } catch (UnsupportedOperationException e16) {
                                                                                e = e16;
                                                                                strM37086g = null;
                                                                            }
                                                                        } else {
                                                                            str7 = null;
                                                                            strM37090k = null;
                                                                            str9 = null;
                                                                            str10 = null;
                                                                            str8 = null;
                                                                        }
                                                                        fingerprint.lpt2(new NetworkInfo(str7, strM37090k, str9, str10, str8));
                                                                        DisplayMetrics displayMetrics10 = context.getResources().getDisplayMetrics();
                                                                        fingerprint.lpt2(new ScreenInfo(displayMetrics10.densityDpi, displayMetrics10.heightPixels, displayMetrics10.widthPixels));
                                                                        nve nveVar10 = (nve) zkk0Var;
                                                                        nveVar10.getClass();
                                                                        DeviceId.Companion coM13 = DeviceId.INSTANCE;
                                                                        fingerprint.lpt2(new DeviceInfo(coM13.Lpt5().getBluetoothMAC(), coM13.Lpt5().getWiFiMAC(), coM13.Lpt5().getImei(), coM13.Lpt5().getImsi(), coM13.Lpt5().getAndroidId(), coM13.Lpt5().getMediaDrmId()));
                                                                        fingerprint.Com8(Locale.getDefault().toLanguageTag());
                                                                        fingerprint.Lpt5(Locale.getDefault().getCountry());
                                                                        fingerprint.lpt2(context.getPackageName());
                                                                        nveVar10.getClass();
                                                                        strCON = coM13.Lpt5().getDeviceIdProvider();
                                                                        if (wj50.m88271j(strCON, context.getPackageName())) {
                                                                            strCON = "self provider";
                                                                        } else {
                                                                            strCON = "self provider";
                                                                        }
                                                                        fingerprint.COM7(strCON);
                                                                        String str11111 = Build.MANUFACTURER;
                                                                        fingerprint.cON(str11111);
                                                                        String str11112 = Build.MODEL;
                                                                        fingerprint.LPT3(str11112);
                                                                        fingerprint.COM5(String.valueOf(Build.VERSION.SDK_INT));
                                                                        aveVar = dveVar.f53439i;
                                                                        y2f1Var = (y2f1) dveVar.f53433c;
                                                                        y2f1Var.getClass();
                                                                        str11 = Build.FINGERPRINT;
                                                                        if (!bm51.m29803n0(str11, "generic", false)) {
                                                                            z5 = z3;
                                                                            z6 = true;
                                                                        } else {
                                                                            z5 = z3;
                                                                            z6 = true;
                                                                        }
                                                                        String str11113 = y2f1.f268606c;
                                                                        utu0 utu0Var11 = gk71.f80747a;
                                                                        utu0Var11.m83940H(str11113);
                                                                        utu0Var11.m83952u("isProbablyEmulator = " + z6, new Object[0]);
                                                                        boolValueOf = Boolean.valueOf(z6);
                                                                        boolValueOf2 = Boolean.valueOf(((x1f1) y2f1Var.f268607a).m89639c(y2f1.m92706d(context)));
                                                                        boolValueOf3 = Boolean.valueOf(Debug.isDebuggerConnected());
                                                                        strM92703a = y2f1.m92703a(context);
                                                                        if (strM92703a == null) {
                                                                            str12 = "non valid source";
                                                                        } else {
                                                                            iHashCode = strM92703a.hashCode();
                                                                            if (iHashCode != -1859733809) {
                                                                                if (iHashCode != -1637701853) {
                                                                                    if (iHashCode != -1225090538) {
                                                                                        if (iHashCode == -1046965711) {
                                                                                            str12 = "non valid source";
                                                                                        } else {
                                                                                            str12 = "non valid source";
                                                                                        }
                                                                                    } else if (strM92703a.equals("com.sec.android.app.samsungapps")) {
                                                                                        str12 = "non valid source";
                                                                                    } else {
                                                                                        str12 = "Samsung Galaxy Store";
                                                                                    }
                                                                                } else if (strM92703a.equals("com.huawei.appmarket")) {
                                                                                    str12 = "non valid source";
                                                                                } else {
                                                                                    str12 = "Huawei App Gallery";
                                                                                }
                                                                            } else if (strM92703a.equals("com.amazon.venezia")) {
                                                                                str12 = "non valid source";
                                                                            } else {
                                                                                str12 = "Amazon Appstore";
                                                                            }
                                                                        }
                                                                        str13 = str12;
                                                                        bool2 = Boolean.TRUE;
                                                                        throw new Exception("Verifying use of hookup tools");
                                                                    }
                                                                    simOperator = telephonyManager.getSimOperator();
                                                                    boolM37088i = dveVar.m37088i(telephonyManager);
                                                                    str3 = simCountryIso;
                                                                    str4 = strM37095r;
                                                                    str5 = strM37084q;
                                                                    str6 = str2;
                                                                } catch (RemoteException e17) {
                                                                    e = e17;
                                                                    ((z2f1) xd70Var).m95188a(new MobileError(System.currentTimeMillis(), null, "mobile-report", e.getMessage(), new ErrorMetadata(201, "Telephony", "A telephony remote error occurred", (String) null, pmf0.m70321g(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null)));
                                                                    str3 = simCountryIso;
                                                                    str4 = strM37095r;
                                                                    str5 = strM37084q;
                                                                    str6 = str2;
                                                                    boolM37088i = null;
                                                                } catch (SecurityException e18) {
                                                                    e = e18;
                                                                    ((z2f1) xd70Var).m95188a(new MobileError(System.currentTimeMillis(), null, "mobile-report", e.getMessage(), new ErrorMetadata(200, "Telephony", "A telephony security error occurred", (String) null, pmf0.m70321g(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null)));
                                                                    str3 = simCountryIso;
                                                                    str4 = strM37095r;
                                                                    str5 = strM37084q;
                                                                    str6 = str2;
                                                                    boolM37088i = null;
                                                                }
                                                                str2 = simOperator;
                                                            } catch (RemoteException e19) {
                                                                e = e19;
                                                                str2 = null;
                                                                ((z2f1) xd70Var).m95188a(new MobileError(System.currentTimeMillis(), null, "mobile-report", e.getMessage(), new ErrorMetadata(201, "Telephony", "A telephony remote error occurred", (String) null, pmf0.m70321g(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null)));
                                                                str3 = simCountryIso;
                                                                str4 = strM37095r;
                                                                str5 = strM37084q;
                                                                str6 = str2;
                                                                boolM37088i = null;
                                                                fingerprint.lpt2(new CarrierInfo(str4, str5, str3, str6, boolM37088i));
                                                                if (telephonyManager != null) {
                                                                    strM37086g = dveVar.m37086g(vueVar2, telephonyManager);
                                                                    strM37083p = m37083p(telephonyManager);
                                                                    strM37091l = dveVar.m37091l(vueVar2, telephonyManager);
                                                                    strM37087h = dveVar.m37087h(vueVar2, telephonyManager);
                                                                    strM37090k = dveVar.m37090k(context, telephonyManager);
                                                                    str7 = strM37086g;
                                                                    str8 = strM37083p;
                                                                    str9 = strM37091l;
                                                                    str10 = strM37087h;
                                                                } else {
                                                                    str7 = null;
                                                                    strM37090k = null;
                                                                    str9 = null;
                                                                    str10 = null;
                                                                    str8 = null;
                                                                }
                                                                fingerprint.lpt2(new NetworkInfo(str7, strM37090k, str9, str10, str8));
                                                                DisplayMetrics displayMetrics11 = context.getResources().getDisplayMetrics();
                                                                fingerprint.lpt2(new ScreenInfo(displayMetrics11.densityDpi, displayMetrics11.heightPixels, displayMetrics11.widthPixels));
                                                                nve nveVar11 = (nve) zkk0Var;
                                                                nveVar11.getClass();
                                                                DeviceId.Companion coM14 = DeviceId.INSTANCE;
                                                                fingerprint.lpt2(new DeviceInfo(coM14.Lpt5().getBluetoothMAC(), coM14.Lpt5().getWiFiMAC(), coM14.Lpt5().getImei(), coM14.Lpt5().getImsi(), coM14.Lpt5().getAndroidId(), coM14.Lpt5().getMediaDrmId()));
                                                                fingerprint.Com8(Locale.getDefault().toLanguageTag());
                                                                fingerprint.Lpt5(Locale.getDefault().getCountry());
                                                                fingerprint.lpt2(context.getPackageName());
                                                                nveVar11.getClass();
                                                                strCON = coM14.Lpt5().getDeviceIdProvider();
                                                                if (wj50.m88271j(strCON, context.getPackageName())) {
                                                                    strCON = "self provider";
                                                                } else {
                                                                    strCON = "self provider";
                                                                }
                                                                fingerprint.COM7(strCON);
                                                                String str11114 = Build.MANUFACTURER;
                                                                fingerprint.cON(str11114);
                                                                String str11115 = Build.MODEL;
                                                                fingerprint.LPT3(str11115);
                                                                fingerprint.COM5(String.valueOf(Build.VERSION.SDK_INT));
                                                                aveVar = dveVar.f53439i;
                                                                y2f1Var = (y2f1) dveVar.f53433c;
                                                                y2f1Var.getClass();
                                                                str11 = Build.FINGERPRINT;
                                                                if (!bm51.m29803n0(str11, "generic", false)) {
                                                                    z5 = z3;
                                                                    z6 = true;
                                                                } else {
                                                                    z5 = z3;
                                                                    z6 = true;
                                                                }
                                                                String str11116 = y2f1.f268606c;
                                                                utu0 utu0Var12 = gk71.f80747a;
                                                                utu0Var12.m83940H(str11116);
                                                                utu0Var12.m83952u("isProbablyEmulator = " + z6, new Object[0]);
                                                                boolValueOf = Boolean.valueOf(z6);
                                                                boolValueOf2 = Boolean.valueOf(((x1f1) y2f1Var.f268607a).m89639c(y2f1.m92706d(context)));
                                                                boolValueOf3 = Boolean.valueOf(Debug.isDebuggerConnected());
                                                                strM92703a = y2f1.m92703a(context);
                                                                if (strM92703a == null) {
                                                                    str12 = "non valid source";
                                                                } else {
                                                                    iHashCode = strM92703a.hashCode();
                                                                    if (iHashCode != -1859733809) {
                                                                        if (iHashCode != -1637701853) {
                                                                            if (iHashCode != -1225090538) {
                                                                                if (iHashCode == -1046965711) {
                                                                                    str12 = "non valid source";
                                                                                } else {
                                                                                    str12 = "non valid source";
                                                                                }
                                                                            } else if (strM92703a.equals("com.sec.android.app.samsungapps")) {
                                                                                str12 = "non valid source";
                                                                            } else {
                                                                                str12 = "Samsung Galaxy Store";
                                                                            }
                                                                        } else if (strM92703a.equals("com.huawei.appmarket")) {
                                                                            str12 = "non valid source";
                                                                        } else {
                                                                            str12 = "Huawei App Gallery";
                                                                        }
                                                                    } else if (strM92703a.equals("com.amazon.venezia")) {
                                                                        str12 = "non valid source";
                                                                    } else {
                                                                        str12 = "Amazon Appstore";
                                                                    }
                                                                }
                                                                str13 = str12;
                                                                bool2 = Boolean.TRUE;
                                                                throw new Exception("Verifying use of hookup tools");
                                                            } catch (SecurityException e20) {
                                                                e = e20;
                                                                str2 = null;
                                                                ((z2f1) xd70Var).m95188a(new MobileError(System.currentTimeMillis(), null, "mobile-report", e.getMessage(), new ErrorMetadata(200, "Telephony", "A telephony security error occurred", (String) null, pmf0.m70321g(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null)));
                                                                str3 = simCountryIso;
                                                                str4 = strM37095r;
                                                                str5 = strM37084q;
                                                                str6 = str2;
                                                                boolM37088i = null;
                                                                fingerprint.lpt2(new CarrierInfo(str4, str5, str3, str6, boolM37088i));
                                                                if (telephonyManager != null) {
                                                                    strM37086g = dveVar.m37086g(vueVar2, telephonyManager);
                                                                    strM37083p = m37083p(telephonyManager);
                                                                    strM37091l = dveVar.m37091l(vueVar2, telephonyManager);
                                                                    strM37087h = dveVar.m37087h(vueVar2, telephonyManager);
                                                                    strM37090k = dveVar.m37090k(context, telephonyManager);
                                                                    str7 = strM37086g;
                                                                    str8 = strM37083p;
                                                                    str9 = strM37091l;
                                                                    str10 = strM37087h;
                                                                } else {
                                                                    str7 = null;
                                                                    strM37090k = null;
                                                                    str9 = null;
                                                                    str10 = null;
                                                                    str8 = null;
                                                                }
                                                                fingerprint.lpt2(new NetworkInfo(str7, strM37090k, str9, str10, str8));
                                                                DisplayMetrics displayMetrics12 = context.getResources().getDisplayMetrics();
                                                                fingerprint.lpt2(new ScreenInfo(displayMetrics12.densityDpi, displayMetrics12.heightPixels, displayMetrics12.widthPixels));
                                                                nve nveVar12 = (nve) zkk0Var;
                                                                nveVar12.getClass();
                                                                DeviceId.Companion coM15 = DeviceId.INSTANCE;
                                                                fingerprint.lpt2(new DeviceInfo(coM15.Lpt5().getBluetoothMAC(), coM15.Lpt5().getWiFiMAC(), coM15.Lpt5().getImei(), coM15.Lpt5().getImsi(), coM15.Lpt5().getAndroidId(), coM15.Lpt5().getMediaDrmId()));
                                                                fingerprint.Com8(Locale.getDefault().toLanguageTag());
                                                                fingerprint.Lpt5(Locale.getDefault().getCountry());
                                                                fingerprint.lpt2(context.getPackageName());
                                                                nveVar12.getClass();
                                                                strCON = coM15.Lpt5().getDeviceIdProvider();
                                                                if (wj50.m88271j(strCON, context.getPackageName())) {
                                                                    strCON = "self provider";
                                                                } else {
                                                                    strCON = "self provider";
                                                                }
                                                                fingerprint.COM7(strCON);
                                                                String str11117 = Build.MANUFACTURER;
                                                                fingerprint.cON(str11117);
                                                                String str11118 = Build.MODEL;
                                                                fingerprint.LPT3(str11118);
                                                                fingerprint.COM5(String.valueOf(Build.VERSION.SDK_INT));
                                                                aveVar = dveVar.f53439i;
                                                                y2f1Var = (y2f1) dveVar.f53433c;
                                                                y2f1Var.getClass();
                                                                str11 = Build.FINGERPRINT;
                                                                if (!bm51.m29803n0(str11, "generic", false)) {
                                                                    z5 = z3;
                                                                    z6 = true;
                                                                } else {
                                                                    z5 = z3;
                                                                    z6 = true;
                                                                }
                                                                String str11119 = y2f1.f268606c;
                                                                utu0 utu0Var13 = gk71.f80747a;
                                                                utu0Var13.m83940H(str11119);
                                                                utu0Var13.m83952u("isProbablyEmulator = " + z6, new Object[0]);
                                                                boolValueOf = Boolean.valueOf(z6);
                                                                boolValueOf2 = Boolean.valueOf(((x1f1) y2f1Var.f268607a).m89639c(y2f1.m92706d(context)));
                                                                boolValueOf3 = Boolean.valueOf(Debug.isDebuggerConnected());
                                                                strM92703a = y2f1.m92703a(context);
                                                                if (strM92703a == null) {
                                                                    str12 = "non valid source";
                                                                } else {
                                                                    iHashCode = strM92703a.hashCode();
                                                                    if (iHashCode != -1859733809) {
                                                                        if (iHashCode != -1637701853) {
                                                                            if (iHashCode != -1225090538) {
                                                                                if (iHashCode == -1046965711) {
                                                                                    str12 = "non valid source";
                                                                                } else {
                                                                                    str12 = "non valid source";
                                                                                }
                                                                            } else if (strM92703a.equals("com.sec.android.app.samsungapps")) {
                                                                                str12 = "non valid source";
                                                                            } else {
                                                                                str12 = "Samsung Galaxy Store";
                                                                            }
                                                                        } else if (strM92703a.equals("com.huawei.appmarket")) {
                                                                            str12 = "non valid source";
                                                                        } else {
                                                                            str12 = "Huawei App Gallery";
                                                                        }
                                                                    } else if (strM92703a.equals("com.amazon.venezia")) {
                                                                        str12 = "non valid source";
                                                                    } else {
                                                                        str12 = "Amazon Appstore";
                                                                    }
                                                                }
                                                                str13 = str12;
                                                                bool2 = Boolean.TRUE;
                                                                throw new Exception("Verifying use of hookup tools");
                                                            }
                                                        } catch (RemoteException e21) {
                                                            e = e21;
                                                            simCountryIso = null;
                                                        } catch (SecurityException e22) {
                                                            e = e22;
                                                            simCountryIso = null;
                                                        }
                                                    } catch (RemoteException e23) {
                                                        e = e23;
                                                        simCountryIso = null;
                                                        strM37084q = null;
                                                        str2 = null;
                                                        ((z2f1) xd70Var).m95188a(new MobileError(System.currentTimeMillis(), null, "mobile-report", e.getMessage(), new ErrorMetadata(201, "Telephony", "A telephony remote error occurred", (String) null, pmf0.m70321g(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null)));
                                                        str3 = simCountryIso;
                                                        str4 = strM37095r;
                                                        str5 = strM37084q;
                                                        str6 = str2;
                                                        boolM37088i = null;
                                                        fingerprint.lpt2(new CarrierInfo(str4, str5, str3, str6, boolM37088i));
                                                        if (telephonyManager != null) {
                                                            strM37086g = dveVar.m37086g(vueVar2, telephonyManager);
                                                            strM37083p = m37083p(telephonyManager);
                                                            strM37091l = dveVar.m37091l(vueVar2, telephonyManager);
                                                            strM37087h = dveVar.m37087h(vueVar2, telephonyManager);
                                                            strM37090k = dveVar.m37090k(context, telephonyManager);
                                                            str7 = strM37086g;
                                                            str8 = strM37083p;
                                                            str9 = strM37091l;
                                                            str10 = strM37087h;
                                                        } else {
                                                            str7 = null;
                                                            strM37090k = null;
                                                            str9 = null;
                                                            str10 = null;
                                                            str8 = null;
                                                        }
                                                        fingerprint.lpt2(new NetworkInfo(str7, strM37090k, str9, str10, str8));
                                                        DisplayMetrics displayMetrics13 = context.getResources().getDisplayMetrics();
                                                        fingerprint.lpt2(new ScreenInfo(displayMetrics13.densityDpi, displayMetrics13.heightPixels, displayMetrics13.widthPixels));
                                                        nve nveVar13 = (nve) zkk0Var;
                                                        nveVar13.getClass();
                                                        DeviceId.Companion coM16 = DeviceId.INSTANCE;
                                                        fingerprint.lpt2(new DeviceInfo(coM16.Lpt5().getBluetoothMAC(), coM16.Lpt5().getWiFiMAC(), coM16.Lpt5().getImei(), coM16.Lpt5().getImsi(), coM16.Lpt5().getAndroidId(), coM16.Lpt5().getMediaDrmId()));
                                                        fingerprint.Com8(Locale.getDefault().toLanguageTag());
                                                        fingerprint.Lpt5(Locale.getDefault().getCountry());
                                                        fingerprint.lpt2(context.getPackageName());
                                                        nveVar13.getClass();
                                                        strCON = coM16.Lpt5().getDeviceIdProvider();
                                                        if (wj50.m88271j(strCON, context.getPackageName())) {
                                                            strCON = "self provider";
                                                        } else {
                                                            strCON = "self provider";
                                                        }
                                                        fingerprint.COM7(strCON);
                                                        String str111110 = Build.MANUFACTURER;
                                                        fingerprint.cON(str111110);
                                                        String str111111 = Build.MODEL;
                                                        fingerprint.LPT3(str111111);
                                                        fingerprint.COM5(String.valueOf(Build.VERSION.SDK_INT));
                                                        aveVar = dveVar.f53439i;
                                                        y2f1Var = (y2f1) dveVar.f53433c;
                                                        y2f1Var.getClass();
                                                        str11 = Build.FINGERPRINT;
                                                        if (!bm51.m29803n0(str11, "generic", false)) {
                                                            z5 = z3;
                                                            z6 = true;
                                                        } else {
                                                            z5 = z3;
                                                            z6 = true;
                                                        }
                                                        String str111112 = y2f1.f268606c;
                                                        utu0 utu0Var14 = gk71.f80747a;
                                                        utu0Var14.m83940H(str111112);
                                                        utu0Var14.m83952u("isProbablyEmulator = " + z6, new Object[0]);
                                                        boolValueOf = Boolean.valueOf(z6);
                                                        boolValueOf2 = Boolean.valueOf(((x1f1) y2f1Var.f268607a).m89639c(y2f1.m92706d(context)));
                                                        boolValueOf3 = Boolean.valueOf(Debug.isDebuggerConnected());
                                                        strM92703a = y2f1.m92703a(context);
                                                        if (strM92703a == null) {
                                                            str12 = "non valid source";
                                                        } else {
                                                            iHashCode = strM92703a.hashCode();
                                                            if (iHashCode != -1859733809) {
                                                                if (iHashCode != -1637701853) {
                                                                    if (iHashCode != -1225090538) {
                                                                        if (iHashCode == -1046965711) {
                                                                            str12 = "non valid source";
                                                                        } else {
                                                                            str12 = "non valid source";
                                                                        }
                                                                    } else if (strM92703a.equals("com.sec.android.app.samsungapps")) {
                                                                        str12 = "non valid source";
                                                                    } else {
                                                                        str12 = "Samsung Galaxy Store";
                                                                    }
                                                                } else if (strM92703a.equals("com.huawei.appmarket")) {
                                                                    str12 = "non valid source";
                                                                } else {
                                                                    str12 = "Huawei App Gallery";
                                                                }
                                                            } else if (strM92703a.equals("com.amazon.venezia")) {
                                                                str12 = "non valid source";
                                                            } else {
                                                                str12 = "Amazon Appstore";
                                                            }
                                                        }
                                                        str13 = str12;
                                                        bool2 = Boolean.TRUE;
                                                        throw new Exception("Verifying use of hookup tools");
                                                    } catch (SecurityException e24) {
                                                        e = e24;
                                                        simCountryIso = null;
                                                        strM37084q = null;
                                                        str2 = null;
                                                        ((z2f1) xd70Var).m95188a(new MobileError(System.currentTimeMillis(), null, "mobile-report", e.getMessage(), new ErrorMetadata(200, "Telephony", "A telephony security error occurred", (String) null, pmf0.m70321g(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null)));
                                                        str3 = simCountryIso;
                                                        str4 = strM37095r;
                                                        str5 = strM37084q;
                                                        str6 = str2;
                                                        boolM37088i = null;
                                                        fingerprint.lpt2(new CarrierInfo(str4, str5, str3, str6, boolM37088i));
                                                        if (telephonyManager != null) {
                                                            strM37086g = dveVar.m37086g(vueVar2, telephonyManager);
                                                            strM37083p = m37083p(telephonyManager);
                                                            strM37091l = dveVar.m37091l(vueVar2, telephonyManager);
                                                            strM37087h = dveVar.m37087h(vueVar2, telephonyManager);
                                                            strM37090k = dveVar.m37090k(context, telephonyManager);
                                                            str7 = strM37086g;
                                                            str8 = strM37083p;
                                                            str9 = strM37091l;
                                                            str10 = strM37087h;
                                                        } else {
                                                            str7 = null;
                                                            strM37090k = null;
                                                            str9 = null;
                                                            str10 = null;
                                                            str8 = null;
                                                        }
                                                        fingerprint.lpt2(new NetworkInfo(str7, strM37090k, str9, str10, str8));
                                                        DisplayMetrics displayMetrics14 = context.getResources().getDisplayMetrics();
                                                        fingerprint.lpt2(new ScreenInfo(displayMetrics14.densityDpi, displayMetrics14.heightPixels, displayMetrics14.widthPixels));
                                                        nve nveVar14 = (nve) zkk0Var;
                                                        nveVar14.getClass();
                                                        DeviceId.Companion coM17 = DeviceId.INSTANCE;
                                                        fingerprint.lpt2(new DeviceInfo(coM17.Lpt5().getBluetoothMAC(), coM17.Lpt5().getWiFiMAC(), coM17.Lpt5().getImei(), coM17.Lpt5().getImsi(), coM17.Lpt5().getAndroidId(), coM17.Lpt5().getMediaDrmId()));
                                                        fingerprint.Com8(Locale.getDefault().toLanguageTag());
                                                        fingerprint.Lpt5(Locale.getDefault().getCountry());
                                                        fingerprint.lpt2(context.getPackageName());
                                                        nveVar14.getClass();
                                                        strCON = coM17.Lpt5().getDeviceIdProvider();
                                                        if (wj50.m88271j(strCON, context.getPackageName())) {
                                                            strCON = "self provider";
                                                        } else {
                                                            strCON = "self provider";
                                                        }
                                                        fingerprint.COM7(strCON);
                                                        String str111113 = Build.MANUFACTURER;
                                                        fingerprint.cON(str111113);
                                                        String str111114 = Build.MODEL;
                                                        fingerprint.LPT3(str111114);
                                                        fingerprint.COM5(String.valueOf(Build.VERSION.SDK_INT));
                                                        aveVar = dveVar.f53439i;
                                                        y2f1Var = (y2f1) dveVar.f53433c;
                                                        y2f1Var.getClass();
                                                        str11 = Build.FINGERPRINT;
                                                        if (!bm51.m29803n0(str11, "generic", false)) {
                                                            z5 = z3;
                                                            z6 = true;
                                                        } else {
                                                            z5 = z3;
                                                            z6 = true;
                                                        }
                                                        String str111115 = y2f1.f268606c;
                                                        utu0 utu0Var15 = gk71.f80747a;
                                                        utu0Var15.m83940H(str111115);
                                                        utu0Var15.m83952u("isProbablyEmulator = " + z6, new Object[0]);
                                                        boolValueOf = Boolean.valueOf(z6);
                                                        boolValueOf2 = Boolean.valueOf(((x1f1) y2f1Var.f268607a).m89639c(y2f1.m92706d(context)));
                                                        boolValueOf3 = Boolean.valueOf(Debug.isDebuggerConnected());
                                                        strM92703a = y2f1.m92703a(context);
                                                        if (strM92703a == null) {
                                                            str12 = "non valid source";
                                                        } else {
                                                            iHashCode = strM92703a.hashCode();
                                                            if (iHashCode != -1859733809) {
                                                                if (iHashCode != -1637701853) {
                                                                    if (iHashCode != -1225090538) {
                                                                        if (iHashCode == -1046965711) {
                                                                            str12 = "non valid source";
                                                                        } else {
                                                                            str12 = "non valid source";
                                                                        }
                                                                    } else if (strM92703a.equals("com.sec.android.app.samsungapps")) {
                                                                        str12 = "non valid source";
                                                                    } else {
                                                                        str12 = "Samsung Galaxy Store";
                                                                    }
                                                                } else if (strM92703a.equals("com.huawei.appmarket")) {
                                                                    str12 = "non valid source";
                                                                } else {
                                                                    str12 = "Huawei App Gallery";
                                                                }
                                                            } else if (strM92703a.equals("com.amazon.venezia")) {
                                                                str12 = "non valid source";
                                                            } else {
                                                                str12 = "Amazon Appstore";
                                                            }
                                                        }
                                                        str13 = str12;
                                                        bool2 = Boolean.TRUE;
                                                        throw new Exception("Verifying use of hookup tools");
                                                    }
                                                } catch (RemoteException e25) {
                                                    e = e25;
                                                    simCountryIso = null;
                                                    strM37095r = null;
                                                } catch (SecurityException e26) {
                                                    e = e26;
                                                    simCountryIso = null;
                                                    strM37095r = null;
                                                }
                                                fingerprint.lpt2(new CarrierInfo(str4, str5, str3, str6, boolM37088i));
                                                if (telephonyManager != null) {
                                                    strM37086g = dveVar.m37086g(vueVar2, telephonyManager);
                                                    strM37083p = m37083p(telephonyManager);
                                                    strM37091l = dveVar.m37091l(vueVar2, telephonyManager);
                                                    strM37087h = dveVar.m37087h(vueVar2, telephonyManager);
                                                    strM37090k = dveVar.m37090k(context, telephonyManager);
                                                    str7 = strM37086g;
                                                    str8 = strM37083p;
                                                    str9 = strM37091l;
                                                    str10 = strM37087h;
                                                } else {
                                                    str7 = null;
                                                    strM37090k = null;
                                                    str9 = null;
                                                    str10 = null;
                                                    str8 = null;
                                                }
                                                fingerprint.lpt2(new NetworkInfo(str7, strM37090k, str9, str10, str8));
                                                DisplayMetrics displayMetrics15 = context.getResources().getDisplayMetrics();
                                                fingerprint.lpt2(new ScreenInfo(displayMetrics15.densityDpi, displayMetrics15.heightPixels, displayMetrics15.widthPixels));
                                                nve nveVar15 = (nve) zkk0Var;
                                                nveVar15.getClass();
                                                DeviceId.Companion coM18 = DeviceId.INSTANCE;
                                                fingerprint.lpt2(new DeviceInfo(coM18.Lpt5().getBluetoothMAC(), coM18.Lpt5().getWiFiMAC(), coM18.Lpt5().getImei(), coM18.Lpt5().getImsi(), coM18.Lpt5().getAndroidId(), coM18.Lpt5().getMediaDrmId()));
                                                fingerprint.Com8(Locale.getDefault().toLanguageTag());
                                                fingerprint.Lpt5(Locale.getDefault().getCountry());
                                                fingerprint.lpt2(context.getPackageName());
                                                nveVar15.getClass();
                                                strCON = coM18.Lpt5().getDeviceIdProvider();
                                                if (wj50.m88271j(strCON, context.getPackageName())) {
                                                    strCON = "self provider";
                                                } else {
                                                    strCON = "self provider";
                                                }
                                                fingerprint.COM7(strCON);
                                                String str111116 = Build.MANUFACTURER;
                                                fingerprint.cON(str111116);
                                                String str111117 = Build.MODEL;
                                                fingerprint.LPT3(str111117);
                                                fingerprint.COM5(String.valueOf(Build.VERSION.SDK_INT));
                                                aveVar = dveVar.f53439i;
                                                y2f1Var = (y2f1) dveVar.f53433c;
                                                y2f1Var.getClass();
                                                str11 = Build.FINGERPRINT;
                                                if (!bm51.m29803n0(str11, "generic", false)) {
                                                    z5 = z3;
                                                    z6 = true;
                                                } else {
                                                    z5 = z3;
                                                    z6 = true;
                                                }
                                                String str111118 = y2f1.f268606c;
                                                utu0 utu0Var16 = gk71.f80747a;
                                                utu0Var16.m83940H(str111118);
                                                utu0Var16.m83952u("isProbablyEmulator = " + z6, new Object[0]);
                                                boolValueOf = Boolean.valueOf(z6);
                                                boolValueOf2 = Boolean.valueOf(((x1f1) y2f1Var.f268607a).m89639c(y2f1.m92706d(context)));
                                                boolValueOf3 = Boolean.valueOf(Debug.isDebuggerConnected());
                                                strM92703a = y2f1.m92703a(context);
                                                if (strM92703a == null) {
                                                    str12 = "non valid source";
                                                } else {
                                                    iHashCode = strM92703a.hashCode();
                                                    if (iHashCode != -1859733809) {
                                                        if (iHashCode != -1637701853) {
                                                            if (iHashCode != -1225090538) {
                                                                if (iHashCode == -1046965711) {
                                                                    str12 = "non valid source";
                                                                } else {
                                                                    str12 = "non valid source";
                                                                }
                                                            } else if (strM92703a.equals("com.sec.android.app.samsungapps")) {
                                                                str12 = "non valid source";
                                                            } else {
                                                                str12 = "Samsung Galaxy Store";
                                                            }
                                                        } else if (strM92703a.equals("com.huawei.appmarket")) {
                                                            str12 = "non valid source";
                                                        } else {
                                                            str12 = "Huawei App Gallery";
                                                        }
                                                    } else if (strM92703a.equals("com.amazon.venezia")) {
                                                        str12 = "non valid source";
                                                    } else {
                                                        str12 = "Amazon Appstore";
                                                    }
                                                }
                                                str13 = str12;
                                                bool2 = Boolean.TRUE;
                                                throw new Exception("Verifying use of hookup tools");
                                            }
                                            str4 = null;
                                            str5 = null;
                                            str3 = null;
                                            str6 = null;
                                            boolM37088i = null;
                                            fingerprint.lpt2(new CarrierInfo(str4, str5, str3, str6, boolM37088i));
                                            if (telephonyManager != null) {
                                                strM37086g = dveVar.m37086g(vueVar2, telephonyManager);
                                                strM37083p = m37083p(telephonyManager);
                                                strM37091l = dveVar.m37091l(vueVar2, telephonyManager);
                                                strM37087h = dveVar.m37087h(vueVar2, telephonyManager);
                                                strM37090k = dveVar.m37090k(context, telephonyManager);
                                                str7 = strM37086g;
                                                str8 = strM37083p;
                                                str9 = strM37091l;
                                                str10 = strM37087h;
                                            } else {
                                                str7 = null;
                                                strM37090k = null;
                                                str9 = null;
                                                str10 = null;
                                                str8 = null;
                                            }
                                            fingerprint.lpt2(new NetworkInfo(str7, strM37090k, str9, str10, str8));
                                            DisplayMetrics displayMetrics16 = context.getResources().getDisplayMetrics();
                                            fingerprint.lpt2(new ScreenInfo(displayMetrics16.densityDpi, displayMetrics16.heightPixels, displayMetrics16.widthPixels));
                                            nve nveVar16 = (nve) zkk0Var;
                                            nveVar16.getClass();
                                            DeviceId.Companion coM19 = DeviceId.INSTANCE;
                                            fingerprint.lpt2(new DeviceInfo(coM19.Lpt5().getBluetoothMAC(), coM19.Lpt5().getWiFiMAC(), coM19.Lpt5().getImei(), coM19.Lpt5().getImsi(), coM19.Lpt5().getAndroidId(), coM19.Lpt5().getMediaDrmId()));
                                            fingerprint.Com8(Locale.getDefault().toLanguageTag());
                                            fingerprint.Lpt5(Locale.getDefault().getCountry());
                                            fingerprint.lpt2(context.getPackageName());
                                            nveVar16.getClass();
                                            strCON = coM19.Lpt5().getDeviceIdProvider();
                                            if (wj50.m88271j(strCON, context.getPackageName())) {
                                                strCON = "self provider";
                                            } else {
                                                strCON = "self provider";
                                            }
                                            fingerprint.COM7(strCON);
                                            String str111119 = Build.MANUFACTURER;
                                            fingerprint.cON(str111119);
                                            String str1111110 = Build.MODEL;
                                            fingerprint.LPT3(str1111110);
                                            fingerprint.COM5(String.valueOf(Build.VERSION.SDK_INT));
                                            aveVar = dveVar.f53439i;
                                            y2f1Var = (y2f1) dveVar.f53433c;
                                            y2f1Var.getClass();
                                            str11 = Build.FINGERPRINT;
                                            if (!bm51.m29803n0(str11, "generic", false)) {
                                                z5 = z3;
                                                z6 = true;
                                            } else {
                                                z5 = z3;
                                                z6 = true;
                                            }
                                            String str1111111 = y2f1.f268606c;
                                            utu0 utu0Var17 = gk71.f80747a;
                                            utu0Var17.m83940H(str1111111);
                                            utu0Var17.m83952u("isProbablyEmulator = " + z6, new Object[0]);
                                            boolValueOf = Boolean.valueOf(z6);
                                            boolValueOf2 = Boolean.valueOf(((x1f1) y2f1Var.f268607a).m89639c(y2f1.m92706d(context)));
                                            boolValueOf3 = Boolean.valueOf(Debug.isDebuggerConnected());
                                            strM92703a = y2f1.m92703a(context);
                                            if (strM92703a == null) {
                                                str12 = "non valid source";
                                            } else {
                                                iHashCode = strM92703a.hashCode();
                                                if (iHashCode != -1859733809) {
                                                    if (iHashCode != -1637701853) {
                                                        if (iHashCode != -1225090538) {
                                                            if (iHashCode == -1046965711) {
                                                                str12 = "non valid source";
                                                            } else {
                                                                str12 = "non valid source";
                                                            }
                                                        } else if (strM92703a.equals("com.sec.android.app.samsungapps")) {
                                                            str12 = "non valid source";
                                                        } else {
                                                            str12 = "Samsung Galaxy Store";
                                                        }
                                                    } else if (strM92703a.equals("com.huawei.appmarket")) {
                                                        str12 = "non valid source";
                                                    } else {
                                                        str12 = "Huawei App Gallery";
                                                    }
                                                } else if (strM92703a.equals("com.amazon.venezia")) {
                                                    str12 = "non valid source";
                                                } else {
                                                    str12 = "Amazon Appstore";
                                                }
                                            }
                                            str13 = str12;
                                            bool2 = Boolean.TRUE;
                                            throw new Exception("Verifying use of hookup tools");
                                        } catch (IllegalArgumentException e27) {
                                            e = e27;
                                            z4 = z2;
                                            ((z2f1) xd70Var).m95188a(new MobileError(System.currentTimeMillis(), null, "mobile-report", e.getMessage(), new ErrorMetadata(ContentDeliverySubscriptionType.SUBSCRIPTION, "JVM", "An illegal argument was passed to a method", (String) null, pmf0.m70321g(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null)));
                                            displayName = null;
                                            int rawOffset2 = new GregorianCalendar().getTimeZone().getRawOffset();
                                            j3 = j2;
                                            numValueOf = Integer.valueOf((int) TimeUnit.HOURS.convert(rawOffset2, TimeUnit.MILLISECONDS));
                                            numValueOf2 = Integer.valueOf((int) TimeUnit.MINUTES.convert(rawOffset2, TimeUnit.MILLISECONDS));
                                            fingerprint.lpt2(new TimezoneInfo(numValueOf, displayName, numValueOf2));
                                            e2f1Var = (e2f1) vueVar4;
                                            if (e2f1Var.m37603a(context, "android.hardware.telephony")) {
                                                telephonyManager = (TelephonyManager) context.getApplicationContext().getSystemService("phone");
                                            } else {
                                                telephonyManager = null;
                                            }
                                            if (telephonyManager != null) {
                                                strM37095r = dveVar.m37095r(vueVar2, telephonyManager);
                                                strM37084q = m37084q(vueVar2, context, telephonyManager);
                                                i7 = Build.VERSION.SDK_INT;
                                                if (i7 >= 33) {
                                                    ((e2f1) vueVar2).getClass();
                                                    if (context.getPackageManager().hasSystemFeature("android.hardware.telephony.subscription")) {
                                                        simCountryIso = telephonyManager.getSimCountryIso();
                                                    } else {
                                                        simCountryIso = null;
                                                    }
                                                } else {
                                                    simCountryIso = telephonyManager.getSimCountryIso();
                                                }
                                                if (i7 >= 33) {
                                                    ((e2f1) vueVar2).getClass();
                                                    if (context.getPackageManager().hasSystemFeature("android.hardware.telephony.subscription")) {
                                                        simOperator = telephonyManager.getSimOperator();
                                                    } else {
                                                        str2 = null;
                                                    }
                                                    boolM37088i = dveVar.m37088i(telephonyManager);
                                                    str3 = simCountryIso;
                                                    str4 = strM37095r;
                                                    str5 = strM37084q;
                                                    str6 = str2;
                                                    fingerprint.lpt2(new CarrierInfo(str4, str5, str3, str6, boolM37088i));
                                                    if (telephonyManager != null) {
                                                        strM37086g = dveVar.m37086g(vueVar2, telephonyManager);
                                                        strM37083p = m37083p(telephonyManager);
                                                        strM37091l = dveVar.m37091l(vueVar2, telephonyManager);
                                                        strM37087h = dveVar.m37087h(vueVar2, telephonyManager);
                                                        strM37090k = dveVar.m37090k(context, telephonyManager);
                                                        str7 = strM37086g;
                                                        str8 = strM37083p;
                                                        str9 = strM37091l;
                                                        str10 = strM37087h;
                                                    } else {
                                                        str7 = null;
                                                        strM37090k = null;
                                                        str9 = null;
                                                        str10 = null;
                                                        str8 = null;
                                                    }
                                                    fingerprint.lpt2(new NetworkInfo(str7, strM37090k, str9, str10, str8));
                                                    DisplayMetrics displayMetrics17 = context.getResources().getDisplayMetrics();
                                                    fingerprint.lpt2(new ScreenInfo(displayMetrics17.densityDpi, displayMetrics17.heightPixels, displayMetrics17.widthPixels));
                                                    nve nveVar17 = (nve) zkk0Var;
                                                    nveVar17.getClass();
                                                    DeviceId.Companion coM110 = DeviceId.INSTANCE;
                                                    fingerprint.lpt2(new DeviceInfo(coM110.Lpt5().getBluetoothMAC(), coM110.Lpt5().getWiFiMAC(), coM110.Lpt5().getImei(), coM110.Lpt5().getImsi(), coM110.Lpt5().getAndroidId(), coM110.Lpt5().getMediaDrmId()));
                                                    fingerprint.Com8(Locale.getDefault().toLanguageTag());
                                                    fingerprint.Lpt5(Locale.getDefault().getCountry());
                                                    fingerprint.lpt2(context.getPackageName());
                                                    nveVar17.getClass();
                                                    strCON = coM110.Lpt5().getDeviceIdProvider();
                                                    if (wj50.m88271j(strCON, context.getPackageName())) {
                                                        strCON = "self provider";
                                                    } else {
                                                        strCON = "self provider";
                                                    }
                                                    fingerprint.COM7(strCON);
                                                    String str1111112 = Build.MANUFACTURER;
                                                    fingerprint.cON(str1111112);
                                                    String str1111113 = Build.MODEL;
                                                    fingerprint.LPT3(str1111113);
                                                    fingerprint.COM5(String.valueOf(Build.VERSION.SDK_INT));
                                                    aveVar = dveVar.f53439i;
                                                    y2f1Var = (y2f1) dveVar.f53433c;
                                                    y2f1Var.getClass();
                                                    str11 = Build.FINGERPRINT;
                                                    if (!bm51.m29803n0(str11, "generic", false)) {
                                                        z5 = z3;
                                                        z6 = true;
                                                    } else {
                                                        z5 = z3;
                                                        z6 = true;
                                                    }
                                                    String str1111114 = y2f1.f268606c;
                                                    utu0 utu0Var18 = gk71.f80747a;
                                                    utu0Var18.m83940H(str1111114);
                                                    utu0Var18.m83952u("isProbablyEmulator = " + z6, new Object[0]);
                                                    boolValueOf = Boolean.valueOf(z6);
                                                    boolValueOf2 = Boolean.valueOf(((x1f1) y2f1Var.f268607a).m89639c(y2f1.m92706d(context)));
                                                    boolValueOf3 = Boolean.valueOf(Debug.isDebuggerConnected());
                                                    strM92703a = y2f1.m92703a(context);
                                                    if (strM92703a == null) {
                                                        str12 = "non valid source";
                                                    } else {
                                                        iHashCode = strM92703a.hashCode();
                                                        if (iHashCode != -1859733809) {
                                                            if (iHashCode != -1637701853) {
                                                                if (iHashCode != -1225090538) {
                                                                    if (iHashCode == -1046965711) {
                                                                        str12 = "non valid source";
                                                                    } else {
                                                                        str12 = "non valid source";
                                                                    }
                                                                } else if (strM92703a.equals("com.sec.android.app.samsungapps")) {
                                                                    str12 = "non valid source";
                                                                } else {
                                                                    str12 = "Samsung Galaxy Store";
                                                                }
                                                            } else if (strM92703a.equals("com.huawei.appmarket")) {
                                                                str12 = "non valid source";
                                                            } else {
                                                                str12 = "Huawei App Gallery";
                                                            }
                                                        } else if (strM92703a.equals("com.amazon.venezia")) {
                                                            str12 = "non valid source";
                                                        } else {
                                                            str12 = "Amazon Appstore";
                                                        }
                                                    }
                                                    str13 = str12;
                                                    bool2 = Boolean.TRUE;
                                                    throw new Exception("Verifying use of hookup tools");
                                                }
                                                simOperator = telephonyManager.getSimOperator();
                                                str2 = simOperator;
                                                boolM37088i = dveVar.m37088i(telephonyManager);
                                                str3 = simCountryIso;
                                                str4 = strM37095r;
                                                str5 = strM37084q;
                                                str6 = str2;
                                                fingerprint.lpt2(new CarrierInfo(str4, str5, str3, str6, boolM37088i));
                                                if (telephonyManager != null) {
                                                    strM37086g = dveVar.m37086g(vueVar2, telephonyManager);
                                                    strM37083p = m37083p(telephonyManager);
                                                    strM37091l = dveVar.m37091l(vueVar2, telephonyManager);
                                                    strM37087h = dveVar.m37087h(vueVar2, telephonyManager);
                                                    strM37090k = dveVar.m37090k(context, telephonyManager);
                                                    str7 = strM37086g;
                                                    str8 = strM37083p;
                                                    str9 = strM37091l;
                                                    str10 = strM37087h;
                                                } else {
                                                    str7 = null;
                                                    strM37090k = null;
                                                    str9 = null;
                                                    str10 = null;
                                                    str8 = null;
                                                }
                                                fingerprint.lpt2(new NetworkInfo(str7, strM37090k, str9, str10, str8));
                                                DisplayMetrics displayMetrics18 = context.getResources().getDisplayMetrics();
                                                fingerprint.lpt2(new ScreenInfo(displayMetrics18.densityDpi, displayMetrics18.heightPixels, displayMetrics18.widthPixels));
                                                nve nveVar18 = (nve) zkk0Var;
                                                nveVar18.getClass();
                                                DeviceId.Companion coM111 = DeviceId.INSTANCE;
                                                fingerprint.lpt2(new DeviceInfo(coM111.Lpt5().getBluetoothMAC(), coM111.Lpt5().getWiFiMAC(), coM111.Lpt5().getImei(), coM111.Lpt5().getImsi(), coM111.Lpt5().getAndroidId(), coM111.Lpt5().getMediaDrmId()));
                                                fingerprint.Com8(Locale.getDefault().toLanguageTag());
                                                fingerprint.Lpt5(Locale.getDefault().getCountry());
                                                fingerprint.lpt2(context.getPackageName());
                                                nveVar18.getClass();
                                                strCON = coM111.Lpt5().getDeviceIdProvider();
                                                if (wj50.m88271j(strCON, context.getPackageName())) {
                                                    strCON = "self provider";
                                                } else {
                                                    strCON = "self provider";
                                                }
                                                fingerprint.COM7(strCON);
                                                String str1111115 = Build.MANUFACTURER;
                                                fingerprint.cON(str1111115);
                                                String str1111116 = Build.MODEL;
                                                fingerprint.LPT3(str1111116);
                                                fingerprint.COM5(String.valueOf(Build.VERSION.SDK_INT));
                                                aveVar = dveVar.f53439i;
                                                y2f1Var = (y2f1) dveVar.f53433c;
                                                y2f1Var.getClass();
                                                str11 = Build.FINGERPRINT;
                                                if (!bm51.m29803n0(str11, "generic", false)) {
                                                    z5 = z3;
                                                    z6 = true;
                                                } else {
                                                    z5 = z3;
                                                    z6 = true;
                                                }
                                                String str1111117 = y2f1.f268606c;
                                                utu0 utu0Var19 = gk71.f80747a;
                                                utu0Var19.m83940H(str1111117);
                                                utu0Var19.m83952u("isProbablyEmulator = " + z6, new Object[0]);
                                                boolValueOf = Boolean.valueOf(z6);
                                                boolValueOf2 = Boolean.valueOf(((x1f1) y2f1Var.f268607a).m89639c(y2f1.m92706d(context)));
                                                boolValueOf3 = Boolean.valueOf(Debug.isDebuggerConnected());
                                                strM92703a = y2f1.m92703a(context);
                                                if (strM92703a == null) {
                                                    str12 = "non valid source";
                                                } else {
                                                    iHashCode = strM92703a.hashCode();
                                                    if (iHashCode != -1859733809) {
                                                        if (iHashCode != -1637701853) {
                                                            if (iHashCode != -1225090538) {
                                                                if (iHashCode == -1046965711) {
                                                                    str12 = "non valid source";
                                                                } else {
                                                                    str12 = "non valid source";
                                                                }
                                                            } else if (strM92703a.equals("com.sec.android.app.samsungapps")) {
                                                                str12 = "non valid source";
                                                            } else {
                                                                str12 = "Samsung Galaxy Store";
                                                            }
                                                        } else if (strM92703a.equals("com.huawei.appmarket")) {
                                                            str12 = "non valid source";
                                                        } else {
                                                            str12 = "Huawei App Gallery";
                                                        }
                                                    } else if (strM92703a.equals("com.amazon.venezia")) {
                                                        str12 = "non valid source";
                                                    } else {
                                                        str12 = "Amazon Appstore";
                                                    }
                                                }
                                                str13 = str12;
                                                bool2 = Boolean.TRUE;
                                                throw new Exception("Verifying use of hookup tools");
                                            }
                                            str4 = null;
                                            str5 = null;
                                            str3 = null;
                                            str6 = null;
                                            boolM37088i = null;
                                            fingerprint.lpt2(new CarrierInfo(str4, str5, str3, str6, boolM37088i));
                                            if (telephonyManager != null) {
                                                strM37086g = dveVar.m37086g(vueVar2, telephonyManager);
                                                strM37083p = m37083p(telephonyManager);
                                                strM37091l = dveVar.m37091l(vueVar2, telephonyManager);
                                                strM37087h = dveVar.m37087h(vueVar2, telephonyManager);
                                                strM37090k = dveVar.m37090k(context, telephonyManager);
                                                str7 = strM37086g;
                                                str8 = strM37083p;
                                                str9 = strM37091l;
                                                str10 = strM37087h;
                                            } else {
                                                str7 = null;
                                                strM37090k = null;
                                                str9 = null;
                                                str10 = null;
                                                str8 = null;
                                            }
                                            fingerprint.lpt2(new NetworkInfo(str7, strM37090k, str9, str10, str8));
                                            DisplayMetrics displayMetrics19 = context.getResources().getDisplayMetrics();
                                            fingerprint.lpt2(new ScreenInfo(displayMetrics19.densityDpi, displayMetrics19.heightPixels, displayMetrics19.widthPixels));
                                            nve nveVar19 = (nve) zkk0Var;
                                            nveVar19.getClass();
                                            DeviceId.Companion coM112 = DeviceId.INSTANCE;
                                            fingerprint.lpt2(new DeviceInfo(coM112.Lpt5().getBluetoothMAC(), coM112.Lpt5().getWiFiMAC(), coM112.Lpt5().getImei(), coM112.Lpt5().getImsi(), coM112.Lpt5().getAndroidId(), coM112.Lpt5().getMediaDrmId()));
                                            fingerprint.Com8(Locale.getDefault().toLanguageTag());
                                            fingerprint.Lpt5(Locale.getDefault().getCountry());
                                            fingerprint.lpt2(context.getPackageName());
                                            nveVar19.getClass();
                                            strCON = coM112.Lpt5().getDeviceIdProvider();
                                            if (wj50.m88271j(strCON, context.getPackageName())) {
                                                strCON = "self provider";
                                            } else {
                                                strCON = "self provider";
                                            }
                                            fingerprint.COM7(strCON);
                                            String str1111118 = Build.MANUFACTURER;
                                            fingerprint.cON(str1111118);
                                            String str1111119 = Build.MODEL;
                                            fingerprint.LPT3(str1111119);
                                            fingerprint.COM5(String.valueOf(Build.VERSION.SDK_INT));
                                            aveVar = dveVar.f53439i;
                                            y2f1Var = (y2f1) dveVar.f53433c;
                                            y2f1Var.getClass();
                                            str11 = Build.FINGERPRINT;
                                            if (!bm51.m29803n0(str11, "generic", false)) {
                                                z5 = z3;
                                                z6 = true;
                                            } else {
                                                z5 = z3;
                                                z6 = true;
                                            }
                                            String str11111110 = y2f1.f268606c;
                                            utu0 utu0Var110 = gk71.f80747a;
                                            utu0Var110.m83940H(str11111110);
                                            utu0Var110.m83952u("isProbablyEmulator = " + z6, new Object[0]);
                                            boolValueOf = Boolean.valueOf(z6);
                                            boolValueOf2 = Boolean.valueOf(((x1f1) y2f1Var.f268607a).m89639c(y2f1.m92706d(context)));
                                            boolValueOf3 = Boolean.valueOf(Debug.isDebuggerConnected());
                                            strM92703a = y2f1.m92703a(context);
                                            if (strM92703a == null) {
                                                str12 = "non valid source";
                                            } else {
                                                iHashCode = strM92703a.hashCode();
                                                if (iHashCode != -1859733809) {
                                                    if (iHashCode != -1637701853) {
                                                        if (iHashCode != -1225090538) {
                                                            if (iHashCode == -1046965711) {
                                                                str12 = "non valid source";
                                                            } else {
                                                                str12 = "non valid source";
                                                            }
                                                        } else if (strM92703a.equals("com.sec.android.app.samsungapps")) {
                                                            str12 = "non valid source";
                                                        } else {
                                                            str12 = "Samsung Galaxy Store";
                                                        }
                                                    } else if (strM92703a.equals("com.huawei.appmarket")) {
                                                        str12 = "non valid source";
                                                    } else {
                                                        str12 = "Huawei App Gallery";
                                                    }
                                                } else if (strM92703a.equals("com.amazon.venezia")) {
                                                    str12 = "non valid source";
                                                } else {
                                                    str12 = "Amazon Appstore";
                                                }
                                            }
                                            str13 = str12;
                                            bool2 = Boolean.TRUE;
                                            throw new Exception("Verifying use of hookup tools");
                                        } catch (NullPointerException e28) {
                                            e = e28;
                                            z4 = z2;
                                            ((z2f1) xd70Var).m95188a(new MobileError(System.currentTimeMillis(), null, "mobile-report", e.getMessage(), new ErrorMetadata(ContentDeliverySubscriptionType.TRADITIONAL_MVPD, "JVM", "An data object was null when it should not have been", (String) null, pmf0.m70321g(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null)));
                                            displayName = null;
                                            int rawOffset3 = new GregorianCalendar().getTimeZone().getRawOffset();
                                            j3 = j2;
                                            numValueOf = Integer.valueOf((int) TimeUnit.HOURS.convert(rawOffset3, TimeUnit.MILLISECONDS));
                                            numValueOf2 = Integer.valueOf((int) TimeUnit.MINUTES.convert(rawOffset3, TimeUnit.MILLISECONDS));
                                            fingerprint.lpt2(new TimezoneInfo(numValueOf, displayName, numValueOf2));
                                            e2f1Var = (e2f1) vueVar4;
                                            if (e2f1Var.m37603a(context, "android.hardware.telephony")) {
                                                telephonyManager = (TelephonyManager) context.getApplicationContext().getSystemService("phone");
                                            } else {
                                                telephonyManager = null;
                                            }
                                            if (telephonyManager != null) {
                                                strM37095r = dveVar.m37095r(vueVar2, telephonyManager);
                                                strM37084q = m37084q(vueVar2, context, telephonyManager);
                                                i7 = Build.VERSION.SDK_INT;
                                                if (i7 >= 33) {
                                                    ((e2f1) vueVar2).getClass();
                                                    if (context.getPackageManager().hasSystemFeature("android.hardware.telephony.subscription")) {
                                                        simCountryIso = telephonyManager.getSimCountryIso();
                                                    } else {
                                                        simCountryIso = null;
                                                    }
                                                } else {
                                                    simCountryIso = telephonyManager.getSimCountryIso();
                                                }
                                                if (i7 >= 33) {
                                                    ((e2f1) vueVar2).getClass();
                                                    if (context.getPackageManager().hasSystemFeature("android.hardware.telephony.subscription")) {
                                                        simOperator = telephonyManager.getSimOperator();
                                                    } else {
                                                        str2 = null;
                                                    }
                                                    boolM37088i = dveVar.m37088i(telephonyManager);
                                                    str3 = simCountryIso;
                                                    str4 = strM37095r;
                                                    str5 = strM37084q;
                                                    str6 = str2;
                                                    fingerprint.lpt2(new CarrierInfo(str4, str5, str3, str6, boolM37088i));
                                                    if (telephonyManager != null) {
                                                        strM37086g = dveVar.m37086g(vueVar2, telephonyManager);
                                                        strM37083p = m37083p(telephonyManager);
                                                        strM37091l = dveVar.m37091l(vueVar2, telephonyManager);
                                                        strM37087h = dveVar.m37087h(vueVar2, telephonyManager);
                                                        strM37090k = dveVar.m37090k(context, telephonyManager);
                                                        str7 = strM37086g;
                                                        str8 = strM37083p;
                                                        str9 = strM37091l;
                                                        str10 = strM37087h;
                                                    } else {
                                                        str7 = null;
                                                        strM37090k = null;
                                                        str9 = null;
                                                        str10 = null;
                                                        str8 = null;
                                                    }
                                                    fingerprint.lpt2(new NetworkInfo(str7, strM37090k, str9, str10, str8));
                                                    DisplayMetrics displayMetrics110 = context.getResources().getDisplayMetrics();
                                                    fingerprint.lpt2(new ScreenInfo(displayMetrics110.densityDpi, displayMetrics110.heightPixels, displayMetrics110.widthPixels));
                                                    nve nveVar110 = (nve) zkk0Var;
                                                    nveVar110.getClass();
                                                    DeviceId.Companion coM113 = DeviceId.INSTANCE;
                                                    fingerprint.lpt2(new DeviceInfo(coM113.Lpt5().getBluetoothMAC(), coM113.Lpt5().getWiFiMAC(), coM113.Lpt5().getImei(), coM113.Lpt5().getImsi(), coM113.Lpt5().getAndroidId(), coM113.Lpt5().getMediaDrmId()));
                                                    fingerprint.Com8(Locale.getDefault().toLanguageTag());
                                                    fingerprint.Lpt5(Locale.getDefault().getCountry());
                                                    fingerprint.lpt2(context.getPackageName());
                                                    nveVar110.getClass();
                                                    strCON = coM113.Lpt5().getDeviceIdProvider();
                                                    if (wj50.m88271j(strCON, context.getPackageName())) {
                                                        strCON = "self provider";
                                                    } else {
                                                        strCON = "self provider";
                                                    }
                                                    fingerprint.COM7(strCON);
                                                    String str11111111 = Build.MANUFACTURER;
                                                    fingerprint.cON(str11111111);
                                                    String str11111112 = Build.MODEL;
                                                    fingerprint.LPT3(str11111112);
                                                    fingerprint.COM5(String.valueOf(Build.VERSION.SDK_INT));
                                                    aveVar = dveVar.f53439i;
                                                    y2f1Var = (y2f1) dveVar.f53433c;
                                                    y2f1Var.getClass();
                                                    str11 = Build.FINGERPRINT;
                                                    if (!bm51.m29803n0(str11, "generic", false)) {
                                                        z5 = z3;
                                                        z6 = true;
                                                    } else {
                                                        z5 = z3;
                                                        z6 = true;
                                                    }
                                                    String str11111113 = y2f1.f268606c;
                                                    utu0 utu0Var111 = gk71.f80747a;
                                                    utu0Var111.m83940H(str11111113);
                                                    utu0Var111.m83952u("isProbablyEmulator = " + z6, new Object[0]);
                                                    boolValueOf = Boolean.valueOf(z6);
                                                    boolValueOf2 = Boolean.valueOf(((x1f1) y2f1Var.f268607a).m89639c(y2f1.m92706d(context)));
                                                    boolValueOf3 = Boolean.valueOf(Debug.isDebuggerConnected());
                                                    strM92703a = y2f1.m92703a(context);
                                                    if (strM92703a == null) {
                                                        str12 = "non valid source";
                                                    } else {
                                                        iHashCode = strM92703a.hashCode();
                                                        if (iHashCode != -1859733809) {
                                                            if (iHashCode != -1637701853) {
                                                                if (iHashCode != -1225090538) {
                                                                    if (iHashCode == -1046965711) {
                                                                        str12 = "non valid source";
                                                                    } else {
                                                                        str12 = "non valid source";
                                                                    }
                                                                } else if (strM92703a.equals("com.sec.android.app.samsungapps")) {
                                                                    str12 = "non valid source";
                                                                } else {
                                                                    str12 = "Samsung Galaxy Store";
                                                                }
                                                            } else if (strM92703a.equals("com.huawei.appmarket")) {
                                                                str12 = "non valid source";
                                                            } else {
                                                                str12 = "Huawei App Gallery";
                                                            }
                                                        } else if (strM92703a.equals("com.amazon.venezia")) {
                                                            str12 = "non valid source";
                                                        } else {
                                                            str12 = "Amazon Appstore";
                                                        }
                                                    }
                                                    str13 = str12;
                                                    bool2 = Boolean.TRUE;
                                                    throw new Exception("Verifying use of hookup tools");
                                                }
                                                simOperator = telephonyManager.getSimOperator();
                                                str2 = simOperator;
                                                boolM37088i = dveVar.m37088i(telephonyManager);
                                                str3 = simCountryIso;
                                                str4 = strM37095r;
                                                str5 = strM37084q;
                                                str6 = str2;
                                                fingerprint.lpt2(new CarrierInfo(str4, str5, str3, str6, boolM37088i));
                                                if (telephonyManager != null) {
                                                    strM37086g = dveVar.m37086g(vueVar2, telephonyManager);
                                                    strM37083p = m37083p(telephonyManager);
                                                    strM37091l = dveVar.m37091l(vueVar2, telephonyManager);
                                                    strM37087h = dveVar.m37087h(vueVar2, telephonyManager);
                                                    strM37090k = dveVar.m37090k(context, telephonyManager);
                                                    str7 = strM37086g;
                                                    str8 = strM37083p;
                                                    str9 = strM37091l;
                                                    str10 = strM37087h;
                                                } else {
                                                    str7 = null;
                                                    strM37090k = null;
                                                    str9 = null;
                                                    str10 = null;
                                                    str8 = null;
                                                }
                                                fingerprint.lpt2(new NetworkInfo(str7, strM37090k, str9, str10, str8));
                                                DisplayMetrics displayMetrics111 = context.getResources().getDisplayMetrics();
                                                fingerprint.lpt2(new ScreenInfo(displayMetrics111.densityDpi, displayMetrics111.heightPixels, displayMetrics111.widthPixels));
                                                nve nveVar111 = (nve) zkk0Var;
                                                nveVar111.getClass();
                                                DeviceId.Companion coM114 = DeviceId.INSTANCE;
                                                fingerprint.lpt2(new DeviceInfo(coM114.Lpt5().getBluetoothMAC(), coM114.Lpt5().getWiFiMAC(), coM114.Lpt5().getImei(), coM114.Lpt5().getImsi(), coM114.Lpt5().getAndroidId(), coM114.Lpt5().getMediaDrmId()));
                                                fingerprint.Com8(Locale.getDefault().toLanguageTag());
                                                fingerprint.Lpt5(Locale.getDefault().getCountry());
                                                fingerprint.lpt2(context.getPackageName());
                                                nveVar111.getClass();
                                                strCON = coM114.Lpt5().getDeviceIdProvider();
                                                if (wj50.m88271j(strCON, context.getPackageName())) {
                                                    strCON = "self provider";
                                                } else {
                                                    strCON = "self provider";
                                                }
                                                fingerprint.COM7(strCON);
                                                String str11111114 = Build.MANUFACTURER;
                                                fingerprint.cON(str11111114);
                                                String str11111115 = Build.MODEL;
                                                fingerprint.LPT3(str11111115);
                                                fingerprint.COM5(String.valueOf(Build.VERSION.SDK_INT));
                                                aveVar = dveVar.f53439i;
                                                y2f1Var = (y2f1) dveVar.f53433c;
                                                y2f1Var.getClass();
                                                str11 = Build.FINGERPRINT;
                                                if (!bm51.m29803n0(str11, "generic", false)) {
                                                    z5 = z3;
                                                    z6 = true;
                                                } else {
                                                    z5 = z3;
                                                    z6 = true;
                                                }
                                                String str11111116 = y2f1.f268606c;
                                                utu0 utu0Var112 = gk71.f80747a;
                                                utu0Var112.m83940H(str11111116);
                                                utu0Var112.m83952u("isProbablyEmulator = " + z6, new Object[0]);
                                                boolValueOf = Boolean.valueOf(z6);
                                                boolValueOf2 = Boolean.valueOf(((x1f1) y2f1Var.f268607a).m89639c(y2f1.m92706d(context)));
                                                boolValueOf3 = Boolean.valueOf(Debug.isDebuggerConnected());
                                                strM92703a = y2f1.m92703a(context);
                                                if (strM92703a == null) {
                                                    str12 = "non valid source";
                                                } else {
                                                    iHashCode = strM92703a.hashCode();
                                                    if (iHashCode != -1859733809) {
                                                        if (iHashCode != -1637701853) {
                                                            if (iHashCode != -1225090538) {
                                                                if (iHashCode == -1046965711) {
                                                                    str12 = "non valid source";
                                                                } else {
                                                                    str12 = "non valid source";
                                                                }
                                                            } else if (strM92703a.equals("com.sec.android.app.samsungapps")) {
                                                                str12 = "non valid source";
                                                            } else {
                                                                str12 = "Samsung Galaxy Store";
                                                            }
                                                        } else if (strM92703a.equals("com.huawei.appmarket")) {
                                                            str12 = "non valid source";
                                                        } else {
                                                            str12 = "Huawei App Gallery";
                                                        }
                                                    } else if (strM92703a.equals("com.amazon.venezia")) {
                                                        str12 = "non valid source";
                                                    } else {
                                                        str12 = "Amazon Appstore";
                                                    }
                                                }
                                                str13 = str12;
                                                bool2 = Boolean.TRUE;
                                                throw new Exception("Verifying use of hookup tools");
                                            }
                                            str4 = null;
                                            str5 = null;
                                            str3 = null;
                                            str6 = null;
                                            boolM37088i = null;
                                            fingerprint.lpt2(new CarrierInfo(str4, str5, str3, str6, boolM37088i));
                                            if (telephonyManager != null) {
                                                strM37086g = dveVar.m37086g(vueVar2, telephonyManager);
                                                strM37083p = m37083p(telephonyManager);
                                                strM37091l = dveVar.m37091l(vueVar2, telephonyManager);
                                                strM37087h = dveVar.m37087h(vueVar2, telephonyManager);
                                                strM37090k = dveVar.m37090k(context, telephonyManager);
                                                str7 = strM37086g;
                                                str8 = strM37083p;
                                                str9 = strM37091l;
                                                str10 = strM37087h;
                                            } else {
                                                str7 = null;
                                                strM37090k = null;
                                                str9 = null;
                                                str10 = null;
                                                str8 = null;
                                            }
                                            fingerprint.lpt2(new NetworkInfo(str7, strM37090k, str9, str10, str8));
                                            DisplayMetrics displayMetrics112 = context.getResources().getDisplayMetrics();
                                            fingerprint.lpt2(new ScreenInfo(displayMetrics112.densityDpi, displayMetrics112.heightPixels, displayMetrics112.widthPixels));
                                            nve nveVar112 = (nve) zkk0Var;
                                            nveVar112.getClass();
                                            DeviceId.Companion coM115 = DeviceId.INSTANCE;
                                            fingerprint.lpt2(new DeviceInfo(coM115.Lpt5().getBluetoothMAC(), coM115.Lpt5().getWiFiMAC(), coM115.Lpt5().getImei(), coM115.Lpt5().getImsi(), coM115.Lpt5().getAndroidId(), coM115.Lpt5().getMediaDrmId()));
                                            fingerprint.Com8(Locale.getDefault().toLanguageTag());
                                            fingerprint.Lpt5(Locale.getDefault().getCountry());
                                            fingerprint.lpt2(context.getPackageName());
                                            nveVar112.getClass();
                                            strCON = coM115.Lpt5().getDeviceIdProvider();
                                            if (wj50.m88271j(strCON, context.getPackageName())) {
                                                strCON = "self provider";
                                            } else {
                                                strCON = "self provider";
                                            }
                                            fingerprint.COM7(strCON);
                                            String str11111117 = Build.MANUFACTURER;
                                            fingerprint.cON(str11111117);
                                            String str11111118 = Build.MODEL;
                                            fingerprint.LPT3(str11111118);
                                            fingerprint.COM5(String.valueOf(Build.VERSION.SDK_INT));
                                            aveVar = dveVar.f53439i;
                                            y2f1Var = (y2f1) dveVar.f53433c;
                                            y2f1Var.getClass();
                                            str11 = Build.FINGERPRINT;
                                            if (!bm51.m29803n0(str11, "generic", false)) {
                                                z5 = z3;
                                                z6 = true;
                                            } else {
                                                z5 = z3;
                                                z6 = true;
                                            }
                                            String str11111119 = y2f1.f268606c;
                                            utu0 utu0Var113 = gk71.f80747a;
                                            utu0Var113.m83940H(str11111119);
                                            utu0Var113.m83952u("isProbablyEmulator = " + z6, new Object[0]);
                                            boolValueOf = Boolean.valueOf(z6);
                                            boolValueOf2 = Boolean.valueOf(((x1f1) y2f1Var.f268607a).m89639c(y2f1.m92706d(context)));
                                            boolValueOf3 = Boolean.valueOf(Debug.isDebuggerConnected());
                                            strM92703a = y2f1.m92703a(context);
                                            if (strM92703a == null) {
                                                str12 = "non valid source";
                                            } else {
                                                iHashCode = strM92703a.hashCode();
                                                if (iHashCode != -1859733809) {
                                                    if (iHashCode != -1637701853) {
                                                        if (iHashCode != -1225090538) {
                                                            if (iHashCode == -1046965711) {
                                                                str12 = "non valid source";
                                                            } else {
                                                                str12 = "non valid source";
                                                            }
                                                        } else if (strM92703a.equals("com.sec.android.app.samsungapps")) {
                                                            str12 = "non valid source";
                                                        } else {
                                                            str12 = "Samsung Galaxy Store";
                                                        }
                                                    } else if (strM92703a.equals("com.huawei.appmarket")) {
                                                        str12 = "non valid source";
                                                    } else {
                                                        str12 = "Huawei App Gallery";
                                                    }
                                                } else if (strM92703a.equals("com.amazon.venezia")) {
                                                    str12 = "non valid source";
                                                } else {
                                                    str12 = "Amazon Appstore";
                                                }
                                            }
                                            str13 = str12;
                                            bool2 = Boolean.TRUE;
                                            throw new Exception("Verifying use of hookup tools");
                                        } catch (RuntimeException e29) {
                                            e = e29;
                                            z4 = z2;
                                            ((z2f1) xd70Var).m95188a(new MobileError(System.currentTimeMillis(), null, "mobile-report", e.getMessage(), new ErrorMetadata(ContentDeliverySubscriptionType.VIRTUAL_MVPD, "JVM", "An error occurred during runtime", (String) null, pmf0.m70321g(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null)));
                                            displayName = null;
                                            int rawOffset4 = new GregorianCalendar().getTimeZone().getRawOffset();
                                            j3 = j2;
                                            numValueOf = Integer.valueOf((int) TimeUnit.HOURS.convert(rawOffset4, TimeUnit.MILLISECONDS));
                                            numValueOf2 = Integer.valueOf((int) TimeUnit.MINUTES.convert(rawOffset4, TimeUnit.MILLISECONDS));
                                            fingerprint.lpt2(new TimezoneInfo(numValueOf, displayName, numValueOf2));
                                            e2f1Var = (e2f1) vueVar4;
                                            if (e2f1Var.m37603a(context, "android.hardware.telephony")) {
                                                telephonyManager = (TelephonyManager) context.getApplicationContext().getSystemService("phone");
                                            } else {
                                                telephonyManager = null;
                                            }
                                            if (telephonyManager != null) {
                                                strM37095r = dveVar.m37095r(vueVar2, telephonyManager);
                                                strM37084q = m37084q(vueVar2, context, telephonyManager);
                                                i7 = Build.VERSION.SDK_INT;
                                                if (i7 >= 33) {
                                                    ((e2f1) vueVar2).getClass();
                                                    if (context.getPackageManager().hasSystemFeature("android.hardware.telephony.subscription")) {
                                                        simCountryIso = telephonyManager.getSimCountryIso();
                                                    } else {
                                                        simCountryIso = null;
                                                    }
                                                } else {
                                                    simCountryIso = telephonyManager.getSimCountryIso();
                                                }
                                                if (i7 >= 33) {
                                                    ((e2f1) vueVar2).getClass();
                                                    if (context.getPackageManager().hasSystemFeature("android.hardware.telephony.subscription")) {
                                                        simOperator = telephonyManager.getSimOperator();
                                                    } else {
                                                        str2 = null;
                                                    }
                                                    boolM37088i = dveVar.m37088i(telephonyManager);
                                                    str3 = simCountryIso;
                                                    str4 = strM37095r;
                                                    str5 = strM37084q;
                                                    str6 = str2;
                                                    fingerprint.lpt2(new CarrierInfo(str4, str5, str3, str6, boolM37088i));
                                                    if (telephonyManager != null) {
                                                        strM37086g = dveVar.m37086g(vueVar2, telephonyManager);
                                                        strM37083p = m37083p(telephonyManager);
                                                        strM37091l = dveVar.m37091l(vueVar2, telephonyManager);
                                                        strM37087h = dveVar.m37087h(vueVar2, telephonyManager);
                                                        strM37090k = dveVar.m37090k(context, telephonyManager);
                                                        str7 = strM37086g;
                                                        str8 = strM37083p;
                                                        str9 = strM37091l;
                                                        str10 = strM37087h;
                                                    } else {
                                                        str7 = null;
                                                        strM37090k = null;
                                                        str9 = null;
                                                        str10 = null;
                                                        str8 = null;
                                                    }
                                                    fingerprint.lpt2(new NetworkInfo(str7, strM37090k, str9, str10, str8));
                                                    DisplayMetrics displayMetrics113 = context.getResources().getDisplayMetrics();
                                                    fingerprint.lpt2(new ScreenInfo(displayMetrics113.densityDpi, displayMetrics113.heightPixels, displayMetrics113.widthPixels));
                                                    nve nveVar113 = (nve) zkk0Var;
                                                    nveVar113.getClass();
                                                    DeviceId.Companion coM116 = DeviceId.INSTANCE;
                                                    fingerprint.lpt2(new DeviceInfo(coM116.Lpt5().getBluetoothMAC(), coM116.Lpt5().getWiFiMAC(), coM116.Lpt5().getImei(), coM116.Lpt5().getImsi(), coM116.Lpt5().getAndroidId(), coM116.Lpt5().getMediaDrmId()));
                                                    fingerprint.Com8(Locale.getDefault().toLanguageTag());
                                                    fingerprint.Lpt5(Locale.getDefault().getCountry());
                                                    fingerprint.lpt2(context.getPackageName());
                                                    nveVar113.getClass();
                                                    strCON = coM116.Lpt5().getDeviceIdProvider();
                                                    if (wj50.m88271j(strCON, context.getPackageName())) {
                                                        strCON = "self provider";
                                                    } else {
                                                        strCON = "self provider";
                                                    }
                                                    fingerprint.COM7(strCON);
                                                    String str111111110 = Build.MANUFACTURER;
                                                    fingerprint.cON(str111111110);
                                                    String str111111111 = Build.MODEL;
                                                    fingerprint.LPT3(str111111111);
                                                    fingerprint.COM5(String.valueOf(Build.VERSION.SDK_INT));
                                                    aveVar = dveVar.f53439i;
                                                    y2f1Var = (y2f1) dveVar.f53433c;
                                                    y2f1Var.getClass();
                                                    str11 = Build.FINGERPRINT;
                                                    if (!bm51.m29803n0(str11, "generic", false)) {
                                                        z5 = z3;
                                                        z6 = true;
                                                    } else {
                                                        z5 = z3;
                                                        z6 = true;
                                                    }
                                                    String str111111112 = y2f1.f268606c;
                                                    utu0 utu0Var114 = gk71.f80747a;
                                                    utu0Var114.m83940H(str111111112);
                                                    utu0Var114.m83952u("isProbablyEmulator = " + z6, new Object[0]);
                                                    boolValueOf = Boolean.valueOf(z6);
                                                    boolValueOf2 = Boolean.valueOf(((x1f1) y2f1Var.f268607a).m89639c(y2f1.m92706d(context)));
                                                    boolValueOf3 = Boolean.valueOf(Debug.isDebuggerConnected());
                                                    strM92703a = y2f1.m92703a(context);
                                                    if (strM92703a == null) {
                                                        str12 = "non valid source";
                                                    } else {
                                                        iHashCode = strM92703a.hashCode();
                                                        if (iHashCode != -1859733809) {
                                                            if (iHashCode != -1637701853) {
                                                                if (iHashCode != -1225090538) {
                                                                    if (iHashCode == -1046965711) {
                                                                        str12 = "non valid source";
                                                                    } else {
                                                                        str12 = "non valid source";
                                                                    }
                                                                } else if (strM92703a.equals("com.sec.android.app.samsungapps")) {
                                                                    str12 = "non valid source";
                                                                } else {
                                                                    str12 = "Samsung Galaxy Store";
                                                                }
                                                            } else if (strM92703a.equals("com.huawei.appmarket")) {
                                                                str12 = "non valid source";
                                                            } else {
                                                                str12 = "Huawei App Gallery";
                                                            }
                                                        } else if (strM92703a.equals("com.amazon.venezia")) {
                                                            str12 = "non valid source";
                                                        } else {
                                                            str12 = "Amazon Appstore";
                                                        }
                                                    }
                                                    str13 = str12;
                                                    bool2 = Boolean.TRUE;
                                                    throw new Exception("Verifying use of hookup tools");
                                                }
                                                simOperator = telephonyManager.getSimOperator();
                                                str2 = simOperator;
                                                boolM37088i = dveVar.m37088i(telephonyManager);
                                                str3 = simCountryIso;
                                                str4 = strM37095r;
                                                str5 = strM37084q;
                                                str6 = str2;
                                                fingerprint.lpt2(new CarrierInfo(str4, str5, str3, str6, boolM37088i));
                                                if (telephonyManager != null) {
                                                    strM37086g = dveVar.m37086g(vueVar2, telephonyManager);
                                                    strM37083p = m37083p(telephonyManager);
                                                    strM37091l = dveVar.m37091l(vueVar2, telephonyManager);
                                                    strM37087h = dveVar.m37087h(vueVar2, telephonyManager);
                                                    strM37090k = dveVar.m37090k(context, telephonyManager);
                                                    str7 = strM37086g;
                                                    str8 = strM37083p;
                                                    str9 = strM37091l;
                                                    str10 = strM37087h;
                                                } else {
                                                    str7 = null;
                                                    strM37090k = null;
                                                    str9 = null;
                                                    str10 = null;
                                                    str8 = null;
                                                }
                                                fingerprint.lpt2(new NetworkInfo(str7, strM37090k, str9, str10, str8));
                                                DisplayMetrics displayMetrics114 = context.getResources().getDisplayMetrics();
                                                fingerprint.lpt2(new ScreenInfo(displayMetrics114.densityDpi, displayMetrics114.heightPixels, displayMetrics114.widthPixels));
                                                nve nveVar114 = (nve) zkk0Var;
                                                nveVar114.getClass();
                                                DeviceId.Companion coM117 = DeviceId.INSTANCE;
                                                fingerprint.lpt2(new DeviceInfo(coM117.Lpt5().getBluetoothMAC(), coM117.Lpt5().getWiFiMAC(), coM117.Lpt5().getImei(), coM117.Lpt5().getImsi(), coM117.Lpt5().getAndroidId(), coM117.Lpt5().getMediaDrmId()));
                                                fingerprint.Com8(Locale.getDefault().toLanguageTag());
                                                fingerprint.Lpt5(Locale.getDefault().getCountry());
                                                fingerprint.lpt2(context.getPackageName());
                                                nveVar114.getClass();
                                                strCON = coM117.Lpt5().getDeviceIdProvider();
                                                if (wj50.m88271j(strCON, context.getPackageName())) {
                                                    strCON = "self provider";
                                                } else {
                                                    strCON = "self provider";
                                                }
                                                fingerprint.COM7(strCON);
                                                String str111111113 = Build.MANUFACTURER;
                                                fingerprint.cON(str111111113);
                                                String str111111114 = Build.MODEL;
                                                fingerprint.LPT3(str111111114);
                                                fingerprint.COM5(String.valueOf(Build.VERSION.SDK_INT));
                                                aveVar = dveVar.f53439i;
                                                y2f1Var = (y2f1) dveVar.f53433c;
                                                y2f1Var.getClass();
                                                str11 = Build.FINGERPRINT;
                                                if (!bm51.m29803n0(str11, "generic", false)) {
                                                    z5 = z3;
                                                    z6 = true;
                                                } else {
                                                    z5 = z3;
                                                    z6 = true;
                                                }
                                                String str111111115 = y2f1.f268606c;
                                                utu0 utu0Var115 = gk71.f80747a;
                                                utu0Var115.m83940H(str111111115);
                                                utu0Var115.m83952u("isProbablyEmulator = " + z6, new Object[0]);
                                                boolValueOf = Boolean.valueOf(z6);
                                                boolValueOf2 = Boolean.valueOf(((x1f1) y2f1Var.f268607a).m89639c(y2f1.m92706d(context)));
                                                boolValueOf3 = Boolean.valueOf(Debug.isDebuggerConnected());
                                                strM92703a = y2f1.m92703a(context);
                                                if (strM92703a == null) {
                                                    str12 = "non valid source";
                                                } else {
                                                    iHashCode = strM92703a.hashCode();
                                                    if (iHashCode != -1859733809) {
                                                        if (iHashCode != -1637701853) {
                                                            if (iHashCode != -1225090538) {
                                                                if (iHashCode == -1046965711) {
                                                                    str12 = "non valid source";
                                                                } else {
                                                                    str12 = "non valid source";
                                                                }
                                                            } else if (strM92703a.equals("com.sec.android.app.samsungapps")) {
                                                                str12 = "non valid source";
                                                            } else {
                                                                str12 = "Samsung Galaxy Store";
                                                            }
                                                        } else if (strM92703a.equals("com.huawei.appmarket")) {
                                                            str12 = "non valid source";
                                                        } else {
                                                            str12 = "Huawei App Gallery";
                                                        }
                                                    } else if (strM92703a.equals("com.amazon.venezia")) {
                                                        str12 = "non valid source";
                                                    } else {
                                                        str12 = "Amazon Appstore";
                                                    }
                                                }
                                                str13 = str12;
                                                bool2 = Boolean.TRUE;
                                                throw new Exception("Verifying use of hookup tools");
                                            }
                                            str4 = null;
                                            str5 = null;
                                            str3 = null;
                                            str6 = null;
                                            boolM37088i = null;
                                            fingerprint.lpt2(new CarrierInfo(str4, str5, str3, str6, boolM37088i));
                                            if (telephonyManager != null) {
                                                strM37086g = dveVar.m37086g(vueVar2, telephonyManager);
                                                strM37083p = m37083p(telephonyManager);
                                                strM37091l = dveVar.m37091l(vueVar2, telephonyManager);
                                                strM37087h = dveVar.m37087h(vueVar2, telephonyManager);
                                                strM37090k = dveVar.m37090k(context, telephonyManager);
                                                str7 = strM37086g;
                                                str8 = strM37083p;
                                                str9 = strM37091l;
                                                str10 = strM37087h;
                                            } else {
                                                str7 = null;
                                                strM37090k = null;
                                                str9 = null;
                                                str10 = null;
                                                str8 = null;
                                            }
                                            fingerprint.lpt2(new NetworkInfo(str7, strM37090k, str9, str10, str8));
                                            DisplayMetrics displayMetrics115 = context.getResources().getDisplayMetrics();
                                            fingerprint.lpt2(new ScreenInfo(displayMetrics115.densityDpi, displayMetrics115.heightPixels, displayMetrics115.widthPixels));
                                            nve nveVar115 = (nve) zkk0Var;
                                            nveVar115.getClass();
                                            DeviceId.Companion coM118 = DeviceId.INSTANCE;
                                            fingerprint.lpt2(new DeviceInfo(coM118.Lpt5().getBluetoothMAC(), coM118.Lpt5().getWiFiMAC(), coM118.Lpt5().getImei(), coM118.Lpt5().getImsi(), coM118.Lpt5().getAndroidId(), coM118.Lpt5().getMediaDrmId()));
                                            fingerprint.Com8(Locale.getDefault().toLanguageTag());
                                            fingerprint.Lpt5(Locale.getDefault().getCountry());
                                            fingerprint.lpt2(context.getPackageName());
                                            nveVar115.getClass();
                                            strCON = coM118.Lpt5().getDeviceIdProvider();
                                            if (wj50.m88271j(strCON, context.getPackageName())) {
                                                strCON = "self provider";
                                            } else {
                                                strCON = "self provider";
                                            }
                                            fingerprint.COM7(strCON);
                                            String str111111116 = Build.MANUFACTURER;
                                            fingerprint.cON(str111111116);
                                            String str111111117 = Build.MODEL;
                                            fingerprint.LPT3(str111111117);
                                            fingerprint.COM5(String.valueOf(Build.VERSION.SDK_INT));
                                            aveVar = dveVar.f53439i;
                                            y2f1Var = (y2f1) dveVar.f53433c;
                                            y2f1Var.getClass();
                                            str11 = Build.FINGERPRINT;
                                            if (!bm51.m29803n0(str11, "generic", false)) {
                                                z5 = z3;
                                                z6 = true;
                                            } else {
                                                z5 = z3;
                                                z6 = true;
                                            }
                                            String str111111118 = y2f1.f268606c;
                                            utu0 utu0Var116 = gk71.f80747a;
                                            utu0Var116.m83940H(str111111118);
                                            utu0Var116.m83952u("isProbablyEmulator = " + z6, new Object[0]);
                                            boolValueOf = Boolean.valueOf(z6);
                                            boolValueOf2 = Boolean.valueOf(((x1f1) y2f1Var.f268607a).m89639c(y2f1.m92706d(context)));
                                            boolValueOf3 = Boolean.valueOf(Debug.isDebuggerConnected());
                                            strM92703a = y2f1.m92703a(context);
                                            if (strM92703a == null) {
                                                str12 = "non valid source";
                                            } else {
                                                iHashCode = strM92703a.hashCode();
                                                if (iHashCode != -1859733809) {
                                                    if (iHashCode != -1637701853) {
                                                        if (iHashCode != -1225090538) {
                                                            if (iHashCode == -1046965711) {
                                                                str12 = "non valid source";
                                                            } else {
                                                                str12 = "non valid source";
                                                            }
                                                        } else if (strM92703a.equals("com.sec.android.app.samsungapps")) {
                                                            str12 = "non valid source";
                                                        } else {
                                                            str12 = "Samsung Galaxy Store";
                                                        }
                                                    } else if (strM92703a.equals("com.huawei.appmarket")) {
                                                        str12 = "non valid source";
                                                    } else {
                                                        str12 = "Huawei App Gallery";
                                                    }
                                                } else if (strM92703a.equals("com.amazon.venezia")) {
                                                    str12 = "non valid source";
                                                } else {
                                                    str12 = "Amazon Appstore";
                                                }
                                            }
                                            str13 = str12;
                                            bool2 = Boolean.TRUE;
                                            throw new Exception("Verifying use of hookup tools");
                                        }
                                    } else {
                                        id = null;
                                    }
                                    z4 = z2;
                                    displayName = DesugarTimeZone.getTimeZone(id).getDisplayName(false, 0);
                                    i = i;
                                    i3 = i3;
                                    int rawOffset5 = new GregorianCalendar().getTimeZone().getRawOffset();
                                    j3 = j2;
                                    numValueOf = Integer.valueOf((int) TimeUnit.HOURS.convert(rawOffset5, TimeUnit.MILLISECONDS));
                                    numValueOf2 = Integer.valueOf((int) TimeUnit.MINUTES.convert(rawOffset5, TimeUnit.MILLISECONDS));
                                    fingerprint.lpt2(new TimezoneInfo(numValueOf, displayName, numValueOf2));
                                    e2f1Var = (e2f1) vueVar4;
                                    if (e2f1Var.m37603a(context, "android.hardware.telephony")) {
                                        telephonyManager = (TelephonyManager) context.getApplicationContext().getSystemService("phone");
                                    } else {
                                        telephonyManager = null;
                                    }
                                    if (telephonyManager != null) {
                                        strM37095r = dveVar.m37095r(vueVar2, telephonyManager);
                                        strM37084q = m37084q(vueVar2, context, telephonyManager);
                                        i7 = Build.VERSION.SDK_INT;
                                        if (i7 >= 33) {
                                            ((e2f1) vueVar2).getClass();
                                            if (context.getPackageManager().hasSystemFeature("android.hardware.telephony.subscription")) {
                                                simCountryIso = telephonyManager.getSimCountryIso();
                                            } else {
                                                simCountryIso = null;
                                            }
                                        } else {
                                            simCountryIso = telephonyManager.getSimCountryIso();
                                        }
                                        if (i7 >= 33) {
                                            ((e2f1) vueVar2).getClass();
                                            if (context.getPackageManager().hasSystemFeature("android.hardware.telephony.subscription")) {
                                                simOperator = telephonyManager.getSimOperator();
                                            } else {
                                                str2 = null;
                                            }
                                            boolM37088i = dveVar.m37088i(telephonyManager);
                                            str3 = simCountryIso;
                                            str4 = strM37095r;
                                            str5 = strM37084q;
                                            str6 = str2;
                                            fingerprint.lpt2(new CarrierInfo(str4, str5, str3, str6, boolM37088i));
                                            if (telephonyManager != null) {
                                                strM37086g = dveVar.m37086g(vueVar2, telephonyManager);
                                                strM37083p = m37083p(telephonyManager);
                                                strM37091l = dveVar.m37091l(vueVar2, telephonyManager);
                                                strM37087h = dveVar.m37087h(vueVar2, telephonyManager);
                                                strM37090k = dveVar.m37090k(context, telephonyManager);
                                                str7 = strM37086g;
                                                str8 = strM37083p;
                                                str9 = strM37091l;
                                                str10 = strM37087h;
                                            } else {
                                                str7 = null;
                                                strM37090k = null;
                                                str9 = null;
                                                str10 = null;
                                                str8 = null;
                                            }
                                            fingerprint.lpt2(new NetworkInfo(str7, strM37090k, str9, str10, str8));
                                            DisplayMetrics displayMetrics116 = context.getResources().getDisplayMetrics();
                                            fingerprint.lpt2(new ScreenInfo(displayMetrics116.densityDpi, displayMetrics116.heightPixels, displayMetrics116.widthPixels));
                                            nve nveVar116 = (nve) zkk0Var;
                                            nveVar116.getClass();
                                            DeviceId.Companion coM119 = DeviceId.INSTANCE;
                                            fingerprint.lpt2(new DeviceInfo(coM119.Lpt5().getBluetoothMAC(), coM119.Lpt5().getWiFiMAC(), coM119.Lpt5().getImei(), coM119.Lpt5().getImsi(), coM119.Lpt5().getAndroidId(), coM119.Lpt5().getMediaDrmId()));
                                            fingerprint.Com8(Locale.getDefault().toLanguageTag());
                                            fingerprint.Lpt5(Locale.getDefault().getCountry());
                                            fingerprint.lpt2(context.getPackageName());
                                            nveVar116.getClass();
                                            strCON = coM119.Lpt5().getDeviceIdProvider();
                                            if (wj50.m88271j(strCON, context.getPackageName()) || strCON == null) {
                                                strCON = "self provider";
                                            }
                                            fingerprint.COM7(strCON);
                                            String str111111119 = Build.MANUFACTURER;
                                            fingerprint.cON(str111111119);
                                            String str1111111110 = Build.MODEL;
                                            fingerprint.LPT3(str1111111110);
                                            fingerprint.COM5(String.valueOf(Build.VERSION.SDK_INT));
                                            aveVar = dveVar.f53439i;
                                            y2f1Var = (y2f1) dveVar.f53433c;
                                            y2f1Var.getClass();
                                            str11 = Build.FINGERPRINT;
                                            if (!bm51.m29803n0(str11, "generic", false) && !bm51.m29803n0(str11, "unknown", false) && !wl51.m88496t0(str11, "sdk_gphone", false)) {
                                                z5 = z3;
                                                if (!wl51.m88496t0(str11, "emulator", false) && !wl51.m88496t0(str1111111110, "google_sdk", false) && !wl51.m88496t0(str1111111110, "sdk_gphone", false) && !wl51.m88496t0(str1111111110, "Emulator", true) && !wl51.m88496t0(str1111111110, "Android SDK built for x86", true) && !wl51.m88496t0(str1111111110, "sdk_phone_armv7", false) && !wl51.m88496t0(str111111119, "Genymotion", true) && !wl51.m88496t0(str111111119, "Genymobile", true) && !wl51.m88496t0(str111111119, "BlueStacks", true) && !wl51.m88496t0(str111111119, "Andy", true) && !wl51.m88496t0(str111111119, "YouWave", true) && !wl51.m88496t0(Build.DISPLAY, "sdk_gphone", false) && !wj50.m88271j(Build.BOARD, "QC_Reference_Phone") && !bm51.m29803n0(Build.HOST, "Build", false) && !wl51.m88496t0(Build.HARDWARE, "goldfish", false) && (!wl51.m88496t0(Build.BRAND, "generic", false) || !wl51.m88496t0(Build.DEVICE, "generic", false))) {
                                                    ArrayList arrayList3 = new ArrayList(wl51.m88477a1(Build.PRODUCT, new String[]{"_"}, 0, 6));
                                                    arrayList3.removeAll(h6f.m46715L("sdk", "google", "x86", "64", "vbox86p"));
                                                    if (!arrayList3.isEmpty()) {
                                                        z6 = false;
                                                    }
                                                }
                                                String str1111111111 = y2f1.f268606c;
                                                utu0 utu0Var117 = gk71.f80747a;
                                                utu0Var117.m83940H(str1111111111);
                                                utu0Var117.m83952u("isProbablyEmulator = " + z6, new Object[0]);
                                                boolValueOf = Boolean.valueOf(z6);
                                                boolValueOf2 = Boolean.valueOf(((x1f1) y2f1Var.f268607a).m89639c(y2f1.m92706d(context)));
                                                boolValueOf3 = Boolean.valueOf(Debug.isDebuggerConnected());
                                                strM92703a = y2f1.m92703a(context);
                                                if (strM92703a == null) {
                                                    str12 = "non valid source";
                                                } else {
                                                    iHashCode = strM92703a.hashCode();
                                                    if (iHashCode != -1859733809) {
                                                        if (iHashCode != -1637701853) {
                                                            if (iHashCode != -1225090538) {
                                                                if (iHashCode == -1046965711 || !strM92703a.equals("com.android.vending")) {
                                                                    str12 = "non valid source";
                                                                } else {
                                                                    str12 = "Google Play Store";
                                                                }
                                                            } else if (strM92703a.equals("com.sec.android.app.samsungapps")) {
                                                                str12 = "non valid source";
                                                            } else {
                                                                str12 = "Samsung Galaxy Store";
                                                            }
                                                        } else if (strM92703a.equals("com.huawei.appmarket")) {
                                                            str12 = "non valid source";
                                                        } else {
                                                            str12 = "Huawei App Gallery";
                                                        }
                                                    } else if (strM92703a.equals("com.amazon.venezia")) {
                                                        str12 = "non valid source";
                                                    } else {
                                                        str12 = "Amazon Appstore";
                                                    }
                                                }
                                                str13 = str12;
                                                bool2 = Boolean.TRUE;
                                                throw new Exception("Verifying use of hookup tools");
                                            }
                                            z5 = z3;
                                            z6 = true;
                                            String str1111111112 = y2f1.f268606c;
                                            utu0 utu0Var118 = gk71.f80747a;
                                            utu0Var118.m83940H(str1111111112);
                                            utu0Var118.m83952u("isProbablyEmulator = " + z6, new Object[0]);
                                            boolValueOf = Boolean.valueOf(z6);
                                            boolValueOf2 = Boolean.valueOf(((x1f1) y2f1Var.f268607a).m89639c(y2f1.m92706d(context)));
                                            boolValueOf3 = Boolean.valueOf(Debug.isDebuggerConnected());
                                            strM92703a = y2f1.m92703a(context);
                                            if (strM92703a == null) {
                                                str12 = "non valid source";
                                            } else {
                                                iHashCode = strM92703a.hashCode();
                                                if (iHashCode != -1859733809) {
                                                    if (iHashCode != -1637701853) {
                                                        if (iHashCode != -1225090538) {
                                                            if (iHashCode == -1046965711) {
                                                                str12 = "non valid source";
                                                            } else {
                                                                str12 = "non valid source";
                                                            }
                                                        } else if (strM92703a.equals("com.sec.android.app.samsungapps")) {
                                                            str12 = "non valid source";
                                                        } else {
                                                            str12 = "Samsung Galaxy Store";
                                                        }
                                                    } else if (strM92703a.equals("com.huawei.appmarket")) {
                                                        str12 = "non valid source";
                                                    } else {
                                                        str12 = "Huawei App Gallery";
                                                    }
                                                } else if (strM92703a.equals("com.amazon.venezia")) {
                                                    str12 = "non valid source";
                                                } else {
                                                    str12 = "Amazon Appstore";
                                                }
                                            }
                                            str13 = str12;
                                            bool2 = Boolean.TRUE;
                                            throw new Exception("Verifying use of hookup tools");
                                        }
                                        simOperator = telephonyManager.getSimOperator();
                                        str2 = simOperator;
                                        boolM37088i = dveVar.m37088i(telephonyManager);
                                        str3 = simCountryIso;
                                        str4 = strM37095r;
                                        str5 = strM37084q;
                                        str6 = str2;
                                        fingerprint.lpt2(new CarrierInfo(str4, str5, str3, str6, boolM37088i));
                                        if (telephonyManager != null) {
                                            strM37086g = dveVar.m37086g(vueVar2, telephonyManager);
                                            strM37083p = m37083p(telephonyManager);
                                            strM37091l = dveVar.m37091l(vueVar2, telephonyManager);
                                            strM37087h = dveVar.m37087h(vueVar2, telephonyManager);
                                            strM37090k = dveVar.m37090k(context, telephonyManager);
                                            str7 = strM37086g;
                                            str8 = strM37083p;
                                            str9 = strM37091l;
                                            str10 = strM37087h;
                                        } else {
                                            str7 = null;
                                            strM37090k = null;
                                            str9 = null;
                                            str10 = null;
                                            str8 = null;
                                        }
                                        fingerprint.lpt2(new NetworkInfo(str7, strM37090k, str9, str10, str8));
                                        DisplayMetrics displayMetrics117 = context.getResources().getDisplayMetrics();
                                        fingerprint.lpt2(new ScreenInfo(displayMetrics117.densityDpi, displayMetrics117.heightPixels, displayMetrics117.widthPixels));
                                        nve nveVar117 = (nve) zkk0Var;
                                        nveVar117.getClass();
                                        DeviceId.Companion coM1110 = DeviceId.INSTANCE;
                                        fingerprint.lpt2(new DeviceInfo(coM1110.Lpt5().getBluetoothMAC(), coM1110.Lpt5().getWiFiMAC(), coM1110.Lpt5().getImei(), coM1110.Lpt5().getImsi(), coM1110.Lpt5().getAndroidId(), coM1110.Lpt5().getMediaDrmId()));
                                        fingerprint.Com8(Locale.getDefault().toLanguageTag());
                                        fingerprint.Lpt5(Locale.getDefault().getCountry());
                                        fingerprint.lpt2(context.getPackageName());
                                        nveVar117.getClass();
                                        strCON = coM1110.Lpt5().getDeviceIdProvider();
                                        if (wj50.m88271j(strCON, context.getPackageName())) {
                                            strCON = "self provider";
                                        } else {
                                            strCON = "self provider";
                                        }
                                        fingerprint.COM7(strCON);
                                        String str1111111113 = Build.MANUFACTURER;
                                        fingerprint.cON(str1111111113);
                                        String str1111111114 = Build.MODEL;
                                        fingerprint.LPT3(str1111111114);
                                        fingerprint.COM5(String.valueOf(Build.VERSION.SDK_INT));
                                        aveVar = dveVar.f53439i;
                                        y2f1Var = (y2f1) dveVar.f53433c;
                                        y2f1Var.getClass();
                                        str11 = Build.FINGERPRINT;
                                        if (!bm51.m29803n0(str11, "generic", false)) {
                                            z5 = z3;
                                            z6 = true;
                                        } else {
                                            z5 = z3;
                                            z6 = true;
                                        }
                                        String str1111111115 = y2f1.f268606c;
                                        utu0 utu0Var119 = gk71.f80747a;
                                        utu0Var119.m83940H(str1111111115);
                                        utu0Var119.m83952u("isProbablyEmulator = " + z6, new Object[0]);
                                        boolValueOf = Boolean.valueOf(z6);
                                        boolValueOf2 = Boolean.valueOf(((x1f1) y2f1Var.f268607a).m89639c(y2f1.m92706d(context)));
                                        boolValueOf3 = Boolean.valueOf(Debug.isDebuggerConnected());
                                        strM92703a = y2f1.m92703a(context);
                                        if (strM92703a == null) {
                                            str12 = "non valid source";
                                        } else {
                                            iHashCode = strM92703a.hashCode();
                                            if (iHashCode != -1859733809) {
                                                if (iHashCode != -1637701853) {
                                                    if (iHashCode != -1225090538) {
                                                        if (iHashCode == -1046965711) {
                                                            str12 = "non valid source";
                                                        } else {
                                                            str12 = "non valid source";
                                                        }
                                                    } else if (strM92703a.equals("com.sec.android.app.samsungapps")) {
                                                        str12 = "non valid source";
                                                    } else {
                                                        str12 = "Samsung Galaxy Store";
                                                    }
                                                } else if (strM92703a.equals("com.huawei.appmarket")) {
                                                    str12 = "non valid source";
                                                } else {
                                                    str12 = "Huawei App Gallery";
                                                }
                                            } else if (strM92703a.equals("com.amazon.venezia")) {
                                                str12 = "non valid source";
                                            } else {
                                                str12 = "Amazon Appstore";
                                            }
                                        }
                                        str13 = str12;
                                        bool2 = Boolean.TRUE;
                                        throw new Exception("Verifying use of hookup tools");
                                    }
                                    str4 = null;
                                    str5 = null;
                                    str3 = null;
                                    str6 = null;
                                    boolM37088i = null;
                                    fingerprint.lpt2(new CarrierInfo(str4, str5, str3, str6, boolM37088i));
                                    if (telephonyManager != null) {
                                        strM37086g = dveVar.m37086g(vueVar2, telephonyManager);
                                        strM37083p = m37083p(telephonyManager);
                                        strM37091l = dveVar.m37091l(vueVar2, telephonyManager);
                                        strM37087h = dveVar.m37087h(vueVar2, telephonyManager);
                                        strM37090k = dveVar.m37090k(context, telephonyManager);
                                        str7 = strM37086g;
                                        str8 = strM37083p;
                                        str9 = strM37091l;
                                        str10 = strM37087h;
                                    } else {
                                        str7 = null;
                                        strM37090k = null;
                                        str9 = null;
                                        str10 = null;
                                        str8 = null;
                                    }
                                    fingerprint.lpt2(new NetworkInfo(str7, strM37090k, str9, str10, str8));
                                    DisplayMetrics displayMetrics118 = context.getResources().getDisplayMetrics();
                                    fingerprint.lpt2(new ScreenInfo(displayMetrics118.densityDpi, displayMetrics118.heightPixels, displayMetrics118.widthPixels));
                                    nve nveVar118 = (nve) zkk0Var;
                                    nveVar118.getClass();
                                    DeviceId.Companion coM1111 = DeviceId.INSTANCE;
                                    fingerprint.lpt2(new DeviceInfo(coM1111.Lpt5().getBluetoothMAC(), coM1111.Lpt5().getWiFiMAC(), coM1111.Lpt5().getImei(), coM1111.Lpt5().getImsi(), coM1111.Lpt5().getAndroidId(), coM1111.Lpt5().getMediaDrmId()));
                                    fingerprint.Com8(Locale.getDefault().toLanguageTag());
                                    fingerprint.Lpt5(Locale.getDefault().getCountry());
                                    fingerprint.lpt2(context.getPackageName());
                                    nveVar118.getClass();
                                    strCON = coM1111.Lpt5().getDeviceIdProvider();
                                    if (wj50.m88271j(strCON, context.getPackageName())) {
                                        strCON = "self provider";
                                    } else {
                                        strCON = "self provider";
                                    }
                                    fingerprint.COM7(strCON);
                                    String str1111111116 = Build.MANUFACTURER;
                                    fingerprint.cON(str1111111116);
                                    String str1111111117 = Build.MODEL;
                                    fingerprint.LPT3(str1111111117);
                                    fingerprint.COM5(String.valueOf(Build.VERSION.SDK_INT));
                                    aveVar = dveVar.f53439i;
                                    y2f1Var = (y2f1) dveVar.f53433c;
                                    y2f1Var.getClass();
                                    str11 = Build.FINGERPRINT;
                                    if (!bm51.m29803n0(str11, "generic", false)) {
                                        z5 = z3;
                                        z6 = true;
                                    } else {
                                        z5 = z3;
                                        z6 = true;
                                    }
                                    String str1111111118 = y2f1.f268606c;
                                    utu0 utu0Var1110 = gk71.f80747a;
                                    utu0Var1110.m83940H(str1111111118);
                                    utu0Var1110.m83952u("isProbablyEmulator = " + z6, new Object[0]);
                                    boolValueOf = Boolean.valueOf(z6);
                                    boolValueOf2 = Boolean.valueOf(((x1f1) y2f1Var.f268607a).m89639c(y2f1.m92706d(context)));
                                    boolValueOf3 = Boolean.valueOf(Debug.isDebuggerConnected());
                                    strM92703a = y2f1.m92703a(context);
                                    if (strM92703a == null) {
                                        str12 = "non valid source";
                                    } else {
                                        iHashCode = strM92703a.hashCode();
                                        if (iHashCode != -1859733809) {
                                            if (iHashCode != -1637701853) {
                                                if (iHashCode != -1225090538) {
                                                    if (iHashCode == -1046965711) {
                                                        str12 = "non valid source";
                                                    } else {
                                                        str12 = "non valid source";
                                                    }
                                                } else if (strM92703a.equals("com.sec.android.app.samsungapps")) {
                                                    str12 = "non valid source";
                                                } else {
                                                    str12 = "Samsung Galaxy Store";
                                                }
                                            } else if (strM92703a.equals("com.huawei.appmarket")) {
                                                str12 = "non valid source";
                                            } else {
                                                str12 = "Huawei App Gallery";
                                            }
                                        } else if (strM92703a.equals("com.amazon.venezia")) {
                                            str12 = "non valid source";
                                        } else {
                                            str12 = "Amazon Appstore";
                                        }
                                    }
                                    str13 = str12;
                                    bool2 = Boolean.TRUE;
                                    throw new Exception("Verifying use of hookup tools");
                                    displayName = DesugarTimeZone.getTimeZone(id).getDisplayName(false, 0);
                                    i = i;
                                    i3 = i3;
                                } catch (AssertionError e30) {
                                    e = e30;
                                    String strM38564m2 = edb.m38564m("Error while discovering timeZone with: ", e.getLocalizedMessage());
                                    AssertionError assertionError2 = e;
                                    utu0 utu0Var20 = gk71.f80747a;
                                    utu0Var20.m83940H(str);
                                    utu0Var20.m83952u(strM38564m2, new Object[0]);
                                    ((z2f1) xd70Var).m95188a(new MobileError(System.currentTimeMillis(), null, "mobile-report", assertionError2.getMessage(), new ErrorMetadata(ContentDeliverySubscriptionType.ADVERTISING, "JVM", "An assertion failed", (String) null, pmf0.m70321g(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null)));
                                    displayName = null;
                                } catch (IllegalArgumentException e31) {
                                    e = e31;
                                    ((z2f1) xd70Var).m95188a(new MobileError(System.currentTimeMillis(), null, "mobile-report", e.getMessage(), new ErrorMetadata(ContentDeliverySubscriptionType.SUBSCRIPTION, "JVM", "An illegal argument was passed to a method", (String) null, pmf0.m70321g(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null)));
                                    displayName = null;
                                } catch (NullPointerException e32) {
                                    e = e32;
                                    ((z2f1) xd70Var).m95188a(new MobileError(System.currentTimeMillis(), null, "mobile-report", e.getMessage(), new ErrorMetadata(ContentDeliverySubscriptionType.TRADITIONAL_MVPD, "JVM", "An data object was null when it should not have been", (String) null, pmf0.m70321g(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null)));
                                    displayName = null;
                                } catch (RuntimeException e33) {
                                    e = e33;
                                    ((z2f1) xd70Var).m95188a(new MobileError(System.currentTimeMillis(), null, "mobile-report", e.getMessage(), new ErrorMetadata(ContentDeliverySubscriptionType.VIRTUAL_MVPD, "JVM", "An error occurred during runtime", (String) null, pmf0.m70321g(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null)));
                                    displayName = null;
                                }
                                numValueOf = Integer.valueOf((int) TimeUnit.HOURS.convert(rawOffset5, TimeUnit.MILLISECONDS));
                            } catch (AbstractMethodError e34) {
                                e = e34;
                                String strM38564m3 = edb.m38564m("Error while discovering timeZone with: ", e.getLocalizedMessage());
                                utu0 utu0Var21 = gk71.f80747a;
                                utu0Var21.m83940H(str);
                                utu0Var21.m83952u(strM38564m3, new Object[0]);
                                numValueOf = null;
                            }
                            timeZone = TimeZone.getDefault();
                        } catch (CloneNotSupportedException e35) {
                            ((z2f1) xd70Var).m95188a(new MobileError(System.currentTimeMillis(), null, "mobile-report", e35.getMessage(), new ErrorMetadata(CtaType.BUY_TICKETS_FIELD_NUMBER, "JVM", "The data object could not be cloned", (String) null, pmf0.m70321g(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null)));
                            timeZone = null;
                        }
                        j3 = j2;
                    } catch (AbstractMethodError e36) {
                        e = e36;
                        j3 = j2;
                    }
                    numValueOf2 = Integer.valueOf((int) TimeUnit.MINUTES.convert(rawOffset5, TimeUnit.MILLISECONDS));
                } catch (AbstractMethodError e37) {
                    String strM38564m4 = edb.m38564m("Error while discovering timeZone with: ", e37.getLocalizedMessage());
                    utu0 utu0Var22 = gk71.f80747a;
                    utu0Var22.m83940H(str);
                    utu0Var22.m83952u(strM38564m4, new Object[0]);
                    numValueOf2 = null;
                }
                if (telephonyManager != null) {
                    strM37095r = dveVar.m37095r(vueVar2, telephonyManager);
                    strM37084q = m37084q(vueVar2, context, telephonyManager);
                    i7 = Build.VERSION.SDK_INT;
                    if (i7 >= 33) {
                        ((e2f1) vueVar2).getClass();
                        if (context.getPackageManager().hasSystemFeature("android.hardware.telephony.subscription")) {
                            simCountryIso = telephonyManager.getSimCountryIso();
                        } else {
                            simCountryIso = null;
                        }
                    } else {
                        simCountryIso = telephonyManager.getSimCountryIso();
                    }
                    if (i7 >= 33) {
                        ((e2f1) vueVar2).getClass();
                        if (context.getPackageManager().hasSystemFeature("android.hardware.telephony.subscription")) {
                            simOperator = telephonyManager.getSimOperator();
                        } else {
                            str2 = null;
                        }
                        boolM37088i = dveVar.m37088i(telephonyManager);
                        str3 = simCountryIso;
                        str4 = strM37095r;
                        str5 = strM37084q;
                        str6 = str2;
                        fingerprint.lpt2(new CarrierInfo(str4, str5, str3, str6, boolM37088i));
                        if (telephonyManager != null) {
                            strM37086g = dveVar.m37086g(vueVar2, telephonyManager);
                            strM37083p = m37083p(telephonyManager);
                            strM37091l = dveVar.m37091l(vueVar2, telephonyManager);
                            strM37087h = dveVar.m37087h(vueVar2, telephonyManager);
                            strM37090k = dveVar.m37090k(context, telephonyManager);
                            str7 = strM37086g;
                            str8 = strM37083p;
                            str9 = strM37091l;
                            str10 = strM37087h;
                        } else {
                            str7 = null;
                            strM37090k = null;
                            str9 = null;
                            str10 = null;
                            str8 = null;
                        }
                        fingerprint.lpt2(new NetworkInfo(str7, strM37090k, str9, str10, str8));
                        DisplayMetrics displayMetrics119 = context.getResources().getDisplayMetrics();
                        fingerprint.lpt2(new ScreenInfo(displayMetrics119.densityDpi, displayMetrics119.heightPixels, displayMetrics119.widthPixels));
                        nve nveVar119 = (nve) zkk0Var;
                        nveVar119.getClass();
                        DeviceId.Companion coM1112 = DeviceId.INSTANCE;
                        fingerprint.lpt2(new DeviceInfo(coM1112.Lpt5().getBluetoothMAC(), coM1112.Lpt5().getWiFiMAC(), coM1112.Lpt5().getImei(), coM1112.Lpt5().getImsi(), coM1112.Lpt5().getAndroidId(), coM1112.Lpt5().getMediaDrmId()));
                        fingerprint.Com8(Locale.getDefault().toLanguageTag());
                        fingerprint.Lpt5(Locale.getDefault().getCountry());
                        fingerprint.lpt2(context.getPackageName());
                        nveVar119.getClass();
                        strCON = coM1112.Lpt5().getDeviceIdProvider();
                        if (wj50.m88271j(strCON, context.getPackageName())) {
                            strCON = "self provider";
                        } else {
                            strCON = "self provider";
                        }
                        fingerprint.COM7(strCON);
                        String str1111111119 = Build.MANUFACTURER;
                        fingerprint.cON(str1111111119);
                        String str11111111110 = Build.MODEL;
                        fingerprint.LPT3(str11111111110);
                        fingerprint.COM5(String.valueOf(Build.VERSION.SDK_INT));
                        aveVar = dveVar.f53439i;
                        y2f1Var = (y2f1) dveVar.f53433c;
                        y2f1Var.getClass();
                        str11 = Build.FINGERPRINT;
                        if (!bm51.m29803n0(str11, "generic", false)) {
                            z5 = z3;
                            z6 = true;
                        } else {
                            z5 = z3;
                            z6 = true;
                        }
                        String str11111111111 = y2f1.f268606c;
                        utu0 utu0Var1111 = gk71.f80747a;
                        utu0Var1111.m83940H(str11111111111);
                        utu0Var1111.m83952u("isProbablyEmulator = " + z6, new Object[0]);
                        boolValueOf = Boolean.valueOf(z6);
                        boolValueOf2 = Boolean.valueOf(((x1f1) y2f1Var.f268607a).m89639c(y2f1.m92706d(context)));
                        boolValueOf3 = Boolean.valueOf(Debug.isDebuggerConnected());
                        strM92703a = y2f1.m92703a(context);
                        if (strM92703a == null) {
                            str12 = "non valid source";
                        } else {
                            iHashCode = strM92703a.hashCode();
                            if (iHashCode != -1859733809) {
                                if (iHashCode != -1637701853) {
                                    if (iHashCode != -1225090538) {
                                        if (iHashCode == -1046965711) {
                                            str12 = "non valid source";
                                        } else {
                                            str12 = "non valid source";
                                        }
                                    } else if (strM92703a.equals("com.sec.android.app.samsungapps")) {
                                        str12 = "non valid source";
                                    } else {
                                        str12 = "Samsung Galaxy Store";
                                    }
                                } else if (strM92703a.equals("com.huawei.appmarket")) {
                                    str12 = "non valid source";
                                } else {
                                    str12 = "Huawei App Gallery";
                                }
                            } else if (strM92703a.equals("com.amazon.venezia")) {
                                str12 = "non valid source";
                            } else {
                                str12 = "Amazon Appstore";
                            }
                        }
                        str13 = str12;
                        bool2 = Boolean.TRUE;
                        throw new Exception("Verifying use of hookup tools");
                    }
                    simOperator = telephonyManager.getSimOperator();
                    str2 = simOperator;
                    boolM37088i = dveVar.m37088i(telephonyManager);
                    str3 = simCountryIso;
                    str4 = strM37095r;
                    str5 = strM37084q;
                    str6 = str2;
                    fingerprint.lpt2(new CarrierInfo(str4, str5, str3, str6, boolM37088i));
                    if (telephonyManager != null) {
                        strM37086g = dveVar.m37086g(vueVar2, telephonyManager);
                        strM37083p = m37083p(telephonyManager);
                        strM37091l = dveVar.m37091l(vueVar2, telephonyManager);
                        strM37087h = dveVar.m37087h(vueVar2, telephonyManager);
                        strM37090k = dveVar.m37090k(context, telephonyManager);
                        str7 = strM37086g;
                        str8 = strM37083p;
                        str9 = strM37091l;
                        str10 = strM37087h;
                    } else {
                        str7 = null;
                        strM37090k = null;
                        str9 = null;
                        str10 = null;
                        str8 = null;
                    }
                    fingerprint.lpt2(new NetworkInfo(str7, strM37090k, str9, str10, str8));
                    DisplayMetrics displayMetrics1110 = context.getResources().getDisplayMetrics();
                    fingerprint.lpt2(new ScreenInfo(displayMetrics1110.densityDpi, displayMetrics1110.heightPixels, displayMetrics1110.widthPixels));
                    nve nveVar1110 = (nve) zkk0Var;
                    nveVar1110.getClass();
                    DeviceId.Companion coM1113 = DeviceId.INSTANCE;
                    fingerprint.lpt2(new DeviceInfo(coM1113.Lpt5().getBluetoothMAC(), coM1113.Lpt5().getWiFiMAC(), coM1113.Lpt5().getImei(), coM1113.Lpt5().getImsi(), coM1113.Lpt5().getAndroidId(), coM1113.Lpt5().getMediaDrmId()));
                    fingerprint.Com8(Locale.getDefault().toLanguageTag());
                    fingerprint.Lpt5(Locale.getDefault().getCountry());
                    fingerprint.lpt2(context.getPackageName());
                    nveVar1110.getClass();
                    strCON = coM1113.Lpt5().getDeviceIdProvider();
                    if (wj50.m88271j(strCON, context.getPackageName())) {
                        strCON = "self provider";
                    } else {
                        strCON = "self provider";
                    }
                    fingerprint.COM7(strCON);
                    String str11111111112 = Build.MANUFACTURER;
                    fingerprint.cON(str11111111112);
                    String str11111111113 = Build.MODEL;
                    fingerprint.LPT3(str11111111113);
                    fingerprint.COM5(String.valueOf(Build.VERSION.SDK_INT));
                    aveVar = dveVar.f53439i;
                    y2f1Var = (y2f1) dveVar.f53433c;
                    y2f1Var.getClass();
                    str11 = Build.FINGERPRINT;
                    if (!bm51.m29803n0(str11, "generic", false)) {
                        z5 = z3;
                        z6 = true;
                    } else {
                        z5 = z3;
                        z6 = true;
                    }
                    String str11111111114 = y2f1.f268606c;
                    utu0 utu0Var1112 = gk71.f80747a;
                    utu0Var1112.m83940H(str11111111114);
                    utu0Var1112.m83952u("isProbablyEmulator = " + z6, new Object[0]);
                    boolValueOf = Boolean.valueOf(z6);
                    boolValueOf2 = Boolean.valueOf(((x1f1) y2f1Var.f268607a).m89639c(y2f1.m92706d(context)));
                    boolValueOf3 = Boolean.valueOf(Debug.isDebuggerConnected());
                    strM92703a = y2f1.m92703a(context);
                    if (strM92703a == null) {
                        str12 = "non valid source";
                    } else {
                        iHashCode = strM92703a.hashCode();
                        if (iHashCode != -1859733809) {
                            if (iHashCode != -1637701853) {
                                if (iHashCode != -1225090538) {
                                    if (iHashCode == -1046965711) {
                                        str12 = "non valid source";
                                    } else {
                                        str12 = "non valid source";
                                    }
                                } else if (strM92703a.equals("com.sec.android.app.samsungapps")) {
                                    str12 = "non valid source";
                                } else {
                                    str12 = "Samsung Galaxy Store";
                                }
                            } else if (strM92703a.equals("com.huawei.appmarket")) {
                                str12 = "non valid source";
                            } else {
                                str12 = "Huawei App Gallery";
                            }
                        } else if (strM92703a.equals("com.amazon.venezia")) {
                            str12 = "non valid source";
                        } else {
                            str12 = "Amazon Appstore";
                        }
                    }
                    str13 = str12;
                    bool2 = Boolean.TRUE;
                    throw new Exception("Verifying use of hookup tools");
                }
                str4 = null;
                str5 = null;
                str3 = null;
                str6 = null;
                boolValueOf2 = Boolean.valueOf(((x1f1) y2f1Var.f268607a).m89639c(y2f1.m92706d(context)));
            } catch (Exception e38) {
                String str20 = y2f1.f268606c;
                String strValueOf = String.valueOf(e38);
                utu0 utu0Var23 = gk71.f80747a;
                utu0Var23.m83940H(str20);
                utu0Var23.m83952u(strValueOf, new Object[0]);
                boolValueOf2 = null;
            }
            throw new Exception("Verifying use of hookup tools");
        } catch (Exception e39) {
            StackTraceElement[] stackTrace = e39.getStackTrace();
            int length = stackTrace.length;
            int i14 = 0;
            boolean z12 = false;
            int i15 = 0;
            while (i14 < length) {
                StackTraceElement stackTraceElement = stackTrace[i14];
                StackTraceElement[] stackTraceElementArr = stackTrace;
                if (stackTraceElement.getClassName().equals("com.android.internal.os.ZygoteInit")) {
                    i15++;
                    if (i15 == 2) {
                        utu0 utu0Var24 = gk71.f80747a;
                        utu0Var24.m83940H("HookDetection");
                        utu0Var24.m83952u("Substrate is active on the device.", new Object[0]);
                        i10 = length;
                        z12 = true;
                    } else {
                        i10 = length;
                    }
                } else {
                    i10 = length;
                    if (stackTraceElement.getClassName().equals("com.saurik.substrate.MS$2") && stackTraceElement.getClassName().equals("invoked")) {
                        utu0 utu0Var25 = gk71.f80747a;
                        utu0Var25.m83940H("HookDetection");
                        utu0Var25.m83952u("A method on the stack trace has been hooked using Substrate.", new Object[0]);
                    } else if (stackTraceElement.getClassName().equals("de.robv.android.xposed.XposedBridge") && (stackTraceElement.getClassName().equals("main") || stackTraceElement.getClassName().equals("handleHookedMethod"))) {
                        utu0 utu0Var26 = gk71.f80747a;
                        utu0Var26.m83940H("HookDetection");
                        utu0Var26.m83952u("A method on the stack trace has been hooked using Xposed.", new Object[0]);
                    }
                    z12 = true;
                }
                i14++;
                stackTrace = stackTraceElementArr;
                length = i10;
            }
            Boolean boolValueOf5 = Boolean.valueOf(z12);
            SharedPreferences sharedPreferences = y2f1Var.f268608b;
            try {
                try {
                    ZipFile zipFile = new ZipFile(context.getPackageCodePath());
                    long j4 = Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L)).lastUpdateTime : context.getPackageManager().getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
                    Fingerprint fingerprint15 = fingerprint2;
                    telephonyManager2 = telephonyManager;
                    try {
                        long jM92705c = y2f1.m92705c(zipFile);
                        vueVar3 = vueVar2;
                        m5pVar3 = m5pVar2;
                        try {
                            long jM92704b = y2f1.m92704b(zipFile);
                            fingerprint6 = fingerprint15;
                            fingerprint7 = fingerprint;
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                long j5 = sharedPreferences.getLong("crc", 0L);
                                                long j6 = sharedPreferences.getLong("package size", 0L);
                                                long j7 = sharedPreferences.getLong("last update", 0L);
                                                Long lValueOf = Long.valueOf(j7);
                                                if (j4 != j7) {
                                                    lValueOf = null;
                                                }
                                                if (lValueOf != null) {
                                                    Long lValueOf2 = Long.valueOf(jM92705c);
                                                    if (jM92705c == j5) {
                                                        lValueOf2 = null;
                                                    }
                                                    if (lValueOf2 == null) {
                                                        Long lValueOf3 = Long.valueOf(jM92704b);
                                                        if (jM92704b == j6) {
                                                            lValueOf3 = null;
                                                        }
                                                        if (lValueOf3 != null) {
                                                        }
                                                    }
                                                    z7 = true;
                                                    Boolean boolValueOf6 = Boolean.valueOf(z7);
                                                    i8 = Build.VERSION.SDK_INT;
                                                    if (i8 >= 26) {
                                                        e2f1Var.getClass();
                                                        if (i8 >= 26 || lzj.m60353c(context, "android.permission.REQUEST_INSTALL_PACKAGES") != 0) {
                                                            zCanRequestPackageInstalls = false;
                                                        } else {
                                                            zCanRequestPackageInstalls = context.getPackageManager().canRequestPackageInstalls();
                                                        }
                                                    } else if (Settings.Secure.getInt(context.getContentResolver(), "install_non_market_apps") == 1) {
                                                        zCanRequestPackageInstalls = true;
                                                    } else {
                                                        zCanRequestPackageInstalls = false;
                                                    }
                                                    Boolean boolValueOf7 = Boolean.valueOf(zCanRequestPackageInstalls);
                                                    if (Settings.Global.getInt(context.getContentResolver(), "adb_enabled", 0) == 0) {
                                                        z8 = false;
                                                    } else {
                                                        z8 = true;
                                                    }
                                                    Boolean boolValueOf8 = Boolean.valueOf(z8);
                                                    if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) == 0) {
                                                        z9 = false;
                                                    } else {
                                                        z9 = true;
                                                    }
                                                    Boolean boolValueOf9 = Boolean.valueOf(z9);
                                                    b2f1 b2f1Var = dveVar.f53438h;
                                                    b2f1Var.getClass();
                                                    Context context2 = b2f1Var.f22589a;
                                                    c06 c06Var = new c06(new vc3(context2));
                                                    if (Build.VERSION.SDK_INT >= 30 || c06Var.m31100l() != 0) {
                                                        z10 = false;
                                                    } else {
                                                        z10 = true;
                                                    }
                                                    Boolean boolValueOf10 = Boolean.valueOf(z10);
                                                    arrayList = new ArrayList();
                                                    i9 = Build.VERSION.SDK_INT;
                                                    if (i9 >= 30 && (packageManager3 = context2.getPackageManager()) != null && packageManager3.hasSystemFeature("android.hardware.fingerprint")) {
                                                        arrayList.add("fingerprint");
                                                    }
                                                    if (i9 >= 30 && (packageManager2 = context2.getPackageManager()) != null && packageManager2.hasSystemFeature("android.hardware.biometrics.face")) {
                                                        arrayList.add("face");
                                                    }
                                                    if (i9 >= 30 && (packageManager = context2.getPackageManager()) != null && packageManager.hasSystemFeature("android.hardware.biometrics.iris")) {
                                                        arrayList.add("iris");
                                                    }
                                                    if (arrayList.isEmpty()) {
                                                        arrayList2 = arrayList;
                                                    } else {
                                                        arrayList2 = null;
                                                    }
                                                    if (arrayList2 != null) {
                                                        arrayList.add("none");
                                                    }
                                                    BiometricProperties biometricProperties = new BiometricProperties(boolValueOf10, (String[]) arrayList.toArray(new String[0]));
                                                    Boolean boolValueOf11 = Boolean.valueOf(UserManager.supportsMultipleUsers());
                                                    string = Settings.Secure.getString(context.getContentResolver(), "default_input_method");
                                                    boolValueOf4 = Boolean.valueOf(((KeyguardManager) context.getSystemService("keyguard")).isKeyguardSecure());
                                                    Float fMo27239a = aveVar.mo27239a();
                                                    Integer numMo27243f = aveVar.mo27243f();
                                                    Float fMo27240b = aveVar.mo27240b();
                                                    Float fMo27242d = aveVar.mo27242d();
                                                    String strMo27241c = aveVar.mo27241c();
                                                    e2f1Var.getClass();
                                                    if (Build.VERSION.SDK_INT >= 36 || lzj.m60353c(context, "android.permission.QUERY_ADVANCED_PROTECTION_MODE") != 0) {
                                                        zM88271j = false;
                                                    } else {
                                                        AdvancedProtectionManager advancedProtectionManager = (AdvancedProtectionManager) context.getSystemService(AdvancedProtectionManager.class);
                                                        zM88271j = wj50.m88271j(advancedProtectionManager != null ? Boolean.valueOf(advancedProtectionManager.isAdvancedProtectionEnabled()) : null, Boolean.TRUE);
                                                    }
                                                    fingerprint8 = fingerprint7;
                                                    fingerprint8.lpt2(new DeviceProperties(boolValueOf, boolValueOf2, boolValueOf3, str13, bool2, boolValueOf5, boolValueOf6, boolValueOf7, boolValueOf8, boolValueOf9, biometricProperties, boolValueOf11, string, (Boolean) null, boolValueOf4, fMo27239a, numMo27243f, fMo27240b, fMo27242d, strMo27241c, Boolean.valueOf(zM88271j), 8192, (DefaultConstructorMarker) null));
                                                    kueVar.f126529a = m5pVar3;
                                                    kueVar.f126530b = dveVar;
                                                    fingerprint9 = fingerprint6;
                                                    kueVar.f126531c = fingerprint9;
                                                    kueVar.f126532d = fingerprint8;
                                                    kueVar.f126533e = vueVar3;
                                                    kueVar.f126534f = telephonyManager2;
                                                    kueVar.f126535g = fingerprint8;
                                                    kueVar.f126536h = z5;
                                                    long j8 = j3;
                                                    kueVar.f126538t = j8;
                                                    kueVar.f126526X = i3;
                                                    kueVar.f126527Y = i;
                                                    kueVar.f126537i = z4;
                                                    kueVar.f126528Z = i6;
                                                    kueVar.f126525N0 = 2;
                                                    objM37092m = dveVar.m37092m(j8, kueVar);
                                                    if (objM37092m == yukVar) {
                                                        return yukVar;
                                                    }
                                                    dveVar2 = dveVar;
                                                    fingerprint10 = fingerprint9;
                                                    fingerprint11 = fingerprint8;
                                                    fingerprint12 = fingerprint11;
                                                } else {
                                                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                                                    editorEdit.putLong("crc", jM92705c);
                                                    editorEdit.putLong("package size", jM92704b);
                                                    editorEdit.putLong("last update", j4);
                                                    editorEdit.apply();
                                                }
                                                zipFile.close();
                                                boolean zM92706d = y2f1.m92706d(context);
                                                if (zM92706d) {
                                                    z7 = false;
                                                } else {
                                                    if (zM92706d) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    z7 = true;
                                                }
                                            } catch (Exception e40) {
                                                e = e40;
                                                String str21 = y2f1.f268606c;
                                                String strM38564m5 = edb.m38564m("Code Integrity check threw an error: ", e.getMessage());
                                                utu0 utu0Var27 = gk71.f80747a;
                                                utu0Var27.m83940H(str21);
                                                utu0Var27.m83952u(strM38564m5, new Object[0]);
                                                z7 = false;
                                                Boolean boolValueOf12 = Boolean.valueOf(z7);
                                                i8 = Build.VERSION.SDK_INT;
                                                if (i8 >= 26) {
                                                    e2f1Var.getClass();
                                                    if (i8 >= 26) {
                                                        zCanRequestPackageInstalls = false;
                                                    } else {
                                                        zCanRequestPackageInstalls = false;
                                                    }
                                                } else if (Settings.Secure.getInt(context.getContentResolver(), "install_non_market_apps") == 1) {
                                                    zCanRequestPackageInstalls = true;
                                                } else {
                                                    zCanRequestPackageInstalls = false;
                                                }
                                                Boolean boolValueOf13 = Boolean.valueOf(zCanRequestPackageInstalls);
                                                if (Settings.Global.getInt(context.getContentResolver(), "adb_enabled", 0) == 0) {
                                                    z8 = false;
                                                } else {
                                                    z8 = true;
                                                }
                                                Boolean boolValueOf14 = Boolean.valueOf(z8);
                                                if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) == 0) {
                                                    z9 = false;
                                                } else {
                                                    z9 = true;
                                                }
                                                Boolean boolValueOf15 = Boolean.valueOf(z9);
                                                b2f1 b2f1Var2 = dveVar.f53438h;
                                                b2f1Var2.getClass();
                                                Context context3 = b2f1Var2.f22589a;
                                                c06 c06Var2 = new c06(new vc3(context3));
                                                if (Build.VERSION.SDK_INT >= 30) {
                                                    z10 = false;
                                                } else {
                                                    z10 = false;
                                                }
                                                Boolean boolValueOf16 = Boolean.valueOf(z10);
                                                arrayList = new ArrayList();
                                                i9 = Build.VERSION.SDK_INT;
                                                if (i9 >= 30) {
                                                    arrayList.add("fingerprint");
                                                }
                                                if (i9 >= 30) {
                                                    arrayList.add("face");
                                                }
                                                if (i9 >= 30) {
                                                    arrayList.add("iris");
                                                }
                                                if (arrayList.isEmpty()) {
                                                    arrayList2 = arrayList;
                                                } else {
                                                    arrayList2 = null;
                                                }
                                                if (arrayList2 != null) {
                                                    arrayList.add("none");
                                                }
                                                BiometricProperties biometricProperties2 = new BiometricProperties(boolValueOf16, (String[]) arrayList.toArray(new String[0]));
                                                Boolean boolValueOf17 = Boolean.valueOf(UserManager.supportsMultipleUsers());
                                                string = Settings.Secure.getString(context.getContentResolver(), "default_input_method");
                                                boolValueOf4 = Boolean.valueOf(((KeyguardManager) context.getSystemService("keyguard")).isKeyguardSecure());
                                                Float fMo27239a2 = aveVar.mo27239a();
                                                Integer numMo27243f2 = aveVar.mo27243f();
                                                Float fMo27240b2 = aveVar.mo27240b();
                                                Float fMo27242d2 = aveVar.mo27242d();
                                                String strMo27241c2 = aveVar.mo27241c();
                                                e2f1Var.getClass();
                                                if (Build.VERSION.SDK_INT >= 36) {
                                                    zM88271j = false;
                                                } else {
                                                    zM88271j = false;
                                                }
                                                fingerprint8 = fingerprint7;
                                                fingerprint8.lpt2(new DeviceProperties(boolValueOf, boolValueOf2, boolValueOf3, str13, bool2, boolValueOf5, boolValueOf12, boolValueOf13, boolValueOf14, boolValueOf15, biometricProperties2, boolValueOf17, string, (Boolean) null, boolValueOf4, fMo27239a2, numMo27243f2, fMo27240b2, fMo27242d2, strMo27241c2, Boolean.valueOf(zM88271j), 8192, (DefaultConstructorMarker) null));
                                                kueVar.f126529a = m5pVar3;
                                                kueVar.f126530b = dveVar;
                                                fingerprint9 = fingerprint6;
                                                kueVar.f126531c = fingerprint9;
                                                kueVar.f126532d = fingerprint8;
                                                kueVar.f126533e = vueVar3;
                                                kueVar.f126534f = telephonyManager2;
                                                kueVar.f126535g = fingerprint8;
                                                kueVar.f126536h = z5;
                                                long j9 = j3;
                                                kueVar.f126538t = j9;
                                                kueVar.f126526X = i3;
                                                kueVar.f126527Y = i;
                                                kueVar.f126537i = z4;
                                                kueVar.f126528Z = i6;
                                                kueVar.f126525N0 = 2;
                                                objM37092m = dveVar.m37092m(j9, kueVar);
                                                if (objM37092m == yukVar) {
                                                    return yukVar;
                                                }
                                                dveVar2 = dveVar;
                                                fingerprint10 = fingerprint9;
                                                fingerprint11 = fingerprint8;
                                                fingerprint12 = fingerprint11;
                                                fingerprint11.lpt2((Connectivity) objM37092m);
                                                fingerprint12.lpt2(Permissions.INSTANCE.lpt2(dveVar2.f53431a));
                                                return fingerprint10;
                                            }
                                            string = Settings.Secure.getString(context.getContentResolver(), "default_input_method");
                                        } catch (Exception unused) {
                                            string = null;
                                        }
                                        c06 c06Var3 = new c06(new vc3(context3));
                                        if (Build.VERSION.SDK_INT >= 30) {
                                            z10 = false;
                                        } else {
                                            z10 = false;
                                        }
                                    } catch (Exception unused2) {
                                    }
                                    if (Settings.Global.getInt(context.getContentResolver(), "adb_enabled", 0) == 0) {
                                        z8 = false;
                                    } else {
                                        z8 = true;
                                    }
                                } catch (Exception unused3) {
                                }
                                boolValueOf4 = Boolean.valueOf(((KeyguardManager) context.getSystemService("keyguard")).isKeyguardSecure());
                            } catch (Exception unused4) {
                                boolValueOf4 = null;
                            }
                        } catch (Exception e41) {
                            e = e41;
                            fingerprint6 = fingerprint15;
                            fingerprint7 = fingerprint;
                            String str22 = y2f1.f268606c;
                            String strM38564m6 = edb.m38564m("Code Integrity check threw an error: ", e.getMessage());
                            utu0 utu0Var28 = gk71.f80747a;
                            utu0Var28.m83940H(str22);
                            utu0Var28.m83952u(strM38564m6, new Object[0]);
                            z7 = false;
                            Boolean boolValueOf18 = Boolean.valueOf(z7);
                            i8 = Build.VERSION.SDK_INT;
                            if (i8 >= 26) {
                                e2f1Var.getClass();
                                if (i8 >= 26) {
                                    zCanRequestPackageInstalls = false;
                                } else {
                                    zCanRequestPackageInstalls = false;
                                }
                            } else if (Settings.Secure.getInt(context.getContentResolver(), "install_non_market_apps") == 1) {
                                zCanRequestPackageInstalls = true;
                            } else {
                                zCanRequestPackageInstalls = false;
                            }
                            Boolean boolValueOf19 = Boolean.valueOf(zCanRequestPackageInstalls);
                            if (Settings.Global.getInt(context.getContentResolver(), "adb_enabled", 0) == 0) {
                                z8 = false;
                            } else {
                                z8 = true;
                            }
                            Boolean boolValueOf110 = Boolean.valueOf(z8);
                            if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) == 0) {
                                z9 = false;
                            } else {
                                z9 = true;
                            }
                            Boolean boolValueOf111 = Boolean.valueOf(z9);
                            b2f1 b2f1Var3 = dveVar.f53438h;
                            b2f1Var3.getClass();
                            Context context4 = b2f1Var3.f22589a;
                            c06 c06Var4 = new c06(new vc3(context4));
                            if (Build.VERSION.SDK_INT >= 30) {
                                z10 = false;
                            } else {
                                z10 = false;
                            }
                            Boolean boolValueOf112 = Boolean.valueOf(z10);
                            arrayList = new ArrayList();
                            i9 = Build.VERSION.SDK_INT;
                            if (i9 >= 30) {
                                arrayList.add("fingerprint");
                            }
                            if (i9 >= 30) {
                                arrayList.add("face");
                            }
                            if (i9 >= 30) {
                                arrayList.add("iris");
                            }
                            if (arrayList.isEmpty()) {
                                arrayList2 = arrayList;
                            } else {
                                arrayList2 = null;
                            }
                            if (arrayList2 != null) {
                                arrayList.add("none");
                            }
                            BiometricProperties biometricProperties3 = new BiometricProperties(boolValueOf112, (String[]) arrayList.toArray(new String[0]));
                            Boolean boolValueOf113 = Boolean.valueOf(UserManager.supportsMultipleUsers());
                            string = Settings.Secure.getString(context.getContentResolver(), "default_input_method");
                            boolValueOf4 = Boolean.valueOf(((KeyguardManager) context.getSystemService("keyguard")).isKeyguardSecure());
                            Float fMo27239a3 = aveVar.mo27239a();
                            Integer numMo27243f3 = aveVar.mo27243f();
                            Float fMo27240b3 = aveVar.mo27240b();
                            Float fMo27242d3 = aveVar.mo27242d();
                            String strMo27241c3 = aveVar.mo27241c();
                            e2f1Var.getClass();
                            if (Build.VERSION.SDK_INT >= 36) {
                                zM88271j = false;
                            } else {
                                zM88271j = false;
                            }
                            fingerprint8 = fingerprint7;
                            fingerprint8.lpt2(new DeviceProperties(boolValueOf, boolValueOf2, boolValueOf3, str13, bool2, boolValueOf5, boolValueOf18, boolValueOf19, boolValueOf110, boolValueOf111, biometricProperties3, boolValueOf113, string, (Boolean) null, boolValueOf4, fMo27239a3, numMo27243f3, fMo27240b3, fMo27242d3, strMo27241c3, Boolean.valueOf(zM88271j), 8192, (DefaultConstructorMarker) null));
                            kueVar.f126529a = m5pVar3;
                            kueVar.f126530b = dveVar;
                            fingerprint9 = fingerprint6;
                            kueVar.f126531c = fingerprint9;
                            kueVar.f126532d = fingerprint8;
                            kueVar.f126533e = vueVar3;
                            kueVar.f126534f = telephonyManager2;
                            kueVar.f126535g = fingerprint8;
                            kueVar.f126536h = z5;
                            long j10 = j3;
                            kueVar.f126538t = j10;
                            kueVar.f126526X = i3;
                            kueVar.f126527Y = i;
                            kueVar.f126537i = z4;
                            kueVar.f126528Z = i6;
                            kueVar.f126525N0 = 2;
                            objM37092m = dveVar.m37092m(j10, kueVar);
                            if (objM37092m == yukVar) {
                                return yukVar;
                            }
                            dveVar2 = dveVar;
                            fingerprint10 = fingerprint9;
                            fingerprint11 = fingerprint8;
                            fingerprint12 = fingerprint11;
                            fingerprint11.lpt2((Connectivity) objM37092m);
                            fingerprint12.lpt2(Permissions.INSTANCE.lpt2(dveVar2.f53431a));
                            return fingerprint10;
                        }
                    } catch (Exception e42) {
                        e = e42;
                        vueVar3 = vueVar2;
                        m5pVar3 = m5pVar2;
                    }
                } catch (Exception e43) {
                    e = e43;
                    vueVar3 = vueVar2;
                    m5pVar3 = m5pVar2;
                    fingerprint6 = fingerprint2;
                    telephonyManager2 = telephonyManager;
                }
                if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) == 0) {
                    z9 = false;
                } else {
                    z9 = true;
                }
            } catch (Exception unused5) {
            }
            Boolean boolValueOf114 = Boolean.valueOf(z7);
            i8 = Build.VERSION.SDK_INT;
            if (i8 >= 26) {
                e2f1Var.getClass();
                if (i8 >= 26) {
                    zCanRequestPackageInstalls = false;
                } else {
                    zCanRequestPackageInstalls = false;
                }
            } else if (Settings.Secure.getInt(context.getContentResolver(), "install_non_market_apps") == 1) {
                zCanRequestPackageInstalls = true;
            } else {
                zCanRequestPackageInstalls = false;
            }
            Boolean boolValueOf115 = Boolean.valueOf(zCanRequestPackageInstalls);
            Boolean boolValueOf116 = Boolean.valueOf(z8);
            Boolean boolValueOf117 = Boolean.valueOf(z9);
            b2f1 b2f1Var4 = dveVar.f53438h;
            b2f1Var4.getClass();
            Context context5 = b2f1Var4.f22589a;
            Boolean boolValueOf118 = Boolean.valueOf(z10);
            arrayList = new ArrayList();
            i9 = Build.VERSION.SDK_INT;
            if (i9 >= 30) {
                arrayList.add("fingerprint");
            }
            if (i9 >= 30) {
                arrayList.add("face");
            }
            if (i9 >= 30) {
                arrayList.add("iris");
            }
            if (arrayList.isEmpty()) {
                arrayList2 = arrayList;
            } else {
                arrayList2 = null;
            }
            if (arrayList2 != null) {
                arrayList.add("none");
            }
            BiometricProperties biometricProperties4 = new BiometricProperties(boolValueOf118, (String[]) arrayList.toArray(new String[0]));
            Boolean boolValueOf119 = Boolean.valueOf(UserManager.supportsMultipleUsers());
            Float fMo27239a4 = aveVar.mo27239a();
            Integer numMo27243f4 = aveVar.mo27243f();
            Float fMo27240b4 = aveVar.mo27240b();
            Float fMo27242d4 = aveVar.mo27242d();
            String strMo27241c4 = aveVar.mo27241c();
            e2f1Var.getClass();
            if (Build.VERSION.SDK_INT >= 36) {
                zM88271j = false;
            } else {
                zM88271j = false;
            }
            fingerprint8 = fingerprint7;
            fingerprint8.lpt2(new DeviceProperties(boolValueOf, boolValueOf2, boolValueOf3, str13, bool2, boolValueOf5, boolValueOf114, boolValueOf115, boolValueOf116, boolValueOf117, biometricProperties4, boolValueOf119, string, (Boolean) null, boolValueOf4, fMo27239a4, numMo27243f4, fMo27240b4, fMo27242d4, strMo27241c4, Boolean.valueOf(zM88271j), 8192, (DefaultConstructorMarker) null));
            kueVar.f126529a = m5pVar3;
            kueVar.f126530b = dveVar;
            fingerprint9 = fingerprint6;
            kueVar.f126531c = fingerprint9;
            kueVar.f126532d = fingerprint8;
            kueVar.f126533e = vueVar3;
            kueVar.f126534f = telephonyManager2;
            kueVar.f126535g = fingerprint8;
            kueVar.f126536h = z5;
            long j11 = j3;
            kueVar.f126538t = j11;
            kueVar.f126526X = i3;
            kueVar.f126527Y = i;
            kueVar.f126537i = z4;
            kueVar.f126528Z = i6;
            kueVar.f126525N0 = 2;
            objM37092m = dveVar.m37092m(j11, kueVar);
            if (objM37092m == yukVar) {
                return yukVar;
            }
            dveVar2 = dveVar;
            fingerprint10 = fingerprint9;
            fingerprint11 = fingerprint8;
            fingerprint12 = fingerprint11;
        }
        location = (com.ravelin.core.model.Location) objM37093n;
        Fingerprint fingerprint16 = fingerprint4;
        i = i5;
        fingerprint2 = fingerprint;
        fingerprint = fingerprint16;
        vueVar2 = vueVar;
        i2 = i4;
        m5pVar2 = m5pVar4;
        fingerprint3 = fingerprint5;
        fingerprint3.lpt2(location);
        xd70Var = dveVar.f53432b;
        zkk0 zkk0Var2 = dveVar.f53434d;
        vue vueVar5 = dveVar.f53435e;
        context = dveVar.f53431a;
        i6 = i2;
        str = f53430j;
        if (timeZone != null) {
            id = timeZone.getID();
        } else {
            id = null;
        }
        z4 = z2;
        int rawOffset6 = new GregorianCalendar().getTimeZone().getRawOffset();
        fingerprint.lpt2(new TimezoneInfo(numValueOf, displayName, numValueOf2));
        e2f1Var = (e2f1) vueVar5;
        if (e2f1Var.m37603a(context, "android.hardware.telephony")) {
            telephonyManager = (TelephonyManager) context.getApplicationContext().getSystemService("phone");
        } else {
            telephonyManager = null;
        }
        boolM37088i = null;
        fingerprint.lpt2(new CarrierInfo(str4, str5, str3, str6, boolM37088i));
        if (telephonyManager != null) {
            strM37086g = dveVar.m37086g(vueVar2, telephonyManager);
            strM37083p = m37083p(telephonyManager);
            strM37091l = dveVar.m37091l(vueVar2, telephonyManager);
            strM37087h = dveVar.m37087h(vueVar2, telephonyManager);
            strM37090k = dveVar.m37090k(context, telephonyManager);
            str7 = strM37086g;
            str8 = strM37083p;
            str9 = strM37091l;
            str10 = strM37087h;
        } else {
            str7 = null;
            strM37090k = null;
            str9 = null;
            str10 = null;
            str8 = null;
        }
        fingerprint.lpt2(new NetworkInfo(str7, strM37090k, str9, str10, str8));
        DisplayMetrics displayMetrics1111 = context.getResources().getDisplayMetrics();
        fingerprint.lpt2(new ScreenInfo(displayMetrics1111.densityDpi, displayMetrics1111.heightPixels, displayMetrics1111.widthPixels));
        nve nveVar1111 = (nve) zkk0Var2;
        nveVar1111.getClass();
        DeviceId.Companion coM1114 = DeviceId.INSTANCE;
        fingerprint.lpt2(new DeviceInfo(coM1114.Lpt5().getBluetoothMAC(), coM1114.Lpt5().getWiFiMAC(), coM1114.Lpt5().getImei(), coM1114.Lpt5().getImsi(), coM1114.Lpt5().getAndroidId(), coM1114.Lpt5().getMediaDrmId()));
        fingerprint.Com8(Locale.getDefault().toLanguageTag());
        fingerprint.Lpt5(Locale.getDefault().getCountry());
        fingerprint.lpt2(context.getPackageName());
        nveVar1111.getClass();
        strCON = coM1114.Lpt5().getDeviceIdProvider();
        if (wj50.m88271j(strCON, context.getPackageName())) {
            strCON = "self provider";
        } else {
            strCON = "self provider";
        }
        fingerprint.COM7(strCON);
        String str11111111115 = Build.MANUFACTURER;
        fingerprint.cON(str11111111115);
        String str11111111116 = Build.MODEL;
        fingerprint.LPT3(str11111111116);
        fingerprint.COM5(String.valueOf(Build.VERSION.SDK_INT));
        aveVar = dveVar.f53439i;
        y2f1Var = (y2f1) dveVar.f53433c;
        y2f1Var.getClass();
        str11 = Build.FINGERPRINT;
        if (!bm51.m29803n0(str11, "generic", false)) {
            z5 = z3;
            z6 = true;
        } else {
            z5 = z3;
            z6 = true;
        }
        String str11111111117 = y2f1.f268606c;
        utu0 utu0Var1113 = gk71.f80747a;
        utu0Var1113.m83940H(str11111111117);
        utu0Var1113.m83952u("isProbablyEmulator = " + z6, new Object[0]);
        boolValueOf = Boolean.valueOf(z6);
        boolValueOf3 = Boolean.valueOf(Debug.isDebuggerConnected());
        strM92703a = y2f1.m92703a(context);
        if (strM92703a == null) {
            str12 = "non valid source";
        } else {
            iHashCode = strM92703a.hashCode();
            if (iHashCode != -1859733809) {
                if (iHashCode != -1637701853) {
                    if (iHashCode != -1225090538) {
                        if (iHashCode == -1046965711) {
                            str12 = "non valid source";
                        } else {
                            str12 = "non valid source";
                        }
                    } else if (strM92703a.equals("com.sec.android.app.samsungapps")) {
                        str12 = "non valid source";
                    } else {
                        str12 = "Samsung Galaxy Store";
                    }
                } else if (strM92703a.equals("com.huawei.appmarket")) {
                    str12 = "non valid source";
                } else {
                    str12 = "Huawei App Gallery";
                }
            } else if (strM92703a.equals("com.amazon.venezia")) {
                str12 = "non valid source";
            } else {
                str12 = "Amazon Appstore";
            }
        }
        str13 = str12;
        bool2 = Boolean.TRUE;
    }

    /* JADX INFO: renamed from: r */
    public final String m37095r(vue vueVar, TelephonyManager telephonyManager) {
        CharSequence simCarrierIdName;
        CharSequence simCarrierIdName2;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            if (!((e2f1) vueVar).m37603a(this.f53431a, "android.hardware.telephony.subscription") || (simCarrierIdName2 = telephonyManager.getSimCarrierIdName()) == null) {
                return null;
            }
            return simCarrierIdName2.toString();
        }
        if (28 > i || i >= 33 || (simCarrierIdName = telephonyManager.getSimCarrierIdName()) == null) {
            return null;
        }
        return simCarrierIdName.toString();
    }
}
