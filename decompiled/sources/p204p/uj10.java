package p204p;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.util.TypedValue;
import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: loaded from: classes.dex */
public class uj10 extends vj10 {

    /* JADX INFO: renamed from: d */
    public static final Object f230857d = new Object();

    /* JADX INFO: renamed from: e */
    public static final uj10 f230858e = new uj10();

    /* JADX INFO: renamed from: c */
    public w4f1 f230859c;

    /* JADX INFO: renamed from: d */
    public static uj10 m83213d() {
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public static AlertDialog m83214f(Activity activity, int i, l4f1 l4f1Var, DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(h4f1.m46649c(activity, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String strM46651e = h4f1.m46651e(activity, i);
        if (strM46651e != null) {
            builder.setPositiveButton(strM46651e, l4f1Var);
        }
        String strM46647a = h4f1.m46647a(activity, i);
        if (strM46647a != null) {
            builder.setTitle(strM46647a);
        }
        new IllegalArgumentException();
        return builder.create();
    }

    /* JADX INFO: renamed from: j */
    public static void m83215j(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof m500) {
                o561.m66277r1(alertDialog, onCancelListener).mo63162p1(((m500) activity).mo15683g0(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        few.m41487a(alertDialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    @Override // p204p.vj10
    /* JADX INFO: renamed from: b */
    public final int mo83216b(Context context) {
        return m85679c(context, vj10.f241853a);
    }

    /* JADX INFO: renamed from: e */
    public final void m83217e(GoogleApiActivity googleApiActivity, int i, GoogleApiActivity googleApiActivity2) {
        AlertDialog alertDialogM83214f = m83214f(googleApiActivity, i, l4f1.m58140b(googleApiActivity, super.m85678a(i, googleApiActivity, "d")), googleApiActivity2);
        if (alertDialogM83214f == null) {
            return;
        }
        m83215j(googleApiActivity, alertDialogM83214f, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    /* JADX INFO: renamed from: g */
    public final void m83218g(Activity activity, ac80 ac80Var, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog alertDialogM83214f = m83214f(activity, i, l4f1.m58141c(ac80Var, super.m85678a(i, activity, "d")), onCancelListener);
        if (alertDialogM83214f == null) {
            return;
        }
        m83215j(activity, alertDialogM83214f, "GooglePlayServicesErrorDialog", onCancelListener);
    }

    /* JADX INFO: renamed from: h */
    public final void m83219h(Context context, int i, PendingIntent pendingIntent) {
        int i2;
        new IllegalArgumentException();
        if (i == 18) {
            new c4f1(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            return;
        }
        String strM46648b = h4f1.m46648b(context, i);
        String strM46650d = h4f1.m46650d(context, i);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        ig31.m50506x(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        ktj0 ktj0Var = new ktj0(context);
        ktj0Var.m57334m();
        ktj0Var.m57326e(true);
        ktj0Var.m57330i(strM46648b);
        itj0 itj0Var = new itj0(0);
        itj0Var.m51636f(strM46650d);
        ktj0Var.m57338q(itj0Var);
        boolean zM59756x = lqg1.m59756x(context);
        int i3 = R.drawable.stat_sys_warning;
        if (zM59756x) {
            int i4 = context.getApplicationInfo().icon;
            if (i4 != 0) {
                i3 = i4;
            }
            ktj0Var.m57337p(i3);
            ktj0Var.m57335n(2);
            if (lqg1.m59757y(context)) {
                ktj0Var.m57323a(com.spotify.music.R.drawable.common_full_open_on_phone, pendingIntent, resources.getString(com.spotify.music.R.string.common_open_on_phone));
            } else {
                ktj0Var.m57328g(pendingIntent);
            }
        } else {
            ktj0Var.m57337p(R.drawable.stat_sys_warning);
            ktj0Var.m57339r(resources.getString(com.spotify.music.R.string.common_google_play_services_notification_ticker));
            ktj0Var.m57340s(System.currentTimeMillis());
            ktj0Var.m57328g(pendingIntent);
            ktj0Var.m57329h(strM46650d);
        }
        if (u1h1.m82225t()) {
            ig31.m50471A(u1h1.m82225t());
            synchronized (f230857d) {
            }
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(com.spotify.music.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(a9f.m25109d(string));
            } else if (!string.contentEquals(notificationChannel.getName())) {
                notificationChannel.setName(string);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            ktj0Var.m57327f();
        }
        Notification notificationM57325c = ktj0Var.m57325c();
        if (i == 1 || i == 2 || i == 3) {
            wo10.f253335a.set(false);
            i2 = 10436;
        } else {
            i2 = 39789;
        }
        notificationManager.notify(i2, notificationM57325c);
    }

    /* JADX INFO: renamed from: i */
    public final void m83220i(Context context, lzi lziVar, boolean z) {
        Integer num = lziVar.f138374e;
        m3f1 m3f1Var = new m3f1(num == null ? -1 : num.intValue(), context.getPackageName(), System.currentTimeMillis(), lziVar.f138371b, z);
        if (this.f230859c == null) {
            this.f230859c = new w4f1(context);
        }
        this.f230859c.m87197l(m3f1Var);
    }
}
