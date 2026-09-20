package p204p;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.TrafficStats;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.protobuf.AbstractC0269h;
import com.spotify.familyviewservice.p066v1.GenAlphaManagedSettings;
import com.spotify.familyviewservice.p066v1.TransitionToManagedAccountRequest;
import com.spotify.messages.WhereToPlayClientRecommendationNotDisplayed;
import com.spotify.music.R;
import com.spotify.playbacknative.AudioDriver;
import com.spotify.share.linkgeneration.api.UnshorteningUrlException;
import com.spotify.share.linkgeneration.api.proto.UnshortenUrlRequest;
import com.spotify.share.linkgeneration.api.proto.UnshortenUrlResponse;
import com.spotify.yourupdates.badgingstate.models.BadgingState;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import org.chromium.support_lib_boundary.WebViewStartUpCallbackBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewStartUpResultBoundaryInterface;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes7.dex */
public final class va91 implements Function, j5b1, ant, jcm0, WebViewStartUpCallbackBoundaryInterface, oal0, kdl0, ach1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f239165a;

    /* JADX INFO: renamed from: b */
    public final Object f239166b;

    public /* synthetic */ va91(Object obj, int i) {
        this.f239165a = i;
        this.f239166b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public Object m85033a(String str, ibk ibkVar) throws Exception {
        h5a1 h5a1Var;
        if (ibkVar instanceof h5a1) {
            h5a1Var = (h5a1) ibkVar;
            int i = h5a1Var.f87794c;
            if ((i & Integer.MIN_VALUE) != 0) {
                h5a1Var.f87794c = i - Integer.MIN_VALUE;
            } else {
                h5a1Var = new h5a1(this, ibkVar);
            }
        } else {
            h5a1Var = new h5a1(this, ibkVar);
        }
        Object objM70184b = h5a1Var.f87792a;
        int i2 = h5a1Var.f87794c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM70184b);
                pka1 pka1Var = (pka1) this.f239166b;
                j5a1 j5a1VarM21031p = UnshortenUrlRequest.m21031p();
                j5a1VarM21031p.m52452m(str);
                UnshortenUrlRequest unshortenUrlRequest = (UnshortenUrlRequest) j5a1VarM21031p.build();
                h5a1Var.f87794c = 1;
                objM70184b = pka1Var.m70184b(unshortenUrlRequest, h5a1Var);
                yuk yukVar = yuk.f276404a;
                if (objM70184b == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM70184b);
            }
            return vkf1.m85846L((UnshortenUrlResponse) objM70184b);
        } catch (HttpException e) {
            String strValueOf = String.valueOf(e.f288164a);
            ql80 ql80Var = new ql80(e.f288165b);
            String str2 = (String) (!ql80Var.hasNext() ? null : ql80Var.next());
            String string = str2 != null ? wl51.m88491o1(str2).toString() : null;
            if (string == null) {
                string = "";
            }
            if (string.length() != 0) {
                strValueOf = klh.m56834f(strValueOf, ": ", string);
            }
            throw new UnshorteningUrlException(strValueOf, e);
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        Single singleError;
        boolean z;
        AbstractC1861fi abstractC1861fi;
        int i = this.f239165a;
        boolean z2 = false;
        Object obj2 = this.f239166b;
        switch (i) {
            case 0:
                oa81 oa81Var = (oa81) obj2;
                hb91 hb91Var = (hb91) oa81Var.f163267d;
                String str = hb91Var.f89455b;
                d0n0 d0n0Var = hb91Var.f89458e;
                String str2 = hb91Var.f89456c;
                if (str == null || wl51.m88460J0(str) || str2 == null || wl51.m88460J0(str2)) {
                    singleError = Single.error(new IllegalStateException("Unable to create kid account. Missing required data"));
                } else {
                    lzm0 lzm0Var = d0n0Var.f44012a;
                    boolean z3 = lzm0Var instanceof fzm0;
                    kzm0 kzm0Var = kzm0.f128164a;
                    if (z3) {
                        z = ((fzm0) lzm0Var).f75128a;
                    } else {
                        if (!wj50.m88271j(lzm0Var, kzm0Var)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        z = false;
                    }
                    lzm0 lzm0Var2 = d0n0Var.f44013b;
                    if (lzm0Var2 instanceof fzm0) {
                        z2 = ((fzm0) lzm0Var2).f75128a;
                    } else if (!wj50.m88271j(lzm0Var2, kzm0Var)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    boolean z4 = z2;
                    b370 b370Var = hb91Var.f89454a;
                    if (b370Var instanceof z270) {
                        singleError = vjf1.m85770t(dau.f47107a, new cw7(oa81Var, b370Var, z, z4, (fbk) null, 7)).map(axq0.f20958U0);
                    } else {
                        boolean z5 = z;
                        if (b370Var instanceof x270) {
                            zby zbyVar = (zby) oa81Var.f163265b;
                            String str3 = ((x270) b370Var).f257374a;
                            String str4 = hb91Var.f89457d;
                            pb91 pb91VarM10793r = TransitionToManagedAccountRequest.m10793r();
                            pb91VarM10793r.m69518m(str3);
                            if (str4 != null) {
                                int i2 = yd20.f271624a;
                                pb91VarM10793r.m69519q(xd20.f260364a.m93079p(str4, vuc.f244913a).toString());
                            }
                            hz00 hz00VarM10703s = GenAlphaManagedSettings.m10703s();
                            hz00VarM10703s.m49217t(str);
                            hz00VarM10703s.m49216s(str2);
                            hz00VarM10703s.m49214q(z5);
                            hz00VarM10703s.m49215r(z4);
                            pb91VarM10793r.m69520r((GenAlphaManagedSettings) hz00VarM10703s.build());
                            TransitionToManagedAccountRequest transitionToManagedAccountRequest = (TransitionToManagedAccountRequest) pb91VarM10793r.build();
                            acy acyVar = zbyVar.f281417a;
                            wj50.m88279p(transitionToManagedAccountRequest);
                            singleError = acyVar.m25491e(transitionToManagedAccountRequest).map(yby.f271304b);
                        } else {
                            singleError = Single.error(new IllegalStateException("Unexpected flow type: " + b370Var));
                        }
                    }
                }
                return singleError.map(crq0.f41351T0).onErrorReturn(wsq0.f254696T0).toObservable();
            case 8:
                return ((wys0) obj2).get(obj);
            case 11:
                wwc1 wwc1Var = (wwc1) obj;
                n601 n601Var = wwc1Var.f255750b;
                double d = n601Var.f150655a;
                int iM72082M = q3d0.m72082M(((double) AudioDriver.SPOTIFY_MAX_VOLUME) * d);
                String str5 = n601Var.f150657c;
                String str6 = wwc1Var.f255749a;
                return ((bka1) obj2).m29661k(iM72082M, str5, str6).m23308z(new pxc1(d, str6, true)).onErrorReturnItem(new pxc1(d, str6, false)).toObservable();
            case 14:
                nrd1 nrd1Var = (nrd1) obj;
                prd1 prd1Var = (prd1) obj2;
                nrd1Var.toString();
                if (nrd1Var.f157512a) {
                    prd1Var.f180570i = true;
                }
                switch (nrd1Var.ordinal()) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 12:
                        abstractC1861fi = null;
                        break;
                    case 9:
                        abstractC1861fi = wbv0.f249860b;
                        break;
                    case 10:
                        abstractC1861fi = ubv0.f228894b;
                        break;
                    case 11:
                        abstractC1861fi = vbv0.f239587b;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                if (abstractC1861fi != null) {
                    qre0 qre0Var = prd1Var.f180565d.f30335a;
                    lrd1 lrd1VarM14845q = WhereToPlayClientRecommendationNotDisplayed.m14845q();
                    lrd1VarM14845q.m59799q(abstractC1861fi.f69733a);
                    lrd1VarM14845q.m59800r(false);
                    lrd1VarM14845q.m59798m("");
                    AbstractC0269h abstractC0269hBuild = lrd1VarM14845q.build();
                    Objects.toString((WhereToPlayClientRecommendationNotDisplayed) abstractC0269hBuild);
                    qre0Var.m73616a(abstractC0269hBuild);
                }
                return Boolean.valueOf(nrd1Var == nrd1.ALL_CHECKS_CLEAR);
            default:
                fve1 fve1Var = (fve1) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    c97 c97Var = fve1Var.f73775b;
                    Single singleOnErrorResumeNext = ((vxe1) c97Var.f35413b).m86654d().map(new c730(c97Var, 29)).onErrorResumeNext(u6j0.f227365S0);
                    return singleOnErrorResumeNext.toObservable().concatMap(new g2a1(19, fve1Var, singleOnErrorResumeNext));
                }
                fve1Var.f73774a.f84740b.onNext(BadgingState.HIDE_BADGE);
                Observable observableEmpty = Observable.empty();
                wj50.m88279p(observableEmpty);
                return observableEmpty;
        }
    }

    @Override // p204p.j5b1, p204p.g5b1
    /* JADX INFO: renamed from: b */
    public boolean mo42324b() {
        ((dc31) this.f239166b).getClass();
        return false;
    }

    /* JADX INFO: renamed from: c */
    public Bundle m85034c() {
        Bundle bundle = new Bundle();
        wsv0 wsv0Var = (wsv0) this.f239166b;
        if (!wsv0Var.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            int i = wsv0Var.f254765d;
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(((j1g1) wsv0Var.get(i2)).mo25051a());
            }
            bundle.putParcelableArrayList("A", arrayList);
        }
        return bundle;
    }

    @Override // p204p.g5b1
    /* JADX INFO: renamed from: d */
    public long mo35620d(w05 w05Var, w05 w05Var2, w05 w05Var3) {
        return ((dc31) this.f239166b).mo35620d(w05Var, w05Var2, w05Var3);
    }

    @Override // p204p.g5b1
    /* JADX INFO: renamed from: f */
    public w05 mo35621f(long j, w05 w05Var, w05 w05Var2, w05 w05Var3) {
        return ((dc31) this.f239166b).mo35621f(j, w05Var, w05Var2, w05Var3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public Object m85035g(ldf1 ldf1Var, ibk ibkVar) {
        kng1 kng1Var;
        if (ibkVar instanceof kng1) {
            kng1Var = (kng1) ibkVar;
            int i = kng1Var.f124410c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kng1Var.f124410c = i - Integer.MIN_VALUE;
            } else {
                kng1Var = new kng1(this, ibkVar);
            }
        } else {
            kng1Var = new kng1(this, ibkVar);
        }
        Object objM29663o = kng1Var.f124408a;
        int i2 = kng1Var.f124410c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM29663o);
                TrafficStats.setThreadStatsTag((int) Thread.currentThread().getId());
                bka1 bka1Var = (bka1) this.f239166b;
                kng1Var.f124410c = 1;
                objM29663o = bka1Var.m29663o(ldf1Var, kng1Var);
                yuk yukVar = yuk.f276404a;
                if (objM29663o == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM29663o);
            }
            return ((Boolean) objM29663o).booleanValue() ? Boolean.TRUE : Boolean.FALSE;
        } catch (Exception e) {
            e.getMessage();
            return Boolean.FALSE;
        }
    }

    @Override // p204p.jcm0
    public mwx0 get() {
        return ((ric1) ((yic1) this.f239166b).m93705c(ric1.class)).f199480b;
    }

    @Override // p204p.g5b1
    /* JADX INFO: renamed from: l */
    public w05 mo35623l(w05 w05Var, w05 w05Var2, w05 w05Var3) {
        return ((dc31) this.f239166b).mo35623l(w05Var, w05Var2, w05Var3);
    }

    @Override // p204p.g5b1
    /* JADX INFO: renamed from: m */
    public w05 mo35624m(long j, w05 w05Var, w05 w05Var2, w05 w05Var3) {
        return ((dc31) this.f239166b).mo35624m(j, w05Var, w05Var2, w05Var3);
    }

    @Override // p204p.oal0
    /* JADX INFO: renamed from: o */
    public void mo27479o(Exception exc) {
        Status status = new Status(8, "unknown error", null, null);
        if (exc instanceof ApiException) {
            ApiException apiException = (ApiException) exc;
            status = new Status(apiException.getStatusCode(), apiException.getMessage(), null, null);
        }
        d151 d151Var = (d151) this.f239166b;
        ura0 ura0Var = obc.f163599m;
        d151Var.m1493a(status);
    }

    /* JADX WARN: Failed to calculate best type for var: r8v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v3 ??, new type: android.content.SharedPreferences
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v3 ??, new type: android.content.SharedPreferences
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v3 android.content.SharedPreferences, new type: android.content.SharedPreferences
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.applyResolvedVars(TypeSearch.java:100)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:76)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:119)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    @Override // p204p.kdl0
    public void onSuccess(Object obj) {
        int i;
        SharedPreferences sharedPreferences;
        dyg1 dyg1Var;
        kug1 kug1VarM37340c;
        nac nacVar = (nac) this.f239166b;
        Bundle bundle = (Bundle) obj;
        if (bfg1.f26710k) {
            Context context = nacVar.f152030a;
            bqg1 bqg1Var = nacVar.f152034e;
            bfg1 bfg1Var = new bfg1(context, bqg1Var, nacVar.f152031b, nacVar.f152038i, nacVar.f152035f);
            int i2 = 0;
            int i3 = bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE") ? bundle.getInt("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", 0) : (bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED") && bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", false)) ? 1 : 0;
            boolean z = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED", false);
            boolean z2 = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_ANALYTICS_ENABLED", false);
            bfg1.f26710k = z2;
            if (i3 != 0) {
                i = i3;
            } else if (!z && !z2) {
                return;
            } else {
                i = 0;
            }
            bfg1Var.f26718h = new hpf1(bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_CONSENT_TIMEOUT_SECONDS", 5L), context);
            String packageName = context.getPackageName();
            Locale locale = Locale.ROOT;
            String strM77250i = s571.m77250i(packageName, ".client_cast_analytics_data");
            bfg1Var.f26719i = bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE") != 0 ? 2 : 1;
            id91.m50309b(context);
            bfg1Var.f26717g = id91.m50308a().m50310c(nva.f158847e).m44416a("CAST_SENDER_SDK", new keu("proto"), d5l0.f45462b);
            if (bundle.containsKey("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE")) {
                bfg1Var.f26715e = Long.valueOf(bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE"));
            }
            SharedPreferences sharedPreferences2 = context.getApplicationContext().getSharedPreferences(strM77250i, 0);
            if (i != 0) {
                h9p h9pVarM46874g = h9p.m46874g();
                h9pVarM46874g.f89015c = new red1(15, bqg1Var, new String[]{"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"});
                h9pVarM46874g.f89016d = new gey[]{q0f1.f184005i};
                h9pVarM46874g.f89014b = false;
                h9pVarM46874g.f89013a = 8426;
                sharedPreferences = sharedPreferences2;
                bqg1Var.m80962e(0, h9pVarM46874g.m46881f()).m92993n(new t0h1(bfg1Var, packageName, i, sharedPreferences, 26));
            } else {
                sharedPreferences = sharedPreferences2;
            }
            if (z) {
                ig31.m50506x(sharedPreferences);
                ura0 ura0Var = dyg1.f54339i;
                synchronized (dyg1.class) {
                    try {
                        if (dyg1.f54341k == null) {
                            dyg1.f54341k = new dyg1(sharedPreferences, bfg1Var, packageName);
                        }
                        dyg1Var = dyg1.f54341k;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                String str = dyg1Var.f54344c;
                SharedPreferences sharedPreferences3 = dyg1Var.f54343b;
                HashSet hashSet = dyg1Var.f54347f;
                String string = sharedPreferences3.getString("feature_usage_sdk_version", null);
                String string2 = sharedPreferences3.getString("feature_usage_package_name", null);
                hashSet.clear();
                HashSet hashSet2 = dyg1Var.f54348g;
                hashSet2.clear();
                dyg1Var.f54349h = r14;
                String str2 = dyg1.f54340j;
                if (str2.equals(string) && str.equals(string2)) {
                    dyg1Var.f54349h = sharedPreferences3.getLong("feature_usage_last_report_time", r14);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    HashSet hashSet3 = new HashSet();
                    for (String str3 : sharedPreferences3.getAll().keySet()) {
                        if (str3.startsWith("feature_usage_timestamp_")) {
                            long j = sharedPreferences3.getLong(str3, r14);
                            if (j != 0 && jCurrentTimeMillis - j > 1209600000) {
                                hashSet3.add(str3);
                            } else if (str3.startsWith("feature_usage_timestamp_reported_feature_")) {
                                kug1 kug1VarM37340c2 = dyg1.m37340c(str3.substring(41));
                                if (kug1VarM37340c2 != null) {
                                    hashSet2.add(kug1VarM37340c2);
                                    hashSet.add(kug1VarM37340c2);
                                }
                            } else if (str3.startsWith("feature_usage_timestamp_detected_feature_") && (kug1VarM37340c = dyg1.m37340c(str3.substring(41))) != null) {
                                hashSet.add(kug1VarM37340c);
                            }
                        }
                    }
                    dyg1Var.m37341b(hashSet3);
                    ig31.m50506x(dyg1Var.f54346e);
                    ig31.m50506x(dyg1Var.f54345d);
                    dyg1Var.f54346e.post(dyg1Var.f54345d);
                } else {
                    HashSet hashSet4 = new HashSet();
                    for (String str4 : sharedPreferences3.getAll().keySet()) {
                        if (str4.startsWith("feature_usage_timestamp_")) {
                            hashSet4.add(str4);
                        }
                    }
                    hashSet4.add("feature_usage_last_report_time");
                    dyg1Var.m37341b(hashSet4);
                    sharedPreferences3.edit().putString("feature_usage_sdk_version", str2).putString("feature_usage_package_name", str).apply();
                }
                dyg1.m37339a(kug1.CAST_CONTEXT);
            }
            if (bfg1.f26710k) {
                synchronized (p4h1.class) {
                    if (p4h1.f173943b == null) {
                        p4h1 p4h1Var = new p4h1(i2);
                        new ConcurrentHashMap();
                        p4h1.f173943b = p4h1Var;
                    }
                }
            }
        }
    }

    @Override // p204p.ant
    /* JADX INFO: renamed from: t */
    public void mo25099t(Object obj) {
        pqm0 pqm0Var = (pqm0) obj;
        qob1 qob1Var = (qob1) this.f239166b;
        dpb1 dpb1Var = qob1Var.f190903e;
        ConstraintLayout constraintLayout = dpb1Var.f51257c;
        Context context = constraintLayout.getContext();
        Object obj2 = pqm0Var.f180350a;
        Object obj3 = pqm0Var.f180351b;
        km8 km8Var = (km8) obj2;
        constraintLayout.setBackground(context.getDrawable(km8Var.f124081a));
        int iOrdinal = km8Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            qob1Var.m73389f((String) obj3);
        } else if (((CharSequence) obj3).length() == 0) {
            qob1Var.m73389f(dpb1Var.f51257c.getContext().getResources().getString(R.string.related_music_videos));
        } else {
            qob1Var.m73389f((String) obj3);
        }
    }

    @Override // p204p.ach1
    public boolean zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((ach1[]) this.f239166b)[i].zzb(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // p204p.ach1
    public jch1 zzc(Class cls) {
        for (int i = 0; i < 2; i++) {
            ach1 ach1Var = ((ach1[]) this.f239166b)[i];
            if (ach1Var.zzb(cls)) {
                return ach1Var.zzc(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    public va91(fnq fnqVar) {
        this.f239165a = 18;
        this.f239166b = fnqVar.f71348a.m53150g();
    }

    public va91(er70 er70Var) {
        this.f239165a = 12;
        this.f239166b = ((lwc1) er70Var.get()).mo44584c().scan(new pqm0(null, null), zkq0.f283818X0).map(alq0.f16930X0).filter(mmq0.f145214Y0).map(onq0.f167328W0);
    }

    public va91(ijc1 ijc1Var, w4a0 w4a0Var, up9 up9Var) {
        this.f239165a = 10;
        this.f239166b = new yic1(ijc1Var, new uax0(1, w4a0Var, up9Var));
    }

    public va91(float f, float f2, w05 w05Var) {
        x05 k791Var;
        this.f239165a = 6;
        int[] iArr = h5b1.f87799a;
        if (w05Var != null) {
            k791Var = new d501(f, f2, w05Var);
        } else {
            k791Var = new k791(f, f2);
        }
        this.f239166b = new dc31(k791Var);
    }

    @Override // org.chromium.support_lib_boundary.WebViewStartUpCallbackBoundaryInterface
    public void onSuccess(InvocationHandler invocationHandler) {
        ArrayList arrayList = null;
        WebViewStartUpResultBoundaryInterface webViewStartUpResultBoundaryInterface = (WebViewStartUpResultBoundaryInterface) (invocationHandler == null ? null : WebViewStartUpResultBoundaryInterface.class.cast(Proxy.newProxyInstance(gga.class.getClassLoader(), new Class[]{WebViewStartUpResultBoundaryInterface.class}, invocationHandler)));
        Objects.requireNonNull(webViewStartUpResultBoundaryInterface);
        List<Throwable> blockingStartUpLocations = webViewStartUpResultBoundaryInterface.getBlockingStartUpLocations();
        ArrayList arrayList2 = new ArrayList();
        for (Throwable th : blockingStartUpLocations) {
            arrayList2.add(new cnd1());
        }
        if (mmd1.f145126c.m43518a()) {
            List<Throwable> asyncStartUpLocations = webViewStartUpResultBoundaryInterface.getAsyncStartUpLocations();
            ArrayList arrayList3 = new ArrayList();
            for (Throwable th2 : asyncStartUpLocations) {
                arrayList3.add(new cnd1());
            }
            arrayList = arrayList3;
        }
        ((zga1) this.f239166b).m96052e(new red1(arrayList2, arrayList, webViewStartUpResultBoundaryInterface));
    }
}
