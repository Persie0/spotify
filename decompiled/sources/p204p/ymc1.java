package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class ymc1 implements Parcelable {

    /* JADX INFO: renamed from: a */
    public static final ymc1 f274221a = new ymc1();
    public static final Parcelable.Creator<ymc1> CREATOR = new vmc1(0);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ymc1);
    }

    public final int hashCode() {
        return 92006053;
    }

    public final String toString() {
        return "Loading";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
