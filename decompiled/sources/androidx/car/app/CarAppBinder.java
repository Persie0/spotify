package androidx.car.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Binder;
import android.util.Log;
import androidx.car.app.navigation.C0034b;
import androidx.car.app.serialization.BundlerException;
import androidx.car.app.utils.AbstractC0042f;
import com.spotify.base.java.logging.Logger;
import com.spotify.carapplibrary.androidauto.AndroidAutoService;
import com.spotify.music.R;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import p204p.bek0;
import p204p.c8b;
import p204p.d6n0;
import p204p.d8b;
import p204p.daj0;
import p204p.er70;
import p204p.exb;
import p204p.fb80;
import p204p.fxz0;
import p204p.g6f;
import p204p.gb80;
import p204p.h4t0;
import p204p.hv31;
import p204p.l5h1;
import p204p.ll61;
import p204p.lv31;
import p204p.oc80;
import p204p.piy0;
import p204p.pra;
import p204p.q7b;
import p204p.r0j0;
import p204p.r6j0;
import p204p.s571;
import p204p.sew0;
import p204p.sgz;
import p204p.son;
import p204p.t2j0;
import p204p.ta80;
import p204p.v7b;
import p204p.vpj;
import p204p.wj50;
import p204p.x0h1;
import p204p.xiy0;
import p204p.ysm;
import p204p.z4n;
import p204p.zb30;
import p204p.zg71;

/* JADX INFO: loaded from: classes3.dex */
final class CarAppBinder extends ICarApp.Stub {
    private fxz0 mCurrentSession;
    private final SessionInfo mCurrentSessionInfo;
    private HandshakeInfo mHandshakeInfo;
    private zb30 mHostValidator;
    private AbstractServiceC0022i mService;

    public CarAppBinder(AbstractServiceC0022i abstractServiceC0022i, SessionInfo sessionInfo) {
        this.mService = abstractServiceC0022i;
        this.mCurrentSessionInfo = sessionInfo;
    }

    private gb80 getCurrentLifecycle() {
        fxz0 fxz0Var = this.mCurrentSession;
        if (fxz0Var == null) {
            return null;
        }
        return fxz0Var.f74495b;
    }

