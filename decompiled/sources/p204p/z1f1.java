package p204p;

import android.app.Application;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;

/* JADX INFO: loaded from: classes11.dex */
public final class z1f1 implements tue {

    /* JADX INFO: renamed from: f */
    public static final String f278306f;

    /* JADX INFO: renamed from: a */
    public final Context f278307a;

    /* JADX INFO: renamed from: b */
    public final vue f278308b;

    /* JADX INFO: renamed from: c */
    public NetworkCapabilities f278309c;

    /* JADX INFO: renamed from: d */
    public r1f1 f278310d;

    /* JADX INFO: renamed from: e */
    public final ConnectivityManager f278311e;

    static {
        String canonicalName = ConnectivityManager.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "ConnectivityManager";
        }
        f278306f = canonicalName;
    }

    public z1f1(Application application, vue vueVar) {
        this.f278307a = application;
        this.f278308b = vueVar;
        this.f278311e = (ConnectivityManager) application.getSystemService("connectivity");
    }

    /* JADX INFO: renamed from: d */
    public static final w2a1 m95105d(z1f1 z1f1Var, NetworkCapabilities networkCapabilities, hqb hqbVar) {
        boolean zIsActive = hqbVar.isActive();
        Boolean boolValueOf = Boolean.valueOf(zIsActive);
        String str = null;
        if (!zIsActive) {
            boolValueOf = null;
        }
        if (boolValueOf == null) {
            return null;
        }
        if (networkCapabilities.hasTransport(2)) {
            str = "bluetooth";
        } else if (networkCapabilities.hasTransport(0)) {
            str = "cellular";
        } else if (networkCapabilities.hasTransport(3)) {
            str = "ethernet";
        } else if (networkCapabilities.hasTransport(6)) {
            str = "lowpan";
        } else if (networkCapabilities.hasTransport(8)) {
            str = "usb";
        } else if (networkCapabilities.hasTransport(4)) {
            str = "vpn";
        } else if (networkCapabilities.hasTransport(1)) {
            str = "wifi";
        } else if (networkCapabilities.hasTransport(5)) {
            str = "wifiAware";
        }
        z1f1Var.m95106b();
        hqbVar.resumeWith(str);
        return w2a1.f247311a;
    }

    /* JADX INFO: renamed from: b */
    public final void m95106b() {
        r1f1 r1f1Var = this.f278310d;
        if (r1f1Var != null) {
            try {
                try {
                    this.f278311e.unregisterNetworkCallback(r1f1Var);
                } catch (IllegalArgumentException unused) {
                    String str = f278306f;
                    utu0 utu0Var = gk71.f80747a;
                    utu0Var.m83940H(str);
                    utu0Var.m83952u("Callback was already unregistered", new Object[0]);
                }
            } finally {
                this.f278310d = null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002c  */
    /* JADX INFO: renamed from: c */
    public final Object m95107c(C2069kx c2069kx) {
        r1f1 r1f1Var;
        hqb hqbVar = new hqb(1, seg1.m77914f(c2069kx));
        hqbVar.m48222q();
        boolean zIsActive = hqbVar.isActive();
        Boolean boolValueOf = Boolean.valueOf(zIsActive);
        if (!zIsActive) {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            if (this.f278310d == null) {
                this.f278310d = null;
                this.f278310d = new r1f1(this, hqbVar);
                System.currentTimeMillis();
                ((e2f1) this.f278308b).getClass();
                if (lzj.m60353c(this.f278307a, "android.permission.ACCESS_NETWORK_STATE") == 0 || (r1f1Var = this.f278310d) == null) {
                    hqbVar.resumeWith(null);
                } else {
                    this.f278311e.registerDefaultNetworkCallback(r1f1Var);
                }
            } else {
                NetworkCapabilities networkCapabilities = this.f278309c;
                if ((networkCapabilities != null ? m95105d(this, networkCapabilities, hqbVar) : null) == null) {
                    this.f278310d = null;
                    this.f278310d = new r1f1(this, hqbVar);
                    System.currentTimeMillis();
                    ((e2f1) this.f278308b).getClass();
                    if (lzj.m60353c(this.f278307a, "android.permission.ACCESS_NETWORK_STATE") == 0) {
                        hqbVar.resumeWith(null);
                    } else {
                        hqbVar.resumeWith(null);
                    }
                }
            }
        }
        hqbVar.mo42415l(new b8i(this, 6));
        return hqbVar.m48221p();
    }
}
