package p204p;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class sbr {

    /* JADX INFO: renamed from: a */
    public static final sbr f207564a = new sbr();

    /* JADX INFO: renamed from: b */
    public static final HashMap f207565b = new HashMap();

    /* JADX INFO: renamed from: a */
    public static final void m77748a(String str) {
        Set set = p2l.f173365a;
        if (set.contains(sbr.class)) {
            return;
        }
        try {
            sbr sbrVar = f207564a;
            HashMap map = f207565b;
            if (set.contains(sbrVar)) {
                return;
            }
            try {
                NsdManager.RegistrationListener registrationListener = (NsdManager.RegistrationListener) map.get(str);
                if (registrationListener != null) {
                    try {
                        ((NsdManager) p8y.m69343a().getSystemService("servicediscovery")).unregisterService(registrationListener);
                    } catch (IllegalArgumentException unused) {
                        p8y p8yVar = p8y.f175080a;
                    }
                    map.remove(str);
                }
            } catch (Throwable th) {
                p2l.m68953a(sbrVar, th);
            }
        } catch (Throwable th2) {
            p2l.m68953a(sbr.class, th2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m77749b() {
        if (p2l.f173365a.contains(sbr.class)) {
            return false;
        }
        try {
            lty ltyVarM71023b = pty.m71023b(p8y.m69344b());
            return ltyVarM71023b != null && ltyVarM71023b.f136907c.contains(yw21.f276836c);
        } catch (Throwable th) {
            p2l.m68953a(sbr.class, th);
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m77750c(String str) {
        if (p2l.f173365a.contains(this)) {
            return false;
        }
        try {
            HashMap map = f207565b;
            int i = 1;
            if (map.containsKey(str)) {
                return true;
            }
            p8y p8yVar = p8y.f175080a;
            String str2 = "fbsdk_" + ("android-" + "18.2.3".replace('.', '|')) + '_' + str;
            NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
            nsdServiceInfo.setServiceType("_fb._tcp.");
            nsdServiceInfo.setServiceName(str2);
            nsdServiceInfo.setPort(80);
            NsdManager nsdManager = (NsdManager) p8y.m69343a().getSystemService("servicediscovery");
            tj4 tj4Var = new tj4(i, str2, str);
            map.put(str, tj4Var);
            nsdManager.registerService(nsdServiceInfo, 1, tj4Var);
            return true;
        } catch (Throwable th) {
            p2l.m68953a(this, th);
            return false;
        }
    }
}
