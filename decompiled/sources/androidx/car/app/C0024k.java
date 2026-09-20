package androidx.car.app;

import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import androidx.car.app.constraints.IConstraintHost;
import androidx.car.app.media.IMediaPlaybackHost;
import androidx.car.app.navigation.INavigationHost;
import androidx.car.app.suggestion.ISuggestionHost;
import java.security.InvalidParameterException;
import java.util.Objects;
import p204p.d6n0;
import p204p.db30;
import p204p.zg71;

/* JADX INFO: renamed from: androidx.car.app.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C0024k {

    /* JADX INFO: renamed from: a */
    public ICarHost f437a;

    /* JADX INFO: renamed from: b */
    public IAppHost f438b;

    /* JADX INFO: renamed from: c */
    public IConstraintHost f439c;

    /* JADX INFO: renamed from: d */
    public INavigationHost f440d;

    /* JADX INFO: renamed from: e */
    public ISuggestionHost f441e;

    /* JADX INFO: renamed from: f */
    public IMediaPlaybackHost f442f;

    /* JADX INFO: renamed from: a */
    public final void m216a(String str, String str2, db30 db30Var) {
        try {
            try {
                try {
                    Log.isLoggable("CarApp", 3);
                    IInterface iInterfaceM217b = m217b(str);
                    if (iInterfaceM217b == null) {
                        return;
                    }
                    db30Var.mo35521h(iInterfaceM217b);
                } catch (SecurityException e) {
                    throw e;
                }
            } catch (RuntimeException e2) {
                throw new HostException("Remote " + str2 + " call failed", e2);
            }
        } catch (RemoteException unused) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: b */
    public final IInterface m217b(String str) {
        if (this.f437a == null) {
            return null;
        }
        try {
            switch (str.hashCode()) {
                case -1606703562:
                    if (str.equals("constraints")) {
                        if (this.f439c == null) {
                            try {
                                Log.isLoggable("CarApp", 3);
                                ICarHost iCarHost = this.f437a;
                                Objects.requireNonNull(iCarHost);
                                this.f439c = IConstraintHost.Stub.asInterface(iCarHost.getHost("constraints"));
                            } catch (SecurityException e) {
                                throw e;
                            } catch (RuntimeException e2) {
                                throw new HostException("Remote getHost(Constraints) call failed", e2);
                            }
                        }
                        return this.f439c;
                    }
                    throw new InvalidParameterException("Invalid host type: ".concat(str));
                case 96801:
                    if (str.equals("app")) {
                        if (this.f438b == null) {
                            try {
                                try {
                                    Log.isLoggable("CarApp", 3);
                                    ICarHost iCarHost2 = this.f437a;
                                    Objects.requireNonNull(iCarHost2);
                                    this.f438b = IAppHost.Stub.asInterface(iCarHost2.getHost("app"));
                                } catch (RuntimeException e3) {
                                    throw new HostException("Remote getHost(App) call failed", e3);
                                }
                            } catch (SecurityException e4) {
                                throw e4;
                            }
                        }
                        return this.f438b;
                    }
                    throw new InvalidParameterException("Invalid host type: ".concat(str));
                case 98260:
                    if (str.equals("car")) {
                        return this.f437a;
                    }
                    throw new InvalidParameterException("Invalid host type: ".concat(str));
                case 1197722116:
                    if (str.equals("suggestion")) {
                        if (this.f441e == null) {
                            try {
                                Log.isLoggable("CarApp", 3);
                                ICarHost iCarHost3 = this.f437a;
                                Objects.requireNonNull(iCarHost3);
                                this.f441e = ISuggestionHost.Stub.asInterface(iCarHost3.getHost("suggestion"));
                            } catch (SecurityException e5) {
                                throw e5;
                            } catch (RuntimeException e6) {
                                throw new HostException("Remote getHost(Suggestion) call failed", e6);
                            }
                        }
                        return this.f441e;
                    }
                    throw new InvalidParameterException("Invalid host type: ".concat(str));
                case 1569536022:
                    if (str.equals("media_playback")) {
                        if (this.f442f == null) {
                            try {
                                Log.isLoggable("CarApp", 3);
                                ICarHost iCarHost4 = this.f437a;
                                Objects.requireNonNull(iCarHost4);
                                this.f442f = IMediaPlaybackHost.Stub.asInterface(iCarHost4.getHost("media_playback"));
                            } catch (SecurityException e7) {
                                throw e7;
                            } catch (RuntimeException e8) {
                                throw new HostException("Remote getHost(Media) call failed", e8);
                            }
                        }
                        return this.f442f;
                    }
                    throw new InvalidParameterException("Invalid host type: ".concat(str));
                case 1862666772:
                    if (str.equals(d6n0.f45729b)) {
                        if (this.f440d == null) {
                            try {
                                Log.isLoggable("CarApp", 3);
                                ICarHost iCarHost5 = this.f437a;
                                Objects.requireNonNull(iCarHost5);
                                this.f440d = INavigationHost.Stub.asInterface(iCarHost5.getHost(d6n0.f45729b));
                            } catch (SecurityException e9) {
                                throw e9;
                            } catch (RuntimeException e10) {
                                throw new HostException("Remote getHost(Navigation) call failed", e10);
                            }
                        }
                        return this.f440d;
                    }
                    throw new InvalidParameterException("Invalid host type: ".concat(str));
                default:
                    throw new InvalidParameterException("Invalid host type: ".concat(str));
            }
        } catch (HostException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m218c() {
        zg71.m96049a();
        this.f437a = null;
        this.f438b = null;
        this.f440d = null;
    }
}
