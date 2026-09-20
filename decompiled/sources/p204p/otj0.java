package p204p;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.graphics.drawable.Icon;

/* JADX INFO: loaded from: classes3.dex */
public abstract class otj0 {
    /* JADX INFO: renamed from: a */
    public static Notification.CallStyle m67801a(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        return Notification.CallStyle.forIncomingCall(person, pendingIntent, pendingIntent2);
    }

    /* JADX INFO: renamed from: b */
    public static Notification.CallStyle m67802b(Person person, PendingIntent pendingIntent) {
        return Notification.CallStyle.forOngoingCall(person, pendingIntent);
    }

    /* JADX INFO: renamed from: c */
    public static Notification.CallStyle m67803c(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        return Notification.CallStyle.forScreeningCall(person, pendingIntent, pendingIntent2);
    }

    /* JADX INFO: renamed from: d */
    public static Notification.CallStyle m67804d(Notification.CallStyle callStyle, int i) {
        return callStyle.setAnswerButtonColorHint(i);
    }

    /* JADX INFO: renamed from: e */
    public static Notification.CallStyle m67805e(Notification.CallStyle callStyle, int i) {
        return callStyle.setDeclineButtonColorHint(i);
    }

    /* JADX INFO: renamed from: f */
    public static Notification.CallStyle m67806f(Notification.CallStyle callStyle, boolean z) {
        return callStyle.setIsVideo(z);
    }

    /* JADX INFO: renamed from: g */
    public static Notification.CallStyle m67807g(Notification.CallStyle callStyle, Icon icon) {
        return callStyle.setVerificationIcon(icon);
    }

    /* JADX INFO: renamed from: h */
    public static Notification.CallStyle m67808h(Notification.CallStyle callStyle, CharSequence charSequence) {
        return callStyle.setVerificationText(charSequence);
    }
}
