package p204p;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class d200 implements Runnable {

    /* JADX INFO: renamed from: e */
    public static final long f44396e;

    /* JADX INFO: renamed from: a */
    public final Context f44397a;

    /* JADX INFO: renamed from: b */
    public final l0e1 f44398b;

    /* JADX INFO: renamed from: c */
    public final phn0 f44399c;

    /* JADX INFO: renamed from: d */
    public int f44400d = 0;

    static {
        gaz.m44194g("ForceStopRunnable");
        f44396e = TimeUnit.DAYS.toMillis(3650L);
    }

    public d200(Context context, l0e1 l0e1Var) {
        this.f44397a = context.getApplicationContext();
        this.f44398b = l0e1Var;
        this.f44399c = l0e1Var.f128409F0;
    }

    /* JADX INFO: renamed from: b */
    public static void m34677b(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long jCurrentTimeMillis = System.currentTimeMillis() + f44396e;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x0181  */
    /* JADX INFO: renamed from: a */
    public final void m34678a() {
        boolean z;
        phn0 phn0Var = this.f44399c;
        l0e1 l0e1Var = this.f44398b;
        WorkDatabase workDatabase = l0e1Var.f128405B0;
        phn0 phn0Var2 = l0e1Var.f128409F0;
        WorkDatabase workDatabase2 = l0e1Var.f128405B0;
        dii diiVar = l0e1Var.f128404A0;
        int i = vh61.f241420f;
        Context context = this.f44397a;
        JobScheduler jobSchedulerM87972a = wf60.m87972a(context);
        ArrayList<JobInfo> arrayListM85510c = vh61.m85510c(context, jobSchedulerM87972a);
        ArrayList arrayListM64439m = workDatabase.mo1152C().m64439m();
        HashSet hashSet = new HashSet(arrayListM85510c != null ? arrayListM85510c.size() : 0);
        if (arrayListM85510c != null && !arrayListM85510c.isEmpty()) {
            for (JobInfo jobInfo : arrayListM85510c) {
                f0e1 f0e1VarM85511f = vh61.m85511f(jobInfo);
                if (f0e1VarM85511f != null) {
                    hashSet.add(f0e1VarM85511f.f64629a);
                } else {
                    vh61.m85509a(jobSchedulerM87972a, jobInfo.getId());
                }
            }
        }
        Iterator it = arrayListM64439m.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!hashSet.contains((String) it.next())) {
                    gaz.m44190b().getClass();
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            workDatabase.m59183c();
            try {
                o1e1 o1e1VarMo1155F = workDatabase.mo1155F();
                Iterator it2 = arrayListM64439m.iterator();
                while (it2.hasNext()) {
                    o1e1VarMo1155F.m66061l(-1L, (String) it2.next());
                }
                workDatabase.m59194x();
                workDatabase.m59184i();
            } catch (Throwable th) {
                workDatabase.m59184i();
                throw th;
            }
        }
        o1e1 o1e1VarMo1155F2 = workDatabase2.mo1155F();
        w0e1 w0e1VarMo1154E = workDatabase2.mo1154E();
        workDatabase2.m59183c();
        try {
            ArrayList<i1e1> arrayListM66056g = o1e1VarMo1155F2.m66056g();
            boolean zIsEmpty = arrayListM66056g.isEmpty();
            if (!zIsEmpty) {
                for (i1e1 i1e1Var : arrayListM66056g) {
                    h0e1 h0e1Var = h0e1.f86263a;
                    String str = i1e1Var.f97499a;
                    o1e1VarMo1155F2.m66065p(str, h0e1Var);
                    o1e1VarMo1155F2.m66066q(-512, str);
                    o1e1VarMo1155F2.m66061l(-1L, str);
                }
            }
            w0e1VarMo1154E.m86939m();
            workDatabase2.m59194x();
            workDatabase2.m59184i();
            boolean z2 = !zIsEmpty || z;
            int i2 = 8;
            if (phn0Var2.m70039b()) {
                gaz.m44190b().getClass();
                jh3.m53324o(diiVar.f49375m, new es3(l0e1Var, i2));
                phn0Var2.m70042f();
                return;
            }
            try {
                int i3 = Build.VERSION.SDK_INT;
                int i4 = i3 >= 31 ? 570425344 : 536870912;
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
                intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i4);
                if (i3 < 30) {
                    if (broadcast == null) {
                        m34677b(context);
                        gaz.m44190b().getClass();
                        jh3.m53324o(diiVar.f49375m, new es3(l0e1Var, i2));
                        diiVar.f49366d.getClass();
                        phn0Var.m70041e(System.currentTimeMillis());
                        return;
                    }
                    if (z2) {
                        gaz.m44190b().getClass();
                        hgy0.m47483b(diiVar, workDatabase2, l0e1Var.f128407D0);
                    }
                }
                if (broadcast != null) {
                    broadcast.cancel();
                }
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    long jM70038a = phn0Var.m70038a();
                    for (int i5 = 0; i5 < historicalProcessExitReasons.size(); i5++) {
                        ApplicationExitInfo applicationExitInfoM96037d = zfs.m96037d(historicalProcessExitReasons.get(i5));
                        if (applicationExitInfoM96037d.getReason() == 10 && applicationExitInfoM96037d.getTimestamp() >= jM70038a) {
                            gaz.m44190b().getClass();
                            jh3.m53324o(diiVar.f49375m, new es3(l0e1Var, i2));
                            diiVar.f49366d.getClass();
                            phn0Var.m70041e(System.currentTimeMillis());
                            return;
                        }
                    }
                }
                if (z2) {
                    gaz.m44190b().getClass();
                    hgy0.m47483b(diiVar, workDatabase2, l0e1Var.f128407D0);
                }
            } catch (IllegalArgumentException | SecurityException unused) {
                gaz.m44190b().getClass();
            }
        } catch (Throwable th2) {
            workDatabase2.m59184i();
            throw th2;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zM41770a;
        l0e1 l0e1Var = this.f44398b;
        try {
            l0e1Var.f128404A0.getClass();
            boolean zIsEmpty = TextUtils.isEmpty(null);
            Context context = this.f44397a;
            if (zIsEmpty) {
                gaz.m44190b().getClass();
                zM41770a = true;
            } else {
                zM41770a = fir0.m41770a(context);
                gaz.m44190b().getClass();
            }
            if (!zM41770a) {
                l0e1Var.m57803V();
                return;
            }
            while (true) {
                try {
                    pp91.m70543x(context);
                    gaz.m44190b().getClass();
                    try {
                        m34678a();
                        l0e1Var.m57803V();
                        return;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteFullException | SQLiteTableLockedException e) {
                        int i = this.f44400d + 1;
                        this.f44400d = i;
                        if (i >= 3) {
                            String str = z8g1.m95592l(context) ? "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store." : "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                            gaz.m44190b().getClass();
                            IllegalStateException illegalStateException = new IllegalStateException(str, e);
                            l0e1Var.f128404A0.getClass();
                            throw illegalStateException;
                        }
                        gaz.m44190b().getClass();
                        try {
                            Thread.sleep(((long) this.f44400d) * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e2) {
                    gaz.m44190b().getClass();
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e2);
                    l0e1Var.f128404A0.getClass();
                    throw illegalStateException2;
                }
            }
        } catch (Throwable th) {
            l0e1Var.m57803V();
            throw th;
        }
    }
}
