package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class oso implements qso {

    /* JADX INFO: renamed from: a */
    public static final oso f168842a = new oso();
    public static final Parcelable.Creator<oso> CREATOR = new lso(1);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
