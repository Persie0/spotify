package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class iz00 extends kz00 {

    /* JADX INFO: renamed from: a */
    public static final iz00 f107098a = new iz00();
    public static final Parcelable.Creator<iz00> CREATOR = new k700(26);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
