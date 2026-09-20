package p204p;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes4.dex */
public final class fyh0 implements Comparable, Parcelable {
    public static final Parcelable.Creator<fyh0> CREATOR = new ruh0(14);

    /* JADX INFO: renamed from: a */
    public final Calendar f74745a;

    /* JADX INFO: renamed from: b */
    public final int f74746b;

    /* JADX INFO: renamed from: c */
    public final int f74747c;

    /* JADX INFO: renamed from: d */
    public final int f74748d;

    /* JADX INFO: renamed from: e */
    public final int f74749e;

    /* JADX INFO: renamed from: f */
    public final long f74750f;

    /* JADX INFO: renamed from: g */
    public String f74751g;

    public fyh0(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarM57746a = kza1.m57746a(calendar);
        this.f74745a = calendarM57746a;
        this.f74746b = calendarM57746a.get(2);
        this.f74747c = calendarM57746a.get(1);
        this.f74748d = calendarM57746a.getMaximum(7);
        this.f74749e = calendarM57746a.getActualMaximum(5);
        this.f74750f = calendarM57746a.getTimeInMillis();
    }

    /* JADX INFO: renamed from: g */
    public static fyh0 m43103g(int i, int i2) {
        Calendar calendarM57748c = kza1.m57748c(null);
        calendarM57748c.set(1, i);
        calendarM57748c.set(2, i2);
        return new fyh0(calendarM57748c);
    }

    /* JADX INFO: renamed from: h */
    public static fyh0 m43104h(long j) {
        Calendar calendarM57748c = kza1.m57748c(null);
        calendarM57748c.setTimeInMillis(j);
        return new fyh0(calendarM57748c);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(fyh0 fyh0Var) {
        return this.f74745a.compareTo(fyh0Var.f74745a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fyh0)) {
            return false;
        }
        fyh0 fyh0Var = (fyh0) obj;
        return this.f74746b == fyh0Var.f74746b && this.f74747c == fyh0Var.f74747c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f74746b), Integer.valueOf(this.f74747c)});
    }

    /* JADX INFO: renamed from: j */
    public final int m43106j() {
        Calendar calendar = this.f74745a;
        int firstDayOfWeek = calendar.get(7) - calendar.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f74748d : firstDayOfWeek;
    }

    /* JADX INFO: renamed from: k */
    public final String m43107k(Context context) {
        if (this.f74751g == null) {
            long timeInMillis = this.f74745a.getTimeInMillis();
            this.f74751g = DateUtils.formatDateTime(context, timeInMillis - ((long) TimeZone.getDefault().getOffset(timeInMillis)), 36);
        }
        return this.f74751g;
    }

    /* JADX INFO: renamed from: l */
    public final int m43108l(fyh0 fyh0Var) {
        if (!(this.f74745a instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (fyh0Var.f74746b - this.f74746b) + ((fyh0Var.f74747c - this.f74747c) * 12);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f74747c);
        parcel.writeInt(this.f74746b);
    }
}
