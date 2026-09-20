package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class r661 implements t661, osv0, yyu0, zyu0 {

    /* JADX INFO: renamed from: a */
    public static final r661 f196181a = new r661();
    public static final Parcelable.Creator<r661> CREATOR = new e361(15);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
