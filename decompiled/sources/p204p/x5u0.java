package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class x5u0 implements Parcelable {
    public static final Parcelable.Creator<x5u0> CREATOR = new v5u0(1);

    /* JADX INFO: renamed from: a */
    public final w5u0 f258520a;

    public x5u0(w5u0 w5u0Var) {
        this.f258520a = w5u0Var;
    }

    /* JADX INFO: renamed from: c */
    public final w5u0 m90047c() {
        return this.f258520a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x5u0) && wj50.m88271j(this.f258520a, ((x5u0) obj).f258520a);
    }

    public final int hashCode() {
        return this.f258520a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f258520a.writeToParcel(parcel, i);
    }
}
