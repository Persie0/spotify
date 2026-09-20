package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class io90 extends ko90 {

    /* JADX INFO: renamed from: a */
    public static final io90 f104160a = new io90();
    public static final Parcelable.Creator<io90> CREATOR = new ra90(18);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
