package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class tct implements vct {

    /* JADX INFO: renamed from: a */
    public static final tct f219142a = new tct();
    public static final Parcelable.Creator<tct> CREATOR = new qct(2);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
