package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class ia51 implements la51 {

    /* JADX INFO: renamed from: a */
    public static final ia51 f100161a = new ia51();
    public static final Parcelable.Creator<ia51> CREATOR = new q051(25);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
