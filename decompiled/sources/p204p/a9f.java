package p204p;

import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.graphics.drawable.Icon;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class a9f {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ NotificationChannel m25106a(String str) {
        return new NotificationChannel("spotify_connect", str, 4);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ NotificationChannel m25107b(String str, String str2) {
        return new NotificationChannel(str, str2, 3);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ RemoteAction m25108c(Icon icon, String str, String str2, PendingIntent pendingIntent) {
        return new RemoteAction(icon, str, str2, pendingIntent);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ NotificationChannel m25109d(String str) {
        return new NotificationChannel("com.google.android.gms.availability", str, 4);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m25110e() {
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ NotificationChannel m25111f(String str) {
        return new NotificationChannel("NOTIFICATION_CHANNEL_DEFAULT", str, 3);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m25112g() {
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ NotificationChannel m25113h(String str) {
        return new NotificationChannel("NOTIFICATION_CHANNEL_MESSAGES", str, 4);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m25114i() {
    }
}
