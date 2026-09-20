package p204p;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.RemoteException;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.google.crypto.tink.shaded.protobuf.C0154c;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.spotify.carapplibrary.app.instrumentation.events.proto.ExternalAccessoryRemoteError;
import com.spotify.core.http.HttpConnectionDelegate;
import com.spotify.core.http.HttpConnectionFactory;
import com.spotify.encoreconsumermobile.layout.headers.BehaviorRetainingAppBarLayout;
import com.spotify.music.R;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableRefCount;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSingleSingle;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTake;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import spotify.your_library.esperanto.proto.YourLibraryContainsRequest;

/* JADX INFO: loaded from: classes10.dex */
public final class i5z implements rdc1, Function, qt8, lbz0, t6l0, cvo0, HttpConnectionFactory, ya6, InstallReferrerStateListener, dn6 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f99058a;

    /* JADX INFO: renamed from: b */
    public final Object f99059b;

    /* JADX INFO: renamed from: c */
    public final Object f99060c;

    public /* synthetic */ i5z(int i, Object obj, Object obj2) {
        this.f99058a = i;
        this.f99059b = obj;
        this.f99060c = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f99058a) {
            case 4:
                qxr0 qxr0Var = (qxr0) obj;
                ArrayList arrayListM43700N0 = g6f.m43700N0(qxr0Var.f193732b, ((qxr0) this.f99059b).f193732b);
                if (!qxr0Var.f193735e) {
                    return Observable.just(qxr0.m74146c(qxr0Var, 0, arrayListM43700N0, null, false, false, 0, 0, 125));
                }
                qxr0 qxr0VarM74146c = qxr0.m74146c(qxr0Var, 0, arrayListM43700N0, null, false, false, 0, 2, 45);
                return ((vxx) this.f99060c).m86691s(qxr0VarM74146c).onErrorResumeNext(new vux(qxr0VarM74146c, 7));
            case 12:
                return new ObservableFromPublisher((Flowable) this.f99059b).map(y8z.f270443f).filter(gaz.f78150f).firstOrError().flatMap(new tey(15, ((l830) obj).f130793c, (vsk) this.f99060c)).toObservable().onErrorResumeNext(q2z.f184753f);
            default:
                if (!((Boolean) obj).booleanValue()) {
                    Observable observableJust = Observable.just(khs0.f122718a);
                    wj50.m88279p(observableJust);
                    return observableJust;
                }
                xq40 xq40Var = (xq40) this.f99059b;
                ses0 ses0Var = (ses0) this.f99060c;
                wj50.m88279p(ses0Var);
                String str = ses0Var.f208385a;
                if (str == null || str.length() == 0) {
                    return i101.m49392b(xq40Var.f264868b, ((lt2) xq40Var.f264869c).m59856c(), null, 30);
                }
                okj0 okj0Var = xq40Var.f264870d;
                String strM48121m = ((hp3) okj0Var.f166383d).m48121m(str);
                tre1 tre1Var = (tre1) okj0Var.f166384e;
                ioe1 ioe1VarM98149q = YourLibraryContainsRequest.m98149q();
                ioe1VarM98149q.m51178q(strM48121m);
                return tre1Var.m81346a((YourLibraryContainsRequest) ioe1VarM98149q.build()).flatMapObservable(new k7q0(22, okj0Var, strM48121m)).onErrorReturnItem(jhs0.f112557a);
        }
    }

    @Override // p204p.qt8
    /* JADX INFO: renamed from: b */
    public j15 mo26895b(xq00 xq00Var) {
        xq00Var.m91771i0(1800142775);
        j15 j15VarM39537a = eo10.m39537a((eo10) this.f99059b, R.string.google_meet_host_in_meeting_chip_message, (lo90) this.f99060c, xq00Var);
        xq00Var.m91788r(false);
        return j15VarM39537a;
    }

    @Override // p204p.lbz0
    /* JADX INFO: renamed from: c */
    public Single mo41414c() {
        FlowableRefCount flowableRefCount = ((jrw) this.f99059b).f115322c;
        flowableRefCount.getClass();
        return new FlowableSingleSingle(new FlowableTake(flowableRefCount)).map(new ae00(this, 5));
    }

    @Override // com.spotify.core.http.HttpConnectionFactory
    public HttpConnectionDelegate createDelegate() {
        return new rg30((z4l0) this.f99059b, (vu81) this.f99060c);
    }

    @Override // p204p.lbz0
    /* JADX INFO: renamed from: d */
    public String mo41415d() {
        throw null;
    }

    @Override // p204p.cvo0
    /* JADX INFO: renamed from: f */
    public boolean mo29657f(yzo0 yzo0Var) {
        ContextTrack contextTrack = (ContextTrack) this.f99059b;
        String str = (String) yzo0Var.f277859a.f128768d.get("track_uid");
        if (str != null) {
            return e72.m38020q(contextTrack, str, gbm.m44256r(yzo0Var)) && ((q6c) ((k730) this.f99060c).f50039a.getTag(R.id.paste_carousel_tag)).f185737a;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // p204p.dn6
    /* JADX INFO: renamed from: g */
    public Single mo25091g(Intent intent, e301 e301Var) {
        cj8 cj8Var = (cj8) this.f99059b;
        return ((z4n) cj8Var.f38520d).m95356R0().observeOn((Scheduler) cj8Var.f38518b).flatMap(new x610((gn80) this.f99060c, intent, cj8Var, 21)).onErrorReturn(kaz.f121006g);
    }

    @Override // p204p.rdc1
    public View getRoot() {
        switch (this.f99058a) {
            case 1:
                return (FrameLayout) this.f99059b;
            case 2:
            default:
                return (ConstraintLayout) this.f99059b;
            case 3:
                return (FrameLayout) this.f99059b;
        }
    }

    @Override // p204p.ya6
    /* JADX INFO: renamed from: h */
    public ab6 mo27675h(y8t y8tVar, Looper looper, za6 za6Var, xa6 xa6Var) {
        return new j440((Context) this.f99059b, y8tVar, za6Var, (uh9) this.f99060c, xa6Var.f259567b);
    }

    /* JADX INFO: renamed from: n */
    public void m49782n(String str, String str2) {
        ((ArrayList) this.f99059b).add(g0b1.m43268j(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
        ((ArrayList) this.f99060c).add(g0b1.m43268j(str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
    }

    /* JADX INFO: renamed from: o */
    public void m49783o(String str, String str2) {
        ((ArrayList) this.f99059b).add(g0b1.m43268j(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
        ((ArrayList) this.f99060c).add(g0b1.m43268j(str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public void onInstallReferrerSetupFinished(int i) {
        InstallReferrerClient installReferrerClient = (InstallReferrerClient) this.f99059b;
        Set set = p2l.f173365a;
        if (set.contains(this)) {
            return;
        }
        try {
            if (i == 0) {
                try {
                    String installReferrer = installReferrerClient.getInstallReferrer().getInstallReferrer();
                    if (installReferrer != null && (wl51.m88496t0(installReferrer, "fb", false) || wl51.m88496t0(installReferrer, "facebook", false))) {
                        ((C2162nf) this.f99060c).getClass();
                        if (!set.contains(n95.class)) {
                            try {
                                p8y.m69343a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("install_referrer", installReferrer).apply();
                            } catch (Throwable th) {
                                p2l.m68953a(n95.class, th);
                            }
                        }
                    }
                    p8y.m69343a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
                } catch (RemoteException | Exception unused) {
                    return;
                }
            } else if (i == 2) {
                p8y.m69343a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
            }
            installReferrerClient.endConnection();
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                p2l.m68953a(this, th3);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public l300 m49784p() {
        return new l300((ArrayList) this.f99059b, (ArrayList) this.f99060c);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: q */
    public Object m49785q(zbf zbfVar, ibk ibkVar) {
        c350 c350Var;
        Object c6x0Var;
        String str;
        String str2;
        if (ibkVar instanceof c350) {
            c350Var = (c350) ibkVar;
            int i = c350Var.f33558d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c350Var.f33558d = i - Integer.MIN_VALUE;
            } else {
                c350Var = new c350(this, ibkVar);
            }
        } else {
            c350Var = new c350(this, ibkVar);
        }
        Object obj = c350Var.f33556b;
        int i2 = c350Var.f33558d;
        w2a1 w2a1Var = w2a1.f247311a;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                u7n u7nVar = (u7n) this.f99059b;
                c350Var.f33555a = zbfVar;
                c350Var.f33558d = 1;
                Object objM82519l = u7nVar.m82519l(zbfVar, c350Var);
                yuk yukVar = yuk.f276404a;
                if (objM82519l == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zbfVar = c350Var.f33555a;
                bga.m29073P(obj);
            }
            c6x0Var = w2a1Var;
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        Throwable thM77348a = s6x0.m77348a(c6x0Var);
        if (thM77348a != null) {
            u6b u6bVar = (u6b) this.f99060c;
            if (zbfVar instanceof tbf) {
                str = "play";
            } else if (zbfVar instanceof vbf) {
                str = ContextTrack.TrackAction.RESUME;
            } else if (zbfVar instanceof sbf) {
                str = ContextTrack.TrackAction.PAUSE;
            } else if (zbfVar instanceof wbf) {
                str = "shuffle_play";
            } else if (zbfVar instanceof xbf) {
                str = "skip_ahead_to";
            } else {
                if (!(zbfVar instanceof ybf)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "toggle_shuffle";
            }
            z650 z650Var = zbfVar.mo77730b().f46380a;
            String strM55263v = k3h1.m55263v(thM77348a);
            qre0 qre0Var = u6bVar.f227256a;
            fwx fwxVarM5543r = ExternalAccessoryRemoteError.m5543r();
            fwxVarM5543r.m42983m(str);
            fwxVarM5543r.m42985r();
            fwxVarM5543r.m42984q(strM55263v);
            if (z650Var != null && (str2 = z650Var.f279709a) != null) {
                fwxVarM5543r.m42986s(str2);
            }
            qre0Var.m73616a((ExternalAccessoryRemoteError) fwxVarM5543r.build());
        }
        return w2a1Var;
    }

    /* JADX INFO: renamed from: r */
    public Object m49786r(fva fvaVar) throws GeneralSecurityException {
        AbstractC2440u5 abstractC2440u5 = (AbstractC2440u5) this.f99059b;
        try {
            AbstractC2205o8 abstractC2205o8Mo57976D = abstractC2440u5.mo57976D(fvaVar);
            Class cls = (Class) this.f99060c;
            if (Void.class.equals(cls)) {
                throw new GeneralSecurityException("Cannot create a primitive for Void");
            }
            abstractC2440u5.mo57977T(abstractC2205o8Mo57976D);
            return abstractC2440u5.m82375s(abstractC2205o8Mo57976D, cls);
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(((Class) abstractC2440u5.f226861b).getName()), e);
        }
    }

    /* JADX INFO: renamed from: s */
    public du60 m49787s(fva fvaVar) throws GeneralSecurityException {
        AbstractC2440u5 abstractC2440u5 = (AbstractC2440u5) this.f99059b;
        try {
            AbstractC1806e9 abstractC1806e9Mo57979y = abstractC2440u5.mo57979y();
            AbstractC2205o8 abstractC2205o8Mo38178t1 = abstractC1806e9Mo57979y.mo38178t1(fvaVar);
            abstractC1806e9Mo57979y.mo38147E1(abstractC2205o8Mo38178t1);
            AbstractC2205o8 abstractC2205o8 = (AbstractC2205o8) abstractC1806e9Mo57979y.mo38154R0(abstractC2205o8Mo38178t1);
            bu60 bu60VarM36905t = du60.m36905t();
            String strMo57978q = abstractC2440u5.mo57978q();
            bu60VarM36905t.m60484d();
            du60.m36901m((du60) bu60VarM36905t.f138791b, strMo57978q);
            try {
                int iMo1800a = abstractC2205o8.mo1800a();
                byte[] bArr = new byte[iMo1800a];
                C0154c c0154c = new C0154c(bArr, iMo1800a);
                abstractC2205o8.mo1801d(c0154c);
                if (c0154c.f2356g - c0154c.f2357h != 0) {
                    throw new IllegalStateException("Did not write as much data as expected.");
                }
                bva bvaVar = new bva(bArr);
                bu60VarM36905t.m60484d();
                du60.m36902n((du60) bu60VarM36905t.f138791b, bvaVar);
                cu60 cu60VarMo57980z = abstractC2440u5.mo57980z();
                bu60VarM36905t.m60484d();
                du60.m36903o((du60) bu60VarM36905t.f138791b, cu60VarMo57980z);
                return (du60) bu60VarM36905t.m60482b();
            } catch (IOException e) {
                throw new RuntimeException(abstractC2205o8.m66413b("ByteString"), e);
            }
        } catch (InvalidProtocolBufferException e2) {
            throw new GeneralSecurityException("Unexpected proto", e2);
        }
    }

    @Override // p204p.t6l0
    /* JADX INFO: renamed from: x */
    public swd1 mo24684x(View view, swd1 swd1Var) {
        int i = swd1Var.f214650a.mo51806g(519).f53849b;
        u12 u12Var = (u12) this.f99059b;
        fn20.m42200d(u12Var, i);
        ((gh00) this.f99060c).invoke(Integer.valueOf(i));
        BehaviorRetainingAppBarLayout behaviorRetainingAppBarLayout = (BehaviorRetainingAppBarLayout) u12Var.f225650d;
        WeakHashMap weakHashMap = mec1.f142677a;
        cec1.m32550n(behaviorRetainingAppBarLayout, null);
        return swd1Var;
    }

    public i5z(kv91 kv91Var) {
        this.f99058a = 27;
        this.f99059b = kv91Var;
        this.f99060c = new ahg0(18);
    }

    public i5z(b5p b5pVar) {
        this.f99058a = 15;
        this.f99059b = b5pVar;
        this.f99060c = jag1.m52819d(lau.f131415a);
    }

    public i5z(ebg0 ebg0Var, scm0 scm0Var, k47 k47Var) {
        this.f99058a = 0;
        this.f99059b = ebg0Var;
        this.f99060c = scm0Var;
    }

    public i5z(h15 h15Var, oh5 oh5Var, gcu0 gcu0Var, Activity activity) {
        this.f99058a = 19;
        this.f99059b = gcu0Var;
        this.f99060c = activity;
    }

    public i5z(FrameLayout frameLayout, FrameLayout frameLayout2, CoordinatorLayout coordinatorLayout, RecyclerView recyclerView) {
        this.f99058a = 3;
        this.f99059b = frameLayout;
        this.f99060c = recyclerView;
    }

    public i5z(AbstractC2440u5 abstractC2440u5, Class cls) {
        this.f99058a = 26;
        if (!((Map) abstractC2440u5.f226862c).keySet().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(edb.m38566o("Given internalKeyMananger ", abstractC2440u5.toString(), " does not support primitive class ", cls.getName()));
        }
        this.f99059b = abstractC2440u5;
        this.f99060c = cls;
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public void onInstallReferrerServiceDisconnected() {
    }

    public i5z() {
        this.f99058a = 2;
        this.f99059b = new ArrayList();
        this.f99060c = new ArrayList();
    }

    public i5z(ArrayList arrayList, ArrayList arrayList2) {
        this.f99058a = 8;
        int size = arrayList.size();
        this.f99059b = new int[size];
        this.f99060c = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.f99059b)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.f99060c)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public i5z(int i, int i2) {
        this.f99058a = 8;
        this.f99059b = new int[]{i, i2};
        this.f99060c = new float[]{0.0f, 1.0f};
    }

    public i5z(int i, int i2, int i3) {
        this.f99058a = 8;
        this.f99059b = new int[]{i, i2, i3};
        this.f99060c = new float[]{0.0f, 0.5f, 1.0f};
    }
}
