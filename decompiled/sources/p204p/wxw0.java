package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class wxw0 extends byw0 {

    /* JADX INFO: renamed from: a */
    public static final wxw0 f256139a = new wxw0();
    public static final Parcelable.Creator<wxw0> CREATOR = new b8w0(29);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
