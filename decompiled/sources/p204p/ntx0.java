package p204p;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class ntx0 {

    /* JADX INFO: renamed from: h */
    public static int f158444h;

    /* JADX INFO: renamed from: i */
    public static PendingIntent f158445i;

    /* JADX INFO: renamed from: j */
    public static final Pattern f158446j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* JADX INFO: renamed from: b */
    public final Context f158448b;

    /* JADX INFO: renamed from: c */
    public final p4l0 f158449c;

    /* JADX INFO: renamed from: d */
    public final ScheduledThreadPoolExecutor f158450d;

    /* JADX INFO: renamed from: f */
    public Messenger f158452f;

    /* JADX INFO: renamed from: g */
    public qrf1 f158453g;

    /* JADX INFO: renamed from: a */
    public final ab21 f158447a = new ab21(0);

    /* JADX INFO: renamed from: e */
    public final Messenger f158451e = new Messenger(new s6f1(this, Looper.getMainLooper()));

    public ntx0(Context context) {
        this.f158448b = context;
        this.f158449c = new p4l0(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f158450d = scheduledThreadPoolExecutor;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d2  */
    /* JADX INFO: renamed from: a */
    public final y7h1 m65645a(Bundle bundle) {
        String string;
        synchronized (ntx0.class) {
            int i = f158444h;
            f158444h = i + 1;
            string = Integer.toString(i);
        }
        ev61 ev61Var = new ev61();
        synchronized (this.f158447a) {
            this.f158447a.put(string, ev61Var);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f158449c.m69149v() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context = this.f158448b;
        synchronized (ntx0.class) {
            try {
                if (f158445i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    f158445i = c6f1.m31564a(context, intent2, c6f1.f34529a);
                }
                intent.putExtra("app", f158445i);
            } catch (Throwable th) {
                throw th;
            }
        }
        intent.putExtra("kid", dq60.m36618r(new StringBuilder(String.valueOf(string).length() + 5), "|ID|", string, "|"));
        if (Log.isLoggable("Rpc", 3)) {
            new StringBuilder(String.valueOf(intent.getExtras()).length() + 8);
        }
        intent.putExtra("google.messenger", this.f158451e);
        if (this.f158452f != null || this.f158453g != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                Messenger messenger = this.f158452f;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    this.f158453g.m73617c(messageObtain);
                }
            } catch (RemoteException unused) {
                Log.isLoggable("Rpc", 3);
                if (this.f158449c.m69149v() == 2) {
                    this.f158448b.sendBroadcast(intent);
                } else {
                    this.f158448b.startService(intent);
                }
            }
        } else if (this.f158449c.m69149v() == 2) {
            this.f158448b.sendBroadcast(intent);
        } else {
            this.f158448b.startService(intent);
        }
        ev61Var.f63172a.m92991l(dkr.f50014c, new f7d1(this, string, this.f158450d.schedule(new tof1(1, ev61Var), 30L, TimeUnit.SECONDS)));
        return ev61Var.f63172a;
    }

    /* JADX INFO: renamed from: b */
    public final void m65646b(String str, Bundle bundle) {
        synchronized (this.f158447a) {
            try {
                ev61 ev61Var = (ev61) this.f158447a.remove(str);
                if (ev61Var != null) {
                    ev61Var.m40097b(bundle);
                    return;
                }
                String strValueOf = String.valueOf(str);
                if (strValueOf.length() != 0) {
                    "Missing callback for ".concat(strValueOf);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
