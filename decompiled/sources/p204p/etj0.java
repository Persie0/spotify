package p204p;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;

/* JADX INFO: loaded from: classes3.dex */
public abstract class etj0 {
    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: a */
    public static Notification.MediaStyle m39936a(Notification.MediaStyle mediaStyle, CharSequence charSequence, int i, PendingIntent pendingIntent, Boolean bool) {
        if (bool.booleanValue()) {
            mediaStyle.setRemotePlaybackInfo(charSequence, i, pendingIntent);
        }
        return mediaStyle;
    }
}
