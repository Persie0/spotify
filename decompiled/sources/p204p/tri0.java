package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class tri0 implements Parcelable {
    public static final Parcelable.Creator<tri0> CREATOR = new rri0(1);

    /* JADX INFO: renamed from: a */
    public final String f223076a;

    public tri0(String str) {
        this.f223076a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tri0) && wj50.m88271j(this.f223076a, ((tri0) obj).f223076a);
    }

    public final int hashCode() {
        return this.f223076a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f223076a);
    }
}
