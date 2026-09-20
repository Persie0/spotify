package p204p;

import android.app.Notification;
import android.media.session.MediaSession;
import android.support.v4.media.session.MediaSessionCompat$Token;

/* JADX INFO: loaded from: classes3.dex */
public abstract class dtj0 {
    /* JADX INFO: renamed from: a */
    public static Notification.MediaStyle m36855a() {
        return new Notification.MediaStyle();
    }

    /* JADX INFO: renamed from: b */
    public static Notification.MediaStyle m36856b(Notification.MediaStyle mediaStyle, int[] iArr, MediaSessionCompat$Token mediaSessionCompat$Token) {
        if (iArr != null) {
            m36859e(mediaStyle, iArr);
        }
        if (mediaSessionCompat$Token != null) {
            m36857c(mediaStyle, (MediaSession.Token) mediaSessionCompat$Token.f22b);
        }
        return mediaStyle;
    }

    /* JADX INFO: renamed from: c */
    public static void m36857c(Notification.MediaStyle mediaStyle, MediaSession.Token token) {
        mediaStyle.setMediaSession(token);
    }

    /* JADX INFO: renamed from: d */
    public static void m36858d(Notification.Builder builder, Notification.MediaStyle mediaStyle) {
        builder.setStyle(mediaStyle);
    }

    /* JADX INFO: renamed from: e */
    public static void m36859e(Notification.MediaStyle mediaStyle, int... iArr) {
        mediaStyle.setShowActionsInCompactView(iArr);
    }
}
