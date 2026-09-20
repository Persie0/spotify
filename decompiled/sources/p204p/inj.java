package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class inj extends onj {
    public static final Parcelable.Creator<inj> CREATOR = new dnj(4);

    /* JADX INFO: renamed from: a */
    public final String f104012a;

    public inj(String str) {
        this.f104012a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof inj) && wj50.m88271j(this.f104012a, ((inj) obj).f104012a);
    }

    public final int hashCode() {
        return this.f104012a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f104012a);
    }
}
