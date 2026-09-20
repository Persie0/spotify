package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p204p.AbstractC2206o9;
import p204p.a9i0;
import p204p.alf1;
import p204p.d7x0;
import p204p.lzi;
import p204p.mvl0;
import p204p.u1h1;
import p204p.xvf1;

/* JADX INFO: loaded from: classes.dex */
public final class Status extends AbstractC2206o9 implements d7x0, ReflectedParcelable {

    /* JADX INFO: renamed from: a */
    public final int f1842a;

    /* JADX INFO: renamed from: b */
    public final String f1843b;

    /* JADX INFO: renamed from: c */
    public final PendingIntent f1844c;

    /* JADX INFO: renamed from: d */
    public final lzi f1845d;

    /* JADX INFO: renamed from: e */
    public static final Status f1837e = new Status(0, null, null, null);

    /* JADX INFO: renamed from: f */
    public static final Status f1838f = new Status(14, null, null, null);

    /* JADX INFO: renamed from: g */
    public static final Status f1839g = new Status(8, null, null, null);

    /* JADX INFO: renamed from: h */
    public static final Status f1840h = new Status(15, null, null, null);

    /* JADX INFO: renamed from: i */
    public static final Status f1841i = new Status(16, null, null, null);
    public static final Parcelable.Creator<Status> CREATOR = new xvf1(2);

    public Status(int i, String str, PendingIntent pendingIntent, lzi lziVar) {
        this.f1842a = i;
        this.f1843b = str;
        this.f1844c = pendingIntent;
        this.f1845d = lziVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f1842a == status.f1842a && mvl0.m62956s(this.f1843b, status.f1843b) && mvl0.m62956s(this.f1844c, status.f1844c) && mvl0.m62956s(this.f1845d, status.f1845d);
    }

    @Override // p204p.d7x0
    public final Status getStatus() {
        return this;
    }

    public final int hashCode() {
        return mvl0.m62961x(Integer.valueOf(this.f1842a), this.f1843b, this.f1844c, this.f1845d);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m1489k() {
        return this.f1842a <= 0;
    }

    public final String toString() {
        a9i0 a9i0VarM62936D = mvl0.m62936D(this);
        String strM82223r = this.f1843b;
        if (strM82223r == null) {
            strM82223r = u1h1.m82223r(this.f1842a);
        }
        a9i0VarM62936D.m25120b(strM82223r, "statusCode");
        a9i0VarM62936D.m25120b(this.f1844c, "resolution");
        return a9i0VarM62936D.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM26329l = alf1.m26329l(parcel);
        alf1.m26302H(parcel, 1, this.f1842a);
        alf1.m26308N(parcel, 2, this.f1843b);
        alf1.m26307M(parcel, 3, this.f1844c, i);
        alf1.m26307M(parcel, 4, this.f1845d, i);
        alf1.m26331n(iM26329l, parcel);
    }
}
