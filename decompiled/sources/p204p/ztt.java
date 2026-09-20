package p204p;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class ztt {

    /* JADX INFO: renamed from: a */
    public final long f286257a;

    /* JADX INFO: renamed from: b */
    public final long f286258b;

    /* JADX INFO: renamed from: c */
    public final long f286259c;

    public ztt(long j, long j2, long j3) {
        this.f286257a = j;
        this.f286258b = j2;
        this.f286259c = j3;
    }

    /* JADX INFO: renamed from: a */
    public static ztt m96946a(long j) {
        long j2 = j + 59000;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long days = timeUnit.toDays(j2);
        long hours = timeUnit.toHours(j2);
        TimeUnit timeUnit2 = TimeUnit.DAYS;
        long hours2 = hours - timeUnit2.toHours(days);
        return new ztt(days, hours2, (timeUnit.toMinutes(j2) - timeUnit2.toMinutes(days)) - TimeUnit.HOURS.toMinutes(hours2));
    }

    /* JADX INFO: renamed from: b */
    public static ztt m96947b(long j) {
        return m96946a(j * 1000);
    }
}
