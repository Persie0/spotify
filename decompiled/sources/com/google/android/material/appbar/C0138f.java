package com.google.android.material.appbar;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import p204p.AbstractC2202o5;

/* JADX INFO: renamed from: com.google.android.material.appbar.f */
/* JADX INFO: loaded from: classes4.dex */
public final class C0138f extends AbstractC2202o5 {
    public static final Parcelable.Creator<C0138f> CREATOR = new C0137e();

    /* JADX INFO: renamed from: c */
    public boolean f1990c;

    /* JADX INFO: renamed from: d */
    public int f1991d;

    /* JADX INFO: renamed from: e */
    public float f1992e;

    /* JADX INFO: renamed from: f */
    public boolean f1993f;

    public C0138f(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1990c = parcel.readByte() != 0;
        this.f1991d = parcel.readInt();
        this.f1992e = parcel.readFloat();
        this.f1993f = parcel.readByte() != 0;
    }

    @Override // p204p.AbstractC2202o5, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f1990c ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f1991d);
        parcel.writeFloat(this.f1992e);
        parcel.writeByte(this.f1993f ? (byte) 1 : (byte) 0);
    }

    public C0138f() {
        super(AbsSavedState.EMPTY_STATE);
    }
}
