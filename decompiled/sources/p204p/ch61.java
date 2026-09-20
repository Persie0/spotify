package p204p;

import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class ch61 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37938a;

    /* JADX INFO: renamed from: b */
    public final dh61 f37939b;

    public /* synthetic */ ch61(dh61 dh61Var, int i) {
        this.f37938a = i;
        this.f37939b = dh61Var;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x007b A[Catch: all -> 0x0039, TryCatch #5 {all -> 0x0039, blocks: (B:6:0x0015, B:8:0x0019, B:10:0x0035, B:13:0x003b, B:14:0x0042, B:15:0x0043, B:16:0x004b, B:20:0x0055, B:22:0x005d, B:23:0x005f, B:27:0x0069, B:29:0x0074, B:37:0x0086, B:33:0x007a, B:34:0x007b, B:36:0x0083, B:41:0x008a, B:24:0x0060, B:25:0x0066, B:17:0x004c, B:18:0x0052), top: B:72:0x0015, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0083 A[Catch: all -> 0x0039, TryCatch #5 {all -> 0x0039, blocks: (B:6:0x0015, B:8:0x0019, B:10:0x0035, B:13:0x003b, B:14:0x0042, B:15:0x0043, B:16:0x004b, B:20:0x0055, B:22:0x005d, B:23:0x005f, B:27:0x0069, B:29:0x0074, B:37:0x0086, B:33:0x007a, B:34:0x007b, B:36:0x0083, B:41:0x008a, B:24:0x0060, B:25:0x0066, B:17:0x004c, B:18:0x0052), top: B:72:0x0015, inners: #1, #2 }] */
    @Override // java.lang.Runnable
    public final void run() {
        zr20 zr20Var;
        ch61 ch61Var;
        boolean zIsEmpty;
        boolean zIsEmpty2;
        switch (this.f37938a) {
            case 0:
                synchronized (this.f37939b.f48999g) {
                    dh61 dh61Var = this.f37939b;
                    dh61Var.f49000h = (Intent) dh61Var.f48999g.get(0);
                    break;
                }
                Intent intent = this.f37939b.f49000h;
                if (intent != null) {
                    String action = intent.getAction();
                    int intExtra = this.f37939b.f49000h.getIntExtra("KEY_START_ID", 0);
                    gaz gazVarM44190b = gaz.m44190b();
                    int i = dh61.f48992X;
                    Objects.toString(this.f37939b.f49000h);
                    gazVarM44190b.getClass();
                    PowerManager.WakeLock wakeLockM61061a = m7d1.m61061a(this.f37939b.f48993a, action + " (" + intExtra + ")");
                    int i2 = 1;
                    try {
                        try {
                            gaz gazVarM44190b2 = gaz.m44190b();
                            wakeLockM61061a.toString();
                            gazVarM44190b2.getClass();
                            wakeLockM61061a.acquire();
                            dh61 dh61Var2 = this.f37939b;
                            dh61Var2.f48998f.m35649b(dh61Var2.f49000h, intExtra, dh61Var2);
                            gaz gazVarM44190b3 = gaz.m44190b();
                            wakeLockM61061a.toString();
                            gazVarM44190b3.getClass();
                            wakeLockM61061a.release();
                            dh61 dh61Var3 = this.f37939b;
                            zr20Var = dh61Var3.f48994b.f160374d;
                            ch61Var = new ch61(dh61Var3, i2);
                        } catch (Throwable unused) {
                            gaz gazVarM44190b4 = gaz.m44190b();
                            int i3 = dh61.f48992X;
                            gazVarM44190b4.getClass();
                            gaz gazVarM44190b5 = gaz.m44190b();
                            wakeLockM61061a.toString();
                            gazVarM44190b5.getClass();
                            wakeLockM61061a.release();
                            dh61 dh61Var4 = this.f37939b;
                            zr20Var = dh61Var4.f48994b.f160374d;
                            ch61Var = new ch61(dh61Var4, i2);
                        }
                        zr20Var.execute(ch61Var);
                        return;
                    } catch (Throwable th) {
                        gaz gazVarM44190b6 = gaz.m44190b();
                        int i4 = dh61.f48992X;
                        wakeLockM61061a.toString();
                        gazVarM44190b6.getClass();
                        wakeLockM61061a.release();
                        dh61 dh61Var5 = this.f37939b;
                        dh61Var5.f48994b.f160374d.execute(new ch61(dh61Var5, i2));
                        throw th;
                    }
                }
                return;
            default:
                dh61 dh61Var6 = this.f37939b;
                gaz.m44190b().getClass();
                dh61.m35994c();
                synchronized (dh61Var6.f48999g) {
                    try {
                        if (dh61Var6.f49000h != null) {
                            gaz gazVarM44190b7 = gaz.m44190b();
                            Objects.toString(dh61Var6.f49000h);
                            gazVarM44190b7.getClass();
                            if (!((Intent) dh61Var6.f48999g.remove(0)).equals(dh61Var6.f49000h)) {
                                throw new IllegalStateException("Dequeue-d command is not the first.");
                            }
                            dh61Var6.f49000h = null;
                        }
                        fc5 fc5Var = dh61Var6.f48994b.f160371a;
                        dcf dcfVar = dh61Var6.f48998f;
                        synchronized (dcfVar.f47546c) {
                            zIsEmpty = dcfVar.f47545b.isEmpty();
                            break;
                        }
                        if (zIsEmpty && dh61Var6.f48999g.isEmpty()) {
                            synchronized (fc5Var.f68008d) {
                                zIsEmpty2 = fc5Var.f68006b.isEmpty();
                                break;
                            }
                            if (zIsEmpty2) {
                                gaz.m44190b().getClass();
                                SystemAlarmService systemAlarmService = dh61Var6.f49001i;
                                if (systemAlarmService != null) {
                                    systemAlarmService.m1163i();
                                }
                            } else if (!dh61Var6.f48999g.isEmpty()) {
                                dh61Var6.m35996d();
                            }
                        } else if (!dh61Var6.f48999g.isEmpty()) {
                            dh61Var6.m35996d();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }
}
