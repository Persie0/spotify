package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import p204p.g7g1;
import p204p.v7h1;

/* JADX INFO: loaded from: classes3.dex */
@KeepName
public final class BinderWrapper implements Parcelable {
    public static final Parcelable.Creator<BinderWrapper> CREATOR = new g7g1(6);

    /* JADX INFO: renamed from: a */
    public final IBinder f1871a;

    public BinderWrapper(v7h1 v7h1Var) {
        this.f1871a = v7h1Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.f1871a);
    }

    public /* synthetic */ BinderWrapper(Parcel parcel) {
        this.f1871a = parcel.readStrongBinder();
    }
}
