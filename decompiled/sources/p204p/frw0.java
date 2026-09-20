package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class frw0 extends hrw0 {

    /* JADX INFO: renamed from: a */
    public static final frw0 f72672a = new frw0();
    public static final Parcelable.Creator<frw0> CREATOR = new b8w0(19);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
