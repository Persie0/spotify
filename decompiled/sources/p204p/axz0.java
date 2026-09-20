package p204p;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.cast.framework.ModuleUnavailableException;

/* JADX INFO: loaded from: classes.dex */
public abstract class axz0 {

    /* JADX INFO: renamed from: b */
    public static final ura0 f21053b = new ura0("Session", null);

    /* JADX INFO: renamed from: a */
    public final ohf1 f21054a;

    public axz0(Context context, String str, String str2) {
        ohf1 ohf1VarM26153j2;
        try {
            ohf1VarM26153j2 = fif1.m41718b(context).m26153j2(str, str2, new wff1(this));
        } catch (RemoteException | ModuleUnavailableException unused) {
            fif1.f69885a.m83849b("Unable to call %s on %s.", "newSessionImpl", ajf1.class.getSimpleName());
            ohf1VarM26153j2 = null;
        }
        this.f21054a = ohf1VarM26153j2;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m27441a() {
        ig31.m50501s("Must be called from the main thread.");
        ohf1 ohf1Var = this.f21054a;
        if (ohf1Var != null) {
            try {
                return ((hhf1) ohf1Var).m47515l2();
            } catch (RemoteException unused) {
                f21053b.m83849b("Unable to call %s on %s.", "isConnected", ohf1.class.getSimpleName());
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final void m27442b(int i) {
        ohf1 ohf1Var = this.f21054a;
        if (ohf1Var == null) {
            return;
        }
        try {
            ((hhf1) ohf1Var).m47519p2(i);
        } catch (RemoteException unused) {
            f21053b.m83849b("Unable to call %s on %s.", "notifySessionEnded", ohf1.class.getSimpleName());
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m27443c() {
        ig31.m50501s("Must be called from the main thread.");
        ohf1 ohf1Var = this.f21054a;
        if (ohf1Var != null) {
            try {
                hhf1 hhf1Var = (hhf1) ohf1Var;
                if (hhf1Var.m47513j2() >= 211100000) {
                    return hhf1Var.m47517n2();
                }
            } catch (RemoteException unused) {
                f21053b.m83849b("Unable to call %s on %s.", "getSessionStartType", ohf1.class.getSimpleName());
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public final tv30 m27444d() {
        ohf1 ohf1Var = this.f21054a;
        if (ohf1Var != null) {
            try {
                return ((hhf1) ohf1Var).m47514k2();
            } catch (RemoteException unused) {
                f21053b.m83849b("Unable to call %s on %s.", "getWrappedObject", ohf1.class.getSimpleName());
            }
        }
        return null;
    }
}
