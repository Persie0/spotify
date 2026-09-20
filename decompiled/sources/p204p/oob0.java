package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class oob0 implements uob0 {

    /* JADX INFO: renamed from: a */
    public static final oob0 f167525a = new oob0();
    public static final Parcelable.Creator<oob0> CREATOR = new rib0(22);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
