package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class bsu extends wwu {

    /* JADX INFO: renamed from: c */
    public static final bsu f30386c = new bsu(new suu(e95.m38204i(), g95.m43989n()), null);

    /* JADX INFO: renamed from: d */
    public static final int f30387d = 8;
    public static final Parcelable.Creator<bsu> CREATOR = new asu(0);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof bsu);
    }

    public final int hashCode() {
        return -1038383899;
    }

    public final String toString() {
        return "MoreAndroid";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
