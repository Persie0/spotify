package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class cro0 implements qro0 {

    /* JADX INFO: renamed from: a */
    public static final cro0 f41336a = new cro0();
    public static final Parcelable.Creator<cro0> CREATOR = new igo0(8);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof cro0);
    }

    public final int hashCode() {
        return 2030244858;
    }

    public final String toString() {
        return "None";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
