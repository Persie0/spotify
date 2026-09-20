package p204p;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class nvg1 {

    /* JADX INFO: renamed from: g */
    public static final Object f158892g = new Object();

    /* JADX INFO: renamed from: h */
    public static nvg1 f158893h;

    /* JADX INFO: renamed from: i */
    public static HandlerThread f158894i;

    /* JADX INFO: renamed from: a */
    public final HashMap f158895a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final Context f158896b;

    /* JADX INFO: renamed from: c */
    public volatile ywh0 f158897c;

    /* JADX INFO: renamed from: d */
    public final d0j f158898d;

    /* JADX INFO: renamed from: e */
    public final long f158899e;

    /* JADX INFO: renamed from: f */
    public final long f158900f;

    public nvg1(Context context, Looper looper) {
        g1g1 g1g1Var = new g1g1(this, 1);
        this.f158896b = context.getApplicationContext();
        this.f158897c = new ywh0(looper, g1g1Var, (byte) 0);
        this.f158898d = d0j.m34539a();
        this.f158899e = 5000L;
        this.f158900f = 300000L;
    }

    /* JADX INFO: renamed from: a */
    public final lzi m65742a(dqg1 dqg1Var, twf1 twf1Var, String str) {
        lzi lziVarM30435a;
        HashMap map = this.f158895a;
        synchronized (map) {
            try {
                bsg1 bsg1Var = (bsg1) map.get(dqg1Var);
                if (bsg1Var == null) {
                    bsg1Var = new bsg1(this, dqg1Var);
                    bsg1Var.f30318a.put(twf1Var, twf1Var);
                    lziVarM30435a = bsg1Var.m30435a(str, null);
                    map.put(dqg1Var, bsg1Var);
                } else {
                    this.f158897c.removeMessages(0, dqg1Var);
                    if (bsg1Var.f30318a.containsKey(twf1Var)) {
                        String string = dqg1Var.toString();
                        StringBuilder sb = new StringBuilder(string.length() + 81);
                        sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb.append(string);
                        throw new IllegalStateException(sb.toString());
                    }
                    bsg1Var.f30318a.put(twf1Var, twf1Var);
                    int i = bsg1Var.f30319b;
                    if (i == 1) {
                        twf1Var.onServiceConnected(bsg1Var.f30323f, bsg1Var.f30321d);
                    } else if (i == 2) {
                        lziVarM30435a = bsg1Var.m30435a(str, null);
                    }
                    lziVarM30435a = null;
                }
                if (bsg1Var.f30320c) {
                    return lzi.f138369f;
                }
                if (lziVarM30435a == null) {
                    lziVarM30435a = new lzi(-1, null, null);
                }
                return lziVarM30435a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m65743b(String str, String str2, ServiceConnection serviceConnection, boolean z) {
        dqg1 dqg1Var = new dqg1(str, str2, z);
        ig31.m50507y(serviceConnection, "ServiceConnection must not be null");
        HashMap map = this.f158895a;
        synchronized (map) {
            try {
                bsg1 bsg1Var = (bsg1) map.get(dqg1Var);
                if (bsg1Var == null) {
                    String string = dqg1Var.toString();
                    StringBuilder sb = new StringBuilder(string.length() + 50);
                    sb.append("Nonexistent connection status for service config: ");
                    sb.append(string);
                    throw new IllegalStateException(sb.toString());
                }
                if (!bsg1Var.f30318a.containsKey(serviceConnection)) {
                    String string2 = dqg1Var.toString();
                    StringBuilder sb2 = new StringBuilder(string2.length() + 76);
                    sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb2.append(string2);
                    throw new IllegalStateException(sb2.toString());
                }
                bsg1Var.f30318a.remove(serviceConnection);
                if (bsg1Var.f30318a.isEmpty()) {
                    this.f158897c.sendMessageDelayed(this.f158897c.obtainMessage(0, dqg1Var), this.f158899e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
