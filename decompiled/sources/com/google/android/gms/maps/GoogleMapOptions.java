package com.google.android.gms.maps;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import com.comscore.streaming.AdvertisementType;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;
import p204p.AbstractC2206o9;
import p204p.a9i0;
import p204p.alf1;
import p204p.luh0;
import p204p.mif1;

/* JADX INFO: loaded from: classes4.dex */
public final class GoogleMapOptions extends AbstractC2206o9 implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new luh0(20);

    /* JADX INFO: renamed from: L0 */
    public final Float f1878L0;

    /* JADX INFO: renamed from: M0 */
    public final Float f1879M0;

    /* JADX INFO: renamed from: N0 */
    public final LatLngBounds f1880N0;

    /* JADX INFO: renamed from: O0 */
    public final Boolean f1881O0;

    /* JADX INFO: renamed from: P0 */
    public final Integer f1882P0;

    /* JADX INFO: renamed from: Q0 */
    public final String f1883Q0;

    /* JADX INFO: renamed from: X */
    public Boolean f1884X;

    /* JADX INFO: renamed from: Y */
    public final Boolean f1885Y;

    /* JADX INFO: renamed from: Z */
    public final Boolean f1886Z;

    /* JADX INFO: renamed from: a */
    public final Boolean f1887a;

    /* JADX INFO: renamed from: b */
    public final Boolean f1888b;

    /* JADX INFO: renamed from: c */
    public final int f1889c;

    /* JADX INFO: renamed from: d */
    public final CameraPosition f1890d;

    /* JADX INFO: renamed from: e */
    public final Boolean f1891e;

    /* JADX INFO: renamed from: f */
    public final Boolean f1892f;

    /* JADX INFO: renamed from: g */
    public final Boolean f1893g;

    /* JADX INFO: renamed from: h */
    public final Boolean f1894h;

    /* JADX INFO: renamed from: i */
    public final Boolean f1895i;

    /* JADX INFO: renamed from: t */
    public final Boolean f1896t;

    static {
        Color.argb(255, 236, AdvertisementType.BRANDED_ON_DEMAND_POST_ROLL, 225);
    }

    public GoogleMapOptions() {
        this.f1889c = -1;
        this.f1878L0 = null;
        this.f1879M0 = null;
        this.f1880N0 = null;
        this.f1882P0 = null;
        this.f1883Q0 = null;
    }

    public final String toString() {
        a9i0 a9i0Var = new a9i0(this);
        a9i0Var.m25120b(Integer.valueOf(this.f1889c), "MapType");
        a9i0Var.m25120b(this.f1884X, "LiteMode");
        a9i0Var.m25120b(this.f1890d, "Camera");
        a9i0Var.m25120b(this.f1892f, "CompassEnabled");
        a9i0Var.m25120b(this.f1891e, "ZoomControlsEnabled");
        a9i0Var.m25120b(this.f1893g, "ScrollGesturesEnabled");
        a9i0Var.m25120b(this.f1894h, "ZoomGesturesEnabled");
        a9i0Var.m25120b(this.f1895i, "TiltGesturesEnabled");
        a9i0Var.m25120b(this.f1896t, "RotateGesturesEnabled");
        a9i0Var.m25120b(this.f1881O0, "ScrollGesturesEnabledDuringRotateOrZoom");
        a9i0Var.m25120b(this.f1885Y, "MapToolbarEnabled");
        a9i0Var.m25120b(this.f1886Z, "AmbientEnabled");
        a9i0Var.m25120b(this.f1878L0, "MinZoomPreference");
        a9i0Var.m25120b(this.f1879M0, "MaxZoomPreference");
        a9i0Var.m25120b(this.f1882P0, "BackgroundColor");
        a9i0Var.m25120b(this.f1880N0, "LatLngBoundsForCameraTarget");
        a9i0Var.m25120b(this.f1887a, "ZOrderOnTop");
        a9i0Var.m25120b(this.f1888b, "UseViewLifecycleInFragment");
        return a9i0Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM26314T = alf1.m26314T(20293, parcel);
        byte bM61865R = mif1.m61865R(this.f1887a);
        alf1.m26313S(parcel, 2, 4);
        parcel.writeInt(bM61865R);
        byte bM61865R2 = mif1.m61865R(this.f1888b);
        alf1.m26313S(parcel, 3, 4);
        parcel.writeInt(bM61865R2);
        alf1.m26313S(parcel, 4, 4);
        parcel.writeInt(this.f1889c);
        alf1.m26307M(parcel, 5, this.f1890d, i);
        byte bM61865R3 = mif1.m61865R(this.f1891e);
        alf1.m26313S(parcel, 6, 4);
        parcel.writeInt(bM61865R3);
        byte bM61865R4 = mif1.m61865R(this.f1892f);
        alf1.m26313S(parcel, 7, 4);
        parcel.writeInt(bM61865R4);
        byte bM61865R5 = mif1.m61865R(this.f1893g);
        alf1.m26313S(parcel, 8, 4);
        parcel.writeInt(bM61865R5);
        byte bM61865R6 = mif1.m61865R(this.f1894h);
        alf1.m26313S(parcel, 9, 4);
        parcel.writeInt(bM61865R6);
        byte bM61865R7 = mif1.m61865R(this.f1895i);
        alf1.m26313S(parcel, 10, 4);
        parcel.writeInt(bM61865R7);
        byte bM61865R8 = mif1.m61865R(this.f1896t);
        alf1.m26313S(parcel, 11, 4);
        parcel.writeInt(bM61865R8);
        byte bM61865R9 = mif1.m61865R(this.f1884X);
        alf1.m26313S(parcel, 12, 4);
        parcel.writeInt(bM61865R9);
        byte bM61865R10 = mif1.m61865R(this.f1885Y);
        alf1.m26313S(parcel, 14, 4);
        parcel.writeInt(bM61865R10);
        byte bM61865R11 = mif1.m61865R(this.f1886Z);
        alf1.m26313S(parcel, 15, 4);
        parcel.writeInt(bM61865R11);
        alf1.m26300F(parcel, 16, this.f1878L0);
        alf1.m26300F(parcel, 17, this.f1879M0);
        alf1.m26307M(parcel, 18, this.f1880N0, i);
        byte bM61865R12 = mif1.m61865R(this.f1881O0);
        alf1.m26313S(parcel, 19, 4);
        parcel.writeInt(bM61865R12);
        alf1.m26304J(parcel, 20, this.f1882P0);
        alf1.m26308N(parcel, 21, this.f1883Q0);
        alf1.m26316V(iM26314T, parcel);
    }

    public GoogleMapOptions(byte b, byte b2, int i, CameraPosition cameraPosition, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8, byte b9, byte b10, byte b11, Float f, Float f2, LatLngBounds latLngBounds, byte b12, Integer num, String str) {
        this.f1889c = -1;
        this.f1878L0 = null;
        this.f1879M0 = null;
        this.f1880N0 = null;
        this.f1882P0 = null;
        this.f1883Q0 = null;
        this.f1887a = mif1.m61867T(b);
        this.f1888b = mif1.m61867T(b2);
        this.f1889c = i;
        this.f1890d = cameraPosition;
        this.f1891e = mif1.m61867T(b3);
        this.f1892f = mif1.m61867T(b4);
        this.f1893g = mif1.m61867T(b5);
        this.f1894h = mif1.m61867T(b6);
        this.f1895i = mif1.m61867T(b7);
        this.f1896t = mif1.m61867T(b8);
        this.f1884X = mif1.m61867T(b9);
        this.f1885Y = mif1.m61867T(b10);
        this.f1886Z = mif1.m61867T(b11);
        this.f1878L0 = f;
        this.f1879M0 = f2;
        this.f1880N0 = latLngBounds;
        this.f1881O0 = mif1.m61867T(b12);
        this.f1882P0 = num;
        this.f1883Q0 = str;
    }
}
