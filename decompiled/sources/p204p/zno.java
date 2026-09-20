package p204p;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zno {

    /* JADX INFO: renamed from: a */
    public static final SimpleDateFormat f284531a;

    static {
        Locale locale = Locale.US;
        f284531a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", locale);
        new SimpleDateFormat("HH:mm:ss", locale);
    }

    /* JADX INFO: renamed from: a */
    public static synchronized String m96593a(Calendar calendar) {
        SimpleDateFormat simpleDateFormat;
        calendar.getClass();
        simpleDateFormat = f284531a;
        simpleDateFormat.setTimeZone(calendar.getTimeZone());
        return simpleDateFormat.format(calendar.getTime());
    }
}
