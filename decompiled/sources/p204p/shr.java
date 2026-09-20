package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class shr extends xhr {

    /* JADX INFO: renamed from: a */
    public static final shr f209251a = new shr();
    public static final Parcelable.Creator<shr> CREATOR = new o5r(9);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
