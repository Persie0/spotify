package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class vo90 extends wo90 {

    /* JADX INFO: renamed from: a */
    public static final vo90 f243430a = new vo90();
    public static final Parcelable.Creator<vo90> CREATOR = new ra90(21);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
