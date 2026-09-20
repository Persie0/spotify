package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class bdj implements hdj {

    /* JADX INFO: renamed from: a */
    public static final bdj f26117a = new bdj();
    public static final Parcelable.Creator<bdj> CREATOR = new wcj(6);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof bdj);
    }

    public final int hashCode() {
        return 929024534;
    }

    public final String toString() {
        return "NewAdminSet";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
