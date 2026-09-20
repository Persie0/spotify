package p204p;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import androidx.car.app.model.Alert;
import com.spotify.connect.mediarouteproviderapi.SpotifyMediaRouteProviderService;

/* JADX INFO: loaded from: classes.dex */
public abstract class lmd0 extends Service {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ int f134946f = 0;

    /* JADX INFO: renamed from: a */
    public final Messenger f134947a = new Messenger(new cd5(this));

    /* JADX INFO: renamed from: b */
    public final un6 f134948b = new un6(this, 7);

    /* JADX INFO: renamed from: c */
    public final kmd0 f134949c;

    /* JADX INFO: renamed from: d */
    public dmd0 f134950d;

    /* JADX INFO: renamed from: e */
    public final xpo f134951e;

    static {
        Log.isLoggable("MediaRouteProviderSrv", 3);
    }

    public lmd0() {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f134951e = new hmd0(this);
        } else {
            this.f134951e = new xpo(this);
        }
        this.f134949c = this.f134951e.m91713l();
    }

    /* JADX INFO: renamed from: a */
    public static Bundle m59425a(fmd0 fmd0Var, int i) {
        if (fmd0Var == null) {
            return null;
        }
        zmn0 zmn0Var = new zmn0(fmd0Var);
        zmn0Var.m96468C();
        if (i < 4) {
            zmn0Var.m96469D(false);
        }
        for (tld0 tld0Var : fmd0Var.m42096q()) {
            if (i >= tld0Var.f221451a.getInt("minClientVersion", 1) && i <= tld0Var.f221451a.getInt("maxClientVersion", Alert.DURATION_SHOW_INDEFINITELY)) {
                zmn0Var.m96477j(tld0Var);
            }
        }
        return zmn0Var.m96481n().m42091i();
    }

    /* JADX INFO: renamed from: c */
    public static void m59426c(Messenger messenger, int i) {
        if (i != 0) {
            m59427d(messenger, 1, i, 0, null, null);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m59427d(Messenger messenger, int i, int i2, int i3, Bundle bundle, Bundle bundle2) {
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.arg1 = i2;
        messageObtain.arg2 = i3;
        messageObtain.obj = bundle;
        messageObtain.setData(bundle2);
        try {
            messenger.send(messageObtain);
        } catch (DeadObjectException unused) {
        } catch (RemoteException unused2) {
            messenger.getBinder().toString();
        }
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        this.f134951e.mo47965a(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m59428b() {
        if (this.f134950d == null) {
            SpotifyMediaRouteProviderService spotifyMediaRouteProviderService = (SpotifyMediaRouteProviderService) this;
            vac vacVar = spotifyMediaRouteProviderService.f3433g;
            dmd0 dmd0VarM40445a = null;
            if (vacVar == null) {
                wj50.m88260d0("castIntegrationModeState");
                throw null;
            }
            if (((kzl0) vacVar).m57761b()) {
                nmd0 nmd0Var = spotifyMediaRouteProviderService.f3435i;
                if (nmd0Var == null) {
                    wj50.m88260d0("servicePlugins");
                    throw null;
                }
                nmd0Var.m64812a();
                f0a f0aVar = spotifyMediaRouteProviderService.f3434h;
                if (f0aVar == null) {
                    wj50.m88260d0("mediaRouteProviderFactory");
                    throw null;
                }
                dmd0VarM40445a = f0aVar.m40445a();
                spotifyMediaRouteProviderService.f3436t = dmd0VarM40445a;
            }
            if (dmd0VarM40445a != null) {
                String strM79868b = dmd0VarM40445a.f60888b.m79868b();
                if (strM79868b.equals(getPackageName())) {
                    this.f134950d = dmd0VarM40445a;
                    zmd0.m96426b();
                    dmd0VarM40445a.f60890d = this.f134949c;
                } else {
                    StringBuilder sbM38572u = edb.m38572u("onCreateMediaRouteProvider() returned a provider whose package name does not match the package name of the service.  A media route provider service can only export its own media route providers.  Provider package name: ", strM79868b, ".  Service package name: ");
                    sbM38572u.append(getPackageName());
                    sbM38572u.append(".");
                    throw new IllegalStateException(sbM38572u.toString());
                }
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f134951e.mo47967n(intent);
    }

    @Override // android.app.Service
    public void onDestroy() {
        dmd0 dmd0Var = this.f134950d;
        if (dmd0Var != null) {
            zmd0.m96426b();
            dmd0Var.f60890d = null;
        }
        this.f134951e.m91715o();
        super.onDestroy();
    }
}
