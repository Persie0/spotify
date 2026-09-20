package p204p;

import android.app.Notification;
import android.app.Person;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xtj0 {
    /* JADX INFO: renamed from: a */
    public static Parcelable m92052a(Person person) {
        return person;
    }

    /* JADX INFO: renamed from: b */
    public static Notification.MessagingStyle.Message m92053b(CharSequence charSequence, long j, Person person) {
        return new Notification.MessagingStyle.Message(charSequence, j, person);
    }
}
