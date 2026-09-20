package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class n661 implements t661, osv0, yyu0, zyu0 {

    /* JADX INFO: renamed from: a */
    public static final n661 f150719a = new n661();
    public static final Parcelable.Creator<n661> CREATOR = new e361(11);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
