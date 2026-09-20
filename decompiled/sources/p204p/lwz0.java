package p204p;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class lwz0 implements jwz0 {

    /* JADX INFO: renamed from: a */
    public final Context f137667a;

    /* JADX INFO: renamed from: b */
    public final NotificationManager f137668b;

    /* JADX INFO: renamed from: c */
    public final g300 f137669c;

    /* JADX INFO: renamed from: d */
    public final xqb f137670d;

    /* JADX INFO: renamed from: e */
    public final ConcurrentHashMap f137671e = new ConcurrentHashMap(1);

    public lwz0(Context context, NotificationManager notificationManager, g300 g300Var, xqb xqbVar) {
        this.f137667a = context;
        this.f137668b = notificationManager;
        this.f137669c = g300Var;
        this.f137670d = xqbVar;
    }

    /* JADX INFO: renamed from: a */
    public final Notification m60133a() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f137668b.createNotificationChannel(new NotificationChannel("external_integration_service_channel", this.f137667a.getString(R.string.foreground_service_notification_channel_title), 2));
        }
        return m60134b(m60135c());
    }

    /* JADX INFO: renamed from: b */
    public final Notification m60134b(ArrayList arrayList) {
        itj0 itj0Var = new itj0(1);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str != null) {
                ((ArrayList) itj0Var.f105612f).add(ktj0.m57322d(str));
            }
        }
        Context context = this.f137667a;
        ktj0 ktj0Var = new ktj0(context, "external_integration_service_channel");
        ktj0Var.f126314e = ktj0.m57322d(context.getString(R.string.foreground_service_notification_title));
        ktj0Var.f126307D.icon = R.drawable.icn_notification;
        ktj0Var.m57338q(itj0Var);
        return ktj0Var.m57325c();
    }

    /* JADX INFO: renamed from: c */
    public final ArrayList m60135c() {
        ArrayList arrayList = new ArrayList(1);
        for (String str : this.f137671e.values()) {
            if (!"foreground-service-empty-notification-message".equals(str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m60136d(String str) {
        boolean z = this.f137671e.get(str) != null;
        Logger.m3965a("Is service " + str + " foreground: " + z, new Object[0]);
        return z;
    }

    /* JADX INFO: renamed from: e */
    public final void m60137e(i6o i6oVar, String str, Integer num) {
        if (m60136d(str)) {
            Logger.m3965a("Foreground service (fgsType=" + num + ") already started: " + str, new Object[0]);
            return;
        }
        Logger.m3965a("Starting foreground service (fgsType=" + num + "): " + str, new Object[0]);
        if (Build.VERSION.SDK_INT >= 31) {
            this.f137670d.m91839s(i6oVar, i6oVar.getClass().getSimpleName(), new kwz0(num, i6oVar, this));
        } else {
            i6oVar.startForeground(28, m60133a());
        }
        this.f137669c.f76060a.onNext(0L);
        this.f137671e.put(str, "foreground-service-empty-notification-message");
    }

    /* JADX INFO: renamed from: f */
    public final void m60138f(i6o i6oVar, String str) {
        if (!m60136d(str)) {
            Logger.m3965a("Foreground service already stopped: ".concat(str), new Object[0]);
            return;
        }
        Logger.m3965a("Stopping foreground service: ".concat(str), new Object[0]);
        ConcurrentHashMap concurrentHashMap = this.f137671e;
        concurrentHashMap.remove(str);
        i6oVar.stopForeground(1);
        this.f137669c.f76060a.onNext(0L);
        boolean zIsEmpty = concurrentHashMap.isEmpty();
        NotificationManager notificationManager = this.f137668b;
        if (zIsEmpty) {
            notificationManager.cancel(28);
        } else {
            notificationManager.notify(28, m60134b(m60135c()));
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m60139g(String str, String str2) {
        ConcurrentHashMap concurrentHashMap = this.f137671e;
        if (concurrentHashMap.containsKey(str)) {
            if (str2 == null) {
                str2 = "foreground-service-empty-notification-message";
            }
            concurrentHashMap.put(str, str2);
            boolean zIsEmpty = concurrentHashMap.isEmpty();
            NotificationManager notificationManager = this.f137668b;
            if (zIsEmpty) {
                notificationManager.cancel(28);
            } else {
                notificationManager.notify(28, m60134b(m60135c()));
            }
        }
    }
}
