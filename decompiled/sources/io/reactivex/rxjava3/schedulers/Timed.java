package io.reactivex.rxjava3.schedulers;

import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p204p.edb;

/* JADX INFO: loaded from: classes11.dex */
public final class Timed<T> {

    /* JADX INFO: renamed from: a */
    public final Object f10376a;

    /* JADX INFO: renamed from: b */
    public final long f10377b;

    /* JADX INFO: renamed from: c */
    public final TimeUnit f10378c;

    public Timed(Object obj, long j, TimeUnit timeUnit) {
        Objects.requireNonNull(obj, "value is null");
        this.f10376a = obj;
        this.f10377b = j;
        Objects.requireNonNull(timeUnit, "unit is null");
        this.f10378c = timeUnit;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Timed) {
            Timed timed = (Timed) obj;
            if (Objects.equals(this.f10376a, timed.f10376a) && this.f10377b == timed.f10377b && Objects.equals(this.f10378c, timed.f10378c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f10376a.hashCode() * 31;
        long j = this.f10377b;
        return this.f10378c.hashCode() + ((iHashCode + ((int) (j ^ (j >>> 31)))) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Timed[time=");
        sb.append(this.f10377b);
        sb.append(", unit=");
        sb.append(this.f10378c);
        sb.append(", value=");
        return edb.m38568q(sb, this.f10376a, "]");
    }
}
