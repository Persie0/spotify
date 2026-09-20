package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class j661 implements t661, yyu0 {

    /* JADX INFO: renamed from: a */
    public static final j661 f109233a = new j661();
    public static final Parcelable.Creator<j661> CREATOR = new e361(7);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