    private zb30 getHostValidator() {
        if (this.mHostValidator == null) {
            AbstractServiceC0022i abstractServiceC0022i = this.mService;
            Objects.requireNonNull(abstractServiceC0022i);
            Context applicationContext = ((AndroidAutoService) abstractServiceC0022i).getApplicationContext();
            HashMap map = new HashMap();
            String[] stringArray = applicationContext.getResources().getStringArray(R.array.hosts_allowlist);
            if (stringArray == null) {
                throw new IllegalArgumentException("Invalid allowlist res id: 2130903059");
            }
            for (String str : stringArray) {
                String[] strArrSplit = str.split(",", -1);
                if (strArrSplit.length != 2) {
                    throw new IllegalArgumentException(s571.m77251j("Invalid allowed host entry: '", str, "'"));
                }
                String str2 = strArrSplit[1];
                Locale locale = Locale.US;
                String strReplace = str2.toLowerCase(locale).replace(" ", "");
                String strReplace2 = strArrSplit[0].toLowerCase(locale).replace(" ", "");
                Objects.requireNonNull(strReplace);
                Objects.requireNonNull(strReplace2);
                List arrayList = (List) map.get(strReplace);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(strReplace, arrayList);
                }
                arrayList.add(strReplace2);
            }
            this.mHostValidator = new zb30(applicationContext.getPackageManager(), map, false);
        }
        return this.mHostValidator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$getManager$7(String str, IOnDoneCallback iOnDoneCallback) {
        fxz0 fxz0Var = this.mCurrentSession;
        Objects.requireNonNull(fxz0Var);
        C0023j c0023j = fxz0Var.f74496c;
        str.getClass();
        if (str.equals("app")) {
            Objects.requireNonNull(c0023j);
            AbstractC0042f.m249f(iOnDoneCallback, "getManager", ((C0014b) c0023j.m214d(C0014b.class)).f405b);
        } else if (!str.equals(d6n0.f45729b)) {
            AbstractC0042f.m248e(iOnDoneCallback, new InvalidParameterException(str.concat(" is not a valid manager type")), "getManager");
        } else {
            Objects.requireNonNull(c0023j);
            AbstractC0042f.m249f(iOnDoneCallback, "getManager", ((C0034b) c0023j.m214d(C0034b.class)).f463a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object lambda$onAppCreate$0(ICarHost iCarHost, Configuration configuration, Intent intent) {
        piy0 piy0VarM31778e;
        AbstractServiceC0022i abstractServiceC0022i = this.mService;
        Objects.requireNonNull(abstractServiceC0022i);
        fxz0 fxz0Var = this.mCurrentSession;
        String str = null;
        if (fxz0Var == null || fxz0Var.f74495b.f163857d == fb80.f67750a) {
            Objects.requireNonNull(this.mCurrentSessionInfo);
            AndroidAutoService androidAutoService = (AndroidAutoService) abstractServiceC0022i;
            Logger.m3965a("[CAL] onCreateSession called", new Object[0]);
            hv31 hv31Var = androidAutoService.f3275f;
            if (hv31Var == null) {
                wj50.m88260d0("prefs");
                throw null;
            }
            lv31 lv31VarEdit = hv31Var.edit();
            lv31VarEdit.m60048a(q7b.f186059e, true);
            lv31VarEdit.m60054g();
            z4n z4nVar = androidAutoService.f3273d;
            if (z4nVar == null) {
                wj50.m88260d0("sessionSubcomponentFactory");
                throw null;
            }
            fxz0Var = (c8b) ((h4t0) new ysm((son) z4nVar.f279302b, (vpj) z4nVar.f279303c).f275814A).get();
            this.mCurrentSession = fxz0Var;
        }
        HandshakeInfo handshakeInfo = getHandshakeInfo();
        Objects.requireNonNull(handshakeInfo);
        Objects.requireNonNull(abstractServiceC0022i.f431c);
        C0023j c0023j = fxz0Var.f74496c;
        c0023j.getClass();
        c0023j.f436e = handshakeInfo.getHostCarAppApiLevel();
        c0023j.m213c(abstractServiceC0022i, configuration);
        zg71.m96049a();
        C0024k c0024k = c0023j.f433b;
        Objects.requireNonNull(iCarHost);
        c0024k.getClass();
        zg71.m96049a();
        c0024k.m218c();
        c0024k.f437a = iCarHost;
        oc80 oc80Var = fxz0Var.f74495b;
        fb80 fb80Var = oc80Var.f163857d;
        Objects.requireNonNull(c0023j);
        int size = ((xiy0) c0023j.m214d(xiy0.class)).f261965a.size();
        if (fb80Var.m41223a(fb80.f67752c) && size >= 1) {
            Log.isLoggable("CarApp", 3);
            onNewIntentInternal(fxz0Var, intent);
            return null;
        }
        if (Log.isLoggable("CarApp", 3)) {
            Objects.toString(oc80Var.f163857d);
        }
        fxz0Var.m43031b(ta80.ON_CREATE);
        xiy0 xiy0Var = (xiy0) c0023j.m214d(xiy0.class);
        c8b c8bVar = (c8b) fxz0Var;
        Logger.m3965a("[CAL] onCreateScreen " + intent + " root " + c8bVar.m31778e() + " with lifecycle: " + c8bVar.m31778e().f178080b.f163857d, new Object[0]);
        er70 er70Var = c8bVar.f35162f;
        daj0.m35485f(((daj0) er70Var.get()).f47056c, t2j0.f216577a);
        if (g6f.m43725i0(d8b.f46417a, intent.getAction())) {
            daj0 daj0Var = (daj0) er70Var.get();
            daj0Var.f47055b.m91169e((ll61) daj0Var.f47070q.getValue());
            daj0Var.f47056c.m87296g(new r6j0("androidauto/widget", str, 6));
            daj0Var.m35488c();
            piy0VarM31778e = (bek0) daj0Var.f47059f.get();
            r0j0 r0j0Var = r0j0.f194511a;
            piy0VarM31778e.f178082d = "spotify:now-playing-view";
        } else {
            piy0VarM31778e = c8bVar.m31778e();
        }
        xiy0Var.m91169e(piy0VarM31778e);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onAppPause$3() {
        fxz0 fxz0Var = this.mCurrentSession;
        Objects.requireNonNull(fxz0Var);
        fxz0Var.m43031b(ta80.ON_PAUSE);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onAppResume$2() {
        fxz0 fxz0Var = this.mCurrentSession;
        Objects.requireNonNull(fxz0Var);
        fxz0Var.m43031b(ta80.ON_RESUME);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onAppStart$1() {
        fxz0 fxz0Var = this.mCurrentSession;
        Objects.requireNonNull(fxz0Var);
        fxz0Var.m43031b(ta80.ON_START);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onAppStop$4() {
        fxz0 fxz0Var = this.mCurrentSession;
        Objects.requireNonNull(fxz0Var);
        fxz0Var.m43031b(ta80.ON_STOP);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onConfigurationChanged$6(Configuration configuration) {
        fxz0 fxz0Var = this.mCurrentSession;
        Objects.requireNonNull(fxz0Var);
        onConfigurationChangedInternal(fxz0Var, configuration);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onNewIntent$5(Intent intent) {
        fxz0 fxz0Var = this.mCurrentSession;
        Objects.requireNonNull(fxz0Var);
        onNewIntentInternal(fxz0Var, intent);
        return null;
    }

    private void onConfigurationChangedInternal(fxz0 fxz0Var, Configuration configuration) {
        zg71.m96049a();
        if (Log.isLoggable("CarApp", 3)) {
            Objects.toString(configuration);
        }
        C0023j c0023j = fxz0Var.f74496c;
        c0023j.m215e(configuration);
        c0023j.getResources().getConfiguration();
        C0023j c0023j2 = ((c8b) fxz0Var).f74496c;
        Objects.requireNonNull(c0023j2);
        xiy0 xiy0Var = (xiy0) c0023j2.m214d(xiy0.class);
        xiy0Var.getClass();
        piy0 piy0Var = (piy0) g6f.m43743r0(new ArrayList(xiy0Var.f261965a));
        if (piy0Var != null) {
            piy0Var.m70120c();
        }
    }

    private void onNewIntentInternal(fxz0 fxz0Var, Intent intent) {
        zg71.m96049a();
        c8b c8bVar = (c8b) fxz0Var;
        c8bVar.getClass();
        intent.toString();
        if (g6f.m43725i0(d8b.f46417a, intent.getAction())) {
            x0h1.m89578u(l5h1.m58232p(c8bVar.getLifecycle()), null, 0, new v7b(c8bVar, null, 6), 3);
        }
    }

    public void destroy() {
        onDestroyLifecycle();
        this.mCurrentSession = null;
        this.mHostValidator = null;
        this.mHandshakeInfo = null;
        this.mService = null;
    }

    @Override // androidx.car.app.ICarApp
    public void getAppInfo(IOnDoneCallback iOnDoneCallback) {
        try {
            AbstractServiceC0022i abstractServiceC0022i = this.mService;
            Objects.requireNonNull(abstractServiceC0022i);
            if (abstractServiceC0022i.f430b == null) {
                abstractServiceC0022i.f430b = AppInfo.create(abstractServiceC0022i);
            }
            AbstractC0042f.m249f(iOnDoneCallback, "getAppInfo", abstractServiceC0022i.f430b);
        } catch (IllegalArgumentException e) {
            AbstractC0042f.m248e(iOnDoneCallback, e, "getAppInfo");
        }
    }

    public AbstractServiceC0022i getCarAppService() {
        return this.mService;
    }

    public fxz0 getCurrentSession() {
        return this.mCurrentSession;
    }

    public SessionInfo getCurrentSessionInfo() {
        return this.mCurrentSessionInfo;
    }

    public HandshakeInfo getHandshakeInfo() {
        return this.mHandshakeInfo;
    }

    @Override // androidx.car.app.ICarApp
    public int getInterfaceVersion() {
        return 1;
    }

    @Override // androidx.car.app.ICarApp
    public void getManager(final String str, final IOnDoneCallback iOnDoneCallback) {
        zg71.m96050b(new Runnable() { // from class: androidx.car.app.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f422a.lambda$getManager$7(str, iOnDoneCallback);
            }
        });
    }

    @Override // androidx.car.app.ICarApp
    public void onAppCreate(final ICarHost iCarHost, final Intent intent, final Configuration configuration, IOnDoneCallback iOnDoneCallback) {
        if (Log.isLoggable("CarApp", 3)) {
            Objects.toString(intent);
        }
        AbstractC0042f.m245b(iOnDoneCallback, "onAppCreate", new sew0() { // from class: androidx.car.app.e
            @Override // p204p.sew0
            /* JADX INFO: renamed from: b */
            public final Object mo205b() {
                return this.f418a.lambda$onAppCreate$0(iCarHost, configuration, intent);
            }
        });
        Log.isLoggable("CarApp", 3);
    }

    @Override // androidx.car.app.ICarApp
    public void onAppPause(IOnDoneCallback iOnDoneCallback) {
        AbstractC0042f.m246c(getCurrentLifecycle(), iOnDoneCallback, "onAppPause", new C0016d(this, 0));
    }

    @Override // androidx.car.app.ICarApp
    public void onAppResume(IOnDoneCallback iOnDoneCallback) {
        AbstractC0042f.m246c(getCurrentLifecycle(), iOnDoneCallback, "onAppResume", new C0016d(this, 3));
    }

    @Override // androidx.car.app.ICarApp
    public void onAppStart(IOnDoneCallback iOnDoneCallback) {
        AbstractC0042f.m246c(getCurrentLifecycle(), iOnDoneCallback, "onAppStart", new C0016d(this, 1));
    }

    @Override // androidx.car.app.ICarApp
    public void onAppStop(IOnDoneCallback iOnDoneCallback) {
        AbstractC0042f.m246c(getCurrentLifecycle(), iOnDoneCallback, "onAppStop", new C0016d(this, 2));
    }

    public void onAutoDriveEnabled() {
        fxz0 fxz0Var = this.mCurrentSession;
        if (fxz0Var != null) {
            C0023j c0023j = fxz0Var.f74496c;
            Objects.requireNonNull(c0023j);
            ((C0034b) c0023j.m214d(C0034b.class)).getClass();
            zg71.m96049a();
            Log.isLoggable("CarApp.Nav", 3);
        }
    }

    @Override // androidx.car.app.ICarApp
    public void onConfigurationChanged(Configuration configuration, IOnDoneCallback iOnDoneCallback) {
        AbstractC0042f.m246c(getCurrentLifecycle(), iOnDoneCallback, "onConfigurationChanged", new C0015c(this, configuration, 0));
    }

    public void onDestroyLifecycle() {
        fxz0 fxz0Var = this.mCurrentSession;
        if (fxz0Var != null) {
            fxz0Var.m43031b(ta80.ON_DESTROY);
        }
        this.mCurrentSession = null;
    }

    @Override // androidx.car.app.ICarApp
    public void onHandshakeCompleted(pra praVar, IOnDoneCallback iOnDoneCallback) {
        AbstractServiceC0022i abstractServiceC0022i = this.mService;
        Objects.requireNonNull(abstractServiceC0022i);
        try {
            HandshakeInfo handshakeInfo = (HandshakeInfo) praVar.m70706c();
            String hostPackageName = handshakeInfo.getHostPackageName();
            int callingUid = Binder.getCallingUid();
            sgz sgzVar = new sgz(hostPackageName, callingUid);
            if (!getHostValidator().m95817b(sgzVar)) {
                AbstractC0042f.m248e(iOnDoneCallback, new IllegalArgumentException("Unknown host '" + hostPackageName + "', uid:" + callingUid), "onHandshakeCompleted");
                return;
            }
            if (abstractServiceC0022i.f430b == null) {
                abstractServiceC0022i.f430b = AppInfo.create(abstractServiceC0022i);
            }
            AppInfo appInfo = abstractServiceC0022i.f430b;
            int minCarAppApiLevel = appInfo.getMinCarAppApiLevel();
            int latestCarAppApiLevel = appInfo.getLatestCarAppApiLevel();
            int hostCarAppApiLevel = handshakeInfo.getHostCarAppApiLevel();
            if (minCarAppApiLevel > hostCarAppApiLevel) {
                AbstractC0042f.m248e(iOnDoneCallback, new IllegalArgumentException("Host API level (" + hostCarAppApiLevel + ") is less than the app's min API level (" + minCarAppApiLevel + ")"), "onHandshakeCompleted");
                return;
            }
            if (latestCarAppApiLevel >= hostCarAppApiLevel) {
                abstractServiceC0022i.f431c = sgzVar;
                this.mHandshakeInfo = handshakeInfo;
                AbstractC0042f.m249f(iOnDoneCallback, "onHandshakeCompleted", null);
            } else {
                AbstractC0042f.m248e(iOnDoneCallback, new IllegalArgumentException("Host API level (" + hostCarAppApiLevel + ") is greater than the app's max API level (" + latestCarAppApiLevel + ")"), "onHandshakeCompleted");
            }
        } catch (BundlerException e) {
            e = e;
            abstractServiceC0022i.f431c = null;
            AbstractC0042f.m248e(iOnDoneCallback, e, "onHandshakeCompleted");
        } catch (IllegalArgumentException e2) {
            e = e2;
            abstractServiceC0022i.f431c = null;
            AbstractC0042f.m248e(iOnDoneCallback, e, "onHandshakeCompleted");
        }
    }

    @Override // androidx.car.app.ICarApp
    public void onNewIntent(Intent intent, IOnDoneCallback iOnDoneCallback) {
        AbstractC0042f.m246c(getCurrentLifecycle(), iOnDoneCallback, "onNewIntent", new C0015c(this, intent, 1));
    }

    public void setHandshakeInfo(HandshakeInfo handshakeInfo) {
        int hostCarAppApiLevel = handshakeInfo.getHostCarAppApiLevel();
        if (hostCarAppApiLevel < 1 || hostCarAppApiLevel > exb.m40215m()) {
            throw new IllegalArgumentException(s571.m77246e(hostCarAppApiLevel, "Invalid Car App API level received: "));
        }
        this.mHandshakeInfo = handshakeInfo;
    }
}
