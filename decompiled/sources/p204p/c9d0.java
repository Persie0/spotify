package p204p;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.util.Log;
import androidx.media3.session.legacy.MediaSessionManager;
import com.spotify.mediabrowserservice.mediabrowserservice.SpotifyMediaBrowserService;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class c9d0 extends Service {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ int f35464h = 0;

    /* JADX INFO: renamed from: a */
    public ugz f35465a;

    /* JADX INFO: renamed from: b */
    public final mj70 f35466b = new mj70(this, 18);

    /* JADX INFO: renamed from: c */
    public final t8d0 f35467c = new t8d0(this, MediaSessionManager.RemoteUserInfo.LEGACY_CONTROLLER, -1, -1, null);

    /* JADX INFO: renamed from: d */
    public final ArrayList f35468d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final uj5 f35469e = new uj5(0);

    /* JADX INFO: renamed from: f */
    public final un6 f35470f = new un6(this);

    /* JADX INFO: renamed from: g */
    public MediaSessionCompat$Token f35471g;

    static {
        Log.isLoggable("MBServiceCompat", 3);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo13458a(String str, z8d0 z8d0Var, Bundle bundle);

    /* JADX INFO: renamed from: b */
    public final void m31918b(String str, t8d0 t8d0Var, Bundle bundle) {
        r8d0 r8d0Var = new r8d0(this, str, t8d0Var, str, bundle);
        if (bundle == null) {
            ((SpotifyMediaBrowserService) this).mo13458a(str, r8d0Var, Bundle.EMPTY);
        } else {
            mo13458a(str, r8d0Var, bundle);
        }
        if (!r8d0Var.m95579b()) {
            throw new IllegalStateException(dq60.m36618r(new StringBuilder("onLoadChildren must call detach() or sendResult() before returning for package="), t8d0Var.f218061a, " id=", str));
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f35465a.m83077S(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f35465a = new y8d0(this);
        } else if (i >= 26) {
            this.f35465a = new x8d0(this);
        } else {
            this.f35465a = new ugz(this);
        }
        this.f35465a.mo83079U();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f35470f.m83528c();
    }
}
