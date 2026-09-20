package p204p;

import android.app.Notification;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ttj0 {
    /* JADX INFO: renamed from: a */
    public static Notification.MessagingStyle m81530a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
        return messagingStyle.addMessage(message);
    }

    /* JADX INFO: renamed from: b */
    public static Notification.MessagingStyle m81531b(CharSequence charSequence) {
        return new Notification.MessagingStyle(charSequence);
    }

    /* JADX INFO: renamed from: c */
    public static Notification.MessagingStyle m81532c(Notification.MessagingStyle messagingStyle, CharSequence charSequence) {
        return messagingStyle.setConversationTitle(charSequence);
    }
}
