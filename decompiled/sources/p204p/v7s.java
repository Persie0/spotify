package p204p;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes2.dex */
public final class v7s implements u7s {

    /* JADX INFO: renamed from: a */
    public final Context f238308a;

    /* JADX INFO: renamed from: b */
    public final NotificationManager f238309b;

    public v7s(Context context, NotificationManager notificationManager) {
        this.f238308a = context;
        this.f238309b = notificationManager;
    }

    /* JADX INFO: renamed from: a */
    public final void m84896a() {
        int i = Build.VERSION.SDK_INT;
        NotificationManager notificationManager = this.f238309b;
        Context context = this.f238308a;
        if (i >= 26) {
            a9f.m25112g();
            NotificationChannel notificationChannelM25107b = a9f.m25107b(context.getString(R.string.share_download_notification_channel_id), context.getString(R.string.share_download_notification_channel_name));
            notificationChannelM25107b.setDescription(context.getString(R.string.share_download_notification_channel_description));
            notificationManager.createNotificationChannel(notificationChannelM25107b);
        }
        ktj0 ktj0Var = new ktj0(context, context.getString(R.string.share_download_notification_channel_id));
        ktj0Var.m57337p(android.R.drawable.stat_sys_download);
        ktj0Var.m57330i(context.getString(R.string.download_notification_downloading));
        ktj0Var.m57336o(0, 0, true);
        ktj0Var.m57335n(0);
        notificationManager.notify(R.string.share_download_notification_channel_id, ktj0Var.m57325c());
    }

    /* JADX INFO: renamed from: b */
    public final void m84897b(Uri uri) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.putExtra("output", uri);
        intent.setDataAndType(uri, "image/*");
        intent.setFlags(1);
        Context context = this.f238308a;
        PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 201326592);
        ktj0 ktj0Var = new ktj0(context, context.getString(R.string.share_download_notification_channel_id));
        ktj0Var.m57330i(context.getString(R.string.download_notification_completed));
        ktj0Var.m57337p(android.R.drawable.stat_sys_download_done);
        ktj0Var.m57336o(0, 0, false);
        ktj0Var.m57328g(activity);
        ktj0Var.m57326e(true);
        this.f238309b.notify(R.string.share_download_notification_channel_id, ktj0Var.m57325c());
    }
}
