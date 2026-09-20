package p204p;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public enum ils {
    NANOSECONDS(TimeUnit.NANOSECONDS),
    MICROSECONDS(TimeUnit.MICROSECONDS),
    MILLISECONDS(TimeUnit.MILLISECONDS),
    SECONDS(TimeUnit.SECONDS),
    MINUTES(TimeUnit.MINUTES),
    HOURS(TimeUnit.HOURS),
    DAYS(TimeUnit.DAYS);


    /* JADX INFO: renamed from: a */
    public final TimeUnit f103474a;

    ils(TimeUnit timeUnit) {
        this.f103474a = timeUnit;
    }
}
