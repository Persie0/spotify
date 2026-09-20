package p204p;

import android.app.Notification;
import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wtj0 {
    /* JADX INFO: renamed from: a */
    public static Notification.MessagingStyle.Message m88952a(CharSequence charSequence, long j, CharSequence charSequence2) {
        return new Notification.MessagingStyle.Message(charSequence, j, charSequence2);
    }

    /* JADX INFO: renamed from: b */
    public static Notification.MessagingStyle.Message m88953b(Notification.MessagingStyle.Message message, String str, Uri uri) {
        return message.setData(str, uri);
    }
}
