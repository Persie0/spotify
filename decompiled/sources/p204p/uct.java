package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class uct implements vct {

    /* JADX INFO: renamed from: a */
    public static final uct f229108a = new uct();
    public static final Parcelable.Creator<uct> CREATOR = new qct(3);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
