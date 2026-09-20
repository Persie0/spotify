package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class bix extends cix {

    /* JADX INFO: renamed from: b */
    public static final bix f27558b = new bix("invalid_email");
    public static final Parcelable.Creator<bix> CREATOR = new wfw(12);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
