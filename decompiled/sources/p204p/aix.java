package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class aix extends cix {

    /* JADX INFO: renamed from: b */
    public static final aix f16102b = new aix("invalid_credentials");
    public static final Parcelable.Creator<aix> CREATOR = new wfw(11);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
