package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class qky extends sky {

    /* JADX INFO: renamed from: a */
    public static final qky f189667a = new qky();
    public static final Parcelable.Creator<qky> CREATOR = new p7y(21);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
