package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class rz00 extends wz00 {

    /* JADX INFO: renamed from: a */
    public static final rz00 f204017a = new rz00();
    public static final Parcelable.Creator<rz00> CREATOR = new qz00(0);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
