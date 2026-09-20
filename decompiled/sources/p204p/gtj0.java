package p204p;

import android.app.Notification;
import android.graphics.drawable.Icon;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gtj0 {
    /* JADX INFO: renamed from: a */
    public static void m45699a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
        bigPictureStyle.bigPicture(icon);
    }

    /* JADX INFO: renamed from: b */
    public static void m45700b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
        bigPictureStyle.setContentDescription(charSequence);
    }

    /* JADX INFO: renamed from: c */
    public static void m45701c(Notification.BigPictureStyle bigPictureStyle, boolean z) {
        bigPictureStyle.showBigPictureWhenCollapsed(z);
    }
}
