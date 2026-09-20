package androidx.car.app.utils;

import android.os.RemoteException;
import android.util.Log;
import androidx.car.app.HostException;
import androidx.car.app.IOnDoneCallback;
import p204p.feb;
import p204p.gb80;
import p204p.jt4;
import p204p.k9w0;
import p204p.kgd0;
import p204p.mal0;
import p204p.pra;
import p204p.s571;
import p204p.sew0;
import p204p.tew0;
import p204p.zg71;

/* JADX INFO: renamed from: androidx.car.app.utils.f */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0042f {
    /* JADX INFO: renamed from: a */
    public static IOnDoneCallback m244a(final mal0 mal0Var) {
        return new IOnDoneCallback.Stub() { // from class: androidx.car.app.utils.RemoteUtils$1
            @Override // androidx.car.app.IOnDoneCallback
            public int getInterfaceVersion() {
                return 1;
            }

            @Override // androidx.car.app.IOnDoneCallback
            public void onFailure(pra praVar) {
                mal0Var.getClass();
            }

            @Override // androidx.car.app.IOnDoneCallback
            public void onSuccess(pra praVar) {
                mal0Var.getClass();
            }
        };
    }

    /* JADX INFO: renamed from: b */
    public static void m245b(IOnDoneCallback iOnDoneCallback, String str, sew0 sew0Var) {
        zg71.m96050b(new kgd0(iOnDoneCallback, str, sew0Var));
    }

    /* JADX INFO: renamed from: c */
    public static void m246c(gb80 gb80Var, IOnDoneCallback iOnDoneCallback, String str, sew0 sew0Var) {
        zg71.m96050b(new feb(gb80Var, iOnDoneCallback, str, sew0Var, 19));
    }

    /* JADX INFO: renamed from: d */
    public static Object m247d(String str, tew0 tew0Var) {
        try {
            Log.isLoggable("CarApp", 3);
            return tew0Var.call();
        } catch (SecurityException e) {
            throw e;
        } catch (RuntimeException e2) {
            throw new HostException(s571.m77251j("Remote ", str, " call failed"), e2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m248e(IOnDoneCallback iOnDoneCallback, Exception exc, String str) {
        try {
            m247d(str.concat(" onFailure"), new k9w0(iOnDoneCallback, exc, str));
        } catch (RemoteException unused) {
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m249f(IOnDoneCallback iOnDoneCallback, String str, Object obj) {
        try {
            m247d(str.concat(" onSuccess"), new jt4(iOnDoneCallback, obj, str, 22));
        } catch (RemoteException unused) {
        }
    }
}
