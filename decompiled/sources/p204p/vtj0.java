package p204p;

import android.app.Notification;
import android.app.Person;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vtj0 {
    /* JADX INFO: renamed from: a */
    public static Notification.MessagingStyle m86399a(Person person) {
        return new Notification.MessagingStyle(person);
    }

    /* JADX INFO: renamed from: b */
    public static Notification.MessagingStyle m86400b(Notification.MessagingStyle messagingStyle, boolean z) {
        return messagingStyle.setGroupConversation(z);
    }
}
