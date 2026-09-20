package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class vz00 extends wz00 {

    /* JADX INFO: renamed from: a */
    public static final vz00 f246356a = new vz00();
    public static final Parcelable.Creator<vz00> CREATOR = new qz00(4);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
