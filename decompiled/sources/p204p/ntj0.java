package p204p;

import android.app.Notification;
import android.app.Person;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ntj0 {
    /* JADX INFO: renamed from: a */
    public static Notification.Builder m65630a(Notification.Builder builder, Person person) {
        return builder.addPerson(person);
    }

    /* JADX INFO: renamed from: b */
    public static Parcelable m65631b(Person person) {
        return person;
    }
}
