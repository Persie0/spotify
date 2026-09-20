package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class ud90 implements Parcelable {

    /* JADX INFO: renamed from: a */
    public static final ud90 f229211a = new ud90();
    public static final Parcelable.Creator<ud90> CREATOR = new ra90(8);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
