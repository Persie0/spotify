package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p204p.AbstractC2206o9;
import p204p.alf1;
import p204p.xvf1;

/* JADX INFO: loaded from: classes4.dex */
public final class LatLng extends AbstractC2206o9 implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLng> CREATOR = new xvf1(22);

    /* JADX INFO: renamed from: a */
    public final double f1901a;

    /* JADX INFO: renamed from: b */
    public final double f1902b;

    public LatLng(double d, double d2) {
        if (d2 < -180.0d || d2 >= 180.0d) {
            this.f1902b = ((((d2 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d;
        } else {
            this.f1902b = d2;
        }
        this.f1901a = Math.max(-90.0d, Math.min(90.0d, d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLng)) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        return Double.doubleToLongBits(this.f1901a) == Double.doubleToLongBits(latLng.f1901a) && Double.doubleToLongBits(this.f1902b) == Double.doubleToLongBits(latLng.f1902b);
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f1901a);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f1902b);
        return ((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) + 31) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
    }

    public final String toString() {
        return "lat/lng: (" + this.f1901a + "," + this.f1902b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM26314T = alf1.m26314T(20293, parcel);
        alf1.m26313S(parcel, 2, 8);
        parcel.writeDouble(this.f1901a);
        alf1.m26313S(parcel, 3, 8);
        parcel.writeDouble(this.f1902b);
        alf1.m26316V(iM26314T, parcel);
    }
}
