package p204p;

import java.util.Calendar;
import java.util.concurrent.atomic.AtomicReference;
import p196j$.util.DesugarTimeZone;

/* JADX INFO: loaded from: classes4.dex */
public abstract class kza1 {

    /* JADX INFO: renamed from: a */
    public static final AtomicReference f128056a = new AtomicReference();

    /* JADX INFO: renamed from: a */
    public static Calendar m57746a(Calendar calendar) {
        Calendar calendarM57748c = m57748c(calendar);
        Calendar calendarM57748c2 = m57748c(null);
        calendarM57748c2.set(calendarM57748c.get(1), calendarM57748c.get(2), calendarM57748c.get(5));
        return calendarM57748c2;
    }

    /* JADX INFO: renamed from: b */
    public static Calendar m57747b() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        return calendar;
    }

    /* JADX INFO: renamed from: c */
    public static Calendar m57748c(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            calendar2.clear();
            return calendar2;
        }
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        return calendar2;
    }
}
